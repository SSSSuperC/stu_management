package com.test.service.imp;

import com.test.entity.GradeEntity;
import com.test.entity.OperatorsEntity;
import com.test.entity.StudentEntity;
import com.test.service.Service;
import com.test.entity.CourseEntity;
import com.test.mapper.TestMapper;

import javax.annotation.Resource;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service {
    @Resource
    TestMapper mapper;

    @Override
    public List<CourseEntity> getTestList() {
        return mapper.getTestList();
    }

    @Override
    public List<GradeEntity> getGradeList() {
        return mapper.getGradelist();
    }

    @Override
    public List<StudentEntity> getStudentList() {
        return mapper.getStudentlist();
    }

    @Override
    public List<OperatorsEntity> getOperatorsList() {
        return mapper.getOpearatorslist();
    }

    @Override
    public int insertTest(CourseEntity testEntity)
    {
        return mapper.insertTest(testEntity);
    }

    @Override
    public int insertGrade(GradeEntity gradeEntity) {
        return mapper.insertGrade(gradeEntity);
    }

    @Override
    public int insertStudent(StudentEntity studentEntity) {
        return mapper.insertStudent(studentEntity);
    }

    @Override
    public int insertOperators(OperatorsEntity operatorsEntity) {
        return mapper.insertOperators(operatorsEntity);
    }

    @Override
    public CourseEntity getCourseByCID(String CID) {
        // 写逻辑
        CourseEntity CourseByCID = mapper.getCourseByCID(CID);
        return CourseByCID;
    }

    @Override
    public GradeEntity getGradeByCID(String CID) {
        // 写逻辑
        GradeEntity GradeByCID = mapper.getGradeByCID(CID);
        return GradeByCID;
    }

    @Override
    public StudentEntity getStudentBySTUID(String STUID) {
        // 写逻辑
        StudentEntity StudentBySTUID = mapper.getStudentBySTUID(STUID);
        return StudentBySTUID;
    }

    @Override
    public OperatorsEntity getOperatorsByAID(String AID) {
        // 写逻辑
        OperatorsEntity OperatorsByAID = mapper.getOperatorsByAID(AID);
        return OperatorsByAID;
    }

    @Override
    public int updateCourse(CourseEntity courseEntity)
    {
        return mapper.updateCourse(courseEntity);
    }

    @Override
    public int updateGrade(GradeEntity gradeEntity)
    {
        return mapper.updateGrade(gradeEntity);
    }

    @Override
    public int updateStudent(StudentEntity studentEntity)
    {
        return mapper.updateStudent(studentEntity);
    }

    @Override
    public int updateOperators(OperatorsEntity operatorsEntity)
    {
        return mapper.updateOperators(operatorsEntity);
    }

    @Override
    public int deleteCourse(String CID)
    {
        return mapper.deleteCourse(CID);
    }

    @Override
    public int deleteGrade(String CID)
    {
        return mapper.deleteGrade(CID);
    }

    @Override
    public int deleteStudent(String STUID)
    {
        return mapper.deleteStudent(STUID);
    }

    @Override
    public int deleteOperators(String AID)
    {
        return mapper.deleteOperators(AID);
    }

}
