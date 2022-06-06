package com.kenany.mutationtesting.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private UserService userService = new UserService();

    @Test
    void isGreaterThanTen() {
        boolean yes = userService.isGreaterThanTen(12);
        Assertions.assertTrue(yes, "Twelve is greater than 10");
    }

    @Test
    void isGreaterThanTenFalse() {
        boolean no = userService.isGreaterThanTen(9);
        Assertions.assertFalse(no,"Nine is not greater than 10");
    }
}