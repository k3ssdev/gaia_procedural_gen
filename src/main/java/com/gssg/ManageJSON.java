package com.gssg;

import java.io.FileWriter;
import java.io.IOException;

public class ManageJSON {
       //metodo para guardar json en archivo
       public static void saveJson(String filename, String json) {
        try {
            FileWriter file = new FileWriter(filename);
            file.write(json);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
