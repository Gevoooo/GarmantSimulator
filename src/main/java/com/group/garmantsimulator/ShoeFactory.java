/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.garmantsimulator;

/**
 *
 * @author main
 */
public class ShoeFactory {
    
    public String getGarmant(String style) {
        switch (style) {
            case "professional":
                return "black high heels";
            case "casual":
                return "vans";
            case "party":
                return "glittery high heels";
            default:
                return null;
        }
    }
}
