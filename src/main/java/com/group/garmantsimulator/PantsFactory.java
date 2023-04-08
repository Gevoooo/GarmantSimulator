/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.garmantsimulator;

/**
 *
 * @author main
 */
public class PantsFactory {
    
    public String getGarmant(String style) {
        switch (style) {
            case "professional":
                return "dress pants";
            case "casual":
                return "jeans";
            case "party":
                return "checker design pants";
            default:
                return null;
        }
    }
}
