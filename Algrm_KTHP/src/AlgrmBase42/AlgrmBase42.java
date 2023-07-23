/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase42;

import java.util.Random;

/**
 *
 * @author Tung
 */
public class AlgrmBase42 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int RandomSearchPrime(Random rand) {
        int n = rand.nextInt(999-2+1) + 2;
        if(n==2 || n==3){
            return n;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return RandomSearchPrime(rand);
        }
        return n;
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
        int p = RandomSearchPrime(rand);
        int q = RandomSearchPrime(rand);

        System.out.println("So p va q sau sinh la: " + p + " , " + q);
        System.out.print("Cac so a thoa man la: ");
        boolean empty = true;
        for (int a = 1; a < 100; a++) {
            if (isPrime(nhanBinhPhuongLap(a, p, q))) {
                System.out.print(a + " ");
                empty = false;
            }
        }
        if (empty) {
            System.out.print("Khong co so nao");
        }
    }
}
