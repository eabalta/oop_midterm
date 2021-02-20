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
public class Soru2Deneme {

    public static void main(String[] args) {
        Mudurlukler genelMudurluk = new Mudurlukler("Genel Müdürlük");
        Calisan calisan1 = new Calisan("Ali", 5000);
        Calisan calisan2 = new Calisan("Veli", 6000);
        genelMudurluk.ekle(calisan1);
        genelMudurluk.ekle(calisan2);

        Mudurlukler egeBolgeMudurluk = new Mudurlukler("Ege Bölge Müdürlüğü");
        Calisan calisan3 = new Calisan("Ayse", 4000);
        Calisan calisan4 = new Calisan("Can", 3000);
        egeBolgeMudurluk.ekle(calisan3);
        egeBolgeMudurluk.ekle(calisan4);

        Mudurlukler izmirIlMudurluk = new Mudurlukler("İzmir İl Müdürlüğü");
        Calisan calisan5 = new Calisan("Selim", 2000);
        Calisan calisan6 = new Calisan("Murat", 1500);
        Calisan calisan7 = new Calisan("Zeynep", 2500);
        izmirIlMudurluk.ekle(calisan5);
        izmirIlMudurluk.ekle(calisan6);
        izmirIlMudurluk.ekle(calisan7);
        
        egeBolgeMudurluk.ekle(izmirIlMudurluk);
        
        genelMudurluk.ekle(egeBolgeMudurluk);

        Mudurlukler akdenizBolgeMudurluk = new Mudurlukler("Akdeniz Bölge Müdürlüğü");
        Calisan calisan8 = new Calisan("Emre", 3000);
        Calisan calisan9 = new Calisan("Ahmet", 4000);
        akdenizBolgeMudurluk.ekle(calisan8);
        akdenizBolgeMudurluk.ekle(calisan9);

        Mudurlukler antalyaIlMudurluk = new Mudurlukler("Antalya İl Müdürlüğü");
        Calisan calisan10 = new Calisan("Bahar", 2500);
        Calisan calisan11 = new Calisan("Sedat", 1500);
        Calisan calisan12 = new Calisan("Vedat", 2500);
        antalyaIlMudurluk.ekle(calisan10);
        antalyaIlMudurluk.ekle(calisan11);
        antalyaIlMudurluk.ekle(calisan12);

        akdenizBolgeMudurluk.ekle(antalyaIlMudurluk);
        
        genelMudurluk.ekle(akdenizBolgeMudurluk);

        System.out.println("Ege Bölge Müdürlüğü Toplam Maliyeti :\t\t"+egeBolgeMudurluk.maliyet());
        System.out.println("Akdeniz Bölge Müdürlüğü Toplam Maliyeti :\t"+akdenizBolgeMudurluk.maliyet());
        System.out.println("Genel Müdürlük Toplam Maliyeti :\t\t"+genelMudurluk.maliyet());

        System.out.println(genelMudurluk);
    }
}
