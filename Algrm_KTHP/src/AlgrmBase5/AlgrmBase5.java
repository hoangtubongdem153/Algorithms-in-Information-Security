/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 Câu 5. 
Viết chương trình tính tổng của các số nguyên tố nằm trong khoảng [A, B] với A, B nhập vào từ bàn phím

*/
package algrmbase5;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase5 {

    static int l = 0, r = 0;

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhap() {
        while (l < 1) {
            System.out.print("Nhap l: ");
            l = sc.nextInt();
        }
        while (r < 1) {
            System.out.print("Nhap r: ");
            r = sc.nextInt();
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static void cSangtrendoan() {
        boolean[] Eros = new boolean[r - l + 1];
        for (int i = 0; i < r - l + 1; i++) {
            Eros[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(r); i++) {
            for (int j = max(i * i, (l + i - 1) / i * i); j <= r; j += i) {
                Eros[j - l] = false;
            }

        }
        System.out.print("Tong cac so nguyen to trong khoang [l,r] : ");
        int k = 0;
        for (int i = max(l, 2); i <= r; i++) {
            if (Eros[i - l] == true) {
                k += i;
            }
        }
        System.out.print(k + "\n");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        nhap();
        cSangtrendoan();
    }

}
