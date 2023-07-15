package com.example.belajar_java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tahun_akademik")
public class TahunAkademikController {
    @GetMapping("/all")
    public List<String> getAllTahunAkademik(){
        String satu = "satu";
        String dua = "dua";
        List<String> list = new ArrayList<>();
        list.add(satu);
        list.add(dua);
        return list;
    }
}
