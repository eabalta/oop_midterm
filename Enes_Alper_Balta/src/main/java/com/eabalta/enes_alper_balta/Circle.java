/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eabalta.enes_alper_balta;

/**
 *
 * @author Balta
 */
public class Circle implements Shape{
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle,radius=" + radius;
    }

    @Override
    public double cevreHesapla() {
        return 2* Math.PI * radius;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * Math.pow(radius, 2);
    }
    
}
