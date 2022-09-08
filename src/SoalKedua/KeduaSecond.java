/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalKedua;
import java.util.Scanner;

/**
 *
 * @author Salman Alfarisi
 */
public class KeduaSecond {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s", s1);
                System.out.printf("%03d%n", x );
            }
            System.out.println("================================");

    }
}
