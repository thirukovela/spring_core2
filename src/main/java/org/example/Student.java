package org.example;

public class Student {

    private String name;
    private String grade;
    private String section;
    private int rollNo;

    public Student() {
    }
    public Student(String name, String grade, String section, int rollNo) {
        this.name = name;
        this.grade = grade;
        this.section = section;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", section='" + section + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
