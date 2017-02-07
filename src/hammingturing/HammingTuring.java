package hammingturing;
import java.util.Scanner;

public class HammingTuring {
        
    public static void main(String[] args) {
    
        //enter 4-bit word
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4-bit binary word divided by enter: ");
            int d1 = scanner.nextInt();
            int d2 = scanner.nextInt();
            int d3 = scanner.nextInt();
            int d4 = scanner.nextInt();
        if(d1 <= 1 && d2 <= 1 && d3 <= 1 && d4 <= 1) {
            System.out.println("Entered word: "+d1+d2+d3+d4);
        } else {
            System.out.println("Entered word wasn't binary one!");
        } 
        
        //declaration of empty values
        int p1=0, p2=0, p3=0;
        //addition of elements inside of p1 circle
        int sump1 = p1+d1+d2+d4;
        int sump2 = p2+d1+d3+d4;
        int sump3 = p3+d2+d3+d4;
        
        //-------------------p1--circle------------------
        //add 1 (as p1, p2, p3) when in circle sum of elements = 3 or sum of d(i) elements inside the circle = 1
        if (sump1 == 1) p1 = 1;
        if (sump1 > 2) p1 = 1;
        //-------------------p2--circle------------------
        if (sump1 == 1) p2 = 1;
        if (sump2 > 2) p2 = 1;
        //-------------------p3--circle------------------
        if (sump3 == 1) p3 = 1;
        if (sump3 > 2) p3 = 1;
        
        System.out.println("After Hamming translation: "+p1+p2+d1+p3+d2+d3+d4);        
    }
}
