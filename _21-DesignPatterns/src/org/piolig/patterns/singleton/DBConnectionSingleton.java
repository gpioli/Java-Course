package org.piolig.patterns.singleton;

public class DBConnectionSingleton {

    // private attribute
    private static DBConnectionSingleton instance;

    // private constructor
    private DBConnectionSingleton(){
        System.out.println("Connecting to the DB engine...");
    }

    public static DBConnectionSingleton getInstance(){
        if( !(instance instanceof DBConnectionSingleton)) { // this is an elegant way of saying this: (instance == null)
            instance = new DBConnectionSingleton();
        }
        return instance;
    }

}
