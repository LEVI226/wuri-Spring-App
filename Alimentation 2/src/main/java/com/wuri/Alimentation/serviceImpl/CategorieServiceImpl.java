package com.wuri.Alimentation.serviceImpl;

import com.wuri.Alimentation.dto.CategorieDto;
import com.wuri.Alimentation.mappers.CategorieMapper;
import com.wuri.Alimentation.models.Categorie;
import com.wuri.Alimentation.repository.CategorieRepository;
import com.wuri.Alimentation.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategorieServiceImpl implements CategorieService {
    private final CategorieRepository categorieRepository;

    @Autowired
    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }
    @Override
    public List<CategorieDto> findAll()
    {
        return categorieRepository.findAll().stream()
                .map(CategorieMapper.instance::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public CategorieDto save(CategorieDto categorieDto)
    {
        Categorie categorie = categorieRepository.save(CategorieDto.toEntity(categorieDto));
        return CategorieMapper.instance.toDto(categorie);
    }
    @Override
    public CategorieDto update(CategorieDto categorieDto)
    {
        Categorie categorie = categorieRepository.findById(categorieDto.getId()).orElseThrow(() -> new RuntimeException("Categorie article non trouvée"));
        categorie.setDescription(categorieDto.getDescription());
        categorie.setLibelle(categorieDto.getLibelle());
        return CategorieMapper.instance.toDto(categorieRepository.save(categorie));
    }

}
