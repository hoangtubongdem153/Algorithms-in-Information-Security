/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase37;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase37 {

    public static ArrayList<Integer> failure(char[] p) {
        ArrayList<Integer> f = new ArrayList<>();
        f.add(-1);
        for (int i = 1; i < p.length; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (isSame(p, 0, j, i - j, i)) {
                    count = j;
                }
            }
            f.add(count);
        }
        return f;
    }

    public static boolean isSame(char[] p, int start1, int end1, int start2, int end2) {
        if (end1 - start1 != end2 - start2) return false;
        for (int i = 0; i < end1 - start1; i++) {
            if (p[start1 + i] != p[start2 + i]) return false;
        }
        return true;
    }

    public static int Knuth_Morris_Pratt(char[] p, char[] T) {
        ArrayList<Integer> f = failure(p);
        int i = 0;
        int j = 0;
        while (i <= (T.length - p.length)) {
            while ((j < p.length) && (p[j] == T[i + j])) {
                j += 1;
            }
            if (j == p.length) {
                return i;
            } else {
                i = i + j - f.get(j);
                if (f.get(j) == -1) j = 0;
                else j = f.get(j);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao s1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhap vao s2: ");
        String s2 = sc.nextLine();
        while ((s1.length()) > (s2.length())) {
            System.out.println("Moi ban nhap lai!");
            System.out.print("Nhap vao s1: ");
            s1 = sc.nextLine();
            System.out.print("Nhap vao s2: ");
            s2 = sc.nextLine();

        }
        int res = Knuth_Morris_Pratt(s1.toCharArray(), s2.toCharArray());
        if (res == -1) {
            System.out.println("Khong tim thay s1 trong s2 !");
        } else {
            System.out.println("Tim thay s1 tai vi tri: " + res);
        }
    }
}

