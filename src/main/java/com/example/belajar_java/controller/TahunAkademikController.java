package com.example.belajar_java.controller;

import com.example.belajar_java.dto.request.TahunAkademikRequest;
import com.example.belajar_java.dto.response.GlobalResponse;
import com.example.belajar_java.entity.TahunAkademikEntity;
import com.example.belajar_java.service.TahunAkademikService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tahun_akademik")
public class TahunAkademikController {
    final TahunAkademikService tahunAkademikService;

    public TahunAkademikController(TahunAkademikService tahunAkademikService) {
        this.tahunAkademikService = tahunAkademikService;
    }

    @GetMapping("/all")
    public ResponseEntity<GlobalResponse<List<TahunAkademikEntity>>> getAll(){
        return tahunAkademikService.getAll();
    }

    @PostMapping
    public ResponseEntity<GlobalResponse<TahunAkademikRequest>> postData(@RequestBody TahunAkademikRequest tahunAkademikRequest){
        GlobalResponse<TahunAkademikRequest> response = new GlobalResponse<>();
        response.setMessage("Success");
        response.setCode(HttpStatus.OK.value());
        response.setData(tahunAkademikRequest);
        return ResponseEntity.ok(response);
    }
}
