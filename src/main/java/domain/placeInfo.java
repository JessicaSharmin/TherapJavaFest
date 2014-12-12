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
public class placeInfo 
{

    private String placeID;
    private String placeName;
    private String placeType;
    private double placeCost;
    private String placeDetails;
    private int placeCapacity;
    public String getplaceID()
    {
        return placeID;
    }
    public String getplaceName()
    {
        return placeName;
    }
    public String getplaceType()
    {
        return placeType;
    }
    public double getplaceCost()
    {
        return placeCost;
    }
    public String getplaceDetail()
    {
        return placeDetails;
    }
    public int getplaceCapacity()
    {
        return placeCapacity;
    }
    
    public void setplaceID(String placeID)
    {
        this.placeID=placeID;
    }
    public void setplaceName(String placeName)
    {
        this.placeName=placeName;
    }
    public void setplaceType(String placeType)
    {
        this.placeType=placeType;
    }
    public void setplaceCost(double placeCost)
    {
        this.placeCost=placeCost;
    }
    public void setplaceDetails(String placeDetails)
    {
        this.placeDetails=placeDetails;
    }
    public void setplaceCapacity(int placeCapacity)
    {
        this.placeCapacity=placeCapacity;
    }     
}
