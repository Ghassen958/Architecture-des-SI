package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.EmployeRepository;
import tn.esprit.Ghassen_Barbouch.entities.Employe;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IEmployeService;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(int id) {
        employeRepository.deleteById((long) id);
    }

    @Override
    public Employe getEmploye(int id) {
        return employeRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
