/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Câu 3. 
Cho một số nguyên dương N, gọi:
-	k là số ước nguyên tố của N;
-	q là tổng của các ước nguyên tố của N;
-	p là tổng của các ước số của N;
-	s là số ước của N;
Hãy viết chương trình tính giá trị của: N+p+s-q-k với N cho trước nhập từ bàn phím.

*/
package algrmbase3;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase3 {

    /**
     * @param args the command line arguments
     */
    static int n;
    static Scanner sc = new Scanner(System.in);

    static void nhap() {
        while (n < 1) {
            System.out.print("Nhap so nguyen duong n(n>0) : ");
            n = sc.nextInt();
        }
    }

    static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }
    static void thucThi() {
        int k = 0, q = 0, p = n, s = 1;
        if (isPrime(n)) {
            k = 1;
        }
        System.out.println("Ket qua (n=" + n + ")");
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                s+=1;
                p += i;
                if (isPrime(i)) {
                    k += 1;
                    q += i;
                }
            }
        }
        System.out.print("k=" + k + " q=" + q + " p=" + p + " s=" + s + "\n");
        System.out.println("N+p+s-q-k="+(n+p+s-q-k));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        nhap();
        thucThi();
    }

}
