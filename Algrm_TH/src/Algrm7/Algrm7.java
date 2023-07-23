/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algrm7;

import LibraryOfAlgrm.MathFunctions;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class Algrm7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        while (a < 1) {
            System.out.print("Nhap a: ");
            a = sc.nextInt();
        }
        while (b < 1) {
            System.out.print("Nhap b: ");
            b = sc.nextInt();
        }

        System.out.print("Ket qua : u= (a,b)= " + MathFunctions.gcd(a, b) + "\n");
    }
}
