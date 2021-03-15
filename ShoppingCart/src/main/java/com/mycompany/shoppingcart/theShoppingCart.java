/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcart;

/**
 *
 * @author eogieglo
 */
public class theShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Cart");
        
        //Declare and initialize String Variables
        String custName="Mary Smith";
        String itemDesc=" Shirt";
        
        
        //Assign the message variable
        String message = custName +" want to purchase a "+ itemDesc;
        
        System.out.println(message);
        
        //Declare numeric fields
        double price = 25;
        double tax = 2;
        double total;
        int quantity= 2;
        
        System.out.println(" ");
        
        String message2 = custName +" want to purchase a " + quantity + itemDesc;
        
        System.out.println(message2);
        
        total = price * quantity * tax;
        
        System.out.println(" ");
        
        System.out.println(" Total cost with tax is " +  total);
        
        
        
        
        
    }
}
