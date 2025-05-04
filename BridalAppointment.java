package com.example.StyleMatch.model;

import jakarta.persistence.*;

@Entity
public class BridalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;
    private String mobile;
    private String email;
    private String service;
    private String date;
    private String startTime;
    private String startAMPM;
    private String endTime;
    private String endAMPM;
    private String address;

    // No-args constructor
    public BridalAppointment() {
    }

    // All-args constructor
    public BridalAppointment(Long id, String firstName, String lastName, String gender, String mobile, String email,
                             String service, String date, String startTime, String startAMPM,
                             String endTime, String endAMPM, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.service = service;
        this.date = date;
        this.startTime = startTime;
        this.startAMPM = startAMPM;
        this.endTime = endTime;
        this.endAMPM = endAMPM;
        this.address = address;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartAMPM() {
        return startAMPM;
    }

    public void setStartAMPM(String startAMPM) {
        this.startAMPM = startAMPM;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndAMPM() {
        return endAMPM;
    }

    public void setEndAMPM(String endAMPM) {
        this.endAMPM = endAMPM;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

