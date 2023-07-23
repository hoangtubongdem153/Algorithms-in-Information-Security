/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase21;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;
/**
 *
 * @author Tung
 */
public class AlgrmBase21 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao A (A>1) : ");
        int a = sc.nextInt();
        while(a<=1){
            System.out.print("Moi ban nhap lai: ");
            a=sc.nextInt();
        }
        System.out.print("Nhap vao B (B>A) : ");
        int b = sc.nextInt();
        while(b<=a){
            System.out.print("Moi ban nhap lai: ");
            b=sc.nextInt();
        }
        boolean[] prime = XuLySNT.eratothenes(b);

        int count = 0;
        for (int i = 1; i < a; i++) {
            if (prime[i]) {
                count++;
            }
        }
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (prime[count]) {
                result++;
            }
            if (prime[i]) {
                count++;
            }
        }
        System.out.println("Co " + result + " so sieu nguyen to trong khoang [" + a + "," + b + "] ");
    }
}
