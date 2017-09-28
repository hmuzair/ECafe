package ecafe;

import java.util.Scanner;

public class FoodItems {

    public int flist() {
        int total = 0;
        int time = 0;

        int sel = 1;
        String[] ArrFood = {"Appetizer -1", "Appetizer -2", "Appetizer -3", "Appetizer -4", "Soup -1", "Soup -2", "Main Course -1", "Main Course -2", "Main Course -3", "Main Course -4", "Main Course -5", "Main Course -6", "Side Dish -1", "Side Dish -2", "Side Dish -3"};

        for (int i = 0; sel != 0; i++) {

            System.out.println("\n\nSelect an item:\n1)Appetizer -1 (Rs.10)\n2)Appetizer -2 (Rs.10)\n3)Appetizer -3 (Rs.10)\n4)Appetizer -4 (Rs.10)\n\n5)Soup -1 (Rs.20)\n6)Soup -2 (Rs.20)\n\n7)Main Course -1 (Rs.40)\n8)Main Course -2 (Rs.40)\n9)Main Course -3 (Rs.40)\n10)Main Course -4 (Rs.40)\n11)Main Course -5 (Rs.40)\n12)Main Course -6 (Rs.40)\n\n13)Side Dish -1 (Rs.30)\n14)Side Dish -2 (Rs.30)\n15)Side Dish -3 (Rs.30)\n\nEnter 0 to Finalise order.\n\n");

            Scanner S2 = new Scanner(System.in);
            sel = S2.nextInt();
            if (sel >= 1 && sel <= 4) {
                total = total + 10;
                time = time + 5;
                System.out.println("\nItem Selected: " + ArrFood[sel - 1]);

            } else if (sel == 5 || sel == 6) {
                total = total + 20;
                time = time + 10;
                System.out.println("\nItem Selected: " + ArrFood[sel - 1]);

            } else if (sel >= 7 && sel <= 12) {
                total = total + 40;
                time = time + 15;
                System.out.println("\nItem Selected: " + ArrFood[sel - 1]);

            } else if (sel >= 13 && sel <= 15) {
                total = total + 30;
                time = time + 10;
                System.out.println("\nItem Selected: " + ArrFood[sel - 1]);

            } else {
                if (sel == 0) {
                    System.out.println("Finalising order");
                    break;
                }
                System.out.println("\n\nNot avaiable in the menu. Please select again: \n");

            }
        }
        System.out.println("\n\nYour total time taken to complete order: " + time + " Minutes\nTotal Bill: Rs." + total);
        return time;
    }
}
