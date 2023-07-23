package com.example.belajar_java.controller;

import com.example.belajar_java.dto.request.TahunAkademikRequest;
import com.example.belajar_java.dto.response.GlobalResponse;
import com.example.belajar_java.entity.TahunAkademikEntity;
import com.example.belajar_java.service.TahunAkademikService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<GlobalResponse<TahunAkademikRequest>> postData(@Valid @RequestBody TahunAkademikRequest tahunAkademikRequest, Errors errors){
        GlobalResponse<TahunAkademikRequest> response = new GlobalResponse<>();
        response.setMessage("Success");
        response.setCode(HttpStatus.OK.value());
        if (errors.hasErrors()){
            for (ObjectError e: errors.getAllErrors()) {
                response.setMessage(e.getDefaultMessage());
            }
            response.setCode(HttpStatus.BAD_REQUEST.value());
        }
        response.setData(tahunAkademikRequest);
        return ResponseEntity.ok(response);
    }
}
