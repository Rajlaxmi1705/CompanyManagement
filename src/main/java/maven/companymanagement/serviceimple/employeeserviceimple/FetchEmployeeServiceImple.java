package maven.companymanagement.serviceimple.employeeserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Employee;
import maven.companymanagement.service.employeeservice.FetchEmployeeService;

public class FetchEmployeeServiceImple implements FetchEmployeeService {

    @Override
    public List<Employee> getEmployeeList() {

        EntityManager em = DbConnection.dbCon().createEntityManager();
        List<Employee> employeeList =em.createQuery("from Employee", Employee.class).getResultList();

        return employeeList;
    }
}