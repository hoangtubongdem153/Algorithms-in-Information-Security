/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Câu 1
 Một số gọi là Q-prime khi nó có đúng 4 ước số nguyên dương. Hãy viết chương trình in ra các số Q-Prime nhỏ hơn hoặc bằng một số N cho trước nhập từ bàn phím.

*/
package AlgrmBase1;

import LibraryOfAlgrm.XuLySNT;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int n = sc.nextInt();
        while(n<1){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        
        System.out.println("Cac so Q-prime la: ");
        for (int i = 6; i <= n ; i++) {
                    int q=1;
            for(int j=1; j<=i/2; j++){
                if (i % j == 0) {
                     q++;                 
                }
            }
            if(q==4){
                System.out.print(i+" ");
            }
            
        }
    }
}
