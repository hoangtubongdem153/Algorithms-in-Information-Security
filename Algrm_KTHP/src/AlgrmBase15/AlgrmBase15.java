/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrmbase15;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class AlgrmBase15 {

    /**
     * @param args the command line arguments
     */
//    static boolean isPrime(int n) {
//        if (n < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.print("Moi ban nhap lai: ");
            n = sc.nextInt();
        }
//        int[] prime = new int[n];
//        int stt = 0;
//        boolean co = false;
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i)) {
//                prime[stt] = i;
//                stt++;
//            }
//        }
        boolean co = false;
        boolean[] prime = XuLySNT.eratothenes(n);
        int stt = prime.length;
        for (int i = 0; i < stt - 1; i++) {
            if (prime[i]) {
                int hieu = 0;
                for (int j = i + 1; j < stt; j++) {
                    if (prime[j]) {
                        hieu = j - i;
                        if (hieu == 2) {
                            System.out.print(i + " " + j + "  ");
                            co = true;
                        }
                    }
                }
            }
        }
        if (co == false) {
            System.out.print("Khong co cap thoa man!");
        }
    }

}
