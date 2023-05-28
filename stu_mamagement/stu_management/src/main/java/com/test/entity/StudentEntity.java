package com.test.entity;

public class StudentEntity
{
    private String Student_name;
    private String STUID;
    private String Address;
    private String Tel;
    private String Dorm;
    private String sex;
    private String IDclass;
    private String IDnum;
    private int Stu_year;
    private String Major;
    private String Class_name;

    public StudentEntity()
    {
    }

    public StudentEntity(String student_name, String STUID, String address, String tel, String dorm, String sex, String IDclass, String IDnum, int stu_year, String major, String class_name) {
        Student_name = student_name;
        this.STUID = STUID;
        Address = address;
        Tel = tel;
        Dorm = dorm;
        this.sex = sex;
        this.IDclass = IDclass;
        this.IDnum = IDnum;
        Stu_year = stu_year;
        Major = major;
        Class_name = class_name;
    }

    public String getClass_name() {
        return Class_name;
    }

    public void setClass_name(String class_name) {
        Class_name = class_name;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public int getStu_year() {
        return Stu_year;
    }

    public void setStu_year(int stu_year) {
        Stu_year = stu_year;
    }

    public String getIDnum() {
        return IDnum;
    }

    public void setIDnum(String IDnum) {
        this.IDnum = IDnum;
    }

    public String getIDclass() {
        return IDclass;
    }

    public void setIDclass(String IDclass) {
        this.IDclass = IDclass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDorm() {
        return Dorm;
    }

    public void setDorm(String dorm) {
        Dorm = dorm;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSTUID() {
        return STUID;
    }

    public void setSTUID(String STUID) {
        this.STUID = STUID;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "Student_name='" + Student_name + '\'' +
                ", STUID='" + STUID + '\'' +
                ", Address='" + Address + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Dorm='" + Dorm + '\'' +
                ", sex='" + sex + '\'' +
                ", IDclass='" + IDclass + '\'' +
                ", IDnum='" + IDnum + '\'' +
                ", Stu_year=" + Stu_year +
                ", Major='" + Major + '\'' +
                ", Class_name='" + Class_name + '\'' +
                '}';
    }
}
