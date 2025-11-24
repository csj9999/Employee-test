package lk.zerocode.employee.employee.service;

import lk.zerocode.employee.employee.contoller.request.AddEmployeeRequest;
import lk.zerocode.employee.employee.exceptions.EmployeeNotCreatedException;
import lk.zerocode.employee.employee.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class EmployeeService {

    @PostMapping
    public void Create(AddEmployeeRequest request) throws EmployeeNotCreatedException {

        if(request.getSalary() >= 30000){
            Employee employee = new Employee();
            employee.setId(request.getId());
            employee.setName(request.getName());
            System.out.println("Employee created successfully");

        }
        else {

            throw new EmployeeNotCreatedException("Salary is below 30k");
        }
    }

}
