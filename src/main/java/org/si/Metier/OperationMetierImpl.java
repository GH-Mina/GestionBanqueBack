package org.si.Metier;

import org.si.dao.CompteRepository;
import org.si.dao.EmployeRepository;
import org.si.dao.OperationRepository;
import org.si.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class OperationMetierImpl implements OperationMetier {
    @Autowired
    private OperationRepository operationRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private EmployeRepository employeRepository;

    @Override
    @Transactional
    public boolean verser(String code, double montant, Long codeEmp) {
        Compte cp = compteRepository.getOne(code);
        Employe em = employeRepository.getOne(codeEmp);
        Operation o = new Versement();
        o.setDateOperation(new Date());
        o.setMontant(montant);
        o.setCompte(cp);
        o.setEmploye(em);
        operationRepository.save(o);
        cp.setSolde(cp.getSolde()+montant);
        return true;
    }

    @Override
    @Transactional
    public boolean retirer(String code, double montant, Long codeEmp) {
        Compte cp = compteRepository.getOne(code);
        if(cp.getSolde()<montant) throw new RuntimeException("Solde est insuffisant");
        Employe em = employeRepository.getOne(codeEmp);
        Operation o = new Retrait();
        o.setDateOperation(new Date());
        o.setMontant(montant);
        o.setCompte(cp);
        o.setEmploye(em);
        operationRepository.save(o);
        cp.setSolde(cp.getSolde()-montant);
        return true;
    }

    @Override
    @Transactional
    public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) {
        retirer(cpte1,montant,codeEmp);
        verser(cpte2,montant,codeEmp);
        return true;
    }

    @Override
    public PageOperation getOperations(String codeCompte, int page, int size) {
       /* Page<Operation> ops=operationRepository.getOperations(codeCompte,new PageRequest(page,size, Sort.Direction.ASC,"id"));
        //Compte cp=compteRepository.findOne(codeCompte);
        //Page<Operation> ops2=operationRepository.findByCompte(cp,new PageRequest(page,size));
        */PageOperation pOp=new PageOperation();
       /* pOp.setOperations(ops.getContent());
        pOp.setNombreOperations(ops.getNumberOfElements());
        pOp.setPage(ops.getNumber());
        pOp.setTotalOperations(ops.getTotalPages());*/
        return pOp;
    }
}
