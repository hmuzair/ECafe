package ecafe;

import java.util.Scanner;


public class Pickup {  
    
    public int pick(){
        Scanner Sp = new Scanner(System.in);
        FoodItems F = new FoodItems();
        int ptime =0;

        System.out.println("You want to pick up from our Resturant. Kindly press\n'1' to confirm and proceed to menu\n'Any other key' to exit.\n\n");
        int CH = Sp.nextInt();
        
        if (CH == 1){
            ptime = F.flist();
           
        }
        else {
            System.out.println("\n\nExiting\n");
            System.exit(0);

        }
        
        return ptime;
    }
 
}
