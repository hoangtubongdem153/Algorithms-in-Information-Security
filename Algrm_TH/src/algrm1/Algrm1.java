
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
