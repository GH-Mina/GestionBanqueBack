package org.si.Metier;

import org.si.entities.Compte;
import org.si.entities.CompteCourant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class CompteMetierImp implements CompteMetier{
    private static HashMap<String, Compte> listComptes = new HashMap<String, Compte>();
    static{
        listComptes.put("123", new CompteCourant());

    }

    @Override
    public Compte saveCompte(Compte cp) {
        cp.setDateCreation(new Date());
        cp.setCodeCompte("cp" + listComptes.size());
        listComptes.put(cp.getCodeCompte(), cp);
        return cp;
    }

    @Override
    public List<Compte> getCompte(String code) {
        List<Compte> list=new ArrayList<Compte>();
        list.add(listComptes.get(code));
        return list;
    }

    @Override
    public List<Compte> getAllComptes() {

        return new ArrayList<>(listComptes.values());
    }
}
