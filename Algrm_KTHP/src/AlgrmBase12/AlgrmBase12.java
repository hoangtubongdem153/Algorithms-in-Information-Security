/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Câu 12. 
Viết chương trình tìm bốn (thay bằng k với k lẻ) số nguyên tố liên tiếp,
sao cho tổng của chúng là số nguyên tố nhỏ hơn hoặc bằng N (với N được nhập vào từ bàn phím).
*/
package algrmbase12;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase12 {

    /**
     * @param args the command line arguments
     * da thay bang k voi k le
     */
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int n = sc.nextInt();
        while(n<1){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        int k = 3;
        int[] prime = new int[n];
        int stt = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                prime[stt] = i;
                stt++;
            }
        }
        boolean empty = true;
        for (int i = 0; i < stt - k + 1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += prime[i + j];
            }
            if (isPrime(sum) && sum <= n) {
                for (int j = 0; j < k; j++) {
                    System.out.print(prime[j + i] + " ");
                    empty = false;
                }
            }
            System.out.print("   ");
        }
        if(empty){
            System.out.println("Khong tim thay!");
        }
    }
}
