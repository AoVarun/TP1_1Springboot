package fr.devavance.tp_springboot_mvc_jpa.controllers;

import com.sun.jdi.InterfaceType;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeControleur {

    private final IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeControleur(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;


    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees";
    }

    @GetMapping("/")
    public String listEmployeesName(Model model) {
        model.addAttribute("employee",new Employee());
        model.addAttribute("employees", employeeRepository.findAll());
        return "liste_emp";
    }

    @PostMapping("/addemployee")
    public String addEmployee(Employee employee){
        employeeRepository.save(employee);
        return "redirect:/";
    }

}