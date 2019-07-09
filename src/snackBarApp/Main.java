package snackBarApp;

public class Main
{
	public static void main(String[] args)
	{
		// New customers
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		// Vending Machines
		VendingMachines vFood = new VendingMachines("Food");
		VendingMachines vDrink = new VendingMachines("Drink");
		VendingMachines vOffice = new VendingMachines("Office");

		// Snacks
		Snacks s1 = new Snacks(vFood.getId(), "Chips", 1.75, 36);
		Snacks s2 = new Snacks(vFood.getId(), "Chocolate Bar", 1, 36);
		Snacks s3 = new Snacks(vFood.getId(), "Pretzel", 1, 36);

		Snacks s4 = new Snacks(vDrink.getId(), "Soda", 2.5, 24);
		Snacks s5 = new Snacks(vDrink.getId(), "Water", 2.75, 20);

		// Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
		c1.buy(s4.getTotalCost(3));
		s4.buySnack(3);
		System.out.println(c1.getName() + " has $" + c1.getCash() + " on hand");	
		System.out.println(s4.getQuantity() + " " + s4.getName() + "s left in inventory");	

		// Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
		c1.buy(s3.getTotalCost(1));
		s3.buySnack(1);
		System.out.println(c1.getName() + " has $" + c1.getCash() + " on hand");
		System.out.println(s3.getQuantity() + " " + s3.getName() + "s left in inventory");	

		// Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
		c2.buy(s4.getTotalCost(2));
		s4.buySnack(2);
		System.out.println(c2.getName() + " has $" + c2.getCash() + " on hand");
		System.out.println(s4.getQuantity() + " " + s4.getName() + "s left in inventory");

		// Customer 1 finds $10. Print Customer 1 Cash on Hand.
		c1.addCash(10);
		System.out.println(c1.getName() + " has $" + c1.getCash() + " on hand");

		// Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
		c1.buy(s2.getTotalCost(1));
		s2.buySnack(1);
		System.out.println(c1.getName() + " has $" + c1.getCash() + " on hand");
		System.out.println(s2.getQuantity() + " " + s2.getName() + "s left in inventory");

		// Add 12 more items to snack 3. Print quantity of snack 3.
		s3.addQuantity(12);
		System.out.println(s3.getQuantity() + " " + s3.getName() + "s left in inventory");

		// Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
		c2.buy(s3.getTotalCost(3));
		s3.buySnack(3);
		System.out.println(c2.getName() + " has $" + c2.getCash() + " on hand");
		System.out.println(s3.getQuantity() + " " + s3.getName() + "s left in inventory");
	}
}