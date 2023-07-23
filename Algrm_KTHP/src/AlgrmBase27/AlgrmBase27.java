/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase27;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class AlgrmBase27 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao a (a>0): ");
        int a = sc.nextInt();
        while(a<1){
            System.out.print("Moi ban nhap lai: ");
            a=sc.nextInt();
        }
        System.out.print("Nhap vao b (1000>b>a): ");
        int b = sc.nextInt();
        while(b<=a || b>=1000){
            System.out.print("Moi ban nhap lai: ");
            b=sc.nextInt();
        }
        boolean[] prime = XuLySNT.eratothenes(b);
        boolean check = false;
        System.out.println("Cac cap so thoa man: ");
        for (int i = a; i < b; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (prime[XuLySNT.gcd(i, j)]) {
                    check = true;
                    System.out.print("(" + i + "," + j + ") ");
                }
            }
        }
        if (check==false) {
            System.out.println("Khong co cap so nao!");
        }
    }
}
