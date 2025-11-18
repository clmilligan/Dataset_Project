import java.io.*;
import java.util.*;
public class dataSetProj {
    public static void main(String[] args) {
        
    }
    public static String FoodVsSeason() throws FileNotFoundException{
        File f=new File("/Users/clmilligan/HCSS/Dataset_Project/Foodpanda Analysis Dataset.csv");
        Scanner s = new Scanner(f);
        while(s.hasNextLine()){
            String line =s.nextLine();
            String[] str =line.split(",");
            

        }

    }
    
}
