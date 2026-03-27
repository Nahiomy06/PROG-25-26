package org.example;

public class Singleton {

    //variable estatica
    private static Singleton instance;

    //Constructor privado
    private Singleton() {}

    //Metodo público que sea estatico
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



