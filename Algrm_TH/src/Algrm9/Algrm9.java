/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algrm9;

import java.util.Scanner;
import LibraryOfAlgrm.MathFunctions;

/**
 *
 * @author Tung
 */
public class Algrm9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, k, n;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap k: ");
        k = sc.nextInt();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Ket qua: "+MathFunctions.nhanBinhPhuongLap(a, k, n));
    }
}
