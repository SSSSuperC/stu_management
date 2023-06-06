package com.test.service;

import com.test.entity.CourseEntity;
import com.test.entity.GradeEntity;
import com.test.entity.OperatorsEntity;
import com.test.entity.StudentEntity;

import java.util.List;

public interface Service {
    //查询
    public List<CourseEntity> getTestList();
    public List<GradeEntity> getGradeList();
    public List<StudentEntity> getStudentList();
    public List<OperatorsEntity> getOperatorsList();

    //插入
    int insertTest(CourseEntity testEntity);
    int insertGrade(GradeEntity gradeEntity);
    int insertStudent(StudentEntity studentEntity);
    int insertOperators(OperatorsEntity operatorsEntity);

    //按需求查询
    CourseEntity getCourseByCID(String CID);
    GradeEntity getGradeByCID(String CID);
    StudentEntity getStudentBySTUID(String STUID);
    OperatorsEntity getOperatorsByAID (String  AID);

    //更新
    int updateCourse(CourseEntity courseEntity);
    int updateGrade(GradeEntity gradeEntity);
    int updateStudent(StudentEntity studentEntity);
    int updateOperators(OperatorsEntity operatorsEntity);

    int deleteCourse(String cid);

    int deleteGrade(String cid);

    int deleteStudent(String stuid);

    int deleteOperators(String aid);
}
