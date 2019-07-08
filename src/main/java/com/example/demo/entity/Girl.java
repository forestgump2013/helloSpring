package com.example.demo.entity;

import java.io.Serializable;

public class Girl implements Serializable {

    private static  final  long serialVersionUID=-3946734305303957850L;
    private static Girl ourInstance = new Girl();

    private  String tag;

    public static Girl getInstance() {
        return ourInstance;
    }

    private Girl() {
    }

    public  void setTag(String tag){
        this.tag=tag;
    }
}
