/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oda;
//buzdolabındaki açıklamaların aynısı
public class Masa {
    Konum konum;
    String renk;
    int kisi;
    
    public void setMasa(Konum konum, String renk, int kisi){
        this.konum = konum;
        this.renk = renk;
        this.kisi = kisi;
    }
    
    public void yeriniDegistir(Konum konum2){
        this.konum = konum2;
    }
    
    public int alanHesapla(){
        return kisi * 2;
    }
    
    public void yazdir(){
        System.out.println("Masa Konumu : "+konum+"\n"+"Masa Rengi : "+renk+"\n"+"Kişi Sayısı : "+kisi);
    }
}
