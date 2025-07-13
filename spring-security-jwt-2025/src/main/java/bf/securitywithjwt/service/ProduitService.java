package bf.securitywithjwt.service;


import bf.securitywithjwt.model.Produit;

import java.util.List;

public interface ProduitService {
    Produit creerProduit(Produit produit);

    Produit modifierProduit(Produit produit, Long idProduit);

    List<Produit> listerAllProduits();

    Produit consulterProduitById(Long idProduit);

    void supprimerProduit(Long idProduit);

}
