/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 Câu 2. 
Viết chương trình tìm các số nguyên tố có N chữ số với N nhập từ bàn phím và 2 ≤ N ≤10.

*/
package algrmbase2;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase2 {

    /**
     * @param args the command line arguments
     */
    static int n;
    static Scanner sc = new Scanner(System.in);

    static void nhap() {
        while (n < 2 || n > 10) {
            System.out.print("Nhap so chu so (2<=n<=10) : ");
            n = sc.nextInt();
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    static void tinh() {
        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n) - 1;
        System.out.println("Cac so nguyen to co " + n + "chu so la: ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        nhap();
        tinh();
    }

}
