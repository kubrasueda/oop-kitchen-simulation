/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oda;
//buzdolabındaki açıklamaların aynısı
public class Fırın {
    Konum konum;
    String renk;
    int uzun, genis;
    
    public void setFirin(Konum konum, String renk, int uzun, int genis){
        this.konum = konum;
        this.renk = renk;
        this.uzun = uzun;
        this.genis = genis;
    }
    
    public void yeriniDegistir(Konum konum2){
        this.konum = konum2;
    }
    
    public int alanHesapla(){
        return uzun * genis;
    }
    
    public void yazdir(){
        System.out.println("Fırının Konumu: "+konum+"\n"+"Fırının Rengi: "+renk+"\n"+"Fırın yüksekliği: "+uzun+"\n"+"Fırın genişliği: "+genis);
    }
}
