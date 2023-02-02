package com.demoblaze.productstore.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties loadProperties(String filepath)  {
        try {
            File file = new File(filepath);
            InputStream inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
