/**
 * This program contains methods to run the specific command given by the user in the Tea Manager system. 
 * 
 * @author Aadya Khanna
 * @since 20.3.2025
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TeaCommands
{
    /**
     *  This method displays the tea inventory in a formatted table for the user
     */
    public static void printTeaInventory() {
        String path = "lib/tea_inventory.csv"; 
        String line = ""; 

        // printing out the table of values to console, with one line after the title of the table and | to seperate each value in a column 
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine(); 

            // creating the title of the table with space after
            String[] title = line.split(","); 
            System.out.println(title[0] + "|" + title[1] + "|" + title[2] + "|" + title[3] + "|" + title[4] + "|");
            System.out.println("-------------------------------------");

            while((line = br.readLine()) != null) 
            {
                String[] values = line.split(","); 
                System.out.println(values[0] + "|" + values[1] + "|" + values[2] + "|" + values[3] + "|" + values[4] + "|");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user add a new tea to the given tea_inventory.csv file 
     */
    public static void addNewTea() 
    {
        String path = "lib/tea_inventory.csv"; 
        String line = ""; 

        ArrayList<Integer> teaIds = new ArrayList<>(); 

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine(); 

            while((line = br.readLine()) != null) 
            {
                String[] values = line.split(","); 
                teaIds.add(Integer.valueOf(values[0])); 
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner kb = new Scanner(System.in); 

        System.out.print("New Tea ID: "); 
        int newTeaId = Integer.parseInt(kb.nextLine());

        // checking to see if the new Tea Id exists in the given tea inventory
        if(teaIds.contains(newTeaId)) {
            System.out.print("A tea with that id already exists, enter a new one: ");
            newTeaId = Integer.parseInt(kb.nextLine());
        }

        System.out.print("New Tea Name: "); 
        String newTeaName = kb.nextLine();

        System.out.print("Type: "); 
        String newTeaType = kb.nextLine();

        System.out.print("Stock in Kg: "); 
        String newStockKg = kb.nextLine();

        System.out.print("Price per Kg: "); 
        String newpriceperkg = kb.nextLine();

        String toAppend = newTeaId + "," + newTeaName + "," + newTeaType + "," + newStockKg + "," + newpriceperkg;
    }
}