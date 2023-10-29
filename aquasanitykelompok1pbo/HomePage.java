/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquasanitykelompok1pbo;

/**
 *
 * @author ACER
 */
public class HomePage {
    private String welcomeMessage;
    private String featuredContent;

    public HomePage(String welcomeMessage, String featuredContent) {
        this.welcomeMessage = welcomeMessage;
        this.featuredContent = featuredContent;
    }

    public void displayPageInfo() {
        System.out.println("Welcome Message: " + welcomeMessage);
        System.out.println("Featured Content: " + featuredContent);
    }
}

