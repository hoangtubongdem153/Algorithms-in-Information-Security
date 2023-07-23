
package algrm1;

import java.util.Scanner;
import LibraryOfAlgrm.MathFunctions;
import java.util.ArrayList;

/**
 *
 * @author Tung
 */
public class Algrm1 {

    /**
     * @param args the command line arguments
     */
//    static void xuLy(long a, int w, long p) {
//        int m, t;
//        int[] A = new int[10];
//        m = (int) Math.round(Math.log(p) / Math.log(2));
//        t = (int)(Math.round((float)m / w));
//        for (int i = t-1; i >= 0; i--) {
//            A[i]=(int)(a / (long)Math.pow(2, w*i));
//            if(i==0){
//                A[i]=(int)Math.round(a/(long)Math.pow(2,w*i));
//                break;
//            }
//            a = (long) (a % (Math.pow(2, w *i)));
//        }
//                System.out.print("A[]={ ");        
//         for(int i=t-1; i>=0; i--){
//                System.out.print(A[i]+" ");
//
//         }
//                System.out.println("}");
//    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap");
        int w=8;
        int a, p=2147483647;
        //1-a
        System.out.print("Nhap a (a<p): ");
        a = sc.nextInt();
        System.out.print("Dang mang: "+MathFunctions.DecimalToWordByte(a, w, p));
        //1-b
        ArrayList<Integer> b= new ArrayList<Integer>();
        System.out.print("\nNhap mang b: \n");
        for(int i=0; i<4; i++){
            int x=sc.nextInt();
            b.add(x);
        }
        System.out.println("\nDang thap phan: "+MathFunctions.WordByteToDecimal(b, w, p));
    }

}
