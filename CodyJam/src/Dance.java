import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Created by u355208 on 5/24/2016.
 */
public class Dance {
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
                List<Long> dancermap = new ArrayList<>(dancers); //  int[] dancerarray = new int[dancers];
                
                for (int k = 1; k <= dancers; k++) {
                    dancermap.add((long) k);                   
                }

                for (int t = 1; t < turns + 1; t++) {//look at the turns of the wheel

                    if (t % 2 > 0) {//is odd
                        for (int k = 0; k < dancers; k += 2) {
                            long val = dancermap.get(k);
                            dancermap.set(k, dancermap.get(k + 1));
                            dancermap.set(k + 1, val);
                        }
                    } else {//is equal
                        for (int k = 1; k < dancers; k += 2) {
                            long val = dancermap.get(k);
                            if ((k + 1) >= dancers) {
                                val = dancermap.get(0);
                                dancermap.set(0, dancermap.get(dancermap.size() - 1));
                                dancermap.set(dancermap.size() - 1, val);
                            } else {
                                dancermap.set(k, dancermap.get(k + 1));
                                dancermap.set(k + 1, val);
                            }
                        }
                    }
                }
                int position = dancermap.indexOf(new Integer(currentDancer));
                long left = 0;
                long right = 0;

                if (position <= 0) {
                    left = dancermap.get(dancermap.size() - 1);
                    right = dancermap.get(1);
                } else if ((position + 1) >= dancermap.size()) {
                    right = dancermap.get(0);
                    left = dancermap.get(dancermap.size() - 2);
                } else {
                    right = dancermap.get(position + 1);
                    left = dancermap.get(position - 1);
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
