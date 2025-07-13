package com.wuri.Alimentation.repository;

import com.wuri.Alimentation.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
