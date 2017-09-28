package ecafe;

import java.util.Scanner;

public class Del {
    public int del(){
        Scanner Sp = new Scanner(System.in);
        FoodItems F = new FoodItems();
        int dtime =0;

        System.out.println("You want us to deliver from Resturant. Kindly press\n'1' to confirm\n'Any other key' to exit.\n\n");
        int CH = Sp.nextInt();
                
        if (CH == 1){
            System.out.println("Kindly Enter address and proceed to Menu: \nHouse no. : ");
            String Hou = Sp.nextLine();
            
            System.out.println("\nStreet: ");
            String St = Sp.nextLine();
            
            System.out.println("\nSector: ");
            String Sec = Sp.nextLine();
            
            dtime = F.flist();
            
            System.out.println("\nYour order will be delivered to: \nHouse no. " +Hou+ " , Street " +St+ " , Sector " +Sec+ " , Islamabad, Pakistan. ");
            
        }
        else {
            System.out.println("\n\nExiting\n");
            System.exit(0);

        }
      
        return dtime;
    }
    
}
