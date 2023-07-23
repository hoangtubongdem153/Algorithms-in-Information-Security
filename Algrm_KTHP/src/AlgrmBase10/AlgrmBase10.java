/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Câu 10. 
Viết chương trình đếm số ước và số ước nguyên tố của
một số N nhập vào từ bàn phím.
*/
package AlgrmBase10;

import LibraryOfAlgrm.XuLySNT;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int n = sc.nextInt();
        while(n<1){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        int count = 1;
        int countPrime = 0;
        if (XuLySNT.isPrime(n)) {
            countPrime = 1;
        }
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                if (XuLySNT.isPrime(i)) {
                    countPrime++;
                }
            }
        }
        System.out.println("Co "+count+" uoc ,trong do co "+countPrime+" uoc la so nguyen to");
    }
}
