package site.acatech.humanapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import site.acatech.humanapi.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
