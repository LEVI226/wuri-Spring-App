package com.wuri.Alimentation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wuri.Alimentation.mappers.CategorieMapper;
import com.wuri.Alimentation.models.Categorie;
import com.wuri.Alimentation.models.Produit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategorieDto {
    private Long id;
    private String libelle;
    private String description;
    private List<Produit> produits;
    public static Categorie toEntity(CategorieDto categorieDto)
    {
        if(categorieDto==null)
        {
            return null;
        }
        return CategorieMapper.instance.toEntity(categorieDto);
    }
    public static CategorieDto toDto(Categorie categorie)
    {
        if(categorie==null)
        {
            return null;
        }
        return CategorieMapper.instance.toDto(categorie);
    }
}
