package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    Integer id;

    @Column(name="studentName")
    String studentName;

    @Column(name="rollNo")

    Long rollNo;

    @Column(name = "branch")
    String studentBranch;

    @Column(name = "enrollmentYear")
    Long enrollmentYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public Long getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Long enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }
}
