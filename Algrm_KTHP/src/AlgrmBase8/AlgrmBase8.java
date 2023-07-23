/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 Câu 8. 
Một số gọi là số Т-prime nếu có có đúng 3 ước nguyên dương.
Viết chương trình tìm các số Т-prime nhỏ hơn hoặc bằng N với N cho trước
nhập từ bàn phím
*/
package algrmbase8;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase8 {

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

    static boolean check(int n) {
        int d = 1;
        for (int i = 1; i <= Math.abs(n / 2); i++) {
            if (n % i == 0) {
                d++;
            }

        }
        if (d == 3) {
            return true;
        }
        return false;
    }

    static void Tprime(){
        System.out.print("Cac so T-prime la: ");
        for(int i=-20; i<=n; i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        nhap();
        Tprime();
    }

}
