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



//    User user = new User( "Aleksandr", 254146484, 19);
//    assertNotNull(user.name);
//    assertEquals("Aleksandr", user.name);


}
