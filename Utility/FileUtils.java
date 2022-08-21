
package Utility;

import Entity.Car;
import Entity.Dealership;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class FileUtils {
       
    public static List<String> readFile(String path ){
        
        List<String> list=new ArrayList<String>();
        try {
            BufferedReader reader= new BufferedReader(new FileReader(path));
            String line="";
            
            while ((line=reader.readLine())  !=null) {
               
                list.add(line) ;
            }
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  list;
        
    }
    
    public static List<Car>  getCarList(List<String> list){
        List<Car> cars=new ArrayList<>();
        for (String string : list) {
         cars.add(convertToCar(string.split(",")));
        }
        return  cars;
    }

    public static List<Dealership>  getDealers(List<String> list){
        List<Dealership> dealers=new ArrayList<>();
        for (String string : list) {
            dealers.add(convertToDealer(string.split(",")));
        }
        return  dealers;
    }
    public static  Dealership convertToDealer(String [] array){


        Dealership dealers= new Dealership(Long.parseLong(array[0]),array[1] , array[2], array[3]);


        return dealers;
    }
    
    public static  Car convertToCar(String [] array){
        
        
        Car car= new Car(Long.parseLong(array[0]),array[1] , array[2], array[3],Long.parseLong(array[4]) );
        
        
        return  car;
    }
    
    public static void main(String[] args) {
        FileUtils f=new FileUtils();
     List<Dealership> list2= f.getDealers(f.readFile(Constant.dealershipFile));
        
        for (Dealership dealership: list2) {
            System.out.println(dealership);
            
        }
     
    }
    
}