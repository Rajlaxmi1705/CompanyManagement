package maven.companymanagement.serviceimple.townserviceimple;

import java.util.Scanner;

import maven.companymanagement.entity.Town;
import maven.companymanagement.service.townservice.AddTownService;

public class AddTownServiceImple implements AddTownService {

    @Override
    public Town addTown() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Town Name");
        String name = s1.next();
        System.out.println("Enter Town Pincode");
        int pincode = s1.nextInt();
        Town t1 = new Town();
        t1.setName(name);
        t1.setPincode(pincode);
        return t1;
    }
}