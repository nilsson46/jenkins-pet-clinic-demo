package com.example.petclinicdemo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void helloWorld() {
        HelloController helloController = new HelloController();
        assertEquals(helloController, "Hello Cat");
    }
}