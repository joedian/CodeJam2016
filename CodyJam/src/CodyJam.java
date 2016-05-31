
import java.io.*;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;

import java.nio.file.Path;
import java.util.*;

// our main class becomes a file but the main method is still found
public class CodyJam {
    public static void main(String[] args) {
        String response = "";
        try {
            File file = new File("largeinput.txt");
            Path path = file.toPath();
            List<String> values = Files.readAllLines(path, Charset.defaultCharset());

            if (values == null)
                response += "";       
             
            for (int i = 0; i < 100; i++) {
                String thisCase ="";               
               
                String caseNumbers;
                if(i == 0)
                    caseNumbers = values.get(i + 2).trim();
                else
                    caseNumbers =  values.get( (2 * i) + 2).trim();
                            
                String[] string = caseNumbers.split(" ");                           
                List<String> holder2 = Arrays.asList(string);                
               
                int[] nums = new int[holder2.size()] ;
                for(int j = 0; j < holder2.size() ; j ++){
                    int a = Integer.parseInt(holder2.get(j));                    
                        nums[j] =a;                    
                }             

                int lastIndex = -1 ; for (int j = 0; j < nums.length ; j ++){
                    BigDecimal f = BigDecimal.valueOf((nums[j] / .75)) ;                  
                
                    for(int k = j + 1; k < nums.length ; k ++) {                       
                        if(nums[k] == f.intValue() && k != lastIndex){                            
                            if(nums[j] == nums[k] ){
                                
                            }else {
                                thisCase += " " + nums[j];
                                lastIndex = k;
                                nums[k] = -1;
                                break;
                            }
                        }
                    }                  
                }               
                response += "Case #" + (i + 1) + ":" +thisCase+ '\n';
 
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(response);
    }

}

