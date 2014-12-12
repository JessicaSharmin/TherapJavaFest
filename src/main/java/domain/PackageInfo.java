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
public class PackageInfo 
{

    private String PackageID;
    private String placeID;
    private String PackageType;
    private double PackageCost;
    private String PackageDetails;
    private int Capacity;
    private String foodID;
    public String getPackageID()
    {
        return PackageID;
    }
    public String getfoodItem()
    {
        return foodID;
    }
    public String getplaceID()
    {
        return placeID;
    }
    public String getPackageType()
    {
        return PackageType;
    }
    public double getPackageCost()
    {
        return PackageCost;
    }
    public String getPackageDetail()
    {
        return PackageDetails;
    }
    public int getPackageCapacity()
    {
        return Capacity;
    }
    public void setfoodItem(String foodItem)
    {
        this.foodID=foodItem;
    }
    public void setPackageID(String PackageID)
    {
        this.PackageID=PackageID;
    }
    public void setplaceID(String placeID)
    {
        this.placeID=placeID;
    }
    public void setPackageType(String PackageType)
    {
        this.PackageType=PackageType;
    }
    public void setPackageCost(double PackageCost)
    {
        this.PackageCost=PackageCost;
    }
    public void setPackageDetails(String PackageDetails)
    {
        this.PackageDetails=PackageDetails;
    }
    public void setCapacity(int PackageCapacity)
    {
        this.Capacity=PackageCapacity;
    }
    
        
}
