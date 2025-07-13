package com.wuri.Alimentation.controller;

import com.wuri.Alimentation.dto.CategorieDto;
import com.wuri.Alimentation.services.CategorieService;
import com.wuri.Alimentation.utils.ApiResponseData;
import com.wuri.Alimentation.utils.Constantes;
import com.wuri.Alimentation.utils.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieController {

    private final CategorieService categorieService;

    @Autowired
    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping(Constantes.CATEGORIE_ENDPOINT)
    ResponseEntity<ApiResponseData<List<CategorieDto>>> findAll()
    {
        List<CategorieDto> categorieDtos = categorieService.findAll();
        return ResponseBuilder.buildResponseEntity(HttpStatus.OK,"Liste des catégories",categorieDtos);
    }

    @PostMapping(Constantes.CATEGORIE_ENDPOINT)
    ResponseEntity<ApiResponseData<CategorieDto>> save(@RequestBody CategorieDto categorieDto)
    {
        CategorieDto categoriesDtosave = categorieService.save(categorieDto);
        return ResponseBuilder.buildResponseEntity(HttpStatus.CREATED,"Categorie créee",categoriesDtosave);
    }

    @PutMapping(Constantes.CATEGORIE_ENDPOINT)
    ResponseEntity<ApiResponseData<CategorieDto>> update(@RequestBody CategorieDto categorieDto)
    {
        CategorieDto categoriesDtoupdate = categorieService.update(categorieDto);
        return ResponseBuilder.buildResponseEntity(HttpStatus.CREATED,"Categorie modifiée",categoriesDtoupdate);
    }

}
