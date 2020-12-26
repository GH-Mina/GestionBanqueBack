package org.si.Metier;

import org.si.entities.Employe;

import java.util.List;

public interface EmployeMetier {
    public Employe save(Employe e);
    public List<Employe> listEmployes();
}
