package com.company;


import java.util.Scanner;

public class Main {
    static class formula{
        float x;
        float y;
        float z;
        public formula(float x, float y, float z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public void dispalayFormula(){
            double len = Math.sqrt ((Math.pow (x, 2) + (Math.pow (y, 2)) + (Math.pow (z, 2))));
            System.out.println ("Длина вектора: "+ len);

        }

    }

    public static void main(String[] args) {


            Scanner in = new Scanner (System.in);
            System.out.println ("Введите x:");
            int x = in.nextInt ();

            System.out.println ("Введите y:");
            int y = in.nextInt ();

            System.out.println ("Введите z:");
            int z = in.nextInt ();

            formula form =new formula (x,y,z);
            form.dispalayFormula ();


    }
}
