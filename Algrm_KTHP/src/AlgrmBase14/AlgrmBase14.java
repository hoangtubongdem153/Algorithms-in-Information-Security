/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Câu 14. 
Viết chương trình tìm số nguyên tố có ba chữ số,
biết rằng nếu viết số đó theo thứ tự ngược lại thì ta được một số là lập phương của một số tự nhiên
*/
package algrmbase14;

/**
 *
 * @author Tung
 */
public class AlgrmBase14 {

    /**
     * @param args the command line arguments
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
    static int reverseNum(int n){
        int reversed=0;
        while(n!=0){
            int getd=n%10;
            reversed=reversed*10 + getd;
            n/=10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=100; i<=999; i++){
            if(isPrime(i)){
                int reversed = reverseNum(i);
                int canbac3 = (int)Math.cbrt(reversed);
                if(canbac3*canbac3*canbac3==reversed){
                    System.out.print(i+" ");
                }
            }
        
    }
    
}
}
