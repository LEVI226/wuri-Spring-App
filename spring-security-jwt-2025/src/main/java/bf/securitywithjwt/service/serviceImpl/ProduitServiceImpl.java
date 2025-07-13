package bf.securitywithjwt.service.serviceImpl;

import bf.securitywithjwt.model.Produit;
import bf.securitywithjwt.repository.ProduitRepository;
import bf.securitywithjwt.service.ProduitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit creerProduit(Produit produit) {
        return  produitRepository.save(produit);
    }

    @Override
    public Produit modifierProduit(Produit produit, Long idProduit) {
        Produit produitExisted = produitRepository.findById(idProduit).get();
        if (produitExisted != null){
            produitExisted.setNom(produit.getNom());
            produitExisted.setPrix(produit.getPrix());
            produitExisted.setDescription(produit.getDescription());
            return produitRepository.save(produitExisted);
        }
        else return null;
    }

    @Override
    public List<Produit> listerAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit consulterProduitById(Long idProduit) {
        return produitRepository.findById(idProduit).get();
    }

    @Override
    public void supprimerProduit(Long idProduit) {
        produitRepository.deleteById(idProduit);
    }


}
