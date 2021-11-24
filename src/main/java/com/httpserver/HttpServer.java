package com.httpserver;

import com.httpserver.config.Configuration;
import com.httpserver.config.ConfigurationManager;
import com.httpserver.core.ServerListenerThread;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpServer {


    private final static Logger LOGGER = LoggerFactory.getLogger(HttpServer.class);

    public static void main(String[] args){
        //Log server startup:
        LOGGER.info("Server starting...");

        //Load Configuration file, parse, and get into Pojo: (Configuration class)
        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();


        LOGGER.info("Port: " + conf.getPort());
        LOGGER.info("Webroot: " + conf.getWebroot());


        try {
            ServerListenerThread serverListenerThread = new ServerListenerThread(conf.getPort(), conf.getWebroot());
            serverListenerThread.run();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
