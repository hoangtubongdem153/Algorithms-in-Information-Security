/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Câu 7. 
Một số emirp là một số nguyên tố mà khi đảo ngược vị trí các chữ số của nó,
ta cũng được một số nguyên tố. Viết chương trình liệt kê các số emirp nhỏ hơn 
hoặc bằng N với N nhập vào từ bàn phím.
*/
package AlgrmBase7;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        while(n<1){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        System.out.println("Cac so emirp nho hon hoac bang " + n + ": ");
        boolean check = false;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && isPrime(reverseInteger(i))) {
                System.out.print(i + " ");
                check = true;
            }
        }
        if (check==false) {
            System.out.println("Khong co so nao!");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int reverseInteger(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
}
