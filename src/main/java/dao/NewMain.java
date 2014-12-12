/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import domain.PackageInfo;
import domain.bookingInfo;
import domain.decorationInfo;
import domain.foodInfo;
import domain.placeInfo;
import domain.placeInfo;
import domain.queryInfo;
import domain.transportInfo;
import domain.userInfo;
import validity.PasswordService;

/**
 *
 * @author RIFU
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        /*queryInfo a =new queryInfo();
        a.setclientName("alu");
        a.setclientUsername("alu1");
        a.setemail("sr");
        a.setmessage("abcd");
        a.setquerySubject("habi");
        queryDao ab=queryDao.getInstance();
        System.out.println(ab.InsertPlace(a));*/
       bookingDao dao=bookingDao.getInstance();
       System.out.println(dao.bookingIDgeneration());
        /*bookingInfo book = new bookingInfo();
        book.setDate("ahd");
        book.setEndDate("cjden");
        book.setStartDate("wejn");
        book.setbookingCost(12.22);
        book.setbookingID("ndjn");
        book.setdecorationID("hbw");
        book.setfoodID("vvwj");
        book.setpackageID("dbdb");
        book.setphotographerID("vkvm");
        book.setplaceID("nwjnvnr");
        book.settransportID("djn");
        book.settype("vdndn");
        book.setuserID("mdkmdkm");
        
        dao.InsertDecorator(book);*/
        
        //PackageInfo a=new PackageInfo();
        //transportDao a=transportDao.getInstance();
        //System.out.println("alu "+a.getData().length);
        /*queryDao ab=queryDao.getInstance();
        queryInfo a[]=ab.getQueryForcheckValue();
        System.out.println(a.length);*/
       /* userInfo user=new userInfo();
        user.setuserID("rifath");
        PasswordService ps=new PasswordService();
        user.setuserPassword(ps.encrypt("123"));
        user.setuserName("rifu");
        user.setuserMobile("0");
        user.setuserEmail("sr");
        user.setuserBankName("1");
        user.setuserBankAccount("1");
        userDao.InsertUser(user);*/
        /*userInfo user=new userInfo();
        user.setuserBankAccount("a");
        user.setuserBankName("b");
        user.setuserEmail("c");
        user.setuserID("d");
        user.setuserMobile("e");
        user.setuserName("f");
        user.setuserPassword("ghhhh");
        
        //userDao.InsertUser(user);
        //userDao.editUser(user);
        userInfo u=userDao.verifyUser("d", "ghhhh");
        System.out.println("userID="+user.getuserBankName());*/
        /*placeInfo a=new placeInfo();
        a.setplaceCapacity(1);
        a.setplaceCost(1.20);
        a.setplaceDetails("aa");
        a.setplaceID("bb");
        a.setplaceName("cccc");
        a.setplaceType("dd");
        
        
        //placeDao.InsertTransport(a);
        //placeDao.deleteTransport(a);
        //placeDao.editTransport(a);
        placeDao.getTransportData("bb");
        System.out.println("userID="+a.getplaceName());*/
        /*transportInfo a=new transportInfo();
        a.settransportCapacity(1);
        a.settransportCost(1.2);
        a.settransportDetails("aaa");
        a.settransportID("bbb");
        a.settransportName("ccc");
        a.settransportType("def");
        
        */
        
        //transportDao.InsertTransport(a);
        //transportDao.deleteTransport(a);
        //transportDao.editTransport(a);
        //transportInfo b=transportDao.getTransportData("abcd");
        //System.out.println("userID="+b.gettransportName());
       /* photographerInfo user=new photographerInfo();
        user.setphotographerCost(1.2);
        user.setphotographerDetails("ab");
        user.setphotographerID("bc");
        user.setphotographerName("cd");
        user.setphotographerType("accaa");*/
        //photographerDao.InsertTransport(user);
        //photographerDao.deleteTransport(user);
        //photographerDao.editTransport(user);
        
        /*photographerInfo a=photographerDao.getTransportData("bc");
        System.out.println("userID="+a.getphotographerType());*/
        /*PackageInfo a=new PackageInfo();
        a.setCapacity(1);
        a.setPackageCost(2.1);
        a.setPackageDetails("a");
        a.setPackageID("b");
        a.setPackageType("c");
        a.setfoodItem("d");
        a.setplaceID("eee");*/
        //PackageDao.InsertTransport(a);
        //PackageDao.deleteTransport(a);
        //PackageDao.editTransport(a);
        //PackageInfo a=PackageDao.getTransportData("b");
        //System.out.println("userID="+a.getPackageType());
        /*foodInfo a=new foodInfo();
        a.setfoodCost(1.23);
        a.setfoodDetails("aab");
        a.setfoodID("ad");
        a.setfoodName("aaa");
        a.setfoodType("aabbb");*/
        //foodDao.InsertTransport(a);
        //foodDao.deleteTransport(a);
        
        /*foodInfo a=foodDao.getTransportData("ad");
        System.out.println("userID="+a.getfoodType());*/
       /* decorationInfo a=new decorationInfo();
        a.setdecorationCost(1.5);
        a.setdecorationDetails("qq");
        a.setdecorationID("wq");
        a.setdecorationType("eeffff");*/
        //decoratorDao.InsertTransport(a);
        //decoratorDao.deleteTransport(a);
        //decoratorDao.editTransport(a);
        //decorationInfo a=decoratorDao.getTransportData("wq");
       // System.out.println("userID="+a.getdecorationType());
        
    }
    
}
