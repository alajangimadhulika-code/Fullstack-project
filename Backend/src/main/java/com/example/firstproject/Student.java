package com.example.firstproject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String studentName;

    @Column
    private String branch;

    @Column
    private String subject;

    @Column
    private Integer marks;

    @Column
    private String section;

    // Getters
    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getBranch() {
        return branch;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getSection() {
        return section;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
