package org.example;

public class User {

    String name;
    long id;
    int age;


    public User (){
    }

    public User( String userName, long userId, int userAge){
        this.name = userName;
        this.id = userId;
        this.age = userAge;
    }


    public String UpdateUserName() {
        if (name == null) {
            return name = "The old one";
        } else {
            return name = name + "Updated name";
        }
    }



}
