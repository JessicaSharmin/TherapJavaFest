package Cost_decoration;
public class transportData extends condimentDecorator 
{
	packageData data;
	public transportData(packageData data,double total) 
        {
		this.data = data;
                
                this.total=total;
	}
 
        @Override
	public String getDescription() 
        {
		return data.getDescription() + "  Transport cost = "+total;
	}
        @Override
	public double getCost()
        {
		return data.getCost()+total;
	}
}