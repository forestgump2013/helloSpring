package com.example.demo.entity;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String realname;

    public  Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public  String getUsername(){
        return this.username;
    }

    public  void setPassword(String password){
        this.password=password;
    }

    public  String getPassword(){
        return  this.password;
    }

    public  void setRealname(String realname){
        this.realname=realname;
    }

    public  String getRealname(){
        return this.realname;
    }

    @Override
    public String toString() {
        return "User{"+
                "id="+id+",username='"+username+'\''+",password='"+password+"'"+",realname='"+realname+"'}";

    }
}
