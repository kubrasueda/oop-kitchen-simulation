/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oda;

import java.util.HashSet;


public class Oda {

    public static void main(String[] args) {
        Mutfak mut = new Mutfak(); // Mutfak sınıfını çağırdık
        mut.setMutfak(30); // mutfağın alanını metot çağırarak 30 m2 olarak belirledik
        
        Buzdolabi buz = new Buzdolabi(); // Buzdolabi sınıfını çağırdık
        Konum bk = new Konum(100,200); // metot çağırarak buzdolabının koordinaatlarını girdik
        buz.setBuzdolabi(bk, "Gri", 2, 1); // buzdolabının konumu, rengi yüksekliği ve genişliği ayarlanır
        
        Fırın frn = new Fırın();
        Konum fk = new Konum(200,200);
        frn.setFirin(fk, "Beyaz", 1, 1);
        
        Masa ms = new Masa();
        Konum mk = new Konum(20, 100);
        ms.setMasa(mk, "Kahverengi", 6); // masanın konumu, rengi ve kişi sayısı ayarlanır
        
        //mutfağa eşyaları ekledik
        mut.esyaEkle(buz);
        mut.esyaEkle(frn);
        mut.esyaEkle(ms);
        
        mut.listele(); // mutfakta olan eşyaları listelemek için
    }  
}