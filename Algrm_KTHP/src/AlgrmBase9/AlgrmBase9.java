/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Câu 9. 
Viết chương trình đếm số số nguyên tố nhỏ hơn hoặc bằng N
với N được nhập vào từ bàn phím.

*/
package algrmbase9;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase9 {

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
    static void demPrime(){
        int d=0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                d++;
            }
        }
        System.out.println("So so nguyen to (p<=n) la: "+d);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        nhap();
        demPrime();
    }
    
}
