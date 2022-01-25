package ru.skypro.controller;

@RestController
public class Democontroller {

    @GetMapping
    public String printHello() {
        retern "Hello, world";
    }
}
