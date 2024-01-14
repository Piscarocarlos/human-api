package site.acatech.humanapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.acatech.humanapi.model.Employee;
import site.acatech.humanapi.service.EmployeeService;

import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }


    /**
     * Create - Add a new employee
     * @param employee An object employee
     * @return The employee object saved
     */
    @PostMapping("/employee")
    public Employee createEmploye(Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

    /**
     * Read - Get one employee
     * @param id The id of the employee
     * @return An Employee object full filled
     */
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") final Long id)
    {
        Optional<Employee> employee = employeeService.getEmployee(id);
        if(employee.isPresent()) {
            return employee.get();
        } else {
            return null;
        }
    }

    /**
     * Delete - Delete an employee
     * @param id - The id of the employee to delete
     */
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") final Long id) {
        employeeService.deleteEmployee(id);
    }

}
