/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan42;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class TesterTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        System.out.println("Saldo Anda Sekarang : " 
                + tabungan.ambilUang(scanner.nextInt()));
    }
    
}
