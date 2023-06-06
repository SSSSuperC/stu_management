package com.test.controller;

import com.test.entity.CourseEntity;
import com.test.entity.GradeEntity;
import com.test.entity.OperatorsEntity;
import com.test.entity.StudentEntity;
import com.test.mapper.TestMapper;
import com.test.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
// /test
public class TestController {
    @Autowired
    Service service;

    @GetMapping(value = "/getCourseList")
    public List<CourseEntity> getTestList() {
        return service.getTestList();
    }

    @GetMapping(value = "/getGradeList")
    public List<GradeEntity> getGradeList() {
        return service.getGradeList();
    }

    @GetMapping(value = "/getStudentList")
    public List<StudentEntity> getStudentList() {
        return service.getStudentList();
    }

    @GetMapping(value = "/getOperatorsList")
    public List<OperatorsEntity> getOperatorsList() {
        return service.getOperatorsList();
    }


    @PostMapping(value = "/insertCourse")
    int insertCourse(@RequestBody CourseEntity testEntity)
    {
        // 参数校验
        return service.insertTest(testEntity);
        // 统一接口返回值
    }

    @PostMapping(value = "/insertGrade")
    int insertGrade(@RequestBody GradeEntity gradeEntity)
    {
        // 参数校验
        return service.insertGrade(gradeEntity);
        // 统一接口返回值
    }

    @PostMapping(value = "/insertStudent")
    int insertStudent(@RequestBody StudentEntity testEntity)
    {
        // 参数校验
        return service.insertStudent(testEntity);
        // 统一接口返回值
    }

    @PostMapping(value = "/insertOperators")
    int insertOperators(@RequestBody OperatorsEntity testEntity)
    {
        // 参数校验
        return service.insertOperators(testEntity);
        // 统一接口返回值
    }

    @GetMapping(value = "/getCourseByCID")
    CourseEntity getCourseByCID(@RequestParam(value = "CID") String CID) {
        return service.getCourseByCID(CID);
    }

    @GetMapping(value = "/getGradeByCID")
    GradeEntity getGradeByCID(@RequestParam(value = "CID") String CID) {
        return service.getGradeByCID(CID);
    }

    @GetMapping(value = "/getStudentBySTUID")
    StudentEntity getStudentBySTUID(@RequestParam(value = "STUID") String STUID) {
        return service.getStudentBySTUID(STUID);
    }

    @GetMapping(value = "/getOperatorsByAID")
    OperatorsEntity getOperatorsByAID(@RequestParam(value = "AID") String AID)
    {
        return service.getOperatorsByAID(AID);
    }

    @PostMapping(value = "/updateCourse")
    int updateCourse(@RequestBody   CourseEntity courseEntity)
    {
        return service.updateCourse(courseEntity);
    }

    @PostMapping(value = "/updateGrade")
    int updateGrade(@RequestBody   GradeEntity gradeEntity)
    {
        return service.updateGrade(gradeEntity);
    }

    @PostMapping(value = "/updateStudent")
    int updateStudent(@RequestBody   StudentEntity studentEntity)
    {
        return service.updateStudent(studentEntity);
    }

    @PostMapping(value = "/updateOperators")
    int updateOperators(@RequestBody   OperatorsEntity operatorsEntity)
    {
        return service.updateOperators(operatorsEntity);
    }

    @DeleteMapping("/deleteCourse/{CID}")
    int deleteCourse(@PathVariable String CID)
    {
        return service.deleteCourse(CID);
    }

    @DeleteMapping("/deleteGrade/{CID}")
    int deleteGrade(@PathVariable String CID)
    {
        return service.deleteGrade(CID);
    }

    @DeleteMapping("/deleteStudent/{STUID}")
    int deleteStudent(@PathVariable String STUID)
    {
        return service.deleteStudent(STUID);
    }

    @DeleteMapping("/deleteOperators/{AID}")
    int deleteOperators(@PathVariable String AID)
    {
        return service.deleteOperators(AID);
    }

}
