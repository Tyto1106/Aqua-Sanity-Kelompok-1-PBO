/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquasanitykelompok1pbo;

/**
 *
 * @author ACER
 */
public class EducationPage {
    private String pageTitle;
    private String content;
    private String author;

    public EducationPage(String pageTitle, String content, String author) {
        this.pageTitle = pageTitle;
        this.content = content;
        this.author = author;
    }

    public void displayPageInfo() {
        System.out.println("Page Title: " + pageTitle);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author);
    }
}

