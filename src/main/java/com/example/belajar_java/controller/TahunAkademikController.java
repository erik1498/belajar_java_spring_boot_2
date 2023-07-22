package com.example.belajar_java.controller;

import com.example.belajar_java.dto.response.GlobalResponse;
import com.example.belajar_java.dto.response.TahunAkademikResponse;
import com.example.belajar_java.entity.TahunAkademikEntity;
import com.example.belajar_java.service.TahunAkademikService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tahun_akademik")
public class TahunAkademikController {
    final TahunAkademikService tahunAkademikService;

    public TahunAkademikController(TahunAkademikService tahunAkademikService) {
        this.tahunAkademikService = tahunAkademikService;
    }

    @GetMapping("/all/string")
    public List<String> getAllString(){
        return tahunAkademikService.getAllString();
    }

    @GetMapping("/all/data")
    public List<TahunAkademikEntity> getAllTahunAkademik(){
        return tahunAkademikService.getAllTahunAkademik();
    }

    @GetMapping("/all")
    public GlobalResponse<List<TahunAkademikEntity>> getAll(){
        return tahunAkademikService.getAll();
    }

    @GetMapping("/all/response")
    public ResponseEntity<GlobalResponse<List<TahunAkademikEntity>>> getAllResponse(){
        return tahunAkademikService.getAllResponse();
    }
}
