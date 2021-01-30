package org.si.services;

import org.si.Metier.CompteMetier;
import org.si.entities.Client;
import org.si.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@CrossOrigin(origins = "*",maxAge= 3600)
@RestController
public class CompteRestService {
    @Autowired
    private CompteMetier compteMetier;

    @RequestMapping(value = "/comptes/add", method = RequestMethod.POST)
    public Compte saveCompte(@RequestBody Compte cp) {
        return compteMetier.saveCompte(cp);
    }

    @RequestMapping(value = "/comptes/{code}", method = RequestMethod.GET)
    public List<Compte> getCompte(@PathVariable String code) {
        return compteMetier.getCompte(code);
    }

    @RequestMapping(value="/comptes", method = RequestMethod.GET)
    public List<Compte> getAllComptes() {
        return compteMetier.getAllComptes();
    }


}
