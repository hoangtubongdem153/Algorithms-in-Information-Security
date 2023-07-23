/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase32;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase32 {

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

    public static int randomSearch(int min, int max) {
        Random rand = new Random();
        int n = rand.nextInt(max - min + 1) + min;
        for (int i = 2; i < 100; i++) {
            if (n == i) {
                continue;
            }
            if (n % i == 0) {
                return randomSearch(min, max);
            }
        }
        if (isPrime(n)) {
            return n;
        }
        return randomSearch(min, max);
    }

    public static BigInteger modulo(BigInteger a, BigInteger k, BigInteger n) {
        BigInteger b = BigInteger.ONE;
        if (k.equals(BigInteger.ZERO)) {
            return b;
        }
        BigInteger A = a;
        int t = k.bitLength();
        if (k.testBit(0)) {
            b = a;
        }
        k = k.shiftRight(1);
        for (int i = 1; i <= t; i++) {
            A = A.multiply(A).mod(n);
            if (k.testBit(0)) {
                b = A.multiply(b).mod(n);
            }
            k = k.shiftRight(1);
        }
        return b;
    }

    public static BigInteger getFn(BigInteger p, BigInteger q) {
        return p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
    }

    public static BigInteger getE(BigInteger fn) {
        for (BigInteger e = BigInteger.valueOf(2); e.compareTo(fn) < 0; e = e.add(BigInteger.ONE)) {
            if (e.gcd(fn).equals(BigInteger.ONE)) {
                return e;
            }
        }
        return null;
    }

    public static BigInteger getD(BigInteger e, BigInteger fn) {
        return e.modInverse(fn);
    }

    public static BigInteger getCipherRSA(BigInteger plain, BigInteger e, BigInteger n) {
        return modulo(plain, e, n);
    }

    public static BigInteger getPlainRSA(BigInteger cipher, BigInteger d, BigInteger n) {
        return modulo(cipher, d, n);
    }

    public static void main(String[] args) {
        int p = randomSearch(100, 500);
        int q = randomSearch(100, 500);
        System.out.println("p,q = " + p + "," + q);
        BigInteger n = BigInteger.valueOf(p).multiply(BigInteger.valueOf(q));
        System.out.println("n = " + n);
        BigInteger fn = getFn(BigInteger.valueOf(p), BigInteger.valueOf(q));
        BigInteger e = getE(fn);
        BigInteger d = getD(e, fn);
        System.out.println("fn = " + fn);
        System.out.println("e = " + e);
        System.out.println("d = " + d);
        System.out.print("Nhap vao ban thong diep: ");
        Scanner sc = new Scanner(System.in);
        BigInteger plain = sc.nextBigInteger();
        BigInteger cipher = getCipherRSA(plain, e, n);
        System.out.println("Thong diep: " + plain);
        System.out.println("Ban ma: " + cipher);
        System.out.println("Thong diep sau khi giai ma: " + getPlainRSA(cipher, d, n));
    }
}
