package org.example;

import org.example.state.Avion;
import org.example.state.AvionImpl;

public class Main {
    public static void main(String[] args) {
        Avion avion=new AvionImpl();
        avion.doActivity();
        System.out.println("---------------------------------------");
        avion.sortirDuGarage();
        System.out.println("---------------------------------------");
        avion.doActivity();
        System.out.println("---------------------------------------");
        avion.entrerAuGarage();
        System.out.println("---------------------------------------");
        avion.doActivity();
        System.out.println("-------------------");
        avion.decoller();
        avion.atterir();
        avion.sortirDuGarage();
        System.out.println("-------------------");
        avion.doActivity();
        avion.decoller();
        System.out.println("-------------------");
        avion.doActivity();
        avion.entrerAuGarage();
        avion.decoller();
        avion.atterir();
        System.out.println("-------------------");
        avion.doActivity();
    }
}