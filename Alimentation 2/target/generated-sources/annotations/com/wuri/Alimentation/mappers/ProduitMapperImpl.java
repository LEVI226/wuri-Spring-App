package com.wuri.Alimentation.mappers;

import com.wuri.Alimentation.dto.ProduitDto;
import com.wuri.Alimentation.models.Produit;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-29T22:31:17+0000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class ProduitMapperImpl implements ProduitMapper {

    @Override
    public Produit toEntity(ProduitDto produitDto) {
        if ( produitDto == null ) {
            return null;
        }

        Produit produit = new Produit();

        produit.setId( produitDto.getId() );
        produit.setNom( produitDto.getNom() );
        produit.setDescription( produitDto.getDescription() );
        produit.setPrix( produitDto.getPrix() );
        produit.setCategorie( produitDto.getCategorie() );

        return produit;
    }

    @Override
    public ProduitDto toDto(Produit produit) {
        if ( produit == null ) {
            return null;
        }

        ProduitDto produitDto = new ProduitDto();

        produitDto.setId( produit.getId() );
        produitDto.setNom( produit.getNom() );
        produitDto.setDescription( produit.getDescription() );
        produitDto.setPrix( produit.getPrix() );
        produitDto.setCategorie( produit.getCategorie() );

        return produitDto;
    }
}
