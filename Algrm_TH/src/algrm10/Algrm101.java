/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class Algrm101 {

    static int n = 0;
    static Scanner sc = new Scanner(System.in);
    static List<Integer> list = new ArrayList<Integer>();

    /**
     * @param args the command line arguments
     */
    static void nhap() {
        while (n < 2) {
            System.out.print("Nhap n (n>=2) : ");
            n = sc.nextInt();
        }
    }

    static boolean isPrime(int k) {
        if (k < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(k); j++) {
            if (k % j == 0) {
                return false;
            }

        }
        return true;
    }

    static void cthongthuong() {
        int a = n;
        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        int d = list.size();
        System.out.println("Day so nguyen to (p<=n) : ");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }

    static void cSangErosthenes() {
        boolean[] Eros = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            Eros[i] = true;
        }
        //kiem tra
        for (int i = 2; i <= n; i++) {
            if (Eros[i] == true) {
                for (int j = 2 * i; j <= n; j += i) {
                    Eros[j] = false;
                }
            }
        }
        System.out.println("\nDay so nguyen to (p<=n) : ");
        for (int i = 2; i <= n; i++) {
            if (Eros[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static void cSangtrendoan() {
        System.out.print("\nNhap l: ");
        int l = sc.nextInt();
        System.out.print("Nhap r: ");
        int r = sc.nextInt();
        boolean[] Eros = new boolean[r - l + 1];
        for (int i = 0; i < r - l + 1; i++) {
            Eros[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(r); i++) {
            for (int j = max(i * i, (l + i - 1) / i * i); j <= r; j += i) {
                Eros[j - l] = false;
            }

        }
        System.out.println("Day so nguyen to (p<=n) : ");
        for (int i = max(l, 2); i <= r; i++) {
            if (Eros[i - l] == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        nhap();
        cthongthuong();
        cSangErosthenes();
        cSangtrendoan();
    }

}
