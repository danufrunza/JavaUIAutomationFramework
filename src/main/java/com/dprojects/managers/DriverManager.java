package com.dprojects.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static  DriverManager instance;
    private WebDriver driver ;
    private static  final String WEB_DRIVER_TYPE = "Chrome";


    private DriverManager(){
        switch (WEB_DRIVER_TYPE.toUpperCase()){
            case "CHROME":
                driver = new ChromeDriver();
                System.out.println("ChromeDriver");
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                System.out.println("FirefoxDriver");
                break;
            default:
                System.out.println("DefaultDriver");
        }
    }

    public static DriverManager getInstance(){
        if(instance == null){
            instance = new DriverManager();
        }

        return  instance;
    }
    public   WebDriver getDriver(){

        return  driver;
    }
}
