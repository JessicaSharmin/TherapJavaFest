package Cost_decoration;
public class placeData extends condimentDecorator 
{
	packageData data;
	public placeData(packageData data,double total) 
        {
		this.data = data;
                
                this.total=total;
	}
 
        @Override
	public String getDescription() 
        {
		return data.getDescription() + "  Place cost = "+total;
	}
 
        @Override
	public double getCost() 
        {
		return data.getCost()+total;
	}
}