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
public class photographerInfo 
{

    private String photographerID;
    private String photographerName;
    private String photographerType;
    private double photographerCost;
    private String photographerDetails;
    public String getphotographerID()
    {
        return photographerID;
    }
    public String getphotographerName()
    {
        return photographerName;
    }
    public String getphotographerType()
    {
        return photographerType;
    }
    public double getphotographerCost()
    {
        return photographerCost;
    }
    public String getphotographerDetail()
    {
        return photographerDetails;
    }
    
    public void setphotographerID(String photographerID)
    {
        this.photographerID=photographerID;
    }
    public void setphotographerName(String photographerName)
    {
        this.photographerName=photographerName;
    }
    public void setphotographerType(String photographerType)
    {
        this.photographerType=photographerType;
    }
    public void setphotographerCost(double photographerCost)
    {
        this.photographerCost=photographerCost;
    }
    public void setphotographerDetails(String photographerDetails)
    {
        this.photographerDetails=photographerDetails;
    }
    
        
}
