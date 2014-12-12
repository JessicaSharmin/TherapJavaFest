package domain;
public class bookingInfo 
{
    private String bookingID;
    private String type;
    private String bookingDate;
    private String startDate;
    private String endDate;
    private String foodID;
    private String packageID;
    private String userID;
    private String transportID;
    private String decorationID;
    private double bookingCost;
    private String placeID;
    private String photographerID;
    public String getfoodID()
    {
        return foodID;
    }
    public String getType()
    {
        return type;
    }
    public String getEndDate()
    {
        return endDate;
    }
    public String getstartDate()
    {
        return startDate;
    }
    public String getDate()
    {
        return bookingDate;
    }
    public String getuserID()
    {
        return userID;
    }
    public String getdecorationID()
    {
        return decorationID;
    }
    public String gettransportID()
    {
        return transportID;
    }
    public String getpackageID()
    {
        return packageID;
    }
    public String getbookingID()
    {
        return bookingID;
    }
    public String getphotographerID()
    {
        return photographerID;
    }
    public double getbookingCost()
    {
        return bookingCost;
    }
    public String getPlaceID()
    {
        return placeID;
    }
    
    public void setbookingID(String bookingID)
    {
        this.bookingID=bookingID;
    }
    public void setpackageID(String packageID)
    {
        this.packageID=packageID;
    }
    public void setfoodID(String foodID)
    {
        this.foodID=foodID;
    }
    public void settransportID(String transportID)
    {
        this.transportID=transportID;
    }
    public void setphotographerID(String photographerID)
    {
        this.photographerID=photographerID;
    }
    public void setuserID(String userID)
    {
        this.userID=userID;
    }
    
    public void setbookingCost(double bookingCost)
    {
        this.bookingCost=bookingCost;
    }
    public void setplaceID(String placeID)
    {
        this.placeID=placeID;
    }
    public void setdecorationID(String decorationID)
    {
        this.decorationID=decorationID;
    }
    public void setDate(String bookingDate)
    {
        this.bookingDate=bookingDate;
    }
    public void setStartDate(String startDate)
    {
        this.startDate=startDate;
    }
    public void setEndDate(String endDate)
    {
        this.endDate=endDate;
    }
    public void settype(String type)
    {
        this.type=type;
    }
    
}
