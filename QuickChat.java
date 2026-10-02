/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.quickchat;

import java.util.Scanner;
import com.quickchat.Login;

/**
 *
 * @author Student
 */
public class QuickChat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================
        // QUICKCHAT
        // =========================

        System.out.println("=================================");
        System.out.println("           QUICKCHAT");
        System.out.println("=================================");

        // =========================
        // REGISTRATION
        // =========================

        System.out.println();
        System.out.println("----- REGISTRATION -----");

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Create a username: ");
        String username = input.nextLine();

        System.out.print("Create a password: ");
        String password = input.nextLine();

        System.out.print("Enter your South African cell phone number: ");
        String cellPhone = input.nextLine();

        // Create Login object
        Login user = new Login(
                username,
                password,
                cellPhone,
                firstName,
                lastName
        );

        // =========================
        // REGISTRATION RESULT
        // =========================

        String registrationMessage = user.registerUser();

        System.out.println();
        System.out.println("Registration Result:");
        System.out.println(registrationMessage);

        
// =========================
// LOGIN
// =========================

if (registrationMessage.equals("User successfully registered.")) {

    System.out.println();
    System.out.println("=================================");
    System.out.println("             LOGIN");
    System.out.println("=================================");

    boolean usernameCorrect = false;

    // =========================
    // USERNAME
    // =========================

    while (!usernameCorrect) {

        System.out.print("Enter your username: ");
        String enteredUsername = input.nextLine();

        if (!enteredUsername.equals(username)) {

            System.out.println();
            System.out.println("ALERT: Username is incorrect.");
            System.out.println("Please enter your username again.");
            System.out.println();

            // Skip the password
            // and ask for username again
            continue;
        }

        usernameCorrect = true;

        System.out.println();
        System.out.println("Username is correct.");

        // =========================
        // PASSWORD
        // =========================

        boolean passwordCorrect = false;

        while (!passwordCorrect) {

            System.out.print("Enter your password: ");
            String enteredPassword = input.nextLine();

            if (!user.loginUser(
                    enteredUsername,
                    enteredPassword)) {

                System.out.println();
                System.out.println("ALERT: Password is incorrect.");
                System.out.println("Please enter your password again.");
                System.out.println();

            } else {

                passwordCorrect = true;

                System.out.println();
                System.out.println(
                        user.returnLoginStatus(
                                enteredUsername,
                                enteredPassword
                        )
                );
            }
        }
    }

} else {

    System.out.println();
    System.out.println(
            "Registration was unsuccessful. "
            + "Please correct your details and try again."
    );
}



}
}
