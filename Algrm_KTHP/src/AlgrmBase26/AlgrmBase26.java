/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase26;

import  LibraryOfAlgrm.XuLySNT;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase26 {
     

    public static boolean isSnum(int x, ArrayList<Integer> res) {
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) > x) return false;
            if (x % res.get(i) == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        while (n <= 1 || n >= 10000) {
            System.out.print("Nhap vao n (1<n<10000): ");
            n = sc.nextInt();
        }
        boolean[] prime = XuLySNT.eratothenes((int) Math.sqrt(n));
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) {
                res.add(i * i);
            }
        }
        System.out.println("Cac so thoa man: ");
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (isSnum(i, res)) {
                System.out.print(i + " ");
                check = true;
            }
        }
        if (check==false) {
            System.out.println("NULL!");
        }
    }

}
