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
public class DikUcgen implements Shape{
    
    private double a,b,c;   //  c for hypotenuse

    public DikUcgen(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public String toString() {
        return "DikUcgen, a=" + a + " b=" + b + " c=" + c;
    }
    
    @Override
    public double cevreHesapla() {
        return a+b+c;
    }

    @Override
    public double alanHesapla() {
        return (a*b)/2;
    }
    
    public void tangentValues(){
        System.out.println("tan(%.0f/%.0f) :\t%.2f".formatted(a,b,(a/b))+"\ntan(%.0f/%.0f) :\t%.2f".formatted(b,a,(b/a)) );
    }
    
}
