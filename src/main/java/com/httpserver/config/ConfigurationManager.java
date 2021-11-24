package com.httpserver.config;

public class ConfigurationManager {

    private static ConfigurationManager myConfigurationManager;
    private static Configuration myCurrentConfiguration;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance(){
        if(myConfigurationManager == null)
           myConfigurationManager = new ConfigurationManager();
        return myConfigurationManager;
    }

    /**
     * used to load the json config file at the path provided
     * */
    public void loadConfigurationFile(String filePath){

    }
}
