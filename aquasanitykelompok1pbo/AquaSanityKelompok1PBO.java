/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aquasanitykelompok1pbo;

/**
 *
 * @author ACER
 */
public class AquaSanityKelompok1PBO {
    public static void main(String[] args) {
        String systemUsername = "wisdom";
        String systemPassword = "123";

        LoginSystem login = new LoginSystem(systemUsername, systemPassword);
        login.login();
        // Further actions or methods after successful login
    }
}
