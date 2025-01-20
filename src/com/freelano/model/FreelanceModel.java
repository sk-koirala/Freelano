/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.freelano.model;

/**
 *
 * 
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Suyash Koirala
 */
public class FreelanceModel {
    private int FreelanceID;
    private String name;
    private String expertise;
    private short age;
    private String project;
    private String address;

    public FreelanceModel(int FreelanceID, String name, String expertise,  String address,String project, short age) {
        this.FreelanceID = FreelanceID;
        this.name = name;
        this.expertise = expertise;
        this.age = age;
        this.project = project;
        this.address = address;
    }

    public FreelanceModel() {
    }

    public int getFreelanceID() {
        return FreelanceID;
    }

    public void setFreelanceID(int FreelanceID) {
        this.FreelanceID = FreelanceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}

