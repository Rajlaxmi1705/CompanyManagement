package maven.companymanagement.serviceimple.managerserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Dept;
import maven.companymanagement.entity.Manager;
import maven.companymanagement.service.managerservice.AddManagerService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;
import maven.companymanagement.serviceimple.deptserviceimple.FetchDeptServiceImple;

public class AddManagerServiceImple implements AddManagerService {

    @Override
    public Manager addManager() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Manager Name");
        String name = s1.next();

        FetchAddressServiceImple fa = new FetchAddressServiceImple();
        List<Address> addressList = fa.getAddressList();

        System.out.println(addressList);
        System.out.println("Select Address Index");
        int aIndex = s1.nextInt();

        FetchDeptServiceImple fd = new FetchDeptServiceImple();
        List<Dept> deptList = fd.getDeptList();
        Manager m1 = new Manager();
        m1.setName(name);
        m1.setAddress(addressList.get(aIndex));
        m1.setDepts(deptList);

        return m1;
    }
}