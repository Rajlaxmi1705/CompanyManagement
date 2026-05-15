package maven.companymanagement.serviceimple.companyserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Branch;
import maven.companymanagement.entity.Company;
import maven.companymanagement.entity.Owner;
import maven.companymanagement.service.companyservice.AddCompanyService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;
import maven.companymanagement.serviceimple.branchserviceimple.FetchBranchServiceImple;
import maven.companymanagement.serviceimple.ownerserviceimple.FetchOwnerServiceImple;

public class AddCompanyServiceImple implements AddCompanyService {

    @Override
    public Company addCompany() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Company Name");
        String name = s1.next();

        FetchBranchServiceImple fb = new FetchBranchServiceImple();
        List<Branch> branchList = fb.getBranchList();

        FetchAddressServiceImple fa = new FetchAddressServiceImple();
        List<Address> addressList = fa.getAddressList();

        FetchOwnerServiceImple fo = new FetchOwnerServiceImple();
        List<Owner> ownerList = fo.getOwnerList();

        System.out.println(ownerList);
        System.out.println("Select Owner Index");
        int oIndex = s1.nextInt();

        Company c1 = new Company();

        c1.setName(name);
        c1.setBranches(branchList);
        c1.setAddress(addressList);
        c1.setOwner(ownerList.get(oIndex));

        return c1;
    }
}