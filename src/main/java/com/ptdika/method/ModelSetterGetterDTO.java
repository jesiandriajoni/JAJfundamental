package main.java.com.ptdika.method;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 03/09/2024 21:58
@Last Modified 03/09/2024 21:58
Version 1.0
*/
public class ModelSetterGetterDTO {
    private String username;
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
