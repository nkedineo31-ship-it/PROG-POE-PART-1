/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package com.quickchat;

public class Login {

    private String username;
    private String password;
    private String cellPhone;
    private String firstName;
    private String lastName;

    public Login(String username, String password, String cellPhone,
                 String firstName, String lastName) {

        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {

        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasCapital = true;
            }

            if (Character.isDigit(character)) {
                hasNumber = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecial = true;
            }
        }

        return password.length() >= 8
                && hasCapital
                && hasNumber
                && hasSpecial;
    }

    public boolean checkCellPhoneNumber() {

        String regex = "^\\+27[0-9]{9}$";

        return cellPhone.matches(regex);
    }

    public String registerUser() {

        if (!checkUserName()) {

            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";

        } else if (!checkPasswordComplexity()) {

            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";

        } else if (!checkCellPhoneNumber()) {

            return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        }

        return "User successfully registered.";
    }


public boolean loginUser(String enteredUsername, String enteredPassword) {

    if (!enteredUsername.equals(username)) {
        return false;
    }

    if (!enteredPassword.equals(password)) {
        return false;
    }

    return true;
}

public String returnLoginStatus(String enteredUsername,
                                String enteredPassword) {

    if (!enteredUsername.equals(username)) {

        return "Username is incorrect, please try again.";
    }

    if (!enteredPassword.equals(password)) {

        return "Password is incorrect, please try again.";
    }

    return "Welcome " + firstName + " ," + lastName
            + " it is great to see you again.";
}

}