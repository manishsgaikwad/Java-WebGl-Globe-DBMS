/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author manish
 */
public class createJSON {

    public static int jsonFile(String fName) throws IOException {
        String path = "C:\\Apache24\\htdocs\\globe\\" + fName + ".json";

        JSONObject surveyObj = new JSONObject();
      /*  surveyObj.put("population", new Integer(1000));
        JSONArray listOfStates = new JSONArray();
        listOfStates.add("Madhya Pradesh");
        listOfStates.add("Maharastra");
        listOfStates.add("Rajasthan");
        surveyObj.put("hmm", listOfStates); */
        try {
            File file = new File(path);
            file.createNewFile();
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(surveyObj.toJSONString());
                fileWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
         rep(path, "\\{", "\\[[");
         rep(path, "\\}", "\\]]");
         rep(path, ":", ",");

        // line is not visible here.
        return 0;
    }


    public static void rep(String path, String search, String replace) {
        File log = new File(path);
        // search = "\\}";
        //replace = "\\]";

        try {
            FileReader fr = new FileReader(log);
            String s;
            String totalStr = "";
            try (BufferedReader br = new BufferedReader(fr)) {

                while ((s = br.readLine()) != null) {
                    totalStr += s;
                }
                totalStr = totalStr.replaceAll(search, replace);
                FileWriter fw = new FileWriter(log);
                fw.write(totalStr);
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /* Example:
    public static void main(String[] args) throws IOException {

        int i = jsonFile("test");
        rep("C:\\Apache24\\htdocs\\Globe\\test.json", "\\{", "\\[");
        rep("C:\\Apache24\\htdocs\\Globe\\test.json", "\\}", "\\]");
        rep("C:\\Apache24\\htdocs\\Globe\\test.json", ":", ",");
    }
    */

}
