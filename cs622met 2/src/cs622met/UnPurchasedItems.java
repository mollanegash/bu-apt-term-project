package cs622met;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/** UnPurchasedItems:child class extends parent class:ModelShoppings. **/
public class UnPurchasedItems extends ModelShoppings {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public double computeCost() {

		ModelShoppings item = new UnPurchasedItems();
		item.setUnitItemPrice(5.1);
		item.setQuantity(2);
		double computeTotalCost = item.getItemUnitPrice() * item.getQuantity();
		return computeTotalCost;

	}

	public double customerBankBalance() {
		ModelShoppings item = new UnPurchasedItems();
		item.setBankAccount(150);
		double balance = item.getBankAccount() - computeCost();
		return balance;

	}

	public double market1() {

		ModelShoppings item = new PurchasedItems<Object>();
		item.setUnitItemPrice(5.1);
		item.setQuantity(2);
		
		double price = computeCost()/item.getQuantity();
		return price;



	}

	public void run() {

		int element = 2;
		/** array list **/
		List<ModelShoppings> list = new ArrayList<>();
		/** scanner class **/
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our store! Try to list item's name, priortiy number and its price please!");
		int y = 0;
		while (y == 0) {
			for (int i = 0; i < element; i++) {
				ModelShoppings item = new UnPurchasedItems();

				/**
				 * Object creation /* Take input from the user that puts the shopping item name
				 * and priority into an array.
				 */

				System.out.println("\nPlease list items' name" + " " + i);

				String iName = scan.nextLine();

				item.setItemName(iName);
				/**
				 * Only have one entry of any type in the list: if the user tries to add the
				 * same item twice, this pseudo code tells the user that it is already on the
				 * list.
				 */
				if (list.contains(item)) {
					System.out.println("item" + " " + i + " " + "is already in the list;try to list another item.");

				} else {

					System.out.println("Please give priority number for item:" + " " + i);
					try {
						String priority = scan.nextLine();

						item.setItemPriority(priority);
					} catch (InputMismatchException e) {
						// catch the exception
						System.out.printf("%nException: %s%n", e);
						System.out.println("Please try again.");
						scan.nextLine();// Discard input so the user can try again
					}
					System.out.println("How many quantity do you want to buy?" + " " + i);
					try {
						double quantity = scan.nextDouble();

						item.setQuantity(quantity);
					} catch (InputMismatchException e) {
						// catch the exception
						System.out.printf("%nException: %s%n", e);
						System.out.println("Please try again.");
						scan.nextLine();// Discard input so the user can try again
					}
					System.out.println("Please give unit price for item  :" + " " + i);
					try {
						double uPrice = scan.nextDouble();

						double totalCost = item.getQuantity() * uPrice;
						item.setUnitItemPrice(uPrice);
						item.setTotalCost(totalCost);
					} catch (InputMismatchException e) {
						// catch the exception
						System.out.printf("%nException: %s%n", e);
						System.out.println("Please try again.");
						scan.nextLine();// Discard input so the user can try again
					}

					System.out.println("please enter your name.");
					String name = scan.next();// single word

					String customerNameNew = "";
					int count = 0;
					while (count < name.length() - 1) {
						// use regex
						if ((name.equals("a-zA-Z") == false)) {
							customerNameNew = name.replaceAll("[^a-zA-Z]", "").replaceAll("[0-9]", "");
							count++;
						} else {
							customerNameNew = name;
							count++;
						}

					}
					item.setCustomerName(customerNameNew);

					System.out.println("Enter your bank balance?");
					try {
						double banckAcaount = scan.nextDouble();

						item.setBankAccount(banckAcaount);
					} catch (InputMismatchException e) {
						// catch the exception
						System.out.printf("%nException: %s%n", e);
						System.out.println("Please try again.");
						scan.nextLine();// Discard input so the user can try again
					}

					double bal = item.getBankAccount();
					item.setBalance(bal);
					list.add(item);
					scan.nextLine();

				}
				try {
					Thread.sleep(element);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			/** Output before sorting **/
			System.out.println("Shopping list at mycart befor purchased:");

			list.forEach(n -> System.out.println("Shopping items in the list :" + " " + n));
			/** Sorting based on mulitipl priority with lambda expression (java 8) **/

			Collections.sort(list, (a, b) -> a.getItemPriority().compareToIgnoreCase(b.getItemPriority()));
			/** purchase as many items on the list by priority, using $59.00. **/

			ArrayList<ModelShoppings> itemsUnPurchasedList = new ArrayList<>();
			double priceCeilings = 59.0;
			double totalCost = 0.0;
			for (int i = 0; i < element; i++) {
				ModelShoppings item = list.get(i);
				System.out.println("Press n to refuse to purchase :" + " " + item.getItemName());

				String ans = scan.nextLine();

				if (ans.equalsIgnoreCase("n")) {
					totalCost += item.getItemUnitPrice() * item.getQuantity();
					if (totalCost > priceCeilings) {
						System.out.println(item.getItemName() + " " + "can't be added due to cost.");
						itemsUnPurchasedList.add(item);
					}

				}
				try {
					Thread.sleep(element);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println("I.ID= " + Thread.currentThread().getId() + " Name=" + Thread.currentThread().getName());
			System.out.println();
			itemsUnPurchasedList.forEach(u -> System.out.println("Unpurchased items with price:" + " " + u));
			/** Have an exit criteria clearly defined **/
			System.out.println("Do you want to proceed?    Y/N");
			String answer = scan.nextLine();
			if (answer.equalsIgnoreCase("N")) {
				y = -1;
			} else {
			}
			System.out.println("\nThank you for your business. Come back soon.");
		}
		scan.close();
	}

	@Override
	void market() {
		// TODO Auto-generated method stub
		
	}
}
