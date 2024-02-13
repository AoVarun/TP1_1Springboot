package fr.devavance.tp_springboot_mvc_jpa.beans;

import fr.devavance.tp_springboot_mvc_jpa.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDataRepository implements CommandLineRunner {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public void run(String ...strings) throws Exception{
        employeeRepository.save(new Employee(1L, "Karim Mahmoud", "Egypt", "kmshawky20@gmail.com", "0097450413948", Fonction.DEV_WEB));
        employeeRepository.save(new Employee(2L, "Fran Wilson", "C/ Araquil, 67, Madrid, Spain", "franwilson@mail.com", "(204) 619-5731", Fonction.DEV_OPS));
        employeeRepository.save(new Employee(3L, "Maria Anders", "25, rue Lauriston, Paris, France", "mariaanders@mail.com", "(503) 555-9931", Fonction.CHEF_PROJET));
        employeeRepository.save(new Employee(4L, "Thomas Hardy", "89 Chiaroscuro Rd, Portland, USA", "thomashardy@mail.com", "(171) 555-2222", Fonction.DEV_AI));
        employeeRepository.save(new Employee(5L, "Ahmed Omar", "KSA", "amhedoomar@gmail.com", "0096650413948", Fonction.SOFTWARE_ARCHITECT));
        employeeRepository.save(new Employee(6L, "Idam Wilson", "C/ Araquil, 67, Madrid, Spain", "idamwilson@mail.com", "(204) 619-5331", Fonction.DEV_AI));
        employeeRepository.save(new Employee(7L, "Peter Perrier", "Obere Str. 57, Berlin, Germany", "peterperrier@mail.com", "(313) 555-5735", Fonction.DEV_WEB));
        employeeRepository.save(new Employee(8L, "Mark Hardy", "89 Chiaroscuro Rd, Portland, USA", "markshardy@mail.com", "(171) 555-2222", Fonction.DEV_OPS));

    };

}
