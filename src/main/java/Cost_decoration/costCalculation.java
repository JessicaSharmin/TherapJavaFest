package Cost_decoration;

public class costCalculation extends packageData 
{
	public costCalculation(double cost) 
        {
		description = "Total Cost : Package cost= "+cost;
                total=cost;
	}
        @Override
	public double getCost() 
        {
		return total;
	}
}

