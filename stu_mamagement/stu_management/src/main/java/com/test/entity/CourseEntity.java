package com.test.entity;

public class CourseEntity
{
    private String Course_name;
    private String Teacher_name;
    private String TID;
    private int Students_num;
    private String CID;

    public CourseEntity()
    {

    }

    public CourseEntity(String Course_name,String  Teacher_name,String TID,int Students_num , String CID)
    {
        this.Course_name = Course_name;
        this.Teacher_name = Teacher_name;
        this.TID = TID;
        this.Students_num = Students_num;
        this.CID = CID;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public int getStudents_num() {
        return Students_num;
    }

    public void setStudents_num(int students_num) {
        Students_num = students_num;
    }

    public String getTeacher_name() {
        return Teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        Teacher_name = teacher_name;
    }

    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    @Override
    public String  toString()
    {
        return "TestEntity{" +
                "Course_name = '" + Course_name + '\'' +
                ", Teacher_name = '" + Teacher_name + '\'' +
                ", TID = " + TID + '\'' +
                ", Students_num = " + Students_num + '\'' +
                ", CID = " + CID + '\'' ;
    }
}
