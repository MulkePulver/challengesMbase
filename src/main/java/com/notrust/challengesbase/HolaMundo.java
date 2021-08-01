package com.notrust.challengesbase;

import java.util.Scanner;

public class HolaMundo { 
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Paco: ");
        int EdadHugo = 30;
        int EdadPaco = sc.nextInt(EdadHugo / 2) -4;
        int EdadLuis = (EdadHugo + EdadPaco) * 5;
        System.out.println("Edad de Paco, Hugo y Luis:" + EdadPaco + " " + EdadHugo + " " + EdadLuis);
        if (EdadLuis <= 20)
            System.out.println("Se encuentra en etapa 1");
        else if (EdadLuis <= 30)
            System.out.println("Se encuentra en etapa 2");
        else if (EdadLuis <= 50)
            System.out.println("Se encuentra en etapa 3");
        else if (EdadLuis >= 50)
            System.out.println("Se encuentra en etapa 4");
    }
}