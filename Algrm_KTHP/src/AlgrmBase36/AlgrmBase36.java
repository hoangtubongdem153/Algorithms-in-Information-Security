/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *Thuật toán BM hiệu quả trong chuỗi chứa tập kí tự lớn như bảng chữ cái lớn A..Z,a..z,1..9,..
 * Không hiệu quả trong trường chứa tập kí tự nhỏ như nhị phân
 */
package AlgrmBase36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AlgrmBase36 {

    public static Object[] lastOccurrence(char[] p, char[] T) {
        ArrayList<Character> x = new ArrayList<>();
        for (char c : T) {
            if (!x.contains(c)) {
                x.add(c);
            }
        }
        x.sort(Character::compareTo);
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            int vt = -1;
            for (int j = p.length - 1; j >= 0; j--) {
                if (p[j] == x.get(i)) {
                    vt = j;
                    break;
                }
            }
            f.add(vt);
        }
        return new Object[]{x, f};
    }

    public static int Boyer_Moore(char[] p, char[] T) {
        Object[] res = lastOccurrence(p, T);
        ArrayList<Character> x = (ArrayList<Character>) res[0];
        ArrayList<Integer> f = (ArrayList<Integer>) res[1];
        HashMap<Character, Integer> L = new HashMap<>();
        for (int i = 0; i < x.size(); i++) {
            L.put(x.get(i), f.get(i));
        }
        int i = p.length - 1;
        int j = p.length - 1;
        while (i < T.length) {
            while ((j >= 0) && (T[i] == p[j])) {
                i -= 1;
                j -= 1;
            }
            if (j == -1) {
                return i + 1;
            } else {
                i = i + p.length - Math.min(j, 1 + L.getOrDefault(T[i], -1));
                j = p.length - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        while ((s1.length()) > (s2.length())) {
            System.out.println("Moi ban nhap lai!");
            System.out.print("Nhap vao s1: ");
            s1 = sc.nextLine();
            System.out.print("Nhap vao s2: ");
            s2 = sc.nextLine();

        }

        int res = Boyer_Moore(s1.toCharArray(), s2.toCharArray());
        if (res == -1) {
            System.out.println("Khong tim thay s");
        } else {
            System.out.println("Tim thay s tai vi tri: " + res);
        }
    }
}
