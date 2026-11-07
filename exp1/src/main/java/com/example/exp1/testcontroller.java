package com.example.exp1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    List<Registration> list = new ArrayList<>();
    int id = 1;

    @PostMapping("/register")
    public Registration register(@RequestBody Registration r) {
        r.id = id++;
        list.add(r);
        return r;
    }

    @GetMapping("/register")
    public List<Registration> getAll() {
        return list;
    }
}