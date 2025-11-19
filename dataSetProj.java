import java.io.*;
import java.util.*;
public class dataSetProj {
    public static void main(String[] args) throws FileNotFoundException{
       System.out.println(FoodVsSeason());
    }
    public static String FoodVsSeason() throws FileNotFoundException{
        File f=new File("/Users/clmilligan/HCSS/Dataset_Project/Foodpanda Analysis Dataset.csv");
        Scanner s = new Scanner(f);
        int[] S1 = {0,0,0,0,0};//arrays to count the number of each food
        int[] S2 ={0,0,0,0,0};
        int[] S3={0,0,0,0,0};
        int [] S4={0,0,0,0,0};

        while(s.hasNextLine()){
            String line =s.nextLine();//to itterate through each line of the .csv file
            String[] str =line.split(",");
            String curr=str[6];
            int cut =curr.indexOf("/");
            if(cut!=-1){
                
                if (Double.parseDouble(curr.substring(0,cut))<4){//checks the month of the food and then checks what food it is and tallys it in an array
                    if(str[8].equals("Burger")){
                        S1[0]=S1[0]+1;
                    }
                    else if(str[8].equals("Pizza")){
                    S1[1]=S1[1]+1;
                    }
                    else if(str[8].equals("Pasta")){
                        S1[2]=S1[2]+1;
                    }
                    else if(str[8].equals("Fries")){
                        S1[3]=S1[3]+1;
                    }
                    else if(str[8].equals("Sandwich")){
                        S1[4]=S1[4]+1;
                    }

                }
                else if (Double.parseDouble(curr.substring(0,cut))<7){
                    if(str[8].equals("Burger")){
                        S2[0]=S1[0]+1;
                    }
                    else if(str[8].equals("Pizza")){
                        S2[1]=S1[2]+1;
                    }
                    else if(str[8].equals("Pasta")){
                        S2[2]=S1[2]+1;
                    }
                    else if(str[8].equals("Fries")){
                        S2[3]=S1[3]+1;
                    }
                    else if(str[8].equals("Sandwich")){
                        S2[4]=S2[4]+1;
                    }

                }
                else if (Double.parseDouble(curr.substring(0,cut))<10){
                    if(str[8].equals("Burger")){
                        S3[0]=S1[0]+1;
                    }
                    else if(str[8].equals("Pizza")){
                        S3[1]=S1[1]+1;
                    }
                    else if(str[8].equals("Pasta")){
                        S3[2]=S1[2]+1;
                    }
                    else if(str[8].equals("Fries")){
                        S3[3]=S1[3]+1;
                    }
                    else if(str[8].equals("Sandwich")){
                        S3[4]=S3[4]+1;
                    }
                }
                else if (Double.parseDouble(curr.substring(0,cut))<13){
                    if(str[8].equals("Burger")){
                        S4[0]=S1[0]+1;
                    }
                    else if(str[8].equals("Pizza")){
                        S4[1]=S1[1]+1;
                    }
                    else if(str[8].equals("Pasta")){
                        S4[2]=S1[2]+1;
                    }
                    else if(str[8].equals("Fries")){
                        S4[3]=S1[3]+1;
                    }
                    else if(str[8].equals("Sandwich")){
                        S4[4]=S4[4]+1;
                    }
                }
            
            }
            


        }
        
        String fr=max(S1);
        String Sc=max(S2);
        String tr=max(S3);
        String fo=max(S4);
        

        return "the most popular food in the winter is "+fr+"\n the most popular food in the spring is "+Sc+"\n the most popular food in the summer is "+tr+"\n the most popular food in the fall is "+fo;

        

    }
    public static String max (int[] arr){//a method to determine the most popular food based on the array and then return the corresponding food
        int max=Math.max(Math.max(arr[0],arr[1]),Math.max(Math.max(arr[4],arr[2]),arr[3]));
        int indx=0;
        for(int i=0; i<arr.length;i++){
            if (max==arr[i]){
                indx=i;
                
            }
        }
        if(indx==0){
            return "Burger";
        }
        else if(indx==1){
            return "Pizza";
        }
        else if(indx==2){
            return "Pasta";
        }
        else if(indx==3){
            return "Fries";
        }
        else if(indx==4){
            return "Sandwich";
        }
        return "erm";
    }
    
}
