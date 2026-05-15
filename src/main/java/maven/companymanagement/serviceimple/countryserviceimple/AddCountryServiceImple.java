package maven.companymanagement.serviceimple.countryserviceimple;

import java.util.Scanner;

import maven.companymanagement.entity.Country;
import maven.companymanagement.service.countryservice.AddCountryService;

public class AddCountryServiceImple implements AddCountryService {

    @Override
    public Country addCountry() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Country Name");
        String name = s1.next();

        System.out.println("Enter Country Region");
        String region = s1.next();

        Country c1 = new Country();

        c1.setName(name);
        c1.setRegion(region);

        return c1;
    }
}