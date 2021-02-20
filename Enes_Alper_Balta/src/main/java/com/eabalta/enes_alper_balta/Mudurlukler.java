/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eabalta.enes_alper_balta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Balta
 */
public class Mudurlukler extends FirmaBilesen {

    private String mudurlukAdi;
    List<FirmaBilesen> list;
    String temp = "";

    public Mudurlukler(String mudurlukAdi) {
        this.mudurlukAdi = mudurlukAdi;
        list = new java.util.ArrayList<>();
    }

    public void ekle(FirmaBilesen bilesen) {
        list.add(bilesen);
    }

    @Override
    int maliyet() {
        int maliyet = 0;
        for (int i = 0; i < list.size(); i++) {
            maliyet += list.get(i).maliyet();
        }
        return maliyet;
    }

    @Override
    public String toString() {
        temp+="\n"+this.mudurlukAdi+"\n";
        for (int i = 0; i < list.size(); i++) {
            temp+=list.get(i)+"\n";
        }
        return temp; 
    }
    
}
