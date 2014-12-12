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
public class transportInfo 
{

    private String transportID;
    private String transportName;
    private double transportCost;
    private String transportDetails;
    private int transportCapacity;
    private String transportType;
    public String gettransportID()
    {
        return transportID;
    }
    public String gettransportType()
    {
        return transportType;
    }
    public String gettransportName()
    {
        return transportName;
    }
    
    public double gettransportCost()
    {
        return transportCost;
    }
    public String gettransportDetail()
    {
        return transportDetails;
    }
    public int gettransportCapacity()
    {
        return transportCapacity;
    }
    
    public void settransportID(String transportID)
    {
        this.transportID=transportID;
    }
    public void settransportType(String transportType)
    {
        this.transportType=transportType;
    }
    public void settransportName(String transportName)
    {
        this.transportName=transportName;
    }
    
    public void settransportCost(double transportCost)
    {
        this.transportCost=transportCost;
    }
    public void settransportDetails(String transportDetails)
    {
        this.transportDetails=transportDetails;
    }
    public void settransportCapacity(int transportCapacity)
    {
        this.transportCapacity=transportCapacity;
    }
    
        
}
