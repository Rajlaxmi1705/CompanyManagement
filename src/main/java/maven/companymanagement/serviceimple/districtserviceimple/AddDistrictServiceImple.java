package maven.companymanagement.serviceimple.districtserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.District;
import maven.companymanagement.entity.State;
import maven.companymanagement.service.districtservice.AddDistrictService;
import maven.companymanagement.serviceimple.stateserviceimple.FetchStateServiceImple;

public class AddDistrictServiceImple implements AddDistrictService {

    @Override
    public District addDistrict() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter District Name");
        String name = s1.next();
        FetchStateServiceImple fs = new FetchStateServiceImple();
        List<State> stateList =fs.getStateList();
        District d1 = new District();
        d1.setName(name);
        return d1;
    }
}