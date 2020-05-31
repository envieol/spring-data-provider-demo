package com.example.springdataproviderdemo.controllor;


import com.example.springdataproviderdemo.entity.Book;
import com.example.springdataproviderdemo.entity.Pen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GoodsController {
    @GetMapping("books")
    private Map<String, Object> getBooks() {
        Book book1 = Book.builder().id("book1").name("Java").price(new BigDecimal("16.999")).pages(99).build();
        Book book2 = Book.builder().id("book2").name("C++").price(new BigDecimal("232.45")).pages(59).build();
        Map<String, Object> res = new HashMap<>();
        res.put("data", Arrays.asList(book1, book2));
        return res;
    }

    @GetMapping("pens")
    private Map<String, Object> getPens() {
        Pen pen1 = Pen.builder().id("pen1").name("pencil").price(new BigDecimal("16.999")).length(new BigDecimal("13")).build();
        Pen pen2 = Pen.builder().id("pen2").name("gel Pen").price(new BigDecimal("232.45")).length(new BigDecimal("8")).build();
        Map<String, Object> res = new HashMap<>();
        res.put("data", Arrays.asList(pen1, pen2));
        return res;
    }
}
