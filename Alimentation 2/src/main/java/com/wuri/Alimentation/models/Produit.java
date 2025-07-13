package com.wuri.Alimentation.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.wuri.Alimentation.abstractClass.AbstractId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Produit extends AbstractId {
    private String nom;
    private String description;
    private int prix;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    @JsonBackReference
    private Categorie categorie;
}
