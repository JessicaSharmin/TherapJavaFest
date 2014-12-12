/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cost_decoration;

import domain.PackageInfo;
import domain.bookingInfo;
import domain.decorationInfo;
import domain.foodInfo;
import domain.photographerInfo;
import domain.placeInfo;
import domain.transportInfo;

/**
 *
 * @author RIFU
 */
public class costWrapping 
{
    public static packageData wrap(PackageInfo Package, decorationInfo decoration, foodInfo food, photographerInfo photographer,placeInfo place,transportInfo transport)
    {
        packageData data;
        data= new costCalculation(Package.getPackageCost());
        System.out.println("ALU1="+data.total);
         if(decoration!=null)
         {
             
             data=new decorationData(data,decoration.getdecorationCost());
         }
         System.out.println("ALU2="+data.total);
         if(food!=null)
         {
             System.out.println("food");
             data=new foodData(data,food.getfoodCost());
         }
         System.out.println("ALU2="+data.total);
         if(photographer!=null)
         {
             data=new photographerData(data,photographer.getphotographerCost());
         }
         System.out.println("ALU4="+data.total);
         if(place!=null)
         {
             data=new placeData(data,place.getplaceCost());
         }
         System.out.println("ALU5="+data.total);
         if(transport!=null)
         {
             data =new transportData(data,transport.gettransportCost());
         }
         System.out.println("ALU5="+data.total);
         return data;
    }
    
}
