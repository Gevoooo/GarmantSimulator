/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.garmantsimulator;

import java.util.Scanner;

/**
 *
 * @author main
 */
public class Main {
    
    private static GarmantFactory factory;
    
    public static void main(String[] args) {
        factory = new GarmantFactory();
        Scanner scnr = new Scanner(System.in);
        System.out.println("What type of clothes would you like?\n(Professional, Casual, Party)");
        String style = scnr.nextLine().toLowerCase();
        System.out.println("What clothes are you looking for?\n(Tops, Pants, Shoes)");
        String item = scnr.nextLine().toLowerCase();
        Garmant newClothes = factory.getGarmant(item, style);
        System.out.println("How about a " + newClothes + "?");
    }
}
