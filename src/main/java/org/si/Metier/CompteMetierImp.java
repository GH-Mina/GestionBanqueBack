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
         CompteCourant c= new CompteCourant("11", new Date(),60000, 2000);
        CompteCourant c1= new CompteCourant("22", new Date(),70000, 300);
        CompteCourant c2= new CompteCourant("33", new Date(),70000, 300);
        CompteCourant c3= new CompteCourant("44", new Date(),70000, 300);
        CompteCourant c4= new CompteCourant("55", new Date(),70000, 300);
        CompteCourant c5= new CompteCourant("66", new Date(),70000, 300);
        CompteCourant c6= new CompteCourant("77", new Date(),70000, 300);
        CompteCourant c7= new CompteCourant("88", new Date(),70000, 300);
        CompteCourant c8= new CompteCourant("99", new Date(),70000, 300);
        CompteCourant c9= new CompteCourant("111", new Date(),70000, 300);
        CompteCourant c10= new CompteCourant("222", new Date(),70000, 300);
        CompteCourant c11= new CompteCourant("333", new Date(),70000, 300);
        

        listComptes.put("1", c);
        listComptes.put("2", c1);
        listComptes.put("3", c2);
        listComptes.put("4", c3);
        listComptes.put("5", c4);
        listComptes.put("6", c5);
        listComptes.put("7", c6);
        listComptes.put("8", c7);
        listComptes.put("9", c8);
        listComptes.put("10", c9);
        listComptes.put("11", c10);
        listComptes.put("12", c11);

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
