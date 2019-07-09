package snackBarApp;

public class VendingMachines
{
	private static int maxId = 0;
	private int id;

	private String name;

	public VendingMachines(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}