package com.aziz.produits.service;

import java.util.List;
import com.aziz.produits.entities.Produit;
public interface ProduitService {
Produit saveProduit(Produit p);
Produit updateProduit(Produit p);
void deleteProduit(Produit p);
 void deleteProduitById(Long id);
Produit getProduit(Long id);
List<Produit> getAllProduits();
}