package validity;

import dao.bookingDao;

public class bookingIDgeneration 
{
    public static String bookingIDgenerate()
    {
        String ID="BOOKING_";
        bookingDao dao=bookingDao.getInstance();
        Integer bookingIDgeneration = dao.bookingIDgeneration();
        bookingIDgeneration++;
        int check=6;
        String s=bookingIDgeneration.toString();
        int len=s.length();
        for(int i=0;i<check-len;i++)
        {
            ID+="0";
        }
        ID+=s;
        return ID;
    }
    
}
