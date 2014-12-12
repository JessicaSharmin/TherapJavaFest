package Cost_decoration;
public class photographerData extends condimentDecorator 
{
	packageData data;
	public photographerData(packageData data,double total) 
        {
		this.data = data;
                this.total=total;
	}
 
        @Override
	public String getDescription() 
        {
		return data.getDescription() + "  photographer = "+total;
	}
 
        @Override
	public double getCost() 
        {
		return data.getCost()+total;
	}
}