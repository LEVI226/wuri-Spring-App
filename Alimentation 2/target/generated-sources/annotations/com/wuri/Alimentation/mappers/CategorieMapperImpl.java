package com.wuri.Alimentation.mappers;

import com.wuri.Alimentation.dto.CategorieDto;
import com.wuri.Alimentation.models.Categorie;
import com.wuri.Alimentation.models.Produit;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-29T22:31:17+0000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
public class CategorieMapperImpl implements CategorieMapper {

    @Override
    public Categorie toEntity(CategorieDto categorieDto) {
        if ( categorieDto == null ) {
            return null;
        }

        Categorie categorie = new Categorie();

        categorie.setId( categorieDto.getId() );
        categorie.setLibelle( categorieDto.getLibelle() );
        categorie.setDescription( categorieDto.getDescription() );
        List<Produit> list = categorieDto.getProduits();
        if ( list != null ) {
            categorie.setProduits( new ArrayList<Produit>( list ) );
        }

        return categorie;
    }

    @Override
    public CategorieDto toDto(Categorie categorie) {
        if ( categorie == null ) {
            return null;
        }

        CategorieDto categorieDto = new CategorieDto();

        categorieDto.setId( categorie.getId() );
        categorieDto.setLibelle( categorie.getLibelle() );
        categorieDto.setDescription( categorie.getDescription() );
        List<Produit> list = categorie.getProduits();
        if ( list != null ) {
            categorieDto.setProduits( new ArrayList<Produit>( list ) );
        }

        return categorieDto;
    }
}
