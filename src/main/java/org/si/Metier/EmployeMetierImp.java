package org.si.Metier;

import org.si.dao.EmployeRepository;
import org.si.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeMetierImp implements  EmployeMetier {
    @Autowired
    private EmployeRepository employeRepository;
    @Override
    public Employe save(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public List<Employe> listEmployes() {
        return employeRepository.findAll();
    }
}
