/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalkeempat;
import java.util.Scanner;

/**
 *
 * @author Salman Alfarisi
 */
public class gaji_agent {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int gaji_pokok = 500000;
        float bonus = 0.1f;
        int harga_item = 50000;
        int penjualan = 0;
        
        System.out.println("================================");
        System.out.println("Masukkan jumlah penjualan :");
        penjualan = input.nextInt();
        if (penjualan > 40)
            bonus = 0.25f;
        else if (penjualan > 80)
            bonus = 0.35f;
        else if (penjualan < 15)
        {   //denda
            gaji_pokok-=(((15-penjualan)*50000)*0.15);
            bonus=0f;
        }
        System.out.println("Ini adalah gaji anda : ");
        System.out.println(gaji_pokok + (int)(bonus*(penjualan*harga_item)));
        System.out.println("================================");
    }
}
