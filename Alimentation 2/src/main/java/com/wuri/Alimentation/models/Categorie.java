package com.wuri.Alimentation.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.wuri.Alimentation.abstractClass.AbstractId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Categorie extends AbstractId {
    private String libelle;
    private String description;
    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Produit> produits;
}
