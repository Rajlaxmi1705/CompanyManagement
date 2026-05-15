package maven.companymanagement.serviceimple.branchserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Branch;
import maven.companymanagement.entity.Dept;
import maven.companymanagement.entity.Manager;
import maven.companymanagement.service.branchservice.AddBranchService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;
import maven.companymanagement.serviceimple.deptserviceimple.FetchDeptServiceImple;
import maven.companymanagement.serviceimple.managerserviceimple.FetchManagerServiceImple;

public class AddBranchServiceImple implements AddBranchService {

    @Override
    public Branch addBranch() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Branch Name");
        String name = s1.next();

        FetchAddressServiceImple fa = new FetchAddressServiceImple();
        List<Address> addressList = fa.getAddressList();

        System.out.println(addressList);
        System.out.println("Select Address Index");
        int aIndex = s1.nextInt();

        FetchManagerServiceImple fm = new FetchManagerServiceImple();
        List<Manager> managerList = fm.getManagerList();

        System.out.println(managerList);
        System.out.println("Select Manager Index");
        int mIndex = s1.nextInt();

        FetchDeptServiceImple fd = new FetchDeptServiceImple();
        List<Dept> deptList = fd.getDeptList();

        Branch b1 = new Branch();

        b1.setName(name);
        b1.setAddress(addressList.get(aIndex));
        b1.setManager(managerList.get(mIndex));
        b1.setDepts(deptList);

        return b1;
    }
}