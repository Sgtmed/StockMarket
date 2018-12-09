package stockmarket;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author Sgtmed
 */
public class Calculations {
    ReadFiles r = new ReadFiles();
    float[][] dataArray = new float[r.findRowNumber()][7];
    Date[] dateArray = new Date[r.findRowNumber()];
    
    public void createDateArray(String[][] n){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(int x = 0;x<n.length;x++){
            for(int y=0;y<n[x].length;y++){
                if(y==0){
                    try{
                        Date newdate = (Date)sdf.parse(n[x][0]);
                        dateArray[x] = newdate;
                    }
                    catch(ParseException pe){
                        System.out.println(pe);
                    }
                }
            }
        }
    }
    // create dataArray[][]
    public void createDataArray(String[][] n){
        for(int x = 0;x<n.length;x++){
            for(int y=0;y<n[x].length;y++){
                switch(y){
                    case 0:
                        dataArray[x][y]=0;
                        break;
                    case 1:
                        dataArray[x][y]= new Float(n[x][y]);
                        break;
                    case 2:
                        dataArray[x][y]= new Float(n[x][y]);
                        break;
                    case 3:
                        dataArray[x][y]= new Float(n[x][y]);
                        break;
                    case 4:
                        dataArray[x][y]= new Float(n[x][y]);
                        break;
                    case 5:
                        dataArray[x][y]= new Float(n[x][y]);
                        break;
                    case 6:
                        dataArray[x][y]= new Float(n[x][y]);
                        break;
                    case 7:
                        dataArray[x][y]= new Float(n[x][y]);
                        break;
                }
            }
        }
        // print datArray
      
            
        }
      public void printArray(){
          for(int x = 0;x<dataArray.length;x++){
              for(int y = 0;y<dataArray[x].length; y++){
                  System.out.printf("%s ", dataArray[x][y]);
              }
                System.out.println();
          }   
    }
}

