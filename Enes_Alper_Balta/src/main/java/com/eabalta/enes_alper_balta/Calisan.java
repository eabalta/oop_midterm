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
public class Calisan extends FirmaBilesen{
    
    private String adSoyad;
    private int maas;

    public Calisan(String adSoyad, int maas) {
        this.adSoyad = adSoyad;
        this.maas = maas;
    }

    @Override
    int maliyet() {
        return maas;
    }

    @Override
    public String toString() {
        return "Calisan - "+ adSoyad + ", maas " + maas;
    }
    
    
    
}
