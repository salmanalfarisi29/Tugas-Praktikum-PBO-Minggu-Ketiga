/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biginteger;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Salman Alfarisi
 */
public class big_integer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        BigInteger pertambahan = a.add(b);   
        BigInteger perkalian = a.multiply(b);
        
        System.out.println(pertambahan+"\n"+perkalian);
     }
}

