package com.wuri.Alimentation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wuri.Alimentation.mappers.ProduitMapper;
import com.wuri.Alimentation.models.Categorie;
import com.wuri.Alimentation.models.Produit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProduitDto {
    private Long id;
    private String nom;
    private String description;
    private int prix;
    private Categorie categorie;

    public static Produit toEntity(ProduitDto produitDto)
    {
        if(produitDto==null)
        {
            return null;
        }
        return ProduitMapper.instance.toEntity(produitDto);
    }
    public static ProduitDto toDto(Produit produit)
    {
        if(produit==null)
        {
            return null;
        }
        return ProduitMapper.instance.toDto(produit);
    }
}
