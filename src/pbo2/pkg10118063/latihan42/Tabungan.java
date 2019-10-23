/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan42;

/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan (int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return saldo-jumlah;
    }
}
