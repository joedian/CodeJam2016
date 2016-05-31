import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Created by u355208 on 5/24/2016.
 */
public class Dance2 {
    public static void main(String[] args) {
        String response = "";
        try {
            File file = new File("blargeinput.txt");
            Path path = file.toPath();
            List<String> values = Files.readAllLines(path, Charset.defaultCharset());

            if (values == null)
                response += "";

            for (int i = 1; i < values.size(); i++) {// each case in document
                String thisCase = "";
                int dancers = 0;
                int currentDancer = 0;
                int turns = 0;

                thisCase = values.get(i).trim();

                String[] string = thisCase.split(" ");

                dancers = Integer.parseInt(string[0]);
                currentDancer = Integer.parseInt(string[1]);
                turns = Integer.parseInt(string[2]);
                int[] dancermap = new int[dancers]; //  int[] dancerarray = new int[dancers];

                for (int k = 0; k < dancers; k++) {
                    dancermap[k] = k + 1;
                }
                
                int positionOfCurrentDancer = 0;

                for (int t = 1; t < turns + 1; t++) {//look at the turns of the wheel

                    if (t % 2 > 0) {//is odd
                        for (int k = 0; k < dancers; k += 2) {
                            int val = dancermap[k];
                            dancermap[k]= dancermap[k + 1];
                            dancermap[k + 1] = val;
                            if(val == currentDancer){
                                positionOfCurrentDancer = k;
                            }
                        }
                    } else {//is equal
                        for (int k = 1; k < dancers; k += 2) {
                            int val = dancermap[k];
                            if ((k + 1) >= dancers) {
                                val = dancermap[0];
                                dancermap[0] = dancermap[dancermap.length -1];
                                dancermap[dancermap.length - 1] = val;
                            } else {
                                dancermap[k] = dancermap[k + 1];
                                dancermap[k + 1] =  val;
                            }

                            if(val == currentDancer){
                                positionOfCurrentDancer = k;
                            }
                        }
                    }
                }
                
               // int position = dancermap.(new Integer(currentDancer));
                long left = 0;
                long right = 0;

                if (positionOfCurrentDancer <= 0) {
                    left = dancermap[dancermap.length - 1];
                    right = dancermap[1];
                } else if ((positionOfCurrentDancer + 1) >= dancermap.length) {
                    right = dancermap[0];
                    left = dancermap[dancermap.length - 2];
                } else {
                    right = dancermap[positionOfCurrentDancer + 1];
                    left = dancermap[positionOfCurrentDancer - 1];
                }

                //after the turns we make the response
                response += "Case #" + i + ": " + right + " " + left + '\n';
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.print(response);

    }
}
