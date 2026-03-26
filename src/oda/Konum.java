/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oda;

public class Konum {
    int x, y;
    
    public Konum(int x, int y){ // oluşturulurkenki koordinatları ayarlar
        this.x = x;
        this.y = y;
    }
    
    public void konumBelirle(int x, int y){ // mevcut nesnenin koordinatlarını ayarlar
        this.x = x;
        this.y = y;
    }

    public String donustur(){ // int koordinatları stringe çevirip (x,y) formatında yazdırır
        return "(" + String.valueOf(x) + ", " + String.valueOf(y) + ")";
    }
}
