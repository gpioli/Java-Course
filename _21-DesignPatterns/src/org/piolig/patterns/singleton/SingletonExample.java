package org.piolig.patterns.singleton;

public class SingletonExample {

    public static void main(String[] args) {

        DBConnectionSingleton con = null;
        for(int i = 0;  i < 10; i++) {
            con = DBConnectionSingleton.getInstance();
            System.out.println("con = " + con);
        }

        DBConnectionSingleton con2 = DBConnectionSingleton.getInstance();
        DBConnectionSingleton con3 = DBConnectionSingleton.getInstance();
        boolean b1 = ((con == con2) && (con2 == con3) && (con == con3));
        System.out.println("b1 = " + b1);

    }

}
