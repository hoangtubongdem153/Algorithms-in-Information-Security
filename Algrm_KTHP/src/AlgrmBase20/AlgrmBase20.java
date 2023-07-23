/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase20;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class AlgrmBase20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao m (m>0): ");
        int m = sc.nextInt();
        while(m<1 || m>=999){
            System.out.print("Moi ban nhap lai: ");
            m=sc.nextInt();
        }
        System.out.print("Nhap vao n (m<n<1000): ");
        int n = sc.nextInt();
        while(n<=m || n>=1000){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        System.out.print("Nhap vao d (0<d<1000): ");
        int d = sc.nextInt();
        while(d<1 || d>=1000){
            System.out.print("Moi ban nhap lai: ");
            d=sc.nextInt();
        }
        System.out.println("Cac cap so trong khoang [" + m + "," + n + "] co UCLN = " + d + " la: ");
        boolean check = false;
        for (int i = m + 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (XuLySNT.gcd(i, j) == d) {
                    check = true;
                    System.out.print("(" + i + "," + j + ") ");
                }
            }
        }
        if (check == false) {
            System.out.println("Khong co cap so nao!");
        }
    }

}
