/**
 * This program runs the Tea Wholesaler Inventory Management that allows users to track inventory, and their tea stock 
 * 
 * @author Aadya Khanna
 * @since 20.3.2025
 */

import java.util.Scanner;

public class TeaManager 
{
    public static void run() 
    {
        Scanner kb = new Scanner(System.in); 

        // description of the program and how to use it for the user
        System.out.println("Hi! Welcome to the program. This is a tea inventory management system that is for you to track your tea stcok and process sales orders. To get started, enter the number besides the desired option:"); 
        System.out.println("  1) View Commands  \n  2) View Tea Inventory \n  3) Add new tea product \n  4) Update stock quantity \n  5) Delete tea product \n  6) Create sales orders \n  7) Exit program");

        int input; 
        
        // get user input to see which process to implement for tea management
        do { 
            System.out.print("Enter command: ");
            input = Integer.parseInt(kb.nextLine());

            // processing user command for their chosen option
            switch (input) {
            case 1:
                System.out.println("  1) View Commands  \n  2) View Tea Inventory \n  3) Add new tea product \n  4) Update stock quantity \n  5) Delete tea product \n  6) Create sales orders \n  7) Exit program");
                break; 
            case 2:
                TeaCommands.printTeaInventory();
                break;
            case 3:
                TeaCommands.addNewTea();
                break;
            case 4:
                System.out.println("update stock quantity!");
                break;
            case 5:
                System.out.println("delete tea product!");
                break;
            case 6:
                System.out.println("create sales order!");
                break;
            case 7:
                System.out.println("You are exiting the program");
                break; 
            }   
        } while (input != 7);     
    }

    /**
     * This is the main method that runs the Team Wholesaler Inventory Management Program
     * 
     * @param args - Command line arguments for running the program  
     */
    public static void main(String[] args) 
    {
        run(); 
    }
}
