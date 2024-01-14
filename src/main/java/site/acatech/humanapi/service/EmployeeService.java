package site.acatech.humanapi.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.acatech.humanapi.model.Employee;
import site.acatech.humanapi.repository.EmployeeRepository;

import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public Optional<Employee> getEmployee(final Long id)
    {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id)
    {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
}
