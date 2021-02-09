package org.si.Metier;

import org.si.entities.Client;
import org.si.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ClientMetierImp implements ClientMetier {
    private static HashMap<String, Client> list = new HashMap<>();
    @Override
    public Client saveClient(Client c) {
        c.setCodeClient(list.size() + 1L);
        return c;
    }

    @Override
    public List<Client> listClient() {
        return new ArrayList<>(list.values());
    }
}
