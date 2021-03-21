import java.util.Scanner;

// print string value, double value, and integer value on next lines.
// for string val, skip integer extra buffer with an extra 
// string scanner

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        String s1 = scan.nextLine();
        
        
        System.out.println("String: "+s1);
        ;
        System.out.println("Double: "+d);
        
        System.out.println("Int: "+i);
        
                
    }
}
