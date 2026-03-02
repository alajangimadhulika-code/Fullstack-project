package com.example.firstproject;

import jakarta.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int xyz;

    @Column
    String username;

    @Column
    String email;

    @Column
    String password;

    // ✅ NEW COLUMN
    @Column
    String department;

    // GETTERS
    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDepartment() {
        return this.department;
    }

    // SETTERS (should be public)
    public void setUsername(String n) {
        this.username = n;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
