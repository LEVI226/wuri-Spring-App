package bf.securitywithjwt.controller;

import bf.securitywithjwt.model.Produit;
import bf.securitywithjwt.service.ProduitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping("api/v1/produit/creer")
    public ResponseEntity<Produit> creerProduit(@RequestBody Produit produit){
        Produit produitCreate=produitService.creerProduit(produit);
        return   ResponseEntity.status(HttpStatus.CREATED).body(produitCreate);
    }

    @PutMapping("api/v1/produit/update/{id}")
    public ResponseEntity<Produit> modifierProduit(@RequestBody Produit produit, @PathVariable Long id)  {
        Produit produitCreate=produitService.modifierProduit(produit,id);
        return   ResponseEntity.status(HttpStatus.OK).body(produitCreate);
    }

    @GetMapping("api/v1/produit/liste")
    public ResponseEntity<List<Produit>> listerProduits(){
        List<Produit> produits=produitService.listerAllProduits();
        return   ResponseEntity.status(HttpStatus.OK).body(produits);
    }


    @GetMapping("api/v1/produit/consulter/{id}")
    public ResponseEntity<Produit> consulterProduitById(@PathVariable Long id)  {
        Produit produit=produitService.consulterProduitById(id);
        return   ResponseEntity.status(HttpStatus.OK).body(produit);
    }

    @DeleteMapping("api/v1/produit/delete/{id}")
    public ResponseEntity<Void> supprimerProduit(@PathVariable Long id) {
        produitService.supprimerProduit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
