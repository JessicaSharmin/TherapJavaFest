package Cost_decoration;
public class decorationData extends condimentDecorator 
{
	packageData data;
	public decorationData(packageData data,double total) 
        {
		this.data = data;
                this.total=total;
	}
        @Override
	public String getDescription() 
        {
		return data.getDescription() + "  Decoration cost = "+total;
	}
        @Override
	public double getCost() 
        {
		return data.getCost()+total;
	}
}