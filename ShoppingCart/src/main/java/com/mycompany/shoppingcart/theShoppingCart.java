/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.*;


/**
 *
 * @author eogieglo
 */
public class theShoppingCart {


    public static void main(String args[]) {
        System.out.println("Welcome to the Shopping Cart");

        //Declare and initialize String Variables
        String custName="Mary Smith";
        String itemDesc=" Shirt";
        String [] arrayStock = {"Pants","Shirt","t-shirt","clothes"};


        //Assign the message variable
        String message = custName +" want to purchase a "+ itemDesc;

        System.out.println(message);

        //Declare numeric fields
        double price = 25;
        double tax = 2;
        double total;
        int quantity= 2;
        boolean outOfStock = false;

        //boolean outOfStock = true;
        System.out.println(" ");

        String message2 = custName +" want to purchase a " + quantity + itemDesc;

        System.out.println(message2);

        total = price * quantity * tax;

        System.out.println(" ");

        System.out.println(" Total cost with tax is " +  total);


        //Test value of quantity , if statement
        if (quantity > 1) {
            String message3 = custName +" want to purchase a " + quantity + itemDesc+"s";
            System.out.println(message3);
        }
        //Test value of outOfStock, if/else statement
        if (outOfStock == true){

            System.out.println("Item not available");
        }else {
            System.out.println(" The total cost of tax is: " + tax);
        }

        //Iteration for each in Array
        for (String article: arrayStock){
            System.out.println("The article is: " + article);
        }

        
    }
}
