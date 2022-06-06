package com.kenany.mutationtesting.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean isGreaterThanTen(int num) {
        if (num < 10) {
            return false;
        } else {
            return true;
        }
    }
}
