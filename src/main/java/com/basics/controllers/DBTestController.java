package com.basics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/api/dbtest")
public class DBTestController {

    @Autowired
    private DataSource dataSource;

    @GetMapping()
    public String testConnection() {
        try {
            if (dataSource.getConnection() != null) {
                return "Database connection is successful!";
            } else {
                return "Failed to connect to the database.";
            }
        } catch (Exception e) {
            return "Error connecting to the database: " + e.getMessage();
        }
    }
}
