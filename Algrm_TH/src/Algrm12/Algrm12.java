/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algrm12;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class Algrm12 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n= new Scanner(System.in).nextInt();
        if(XuLySNT.isPrime(n)){
            System.out.println("La so nguyen to!");
        }else System.out.println("Khong la so nguyen to!");
    }
}
