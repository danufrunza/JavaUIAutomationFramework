package com.dprojects;

import com.dprojects.managers.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        try {
            System.out.printf("Hello and welcome!");
            DriverManager.getInstance().getDriver().get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-edge-driver/4.25.0");
            Thread.sleep(5000);
            DriverManager.getInstance().getDriver().quit();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }



    }
}