/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquasanitykelompok1pbo;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class LoginSystem extends User {
    private boolean isLoggedIn;

    public LoginSystem(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    public void login() {
        Scanner input = new Scanner(System.in);

        while (!isLoggedIn) {
            System.out.println("Masukkan Username: ");
            String inputUsername = input.next();

            System.out.println("Masukkan Password: ");
            String inputPassword = input.next();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Username dan Password terdeteksi, Selamat Datang!");
                isLoggedIn = true; // Set login status to true to exit the loop
            } else if (inputUsername.equals(username)) {
                System.out.println("Password Salah! Coba lagi.");
            } else if (inputPassword.equals(password)) {
                System.out.println("Username Salah! Coba lagi.");
            } else {
                System.out.println("Kedua Username dan Password Salah! Coba lagi.");
            }
        }

        input.close();
    }
}

