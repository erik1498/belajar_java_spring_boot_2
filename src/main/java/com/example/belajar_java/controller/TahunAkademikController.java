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
        GlobalResponse<List<TahunAkademikEntity>> response = tahunAkademikService.getAll();
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @PostMapping
    public ResponseEntity<GlobalResponse<TahunAkademikEntity>> postData(@Valid @RequestBody TahunAkademikRequest tahunAkademikRequest, Errors errors){
        GlobalResponse<TahunAkademikEntity> response = new GlobalResponse<>();
        if (errors.hasErrors()){
            for (ObjectError e: errors.getAllErrors()) {
                response.setMessage(e.getDefaultMessage());
            }
            response.setCode(HttpStatus.BAD_REQUEST.value());
        }else {
            response = tahunAkademikService.insertData(tahunAkademikRequest);
        }
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @PutMapping
    public ResponseEntity<GlobalResponse<Boolean>> putData(@Valid @RequestBody TahunAkademikRequest tahunAkademikRequest, @RequestParam("uuid") String uuid, Errors errors){
        GlobalResponse<Boolean> response = new GlobalResponse<>();
        if (errors.hasErrors()){
            for (ObjectError e: errors.getAllErrors()) {
                response.setMessage(e.getDefaultMessage());
            }
            response.setCode(HttpStatus.BAD_REQUEST.value());
        }else {
            response = tahunAkademikService.updateData(tahunAkademikRequest, uuid);
        }
        return ResponseEntity.status(response.getCode()).body(response);
    }
}
