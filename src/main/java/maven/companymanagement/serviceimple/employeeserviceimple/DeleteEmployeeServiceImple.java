package maven.companymanagement.serviceimple.employeeserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Employee;
import maven.companymanagement.service.employeeservice.DeleteEmployeeService;

public class DeleteEmployeeServiceImple implements DeleteEmployeeService {

    @Override
    public void deleteEmployee() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();

        Employee e1 = em.find(Employee.class, id);
            em.getTransaction().begin();
            em.remove(e1);
            em.getTransaction().commit();
            System.out.println("Employee Deleted");
   
    }
}