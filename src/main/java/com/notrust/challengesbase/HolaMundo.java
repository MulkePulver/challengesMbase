package com.notrust.challengesbase;

import java.util.Scanner;

public class HolaMundo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double n = sc.nextDouble();
        double m = n * 2;
        System.out.println("Resultado: " + m);
    }
}