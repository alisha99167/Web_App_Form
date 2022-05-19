package com.webappform.webappform.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;

    public String getFirstname(){
        return firstname;
    }
    
    public String getLastname(){
        return lastname;
    }
        
    public String getEmail(){
        return email;
    }
        
    public String getAddress(){
        return address;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAddress(String address){
        this.address = address;
    }
}

