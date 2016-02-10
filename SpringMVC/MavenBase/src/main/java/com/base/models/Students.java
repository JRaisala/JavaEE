package com.base.models;
// Generated Feb 10, 2016 12:49:17 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Students generated by hbm2java
 */
public class Students  implements java.io.Serializable {


     private Integer id;
     private String SName;
     private String address;
     private String email;
     private String phone;
     private Set relTables = new HashSet(0);

    public Students() {
    }

	
    public Students(String SName, String address) {
        this.SName = SName;
        this.address = address;
    }
    public Students(String SName, String address, String email, String phone, Set relTables) {
       this.SName = SName;
       this.address = address;
       this.email = email;
       this.phone = phone;
       this.relTables = relTables;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSName() {
        return this.SName;
    }
    
    public void setSName(String SName) {
        this.SName = SName;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set getRelTables() {
        return this.relTables;
    }
    
    public void setRelTables(Set relTables) {
        this.relTables = relTables;
    }




}


