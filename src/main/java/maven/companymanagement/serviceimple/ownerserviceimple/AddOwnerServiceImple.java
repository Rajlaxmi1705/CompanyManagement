package maven.companymanagement.serviceimple.ownerserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Owner;
import maven.companymanagement.service.ownerservice.AddOwnerService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;

public class AddOwnerServiceImple implements AddOwnerService {

    @Override
    public Owner addOwner() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Owner Name");
        String name = s1.next();

        FetchAddressServiceImple fa = new FetchAddressServiceImple();
        List<Address> addressList = fa.getAddressList();
        System.out.println(addressList);
        System.out.println("Select Address Index");
        int aIndex = s1.nextInt();

        Owner o1 = new Owner();
        o1.setName(name);
        o1.setAddress(addressList.get(aIndex));
        return o1;
    }
}