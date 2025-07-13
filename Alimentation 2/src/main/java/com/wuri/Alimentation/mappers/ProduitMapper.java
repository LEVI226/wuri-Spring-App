package com.wuri.Alimentation.mappers;

import com.wuri.Alimentation.dto.ProduitDto;
import com.wuri.Alimentation.models.Produit;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface ProduitMapper {
    ProduitMapper instance = Mappers.getMapper(ProduitMapper.class);
    Produit toEntity(ProduitDto produitDto);
    ProduitDto toDto(Produit produit);
}
