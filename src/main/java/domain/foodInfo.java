/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author RIFU
 */
public class foodInfo 
{

    private String foodID;
    private String foodName;
    private String foodType;
    private double foodCost;
    private String foodDetails;
    
    public String getfoodID()
    {
        return foodID;
    }
    public String getfoodName()
    {
        return foodName;
    }
    public String getfoodType()
    {
        return foodType;
    }
    public double getfoodCost()
    {
        return foodCost;
    }
    public String getfoodDetail()
    {
        return foodDetails;
    }
    
    public void setfoodID(String foodID)
    {
        this.foodID=foodID;
    }
    public void setfoodName(String foodName)
    {
        this.foodName=foodName;
    }
    public void setfoodType(String foodType)
    {
        this.foodType=foodType;
    }
    public void setfoodCost(double foodCost)
    {
        this.foodCost=foodCost;
    }
    public void setfoodDetails(String foodDetails)
    {
        this.foodDetails=foodDetails;
    }
    
    
        
}
