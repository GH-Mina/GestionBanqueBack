package org.si.services;

import org.si.Metier.EmployeMetier;
import org.si.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeRestService {
    @Autowired
    private EmployeMetier employeMetier;

    @RequestMapping(value = "/employes", method = RequestMethod.POST)
    public Employe save(@RequestBody Employe e) {
        return employeMetier.save(e);
    }

    @RequestMapping(value = "/employes", method = RequestMethod.GET)
    public List<Employe> listEmployes() {
        return employeMetier.listEmployes();
    }
}
