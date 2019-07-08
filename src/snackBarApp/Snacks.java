package snackBarApp;

public class Snacks 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendId;

	public Snacks(int vendId, String name, double cost, int quantity)
	{
		maxId++;
		id = maxId;
		this.vendId = vendId;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	public int getId()
	{
		return id;
	}

	public int getVendId()
	{
		return vendId;
	}

	public void setVendId(int vendId)
	{
		this.vendId = vendId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void addQuantity(int quantity)
	{
		this.quantity = this.quantity + quantity;
	}

	public void buySnack(int quantity)
	{
		this.quantity = this.quantity - quantity;
	}

	public double getTotalCost(int quantity)
	{
		return cost * quantity;
	}
}