/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase19;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class AlgrmBase19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap C: ");
        int c = sc.nextInt();
        System.out.print("Nhap N (N>0): ");
        int n = sc.nextInt();
        while(n<1){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        System.out.print("Nhap M (M>N): ");
        int m = sc.nextInt();
        while(m<2){
            System.out.print("Moi ban nhap lai: ");
            m=sc.nextInt();
        }
        boolean empty=true;
        System.out.print("Cac so nguyen duong x thoa man la: ");
        for (int x = n; x <= m; x++) {
            if (XuLySNT.isPrime(a * x * x + b * x + c)) {
                System.out.print(x + " ");
                empty=false;
            }
        }
         if(empty==true){
            System.out.print("Khong co so nao!");
        }
   
    }
}
