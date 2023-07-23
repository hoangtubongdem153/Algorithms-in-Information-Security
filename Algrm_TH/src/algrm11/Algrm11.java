/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm11;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class Algrm11 {

    /**
     * @author Tran Thanh Tung
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Cac thua so nguyen to cua " + n + " la: " + XuLySNT.phantichthuaso(n) + "\n");
    }
}
