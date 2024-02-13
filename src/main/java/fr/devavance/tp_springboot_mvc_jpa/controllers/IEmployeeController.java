package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.entity.Employee;
import org.springframework.ui.Model;

public interface IEmployeeController {
    public String displayHome(Model model);

    String displayHome(ch.qos.logback.core.model.Model model);

    public String addEmployee(Employee employee);

    public String displayEmployee(Long id,  Model model);
}
