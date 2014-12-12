package Cost_decoration;
public class foodData extends condimentDecorator 
{
	packageData data;
	public foodData(packageData data,double total) 
        {
		this.data = data;
                
                this.total=total;
	}
        @Override
	public String getDescription() 
        {
		return data.getDescription() + "  Food cost = " +total;
	}
        @Override
	public double getCost() 
        {
		return data.getCost()+total;
	}
}