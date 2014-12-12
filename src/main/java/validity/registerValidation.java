/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validity;

import dao.userDao;
import domain.userInfo;

public class registerValidation 
{
    public static boolean regValid(userInfo user,String passConf)
    {
        boolean flag=true;
        userDao userConnection=userDao.getInstance();
        flag&=userConnection.userCheck(user.getuserID());
        if(flag==true)
            System.out.println("userID ok!");
        flag&=valid.emailValidity(user.getuserEmail());
        if(flag==true)
            System.out.println("useremail ok!");
        flag&=valid.mobileValidity(user.getuserMobile());
        if(flag==true)
            System.out.println("userMobile ok!");
        flag&=valid.passwordMatch(user.getuserPassword(), passConf);
        if(flag==true)
            System.out.println("userPass ok!");
        return flag;
    }
}
