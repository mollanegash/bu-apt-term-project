package cs622met;

import java.io.IOException;

import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseConnection {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		ModelShoppings model = fetchDataFromModel();

		ShoppingsView view = new ShoppingsView();

		ShoppingController controller = new ShoppingController(model, view);
		controller.updateView();
//		 controller.setName("john");
		// controller.updateView();

	}

	double expense() {
		// ModelShoppings shopData = new PurchasedItems();
		ModelShoppings item = new PurchasedItems<Object>();

		item.setUnitItemPrice(5.1);
		item.setQuantity(2);
		double computeTotalCost = item.getItemUnitPrice() * item.getQuantity();
		return computeTotalCost;

	}

	private static <T> ModelShoppings fetchDataFromModel() throws UnknownHostException, IOException {

		ModelShoppings shopData = new PurchasedItems<T>();

		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:sqlite:shopping.db");

			Statement stm = con.createStatement();
			stm.setQueryTimeout(30);
			System.out.println("sqlite connected...");

			stm.executeUpdate("DROP TABLE IF EXISTS CUSTOMER");
			stm.executeUpdate("CREATE TABLE CUSTOMER (customerID INTEGER(12), name STRING(255), itemNAME String(255))");

			stm.executeUpdate("DROP TABLE IF EXISTS ITEM");
			stm.executeUpdate(
					"CREATE TABLE ITEM (id int, itemName STRING, quantity INTEGER, itemUnitPrice INTEGER, itemPriority String )");

			Scanner scan = new Scanner(System.in);
			System.out.println("please enter your name.");
			

			String name = scan.next();
			shopData.setCustomerName(name);
			// toserver.writeUTF(name);

			System.out.println("Please enter your ID  :");
			int ids = scan.nextInt();
			shopData.setCustomerID(ids);
			// toserver.writeInt(ids);

			System.out.println("Please list items' name");
			String itemName = scan.next();
			shopData.setItemName(itemName);
			// toserver.writeUTF(itemName);
			System.out.println("Please enter items id");
			int id = scan.nextInt();
			shopData.setItemId(id);
			// toserver.writeInt(id);

			System.out.println("Please give priority number for item:");
			String priority = scan.next();
			shopData.setItemPriority(priority);
			// toserver.writeUTF(priority);
			System.out.println("How many quantity do you want to buy?");
			int quantity = scan.nextInt();
			shopData.setQuantity(quantity);
			// toserver.writeInt(quantity);
			System.out.println("Please give unit price for item  :");
			int itemUnitPrice = scan.nextInt();
			shopData.setUnitItemPrice(itemUnitPrice);
			// toserver.writeInt(itemUnitPrice);

			shopData.setTotalCost(itemUnitPrice * quantity);
			scan.close();
			stm.executeUpdate("INSERT INTO CUSTOMER values('" + shopData.getCustomerID() + "', '"
					+ shopData.getCustomerName() +  "', '" + shopData.getItemName() +"')");

			stm.executeUpdate("INSERT INTO ITEM values('" + shopData.getItemId() + "', '" + shopData.getItemName()
					+ "', '" + shopData.getQuantity() + "', '" + shopData.getItemUnitPrice() + "', '"
					+ shopData.getItemPriority() + "')");

			ResultSet resultSet = stm.executeQuery("Select * from CUSTOMER");

			// toserver.writeInt(resultSet.getInt("customerID"));

			// int j = fromserver.readInt();
			while (resultSet.next()) {
				System.out.println("\nCustomer Table\n---------------------------");
				System.out.println("CUSTOMER NAME" + "\t" + "CUSTOMER ID");
				System.out.println("---------------------------");
				System.out.println(resultSet.getString("name") + "\t" + "\t" + resultSet.getInt("customerID"));
				System.out.println("---------------------------");

			}

			ResultSet resultSetItem = stm.executeQuery("Select * from ITEM");
			while (resultSetItem.next()) {

				System.out.println("");
				System.out.println(
						"\nITEM Table\n----------------------------------------------------------------------");
				System.out.println(
						"itemNAME" + "\t" + "itemID" + "\t" + "quantity" + "\t" + "itemPrice" + "\t" + "itemPriority");
				System.out.println(resultSetItem.getString("itemName") + "\t" + "\t" + +resultSetItem.getInt("id")
						+ "\t" + resultSetItem.getInt("quantity") + "\t" + "\t" + resultSetItem.getInt("itemUnitPrice")
						+ "\t" + "\t" + resultSetItem.getInt("itemPriority"));
				System.out.println("----------------------------------------------------------------------");
			}
			
			ResultSet jointQuery = stm.executeQuery("SELECT CUSTOMER.name, CUSTOMER.customerID, CUSTOMER.itemNAME\r\n" + 
					"FROM CUSTOMER\r\n" + 
					"INNER JOIN ITEM ON CUSTOMER.itemNAME=ITEM.itemNAME;");
			while (jointQuery.next()) {

				System.out.println("");
				System.out.println(
						"\nITEM Table\n----------------------------------------------------------------------");
				System.out.println(
						"ID" + "\t" + "\t"  + "name" + "\t" + "Item");
				System.out.println(jointQuery.getInt(id) + "\t" + "\t" + jointQuery.getString("name")
						+ "\t" + jointQuery.getString("itemName"));
				System.out.println("----------------------------------------------------------------------");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return shopData;
		
		

	}

}
