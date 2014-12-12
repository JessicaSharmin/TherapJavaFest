/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cost_decoration;

import dao.PackageDao;
import dao.decoratorDao;
import dao.foodDao;
import dao.photographerDao;
import dao.placeDao;
import dao.transportDao;
import domain.PackageInfo;
import domain.decorationInfo;
import domain.foodInfo;
import domain.photographerInfo;
import domain.placeInfo;
import domain.transportInfo;

/**
 *
 * @author RIFU
 */
public class costGet 
{
    public static packageData costGet(String packageID,String decorationID,String foodID,String photographerID,String placeID,String transportID)
    {
        PackageDao packageData=PackageDao.getInstance();
        PackageInfo packInfo=packageData.getPackageData(packageID);
        System.out.println("ALU="+packInfo.getPackageCost());
        decoratorDao decoratorData=decoratorDao.getInstance();
        decorationInfo decInfo=decoratorData.getDecoratorData(decorationID);
        foodDao foodData=foodDao.getInstance();
        foodInfo foodIn =foodData.getFoodData(foodID);
        photographerDao photoData=photographerDao.getInstance();
        photographerInfo photo=photoData.getPhotographerData(photographerID);
        placeDao placeData =placeDao.getInstance();
        placeInfo place=placeData.getPlaceData(placeID);
        transportDao transportData=transportDao.getInstance();
        transportInfo transport=transportData.getTransportData(transportID);
        packageData data= costWrapping.wrap(packInfo, decInfo, foodIn, photo, place, transport);
        return data;
    }
            
    
}
