package snackBarApp;

public class Main
{
	public static void main(String[] args)
	{
		//New customers
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		//Vending Machines
		VendingMachines vFood = new VendingMachines("Food");
		VendingMachines vDrink = new VendingMachines("Drink");
		VendingMachines vOffice = new VendingMachines("Office");

		//Snacks
		Snacks s1 = new Snacks(vFood.getId(), "Chips", 1.75, 36);
		Snacks s2 = new Snacks(vFood.getId(), "Chocolate Bar", 1, 36);
		Snacks s3 = new Snacks(vFood.getId(), "Chocolate Bar", 1, 36);

		Snacks s4 = new Snacks(vDrink.getId(), "Soda", 2.5, 24);
		Snacks s5 = new Snacks(vDrink.getId(), "Water", 2.75, 20);


		c1.buy(s4.getTotalCost(3));
		s4.buySnack(3);
		System.out.println(c1.getName() + " has $" + c1.getCash() + " on hand");
	}
}