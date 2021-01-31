package org.si.entities;

import java.io.Serializable;


public class Client implements Serializable {
    private Long codeClient;
    private String nomClient;

    public Client() {
        super();
    }

    public Client(String nomClient) {
        super();
        this.nomClient = nomClient;
    }

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
}
