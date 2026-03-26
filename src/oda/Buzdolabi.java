/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oda;

public class Buzdolabi {
    Konum konum; //Konum sınıfındaki konum nesnesi tanımlanır
    String renk;
    int yuksek, genis;
    
    public void setBuzdolabi(Konum konum, String renk, int yuksek, int genis){ //buzdolabının özrlliklerini ayarlamak için
        this.konum = konum;
        this.renk = renk;
        this.yuksek = yuksek;
        this.genis = genis;
    }
    
    public void yeriniDegistir(Konum konum2){ //Girilen konum bilgisine göre buzdolabının konumu değişir.
        this.konum = konum2;
    }
    
    public int alanHesapla(){ //Buzdolabının alanını hesaplar.
        return yuksek * genis;
    }
    
    public void yazdir(){ //Buzdolabının bilgilerini ekrana yazdırır.
        System.out.println("Buzdolabının Konumu: "+konum+"\n"+"Buzdolabının Rengi: "+renk+"\n"+"Buzdolabının yüksekliği: "+yuksek+"\n"+"Buzdolabının genişliği: "+genis);
    }
}
