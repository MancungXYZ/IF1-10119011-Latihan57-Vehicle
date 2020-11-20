/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan57.vehicle;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda    
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle ();
        sepeda.setMyBrand("Trek Bike");
        sepeda.setMyModel("7.4FX");
        sepeda.setMyGearCount(23);
        System.out.println("Brand\t\t : " + sepeda.getMyBrand());
        System.out.println("Model\t\t : " + sepeda.getMyModel());
        System.out.println("Jumlah Gear\t : " + sepeda.getMyGearCount());
        
        System.out.println();
        
        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLegth(54.5);
        System.out.println("Brand\t\t : " + skate.getMyBrand());
        System.out.println("Model\t\t : " + skate.getMyModel());
        System.out.println("Panjangnya Board : " + skate.getMyBoardLegth());
        
    }
    
}
