package com.deckofcards;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryDataManagement {
	 public static void main(String[] args) {
	        System.out.println("Welcome to Inventory Management System");
	        ArrayList<Inventory> list = new ArrayList<Inventory>();
	        try (Scanner sc = new Scanner(System.in)) {
				while (true) {
				    System.out.println("Enter 1 to Add inventory");
				    System.out.println("Enter 2 to View inventory");
				    System.out.println("Enter 3 to Edit inventory");
				    System.out.println("Enter 4 to Delete inventory");
				    System.out.println("Enter 5 to Exit");
				    int Option = sc.nextInt();

				    switch (Option) {
				        case 1:
				            System.out.println("Enter Inventory name");
				            String name = sc.next();
				            System.out.println("Enter  price");
				            double price = sc.nextDouble();
				            System.out.println("Enter Weight");
				            double weight = sc.nextDouble();

				            Inventory inventory = new Inventory();
				            inventory.setName(name);
				            inventory.setPrice(price);
				            inventory.setWeight(weight);
				            list.add(inventory);
				            break;

				        case 2:
				            for (Inventory inventory1 : list) {
				                System.out
				                        .println(inventory1.getName() + " " + inventory1.getPrice() + " " + inventory1.getWeight());

				            }
				            break;
				        case 3:
				            System.out.println("Enter Inventory name");
				            String name1 = sc.next();
				            for (int i = 0; i < list.size(); i++) {
				                if (list.get(i).getName().equals(name1)) {
				                    System.out.println("Enter new price");
				                    double price1 = sc.nextDouble();
				                    System.out.println("Enter new weight");
				                    double weight1 = sc.nextDouble();
				                    list.get(i).setPrice(price1);
				                    list.get(i).setWeight(weight1);
				                    break;
				                }

				            }
				            break;
				        case 4:
				            System.out.println("Enter inventory name");
				            String name2 = sc.next();
				            for (int i = 0; i < list.size(); i++) {
				                if (list.get(i).getName().equals(name2)) {
				                    list.remove(i);
				                    break;
				                }
				            }
				    }
				    if (Option == 5) {
				        break;
				    }
				}
			}
	    }

}
