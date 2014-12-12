/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cost_decoration;

import dao.PackageDao;
import domain.PackageInfo;

/**
 *
 * @author RIFU
 */
public class NewMain 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        packageData a=costGet.costGet("package1", "null", "food1", "null", "null", "null");
        System.out.println(a.getDescription());
        System.out.println(a.getCost());
        
        
        // TODO code application logic here
    }
    
}
