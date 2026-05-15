package maven.companymanagement.serviceimple.employeeserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Employee;
import maven.companymanagement.service.employeeservice.AddEmployeeService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;

public class AddEmployeeServiceImple implements AddEmployeeService {

    @Override
    public Employee addEmployee() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Employee Name");
        String name = s1.next();

        System.out.println("Enter Employee Salary");
        double salary = s1.nextDouble();

        System.out.println("Enter Employee MailId");
        String mailId = s1.next();

        System.out.println("Enter Employee Adhar");
        long adhar = s1.nextLong();

        System.out.println("Enter Employee Pancard");
        String pancard = s1.next();

        FetchAddressServiceImple fa = new FetchAddressServiceImple();

        List<Address> addressList = fa.getAddressList();

        System.out.println(addressList);

        System.out.println("Select Address Index");
        int aIndex = s1.nextInt();

        Employee e1 = new Employee();

        e1.setName(name);
        e1.setSalary(salary);
        e1.setMailId(mailId);
        e1.setAdhar(adhar);
        e1.setPancard(pancard);

        e1.setAddress(addressList.get(aIndex));

        return e1;
    }
}