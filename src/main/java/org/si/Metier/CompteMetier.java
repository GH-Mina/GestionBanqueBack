package org.si.Metier;

import org.si.entities.Compte;

import java.util.List;

public interface CompteMetier {
    public Compte saveCompte(Compte cp);
    public List<Compte> getCompte(String code);
}
