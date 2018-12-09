package stockmarket;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * 
 * @author Sgtmed
 */
public class ReadFiles {
    File file = new File("C:\\temp\\StockMarket\\newBBD.csv");
    int row = 0;
    String[][] items;
    
    // method  - Check if file exists
    public boolean checkIsFile(){
        return file.isFile();
    } 
    // find number of rows in newBBD.csv
    public int findRowNumber(){
        row = 0;
        if(checkIsFile ()){
             
            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));
                // read line by line
                while((reader.readLine()) !=null){
                row++;
            }
                System.out.println("The number of rows is: ");

            }catch(IOException e){
                System.out.println(e);
            }
        }else{
            System.out.println("This file does not exist");
        }
        return row; 
    }
    // convertToArrays from csv file
    public void convertToArray(){
        int r = 0;
        items = new String[findRowNumber()][7];
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            
            while((line=reader.readLine())!=null){
                StringTokenizer z = new StringTokenizer(line,",");
                while(z.hasMoreTokens()){
                    for(int c = 0;c<7;c++){
                        items[r][c] = z.nextToken();
                    }
                    r++;
                }
            }  
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    // prints out items[][]
    
    public void printArray(){
        for(int x = 0;x<items.length;x++){
            // rows
            System.out.printf("%s - ", x);
            //columns
            for(int y = 0;y<items[x].length;y++){
                System.out.printf("%s ", items[x][y]);
            }
            System.out.println();
        }
    }
    // return items[][]
    public String[][] getArray(){
        return items;
    }
}