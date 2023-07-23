/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase43;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase43 {

    public static int RandomSearchPrime(Random rand) {
        int n = rand.nextInt(100 - 2 + 1) + 2;
        if (n == 2 || n == 3) {
            return n;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return RandomSearchPrime(rand);
            }
        }
        return n;
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
        k >>= 1;
        for (int i = 1; i <= t; i++) {
            A = A * A % n;
            if (k % 2 == 1) {
                b = A * b % n;
            }
            k >>= 1;
        }
        return b;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int p = RandomSearchPrime(rand);
        System.out.println("So p sau sinh la: " + p);
        System.out.print("Nhap N (0<N<1000): ");
        int n = sc.nextInt();
        while (n <= 0 || n >=1000) {
            System.out.println("Vui long nhap so nguyen duong (0<N<1000): ");
            n = sc.nextInt();
        }
        System.out.println("Cac so a (a<"+n+") thoa man la: ");
        boolean empty = true;
        for (int a = 1; a < n; a++) {
            if (isPrime(nhanBinhPhuongLap(a, p, n))) {
                System.out.print(a + " ");
                empty = false;
            }
        }
        if (empty) {
            System.out.println("Khong co so nao");
        }
    }
}

