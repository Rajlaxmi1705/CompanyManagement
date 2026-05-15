package maven.companymanagement.serviceimple.deptserviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Dept;
import maven.companymanagement.entity.Employee;
import maven.companymanagement.service.deptservice.UpdateDeptService;
import maven.companymanagement.serviceimple.employeeserviceimple.FetchEmployeeServiceImple;

public class UpdateDeptServiceImple implements UpdateDeptService {

    @Override
    public void updateDept() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Dept Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();
        Dept d1 = em.find(Dept.class, id);

            System.out.println("Enter New Dept Name");
            d1.setName(s1.next());
            System.out.println("Enter New Building");
            d1.setBuilding(s1.next());

            FetchEmployeeServiceImple fe = new FetchEmployeeServiceImple();
            List<Employee> employeeList = fe.getEmployeeList();
            d1.setEmps(employeeList);
            em.getTransaction().begin();
            em.merge(d1);
            em.getTransaction().commit();
            System.out.println("Dept Updated");
       
    }
}