package com.test;

import com.test.entity.CourseEntity;
import com.test.entity.GradeEntity;
import com.test.entity.OperatorsEntity;
import com.test.entity.StudentEntity;
import com.test.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class TestApplicationTests {

    @Resource
    TestMapper testMapper;

    @Test
    void contextLoads()
    {

    }

    @Test
    void test()
    {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(uuid);
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        CourseEntity testEntity1 = new CourseEntity("离散数学","好星星","2020118092",45,"2306");
        GradeEntity gradeEntity = new GradeEntity(80,3.5,"2020118093",4,"离散数学","陈衍鑫","好星星","2020",2,"2103",1);
        StudentEntity studentEntity = new StudentEntity("陈衍鑫","2020118093","陕西省西安市莲湖区铁塔思路","13363979511","2-203","男","1","610104200112024412",2020,"软件工程","软工二班");
        OperatorsEntity operatorsEntity = new OperatorsEntity("20203365","王道铭",3);
//        int i = testMapper.insertGrade(gradeEntity);
//        if (i > 0) {
//            System.out.println("插入成功！");
//        }

//        int i = testMapper.insertTest(testEntity1);
//        if (i > 0) {
//            System.out.println("插入成功！");
//        }
//
//        int i = testMapper.insertStudent(studentEntity);
//        if (i > 0) {
//            System.out.println("插入成功！");
//        }
//
//        int i = testMapper.insertOperators(operatorsEntity);
//        if (i > 0) {
//            System.out.println("插入成功！");
//        }

        List<CourseEntity> testList = testMapper.getTestList(); // alt+enter
        for (CourseEntity testEntity : testList) { // testList.for
            System.out.println(testEntity.toString()); // sout
        }

        List<GradeEntity> gradelist = testMapper.getGradelist();
        for(GradeEntity gradeEntity1 : gradelist)
        {
            System.out.println(gradeEntity1.toString());
        }

        List<StudentEntity> studentlist = testMapper.getStudentlist();
        for(StudentEntity studentEntity1 : studentlist)
        {
            System.out.println(studentEntity1.toString());
        }

        List<OperatorsEntity> operatorslist = testMapper.getOpearatorslist();
        for(OperatorsEntity operatorsEntity1 : operatorslist)
        {
            System.out.println(operatorsEntity1.toString());
        }

    }

}
