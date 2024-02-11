package fr.devavance.tp_springboot_mvc_jpa.dao;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.beans.Fonction;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
@Component
public class EmployeeDAOImpl implements IEmployeeDAO{

    private List<Employee> employees;

    public EmployeeDAOImpl() {
        employees = new ArrayList<>();
        add(new Employee(1, "Karim Mahmoud", "Egypt", "kmshawky20@gmail.com", "0097450413948", Fonction.DEV_WEB));
        add(new Employee(2, "Fran Wilson", "C/ Araquil, 67, Madrid, Spain", "franwilson@mail.com", "(204) 619-5731", Fonction.DEV_OPS));
        add(new Employee(3, "Maria Anders", "25, rue Lauriston, Paris, France", "mariaanders@mail.com", "(503) 555-9931", Fonction.CHEF_PROJET));
        add(new Employee(4, "Thomas Hardy", "89 Chiaroscuro Rd, Portland, USA", "thomashardy@mail.com", "(171) 555-2222", Fonction.DEV_AI));
        add(new Employee(5, "Ahmed Omar", "KSA", "amhedoomar@gmail.com", "0096650413948", Fonction.SOFTWARE_ARCHITECT));
        add(new Employee(6, "Idam Wilson", "C/ Araquil, 67, Madrid, Spain", "idamwilson@mail.com", "(204) 619-5331", Fonction.DEV_AI));
        add(new Employee(7, "Peter Perrier", "Obere Str. 57, Berlin, Germany", "peterperrier@mail.com", "(313) 555-5735", Fonction.DEV_WEB));
        add(new Employee(8, "Mark Hardy", "89 Chiaroscuro Rd, Portland, USA", "markshardy@mail.com", "(171) 555-2222", Fonction.DEV_OPS));
    }


    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }
}