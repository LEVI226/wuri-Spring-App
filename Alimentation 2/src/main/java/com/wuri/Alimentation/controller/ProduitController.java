package com.wuri.Alimentation.controller;


import com.wuri.Alimentation.dto.ProduitDto;
import com.wuri.Alimentation.services.ProduitService;
import com.wuri.Alimentation.utils.ApiResponseData;
import com.wuri.Alimentation.utils.Constantes;
import com.wuri.Alimentation.utils.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitController {

    private final ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping(Constantes.PRODUIT_ENDPOINT)
    ResponseEntity<ApiResponseData<List<ProduitDto>>> findAll()
    {
        List<ProduitDto> produitDtos = produitService.findAll();
        return ResponseBuilder.buildResponseEntity(HttpStatus.OK,"Liste des produits", produitDtos);
    }

    @PostMapping(Constantes.PRODUIT_ENDPOINT)
    ResponseEntity<ApiResponseData<ProduitDto>> save(@RequestBody ProduitDto produitDto)
    {
        ProduitDto produitDtosave = produitService.save(produitDto);
        return ResponseBuilder.buildResponseEntity(HttpStatus.CREATED,"Produit crée", produitDtosave);
    }

    @PutMapping(Constantes.PRODUIT_ENDPOINT)
    ResponseEntity<ApiResponseData<ProduitDto>> update(@RequestBody  ProduitDto produitDto)
    {
        ProduitDto produitDtoupdate = produitService.update(produitDto);
        return ResponseBuilder.buildResponseEntity(HttpStatus.CREATED,"Produit modifié",produitDtoupdate);
    }

}
