package com.demoblaze.productstore.utils;

import java.util.Properties;

public class ConfigUtil {
    private static Properties properties;
    private static ConfigUtil configUtil;
    private ConfigUtil(){
        String env = System.getProperty("env","PRODUCTION");
        if (env.equals("PRODUCTION")){
            properties = PropertiesUtil.loadProperties("src/test/java/com/demoblaze/productstore/config/production.properties");
        } else if (env.equals("LOCAL")) {
            properties = PropertiesUtil.loadProperties("src/test/java/com/demoblaze/productstore/config/local.properties");
        }else {
            throw new RuntimeException("Environment dose not supported");
        }

    }

    public static ConfigUtil getInstance(){
        if (configUtil==null){
            configUtil = new ConfigUtil();
            return configUtil;
        }else return configUtil;
    }


    public String getBaseUrl(){
        String prop = properties.getProperty("baseUrl");
        if (prop!=null)
        return prop;

        throw new RuntimeException("could not find the baseUrl in the properties file");
    }

    public String getEmail(){
        String prop = properties.getProperty("email");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the email in the properties file");
    }

    public String getPassword(){
        String prop = properties.getProperty("password");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the password in the properties file");
    }


    public String getName(){
        String prop = properties.getProperty("name");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the name in the properties file");
    }

    public String getCountry(){
        String prop = properties.getProperty("country");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the country in the properties file");
    }


    public String getCity(){
        String prop = properties.getProperty("city");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the city in the properties file");
    }

    public String getCreditCardNo(){
        String prop = properties.getProperty("creditCardNo");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the Credit Card No in the properties file");
    }


    public String getCreditCarExpiryMonth(){
        String prop = properties.getProperty("month");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the month in the properties file");
    }

    public String getCreditCarExpiryYear(){
        String prop = properties.getProperty("year");
        if (prop!=null)
            return prop;

        throw new RuntimeException("could not find the year in the properties file");
    }

}
