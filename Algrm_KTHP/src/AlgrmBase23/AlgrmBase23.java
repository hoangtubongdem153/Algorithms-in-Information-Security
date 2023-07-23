/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase23;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class AlgrmBase23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao A (A>0): ");
        int a = sc.nextInt();
        while(a<1){
            System.out.print("Moi ban nhap lai: ");
            a=sc.nextInt();
        }
        System.out.print("Nhap vao B (B>A): ");
        int b = sc.nextInt();
        while(b<=a){
            System.out.print("Moi ban nhap lai: ");
            b=sc.nextInt();
        }

        boolean[] prime = XuLySNT.eratothenes(b);
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (prime[i]) {
                sum += i;
            }
        }

        if (XuLySNT.isPrime(sum)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
