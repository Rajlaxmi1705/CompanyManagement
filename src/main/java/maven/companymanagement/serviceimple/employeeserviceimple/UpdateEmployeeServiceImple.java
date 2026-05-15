package maven.companymanagement.serviceimple.employeeserviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Employee;
import maven.companymanagement.service.employeeservice.UpdateEmployeeService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;

public class UpdateEmployeeServiceImple implements UpdateEmployeeService {

    @Override
    public void updateEmployee() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Employee Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();

        Employee e1 = em.find(Employee.class, id);

            System.out.println("Enter New Employee Name");
            e1.setName(s1.next());

            System.out.println("Enter New Employee Salary");
            e1.setSalary(s1.nextDouble());

            System.out.println("Enter New Employee MailId");
            e1.setMailId(s1.next());

            System.out.println("Enter New Employee Adhar");
            e1.setAdhar(s1.nextLong());

            System.out.println("Enter New Employee Pancard");
            e1.setPancard(s1.next());

            FetchAddressServiceImple fa = new FetchAddressServiceImple();
            List<Address> addressList =fa.getAddressList();
            System.out.println(addressList);

            System.out.println("Select Address Index");
            int aIndex = s1.nextInt();

            e1.setAddress(addressList.get(aIndex));
            em.getTransaction().begin();
            em.merge(e1);
            em.getTransaction().commit();
            System.out.println("Employee Updated");
 
    }
}