package com.wuri.Alimentation.services;


import com.wuri.Alimentation.dto.CategorieDto;

import java.util.List;

public interface CategorieService {
    List<CategorieDto> findAll();
    CategorieDto save(CategorieDto categorieDto);
    CategorieDto update(CategorieDto categorieDto);
}
