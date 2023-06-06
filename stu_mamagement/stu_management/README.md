# Sqlserver 测试项目

## 新建SpringBoot项目

### 1.pom.xml配置依赖

Maven中央仓库：https://mvnrepository.com/

Maven基础：https://www.liaoxuefeng.com/wiki/1252599548343744/1255945359327200

Pom文件详解：https://blog.csdn.net/weixin_38569499/article/details/91456988

### 2.properties数据库连接配置

```properties
server.port=8088

# sqlserver数据库基础配置
spring.datasource.url=jdbc:sqlserver://39.101.137.10:1433;databasename=test_db
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.datasource.username=SA
spring.datasource.password=cdfGroup511

# 日志配置(输出SQL语句)
logging.level.com.xiaoshi.test.mapper = debug

```

### 3.项目结构

新建6个包：

- config 配置类
  - 跨域配置、接口文档配置、全局异常处理配置
- controller 层
  - 处理用户请求
- entity 层
  - 对应数据表
- mapper 层
  - 写SQL语言
- service 层
  - 写程序逻辑
- utils工具包

### 4.实体类

1. 首先实体类字段要与数据库字段对应。
2. 其次实现两个构造方法：
   - 无参构造
   - 有参构造

3. 实现get、set方法
4. 重写toString方法

下表列出了基本 SQL Server、JDBC 和 Java 编程语言数据类型之间的默认映射：

| SQL Server 类型  | JDBC 类型 (java.sql.Types)               | Java 语言类型                |
| ---------------- | ---------------------------------------- | ---------------------------- |
| **bigint**       | BIGINT                                   | **long**                     |
| binary           | BINARY                                   | byte[]                       |
| **bit**          | BIT                                      | **boolean**                  |
| **char**         | CHAR                                     | **字符串**                   |
| **date**         | DATE                                     | **java.sql.Date**            |
| datetime3        | TIMESTAMP                                | java.sql.Timestamp           |
| **datetime2**    | TIMESTAMP                                | **java.sql.Timestamp**       |
| datetimeoffset2  | microsoft.sql.Types.DATETIMEOFFSET       | microsoft.sql.DateTimeOffset |
| Decimal          | DECIMAL                                  | java.math.BigDecimal         |
| **FLOAT**        | DOUBLE                                   | **double**                   |
| image            | LONGVARBINARY                            | byte[]                       |
| **int**          | INTEGER                                  | **int**                      |
| money            | DECIMAL                                  | java.math.BigDecimal         |
| nchar            | CHAR   NCHAR (Java SE 6.0)               | 字符串                       |
| ntext            | LONGVARCHAR   LONGNVARCHAR (Java SE 6.0) | 字符串                       |
| numeric          | NUMERIC                                  | java.math.BigDecimal         |
| nvarchar         | VARCHAR   NVARCHAR (Java SE 6.0)         | 字符串                       |
| nvarchar(max)    | VARCHAR   NVARCHAR (Java SE 6.0)         | 字符串                       |
| **real**         | real                                     | **FLOAT**                    |
| smalldatetime    | TIMESTAMP                                | java.sql.Timestamp           |
| smallint         | SMALLINT                                 | short                        |
| smallmoney       | DECIMAL                                  | java.math.BigDecimal         |
| **text**         | LONGVARCHAR                              | **字符串**                   |
| **time**         | TIME1                                    | **java.sql.Time**            |
| timestamp        | BINARY                                   | byte[]                       |
| **tinyint**      | TINYINT                                  | **short**                    |
| udt              | VARBINARY                                | byte[]                       |
| uniqueidentifier | CHAR                                     | 字符串                       |
| varbinary        | VARBINARY                                | byte[]                       |
| varbinary(max)   | VARBINARY                                | byte[]                       |
| **varchar**      | VARCHAR                                  | **字符串**                   |
| varchar(max)     | VARCHAR                                  | 字符串                       |
| xml              | LONGVARCHAR   LONGNVARCHAR (Java SE 6.0) | 字符串   SQLXML              |
| sqlvariant       | microsoft.sql.Types.SQL_VARIANT          | 对象                         |
| geometry         | VARBINARY                                | byte[]                       |
| geography        | VARBINARY                                | byte[]                       |

### 5.Mapper层

1. 写Mapper层之前先去数据库写SQL语句测试
2. Mapper层用于处理sql
3. 写完Mapper层写单元测试进行测试

```java
@Mapper
public interface TestMapper {
    String test_table = "test";

    @Select(
            "SELECT * FROM " + test_table
    )
    List<TestEntity> getTestList();
    
    @Select(
            "SELECT * FROM " + test_table + " WHERE guid = #{guid}"
    )
    TestEntity getTestByGuid(@Param("guid") String guid);

    @Insert(
        "INSERT INTO test ( guid, name, age, sex, money, sign_date, sign_datetime, sign_time, [desc] ) " +
                "VALUES " +
                "(#{guid},#{name},#{age},#{sex},#{money},#{sign_date},#{sign_datetime},#{sign_time},#{desc})"
    )
    int insertTest(TestEntity testEntity);
}
```

### 6.Service层

Service需要写一个接口，再写一个接口的实现类。

在实现类里面调用mapper层的接口获取到数据库的数据，根据业务需求进行逻辑处理，之后返回给controller层。

接口：

```java
public interface TestService {
    List<TestEntity> getTestList();
    int insertTest(TestEntity testEntity);
    TestEntity getTestByGuid(String guid);
}
```

实现类：

```java
@Service
public class TestServiceImp implements TestService {
    @Resource
    TestMapper testMapper;

    @Override
    public List<TestEntity> getTestList() {
        return testMapper.getTestList();
    }
    
    @Override
    public int insertTest(TestEntity testEntity) {
        return testMapper.insertTest(testEntity);
    }

    @Override
    public TestEntity getTestByGuid(String guid) {
        // 写逻辑
        TestEntity testByGuid = testMapper.getTestByGuid(guid);
        testByGuid.setDesc("大笨蛋");
        return testByGuid;
    }
}
```

### 7.controller层

Controller层定义接口请求路径以及请求参数等。

```java
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping(value = "/getTestList")
    public List<TestEntity> getTestList(){
        return testService.getTestList();
    }
    
    @PostMapping(value = "/insertTest")
    int insertTest(@RequestBody TestEntity testEntity){
        return testService.insertTest(testEntity);
    }

    @GetMapping(value="getTestByGuid")
    TestEntity getTestByGuid(@RequestParam(value = "guid") String guid){
        return testService.getTestByGuid(guid);
    }
}
```