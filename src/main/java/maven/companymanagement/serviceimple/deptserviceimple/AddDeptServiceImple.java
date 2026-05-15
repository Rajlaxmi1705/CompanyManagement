package maven.companymanagement.serviceimple.deptserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Dept;
import maven.companymanagement.entity.Employee;
import maven.companymanagement.service.deptservice.AddDeptService;
import maven.companymanagement.serviceimple.employeeserviceimple.FetchEmployeeServiceImple;

public class AddDeptServiceImple implements AddDeptService {

    @Override
    public Dept addDept() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Dept Name");
        String name = s1.next();

        System.out.println("Enter Dept Building");
        String building = s1.next();

        FetchEmployeeServiceImple fe = new FetchEmployeeServiceImple();
        List<Employee> employeeList = fe.getEmployeeList();

        Dept d1 = new Dept();
        d1.setName(name);
        d1.setBuilding(building);
        d1.setEmps(employeeList);
        return d1;
    }
}