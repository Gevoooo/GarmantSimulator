/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.garmantsimulator;

/**
 *
 * @author main
 */
public class TopFactory {
    
    public String getGarmant(String style) {
        switch (style) {
            case "professional":
                return "button-down shirt";
            case "casual":
                return "white long sleaved shirt";
            case "party":
                return "floral dress";
            default:
                return null;
        }
    }
}
