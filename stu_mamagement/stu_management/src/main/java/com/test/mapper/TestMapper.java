package com.test.mapper;

import com.test.entity.CourseEntity;
import com.test.entity.GradeEntity;
import com.test.entity.OperatorsEntity;
import com.test.entity.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface TestMapper {
    String test_table1 = "Course";
    String test_table2 = "Student";
    String test_table3 = "Grade";
    String test_table4 = "Operators";
    //全局查找
    @Select(
            "SELECT * FROM " + test_table1
    )
    List<CourseEntity> getTestList();

    @Select(
            "SELECT * FROM " + test_table2
    )
    List<StudentEntity> getStudentlist();

    @Select(
            "SELECT * FROM " + test_table3
    )
    List<GradeEntity> getGradelist();

    @Select(
            "SELECT * FROM " + test_table4
    )
    List<OperatorsEntity> getOpearatorslist();

    //按标准查找
    @Select(
            "SELECT * FROM " + test_table1 + " WHERE CID = #{CID}"
    )
    CourseEntity getCourseByCID(@Param("CID") String CID);

    //按标准查找
    @Select(
            "SELECT * FROM " + test_table3 + " WHERE CID = #{CID}"
    )
    GradeEntity getGradeByCID(@Param("CID") String CID);

    //按标准查找
    @Select(
            "SELECT * FROM " + test_table2 + " WHERE STUID = #{STUID}"
    )
    StudentEntity getStudentBySTUID(@Param("STUID") String STUID);

    //按标准查找
    @Select(
            "SELECT * FROM " + test_table4 + " WHERE AID = #{AID}"
    )
    OperatorsEntity getOperatorsByAID(@Param("AID") String AID);

    // 插入操作
    @Insert(
            "INSERT INTO Course ( Course_name, Teacher_name, TID, Students_num, CID ) " +
                    "VALUES " +
                    "(#{Course_name},#{Teacher_name},#{TID},#{Students_num},#{CID})"
    )
    int insertTest(CourseEntity testEntity);

    @Insert(
            "INSERT INTO Grade ( Grade, GPA, STUID, Score, Class_name, Student_name,Teacher_name,Syear,Term,CID,Pass ) " +
                    "VALUES " +
                    "(#{Grade},#{GPA},#{STUID},#{Score},#{Class_name},#{Student_name},#{Teacher_name},#{Syear},#{Term},#{CID},#{Pass})"
    )
    int insertGrade(GradeEntity gradeEntity);

    @Insert(
            "INSERT INTO Student ( Student_name, STUID, Address, Tel, Dorm,sex,IDclass,IDnum,Stu_year,Major,Class_name ) " +
                    "VALUES " +
                    "(#{Student_name},#{STUID},#{Address},#{Tel},#{Dorm},#{sex},#{IDclass},#{IDnum},#{Stu_year},#{Major},#{Class_name})"
    )
    int insertStudent(StudentEntity studentEntity);

    @Insert(
            "INSERT INTO Operators ( AID, Admin_name, Admin_privilege) " +
                    "VALUES " +
                    "(#{AID},#{Admin_name},#{Admin_privilege})"
    )
    int insertOperators(OperatorsEntity operatorsEntity);


    int updateCourse(CourseEntity courseEntity);


    int updateGrade(GradeEntity gradeEntity);


    int updateStudent(StudentEntity studententity);


    int updateOperators(OperatorsEntity operatorsEntity);

    @Delete("delete from Course where CID = #{CID}")
    int deleteCourse(@Param("CID") String CID);

    @Delete("delete from Grade where CID = #{CID}")
    int deleteGrade(@Param("CID") String CID);

    @Delete("delete from Student where STUID = #{STUID}")
    int deleteStudent(@Param("STUID") String STUID);

    @Delete("delete from Operators where AID = #{AID}")
    int deleteOperators(@Param("AID") String AID);

}
