package com.example.belajar_java.controller;

import com.example.belajar_java.dto.res.BukuResponse;
import com.example.belajar_java.service.BukuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buku")
public class BukuController {
    final BukuService bukuService;

    public BukuController(BukuService bukuService) {
        this.bukuService = bukuService;
    }

    @GetMapping("/all")
    public List<BukuResponse> daftarBuku(){
        return this.bukuService.getAllBuku();
    }
}
