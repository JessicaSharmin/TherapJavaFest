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
public class userInfo 
{
    private String userID;
    private String userName;
    private String password;
    private String mobile;
    private String email;
    private String bankName;
    private String bankAccount;
    public String getuserID()
    {
        return userID;
    }
    public String getuserName()
    {
        return userName;
    }
    public String getuserPassword()
    {
        return password;
    }
    public String getuserMobile()
    {
        return mobile;
    }
    public String getuserEmail()
    {
        return email;
    }
    public String getuserBankName()
    {
        return bankName;
    }
    public String getuserBankAccountNumber()
    {
        return bankAccount;
    }
    public void setuserID(String userID)
    {
        this.userID=userID;
    }
    public void setuserName(String userName)
    {
        this.userName=userName;
    }
    public void setuserPassword(String userPassword)
    {
        password=userPassword;
    }
    public void setuserMobile(String userMobile)
    {
        mobile=userMobile;
    }
    public void setuserEmail(String userEmail)
    {
        email=userEmail;
    }
    public void setuserBankName(String userBankName)
    {
        bankName=userBankName;
    }
    public void setuserBankAccount(String userBankAccount)
    {
        bankAccount=userBankAccount;
    }
    
}
