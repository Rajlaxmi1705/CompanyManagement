package maven.companymanagement.serviceimple.talukaserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Dept;
import maven.companymanagement.entity.District;
import maven.companymanagement.entity.Taluka;
import maven.companymanagement.service.talukaservice.AddTalukaService;
import maven.companymanagement.serviceimple.districtserviceimple.FetchDistrictServiceImple;

public class AddTalukaServiceImple implements AddTalukaService {

    @Override
    public Taluka addTaluka() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Taluka Name");
        String name = s1.next();
        FetchDistrictServiceImple fd =new FetchDistrictServiceImple();
        List<District> districtList = fd.getDistrictList();
        Taluka t1 = new Taluka();
        t1.setName(name);

        return t1;
    }

}