package maven.companymanagement.service.employeeservice;

import java.util.List;

import maven.companymanagement.entity.Employee;

public interface FetchEmployeeService {

    List<Employee> getEmployeeList();
}