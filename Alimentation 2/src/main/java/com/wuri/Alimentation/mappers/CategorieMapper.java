package com.wuri.Alimentation.mappers;

import com.wuri.Alimentation.dto.CategorieDto;
import com.wuri.Alimentation.models.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategorieMapper {
    CategorieMapper instance = Mappers.getMapper(CategorieMapper.class);
    Categorie toEntity(CategorieDto categorieDto);
    CategorieDto toDto(Categorie categorie);
}
