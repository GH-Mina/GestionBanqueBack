package org.si.Metier;

import org.si.dao.CompteRepository;
import org.si.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CompteMetierImp implements CompteMetier{
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public Compte saveCompte(Compte cp) {
        cp.setDateCreation(new Date());
        return compteRepository.save(cp);
    }

    @Override
    public List<Compte> getCompte(String code) {
        return compteRepository.findAll();
    }

    @Override
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }
}
