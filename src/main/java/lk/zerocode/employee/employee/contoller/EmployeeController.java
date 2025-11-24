package lk.zerocode.employee.employee.contoller;

import lk.zerocode.employee.employee.contoller.request.AddEmployeeRequest;
import lk.zerocode.employee.employee.exceptions.EmployeeNotCreatedException;
import lk.zerocode.employee.employee.model.Employee;
import lk.zerocode.employee.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/employees")
    public void addEmployee(@RequestBody AddEmployeeRequest request) throws EmployeeNotCreatedException {
        employeeService.Create(request);
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployee(@PathVariable("empId") int empId) {
        Employee employee = new Employee();
        employee.setId(5);
        employee.setName("Csj");
        employee.setName("Csj");

        return employee;
    }

}