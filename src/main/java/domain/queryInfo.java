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
public class queryInfo 
{
    private String clientName;
    private String clientUsername;
    private String email;
    private String message;
    private String querySubject;
    
    public String getquerySubject()
    {
        return querySubject;
    }
    public String getclientName()
    {
        return clientName;
    }
    public String getclientUsername()
    {
        return clientUsername;
    }
    public String getemail()
    {
        return email;
    }
    public String getqueryMessage()
    {
        return message;
    }
    
    public void setclientName(String clientName)
    {
        this.clientName=clientName;
    }
    public void setclientUsername(String clientUsername)
    {
        this.clientUsername=clientUsername;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public void setmessage(String message)
    {
        this.message=message;
    }
    public void setquerySubject(String querySubject)
    {
        this.querySubject=querySubject;
    }     
}
