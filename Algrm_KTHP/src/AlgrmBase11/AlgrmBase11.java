/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Câu 11. 
Viết chương trình tính tổng của các số nguyên tố nhỏ hơn hoặc bằng N 
với N được nhập từ bàn phím. 
*/
package algrmbase11;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 */
public class AlgrmBase11 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

//    static void nhap() {
//        while (n < 1) {
//            System.out.print("Nhap so nguyen duong n(n>0) : ");
//            n = sc.nextInt();
//        }
//    }
//    static boolean isPrime(int k) {
//        if (k < 2) {
//            return false;
//        }
//        for (int j = 2; j <= Math.sqrt(k); j++) {
//            if (k % j == 0) {
//                return false;
//            }
//
//        }
//        return true;
//    }
//    static void tongPrime(){
//        int d=0;
//        for(int i=1; i<=n; i++){
//            if(isPrime(i)){
//                d+=i;
//            }
//        }
//        System.out.println("Tong cac so nguyen to (p<=n) la: "+d);
//    }
    public static void main(String[] args) {
        // TODO code application logic here
//        nhap();
        System.out.print("Nhap so nguyen duong N: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.print("Moi ban nhap lai: ");
            n = sc.nextInt();
        }
        boolean[] prime = XuLySNT.eratothenes(n);
        int d = 0;
        for (int i = 1; i <= n; i++) {
            if (prime[i]) {
                d += i;
            }
        }
        System.out.println("Tong cac so nguyen to (p<=n) la: " + d);
//        tongPrime();
    }

}
