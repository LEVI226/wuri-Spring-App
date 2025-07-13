package com.wuri.Alimentation.serviceImpl;


import com.wuri.Alimentation.dto.ProduitDto;
import com.wuri.Alimentation.mappers.ProduitMapper;
import com.wuri.Alimentation.models.Produit;
import com.wuri.Alimentation.repository.ProduitRepository;
import com.wuri.Alimentation.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;

    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
    @Override
    public List<ProduitDto> findAll()
    {
        return produitRepository.findAll().stream()
                .map(ProduitMapper.instance::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public ProduitDto save(ProduitDto produitDto)
    {
        Produit produit = produitRepository.save(ProduitMapper.instance.toEntity(produitDto));
        return ProduitMapper.instance.toDto(produit);
    }
    @Override
    public ProduitDto update(ProduitDto produitDto)
    {
        Produit produit = produitRepository.findById(produitDto.getId()).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
        produit.setNom(produitDto.getNom());
        produit.setPrix(produitDto.getPrix());
        produit.setDescription(produitDto.getDescription());
        produit.setCategorie(produitDto.getCategorie());
        return ProduitMapper.instance.toDto(produitRepository.save(produit));
    }

}
