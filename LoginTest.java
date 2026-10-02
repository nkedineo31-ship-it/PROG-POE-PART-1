/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quickchat
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testValidUsername() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertTrue(user.checkUserName());
    }

    @Test
    public void testInvalidUsername() {

        Login user = new Login(
                "kyle!!!!!!!",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertFalse(user.checkUserName());
    }

    @Test
    public void testValidPassword() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testInvalidPassword() {

        Login user = new Login(
                "kyl_1",
                "password",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testValidCellPhone() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testInvalidCellPhone() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "08966553",
                "Neo",
                "Nkedi"
        );

        assertFalse(user.checkCellPhoneNumber());
    }

    @Test
    public void testSuccessfulLogin() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertTrue(
                user.loginUser("kyl_1", "Ch&&sec@ke99!")
        );
    }

    @Test
    public void testFailedLogin() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertFalse(
                user.loginUser("wrong", "password")
        );
    }

    @Test
    public void testRegistrationSuccessMessage() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertEquals(
                "User successfully registered.",
                user.registerUser()
        );
    }

    @Test
    public void testLoginSuccessMessage() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertEquals(
                "Welcome Neo ,Nkedi it is great to see you again.",
                user.returnLoginStatus(
                        "kyl_1",
                        "Ch&&sec@ke99!"
                )
        );
    }

    @Test
    public void testLoginFailureMessage() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Neo",
                "Nkedi"
        );

        assertEquals(
                "Username or password incorrect, please try again.",
                user.returnLoginStatus(
                        "wrong",
                        "wrong"
                )
        );
    }

   


}