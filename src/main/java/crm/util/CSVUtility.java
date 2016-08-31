package crm.util;

import java.io.*;
import java.util.ArrayList;

public class CSVUtility {
    private String[] line;

    public String[] getLine() {
        return line;
    }

    public void setLine(String[] line) {
        this.line = line;
    }

    public static ArrayList<String> readLine(){
        ArrayList<String> lines = new ArrayList<String>();
        String file = "C:\\Users\\palsulea\\Desktop\\test.csv";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
