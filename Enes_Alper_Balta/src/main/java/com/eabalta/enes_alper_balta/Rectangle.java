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
public class Rectangle implements Shape{
    
    private double height,weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Rectangle,height=" + height + " weight=" + weight;
    }

    @Override
    public double cevreHesapla() {
        return 2*(height+weight);
    }

    @Override
    public double alanHesapla() {
        return height*weight;
    }
    
}
