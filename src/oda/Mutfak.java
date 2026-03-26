/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oda;

import java.util.ArrayList;

public class Mutfak {
    int alan;
    int usedAlan = 0;
    ArrayList<Buzdolabi> buzdolaplari;  // Buzdolapları için dizi oluşturdum
    ArrayList<Fırın> firinlar;  // Fırın için dizi oluşturdum
    ArrayList<Masa> masalar;  // Masa için dizi oluşturdum
    
    public void setMutfak(int alan){
        this.alan = alan;  //mutfağın alanı
        this.buzdolaplari = new ArrayList<>();  //Eklenen buzdolaplarını diziye atıyor
        this.firinlar = new ArrayList<>();  //Eklenen fırınları diziye atıyor
        this.masalar = new ArrayList<>();  //Eklenen masaları diziye atıyor
    }
    
    public void esyaEkle(Buzdolabi b){
        int buzAlan = b.alanHesapla();  //buzdolabının alanı
        if(this.alan >= usedAlan + buzAlan ){  //eğer mutfağın alanı kullanılan alan + buzdolabının alanından büyükse
            buzdolaplari.add(b);
            usedAlan += buzAlan;
        }
        else{
            System.out.println("Buzdolabı eklenemedi, mutfak alanı yetersiz!");
        }
    }
    
    public void esyaEkle(Fırın f){
        int firinAlan = f.alanHesapla();  //fırının alanı
        if(this.alan >= usedAlan + firinAlan ){  //eğer mutfağın alanı kullanılan alan + fırının alanından büyükse
            firinlar.add(f);
            usedAlan += firinAlan;
        }
        else{
            System.out.println("Fırın eklenemedi, mutfak alanı yetersiz!");
        }
    }
    
    public void esyaEkle(Masa m){
        int masaAlan = m.alanHesapla();  //masanın alanı
        if(this.alan >= usedAlan + masaAlan ){  //eğer mutfağın alanı kullanılan alan + masanın alanından büyükse
            masalar.add(m);
            usedAlan += masaAlan;
        }
        else{
            System.out.println("Masa eklenemedi, mutfak alanı yetersiz!");
        }
    }
    
    public void listele(){
        System.out.println("Mutfaktaki eşyalar: ");
        
        if(buzdolaplari.isEmpty() && firinlar.isEmpty() && masalar.isEmpty()){ // esşya var mı diye kontrol ediyoruz.
            System.out.println("Mutfakta hiç eşya yok.");
            return;
        }
        
        //eşyaları yazdırıyoruz.
        for(Buzdolabi b : buzdolaplari){
            b.yazdir();
        }
        for(Fırın f : firinlar){
            f.yazdir();
        }
        for(Masa m : masalar){
            m.yazdir();
        }
    }   
}
