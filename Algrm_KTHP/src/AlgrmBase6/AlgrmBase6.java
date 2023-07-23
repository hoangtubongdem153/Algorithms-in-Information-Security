/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Câu 6. 
Một số gọi là F-number nếu nó bằng tổng tất cả các ước nhỏ hơn chính nó. Viết chương trình tìm số F-number nhỏ hơn hoặc bằng N (với N nhập vào từ bàn phím).

*/
package algrmbase6;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase6 {

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
    static boolean kiemtra(int n){
        int d=0;
        for(int i=1; i<=n/2; i++){
        if(n%i==0){
            d+=i;
        }
    }
        if(d==n){
            return true;
        }
        return false;
    }  
    static void fnumb(){
        System.out.print("Tim duoc cac so la: ");
        for(int i=1; i<=n; i++){
            if(kiemtra(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        nhap();
        fnumb();
    }
    
}
