/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase41;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase41 {
    public static int nhanBinhPhuongLap(int a, int k, int n) {
        int b = 1;
        if (k == 0) {
            return b;
        }
        int A = a;
        int t = (int) Math.round(Math.log(k) / Math.log(2));
        if (k % 2 == 1) {
            b = a;
        }
        k = k >> 1;
        for (int i = 1; i <= t; i++) {
            A = (int) Math.pow(A, 2) % n;
            if (k % 2 == 1) {
                b = A * b % n;
            }
            k = k >> 1;
        }
        return b;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao a: ");
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.println("Vui long nhap so nguyen duong: ");
            a = sc.nextInt();
        }
        System.out.print("Nhap vao k: ");
        int k = sc.nextInt();
        while (k <= 0) {
            System.out.println("Vui long nhap so nguyen duong: ");
            k = sc.nextInt();
        }
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Vui long nhap so nguyen duong: ");
            n = sc.nextInt();
        }
        if (isPrime(nhanBinhPhuongLap(a, k, n))) {
            System.out.println(a + "^" + k + " mod " + n + " la mot so nguyen to ("+nhanBinhPhuongLap(a, k, n)+")\n");
        } else {
            System.out.println(a + "^" + k + " mod " + n + " khong phai la mot so nguyen to ("+nhanBinhPhuongLap(a, k, n)+")\n");
        }
    }

}
