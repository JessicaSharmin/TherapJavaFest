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
public class decorationInfo 
{

    private String decorationID;
    private double decorationCost;
    private String decorationDetails;
    private String decorationType;
    public String getdecorationID()
    {
        return decorationID;
    }
    public String getdecorationType()
    {
        return decorationType;
    }
    public double getdecorationCost()
    {
        return decorationCost;
    }
    public String getdecorationDetail()
    {
        return decorationDetails;
    }
    
    public void setdecorationID(String decorationID)
    {
        this.decorationID=decorationID;
    }
    public void setdecorationType(String decorationType)
    {
        this.decorationType=decorationType;
    }
    
    public void setdecorationCost(double decorationCost)
    {
        this.decorationCost=decorationCost;
    }
    public void setdecorationDetails(String decorationDetails)
    {
        this.decorationDetails=decorationDetails;
    }  
}
