package Cost_decoration;
public abstract class packageData 
{
	String description = "";
        double total;
	public String getDescription() 
        {
	    return description;
	}
 
	public abstract double getCost();
}
