package org.si.Metier;

import org.si.entities.Client;

import java.util.List;

public interface ClientMetier {
    public Client saveClient(Client c);
    public List<Client> listClient();
}
