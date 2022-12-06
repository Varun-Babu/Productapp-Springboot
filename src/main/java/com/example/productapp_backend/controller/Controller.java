package com.example.productapp_backend.controller;


import com.example.productapp_backend.Dao.ProductDao;
import com.example.productapp_backend.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ProductDao dao;

    @PostMapping("/")
    public String Home(){
        return "home";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public String Add(@RequestBody Product p){
        System.out.println(p.toString());
        dao.save(p);
        return "Add";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Product> View(){

        return (List<Product>) dao.findAll();
    }

}
