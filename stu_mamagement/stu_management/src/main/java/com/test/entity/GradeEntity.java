package com.test.entity;

public class GradeEntity
{
    private double Grade;
    private double GPA;
    private String STUID;
    private int Score;
    private String Class_name;
    private String Student_name;
    private String Syear;
    private int Term;
    private String CID;
    private int Pass;

    public GradeEntity(double Grade,
    double GPA,
    String STUID
    ,int Score
    ,String Class_name
    , String Student_name
    , String Syear
    , int Term
    , String CID
    , int Pass)
    {
        this.Grade = Grade;
        this.GPA = GPA;
        this.STUID = STUID;
        this.Score = Score;
        this.Class_name = Class_name;
        this.Student_name = Student_name;
        this.Syear = Syear;
        this.Term = Term;
        this.CID = CID;
        this.Pass = Pass;
    }

    public GradeEntity()
    {

    }


    public int getPass() {
        return Pass;
    }

    public void setPass(int pass) {
        Pass = pass;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public int getTerm() {
        return Term;
    }

    public void setTerm(int term) {
        Term = term;
    }

    public String getSyear() {
        return Syear;
    }

    public void setSyear(String syear) {
        Syear = syear;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getClass_name() {
        return Class_name;
    }

    public void setClass_name(String class_name) {
        Class_name = class_name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getSTUID() {
        return STUID;
    }

    public void setSTUID(String STUID) {
        this.STUID = STUID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "GradeEntity{" +
                "Grade=" + Grade +
                ", GPA=" + GPA +
                ", STUID='" + STUID + '\'' +
                ", Score=" + Score +
                ", Class_name='" + Class_name + '\'' +
                ", Student_name='" + Student_name + '\'' +
                ", Syear='" + Syear + '\'' +
                ", Term=" + Term +
                ", CID='" + CID + '\'' +
                ", Pass=" + Pass +
                '}';
    }
}
