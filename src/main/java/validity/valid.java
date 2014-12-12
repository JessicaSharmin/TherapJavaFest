package validity;
public class valid
{
    
    public static boolean passwordMatch(String pass1,String pass2)
    {
        if(pass1.length()<6)
            return false;
        return pass1.equals(pass2);
    }
    public static boolean numberValidity(String number)
    {
        int i,j;
        for (i=0;i<number.length();i++)
        {
            if((number.charAt(i)>='0' && number.charAt(i)<='9') || number.charAt(i)==('.'))
            {
                
            }
            else
                return false;
        }
        return true;
    }
    public static boolean alphabetValidity(String letter)
    {
        int i,j;
        for (i=0;i<letter.length();i++)
        {
            if(letter.charAt(i)>='0' && letter.charAt(i)<='0')
            {
                return false;
            }
        }
        return true;
    }
    public static boolean mobileValidity(String mobile)
    {
        int i,j;
        for(i=0;i<mobile.length();i++)
        {
            if(mobile.charAt(i)<'0' || mobile.charAt(i)>'9')
            {
                return false;
            }
        }
        if(mobile.length()!=11)
            return false;
        if(mobile.charAt(0)!='0' && mobile.charAt(1)!='1')
        {
            return false;
        }
        else
        {
            //System.out.println(mobile.charAt(2));
            if( mobile.charAt(2)!='5' && mobile.charAt(2)!='5' && mobile.charAt(2)!='6' && mobile.charAt(2)!='7' && mobile.charAt(2)!='8' && mobile.charAt(2)!='9')
            {
                return false;
            }   
        }
        return true;
    }
    public static boolean dateValidity(int day ,int month , int year)
    {
        if(day<1 && day >31)
        {
            return false;
        }
        if(month<1 && month>12)
        {
            return false;
        }
        if(year<1900)
        {
            return false;
        }
        if(month==9 || month==4 || month==6 || month == 11)
        {
            if(day==31)
            {
                return false;
            }
        }
        if(month ==2)
        {
            if((year % 4 != 0) && (year % 100 == 0) || (year % 400 != 0))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean check(String s,String s1)
    {
        return s.toLowerCase().contains(s1.toLowerCase());
    }   
    public String makeCapital(String s1)
    {
        int i;
        String s="";
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
            {
                s+=(char)(s1.charAt(i)+32);
            }
            else
                s+=s1.charAt(i);
        }
        return s;
    }
    public static boolean emailValidity(String email)
    {
        if(email==null)
        {
            System.out.println("Null email");
            return false;
        }
        else
        {            
            String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";;
            return email.matches(EMAIL_REGEX);
        }
    }
}
