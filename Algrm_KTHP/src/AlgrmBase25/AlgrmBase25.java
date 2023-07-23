/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase25;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;
import java.util.ArrayList;

/**
 *
 * @author Tung
 */
public class AlgrmBase25 {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        while (n < 1 || n > 10000) {
            System.out.print("Nhap vao n (1<=n<=10000): ");
            n = sc.nextInt();
        }
        boolean[] prime = XuLySNT.eratothenes(n);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (prime[i]) {
                res.add(i);
            }
        }
        boolean check = false;
        for (int i = 0; i < res.size() - 2; i++) {
            for (int j = i + 1; j < res.size() - 1; j++) {
                if (res.get(i) + res.get(j) >= n) {
                    break;
                }
                for (int k = j + 1; k < res.size(); k++) {
                    int tmp = res.get(i) + res.get(j) + res.get(k);
                    if (tmp == n) {
                        System.out.println(n + " = " + res.get(i) + " + " + res.get(j) + " + " + res.get(k));
                        check = true;
                    }
                    if (tmp > n) {
                        break;
                    }
                }
            }
        }
        if (check == false) {
            System.out.println("Khong the tach thanh cac so thoa man!");
        }
    }
}
