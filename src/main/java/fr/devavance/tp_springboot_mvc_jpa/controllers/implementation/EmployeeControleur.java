package fr.devavance.tp_springboot_mvc_jpa.controllers.implementation;

import fr.devavance.tp_springboot_mvc_jpa.entity.Employee;
import fr.devavance.tp_springboot_mvc_jpa.controllers.IEmployeeController;
import fr.devavance.tp_springboot_mvc_jpa.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControleur implements IEmployeeController {

    private final IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeControleur(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/view_employees")
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "view_home";
    }

    @GetMapping("/employee/home")
    public String displayHome(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeRepository.findAll());
        return "view_home";
    }

    @Override
    public String displayHome(ch.qos.logback.core.model.Model model) {
        return null;
    }

    @PostMapping("/employee/addemployee")
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employee/home";
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees";
    }

    @RequestMapping(value = "/employee/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Id invalide :" + id));
        model.addAttribute("employee", employee);
        return "view_employee";
    }
}
