package maven.companymanagement.serviceimple.stateserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Country;
import maven.companymanagement.entity.State;
import maven.companymanagement.service.stateservice.AddStateService;
import maven.companymanagement.serviceimple.countryserviceimple.FetchCountryServiceImple;

public class AddStateServiceImple implements AddStateService {

    @Override
    public State addState() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter State Name");
        String name = s1.next();

        FetchCountryServiceImple fc =new FetchCountryServiceImple();

        List<Country> countryList = fc.getCountryList();

        State s2 = new State();
        s2.setName(name);
        return s2;
    }
}