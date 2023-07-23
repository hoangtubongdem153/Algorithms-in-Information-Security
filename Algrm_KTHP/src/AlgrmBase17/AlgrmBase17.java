/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrmbase17;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class AlgrmBase17 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap C: ");
        int c = sc.nextInt();
        System.out.print("Nhap N(N>1): ");
        int n = sc.nextInt();
        while(n<2){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        for (int x = 1; x < n; x++) {
            if (XuLySNT.isPrime(a * x * x + b * x + c)) {
                System.out.print("So nguyen duong x nho nhat thoa man la: " + x+"\n");
                break;
            }
            if(x==n-1){
                System.out.print("Khong tim duoc x thoa man!\n");
            }
        }

    }
}
