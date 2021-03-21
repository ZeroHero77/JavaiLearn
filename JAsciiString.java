import java.io.*;
import java.util.*;

// java ascii string function

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        String A2 = A.substring(0,1);
        char A22 = A.charAt(0);
        String A3 = A2.toUpperCase();
        String A4 = A.substring(1, A.length()) +" ";
        String B2 = B.substring(0,1);
        char B22 = B.charAt(0);
        String B3 = B2.toUpperCase();
        int Aascii = A22;
        int Bascii = B22;
        String B4 = B.substring(1, B.length());
        if( Aascii > Bascii ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println( A3 + A4 + B3 + B4);
        
    }
}
