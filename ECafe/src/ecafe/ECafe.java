package ecafe;
import java.util.Scanner;

public class ECafe {

    
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        int ti =0;
        int di =0;
        System.out.println("Kindly enter the time right now (24-Hour time frame):\nHours:");
        int Hr = S1.nextInt();
        System.out.println("Kindly enter the time right now:\nMinutes:");
        int Min = S1.nextInt();
        
        if (Hr < 11 || Hr > 22){
            System.out.println("The cafe is closed right now. Please visit us sometime later.\n");
            System.exit(0);
        }
        
        
        System.out.println("Welcome to ISB Cafe.\nKindly select one of the options:\n(1)Self Pick-up\n(2)Delivery\n(3)Exit (Any other key but 1 or 2)\n\n");
        int ch = S1.nextInt();
        
        Pickup p = new Pickup();
        Del d = new Del();
        
        if(ch == 1){
          ti =  p.pick();
          System.out.println("Kindly receive your order after : " + Hr + " : " + Min + "  Plus  " + ti + "Minutes. (24-Hour Format)\nThanks for ordering, Bye.");
        }
        
        else if (ch == 2){
          di =  d.del();
          System.out.println("Kindly receive your order after : " + Hr + " : " + Min + "  Plus  " + di + "Minutes. (24-Hour Format)\nThanks for ordering, Bye.");
      
        }
            
        else {
            System.exit(0);
        }
    }
    
}
