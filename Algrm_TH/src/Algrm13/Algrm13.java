/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algrm13;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class Algrm13 {

    public static void main(String[] args) {
        int n, t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        n=sc.nextInt();
        while(n<1){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        System.out.print("Nhap so lan kiem tra t (t>=1): ");
        t=sc.nextInt();
        while(t<1){
            System.out.print("Moi ban nhap lai: ");
            t=sc.nextInt();
        }
        if(XuLySNT.isPrimeFermat(n, t)){
            System.out.println("La so nguyen to!");
        }else System.out.println("Khong la so nguyen to!");
    }
}
