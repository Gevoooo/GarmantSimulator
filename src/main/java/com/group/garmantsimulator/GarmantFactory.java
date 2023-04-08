/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.garmantsimulator;

/**
 *
 * @author main
 */
public class GarmantFactory {
    
    public Garmant getGarmant(String item, String style) {
        switch (item) {
            case "tops":
                TopFactory t = new TopFactory();
                return new Garmant(t.getGarmant(style));
            case "pants":
                PantsFactory p = new PantsFactory();
                return new Garmant(p.getGarmant(style));
            case "shoes":
                ShoeFactory s = new ShoeFactory();
                return new Garmant(s.getGarmant(style));
            default:
                return null;
        }
    }
}
