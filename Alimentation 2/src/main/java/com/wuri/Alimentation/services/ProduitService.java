package com.wuri.Alimentation.services;

import com.wuri.Alimentation.dto.ProduitDto;

import java.util.List;

public interface ProduitService {
    List<ProduitDto> findAll();
    ProduitDto save(ProduitDto produitDto);
    ProduitDto update(ProduitDto produitDto);
}
