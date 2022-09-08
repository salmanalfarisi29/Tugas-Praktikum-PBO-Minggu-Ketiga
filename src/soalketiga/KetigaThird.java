/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalketiga;
import java.util.Scanner;

/**
 *
 * @author Salman Alfarisi
 */
public class KetigaThird {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angka1, angka2, tambah, kurang, kali, bagi;
        char operasi;


        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("Setelah karakter harus menggunakan space");
            System.out.println("Masukkan angka: ");
            angka1 = in.nextDouble();
            operasi = in.next().charAt(0); // mengembalikan karakter pertama dalam string
            angka2 = in.nextDouble();

            switch (operasi) {
            case '+' -> {
                tambah = angka1 + angka2;
                System.out.println(tambah);
                }

            case '-' -> {
                kurang = angka1 - angka2;
                System.out.println(kurang);
                }
            case '*' -> {
                kali = angka1 * angka2;
                System.out.println(kali);
                }
            case '/' -> {
                bagi = angka1 / angka2;
                System.out.println(bagi);
                }
            }
        }
    }
}