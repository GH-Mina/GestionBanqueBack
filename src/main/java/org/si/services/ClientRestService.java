package org.si.services;

import org.si.Metier.ClientMetier;
import org.si.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientRestService {
    @Autowired
    private ClientMetier clientMetier;

    @RequestMapping(value="/clients", method = RequestMethod.POST )
    public Client saveClient(@RequestBody Client c) {
        return clientMetier.saveClient(c);
    }

    @RequestMapping(value="/clients", method = RequestMethod.GET)
    public List<Client> listClient() {
        return clientMetier.listClient();
    }

}
