package com.wuri.Alimentation.repository;

import com.wuri.Alimentation.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.rmi.server.UID;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
