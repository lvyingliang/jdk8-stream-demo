package com.jdk8.lyl.model;

import java.util.Objects;

public class Teacher {

    // 学校名称
    private String schoolName;
    // 班级
    private String grade;

    public Teacher(String schoolName, String grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public Teacher() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "schoolName='" + schoolName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(schoolName, teacher.schoolName) &&
                Objects.equals(grade, teacher.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, grade);
    }
}
