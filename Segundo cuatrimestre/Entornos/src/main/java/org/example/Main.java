package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try {
            Singleton instance = Singleton.getInstance();

            System.out.println();

        }catch (Exception e) {
            System.err.println(e.getMessage());

        }




    }
}