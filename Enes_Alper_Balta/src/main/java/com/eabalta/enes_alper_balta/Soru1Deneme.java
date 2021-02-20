/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eabalta.enes_alper_balta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Balta
 * 
 * Enes Alper Balta - 05170000021
 */
public class Soru1Deneme {

    public static void main(String[] args) throws FileNotFoundException {
        // Shape nesnelerinin depolanacağı 5 elemanlı array burada oluşturuldu.
        // Ayrıca shapeArray'nin indexini tutmak için shapeArrayCount isimli bir int değer oluşturuluyor.
        Shape[] shapeArray = new Shape[5];
        int shapeArrayCount = 0;
        // txt dosyasının elemanlarını depolayacağım arrayListi oluşturuyorum.
        ArrayList text = new ArrayList();
        // txtyi okuma işlemini burada yapıyorum.
        Scanner s = new Scanner(new File("girdi.txt"));
        while (s.hasNext()) {
            text.add(s.next().trim());
        }
        // txt'de gelen elemanların isimlerine göre verileri ayırıyıp gereken nesneleri oluşturuyorum ve shapeArray içerisine ekliyorum.
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).equals("Circle")) {
                Circle c = new Circle(Double.parseDouble((String) text.get(++i)));
                shapeArray[shapeArrayCount] = c;
                shapeArrayCount++;
            } else if (text.get(i).equals("Rectangle")) {
                Rectangle r = new Rectangle(Double.parseDouble((String) text.get(++i)), Double.parseDouble((String) text.get(++i)));
                shapeArray[shapeArrayCount] = r;
                shapeArrayCount++;
            } else if (text.get(i).equals("DikUcgen")) {
                DikUcgen d = new DikUcgen(Double.parseDouble((String) text.get(++i)), Double.parseDouble((String) text.get(++i)));
                shapeArray[shapeArrayCount] = d;
                shapeArrayCount++;
            }
        }
        // Yazdırma işlemini burada yapıyorum.
        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println("%s\nÇevre:\t\t%.2f".formatted(shapeArray[i], shapeArray[i].cevreHesapla()) + "\nAlan:\t\t%.2f".formatted(shapeArray[i].alanHesapla()));
            if (shapeArray[i] instanceof DikUcgen) {
                DikUcgen d = (DikUcgen) shapeArray[i];
                d.tangentValues();
            }
            System.out.println("\n");
        }

    }

}
