package maven.companymanagement.serviceimple.addressserviceimple;

import java.util.List;
import java.util.Scanner;

import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Country;
import maven.companymanagement.entity.District;
import maven.companymanagement.entity.State;
import maven.companymanagement.entity.Taluka;
import maven.companymanagement.entity.Town;

import maven.companymanagement.service.addressservice.AddAddressService;

import maven.companymanagement.serviceimple.countryserviceimple.FetchCountryServiceImple;
import maven.companymanagement.serviceimple.districtserviceimple.FetchDistrictServiceImple;
import maven.companymanagement.serviceimple.stateserviceimple.FetchStateServiceImple;
import maven.companymanagement.serviceimple.talukaserviceimple.FetchTalukaServiceImple;
import maven.companymanagement.serviceimple.townserviceimple.FetchTownServiceImple;

public class AddAddressServiceImple implements AddAddressService {

    @Override
    public Address addAddress() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Flat Number");
        String flatNo = s1.next();

        System.out.println("Enter Area");
        String area = s1.next();

        System.out.println("Enter City");
        String city = s1.next();

        FetchCountryServiceImple fc =new FetchCountryServiceImple();
        List<Country> countryList = fc.getCountryList();
        
        FetchStateServiceImple fs =new FetchStateServiceImple();
        List<State> stateList =fs.getStateList();
        
        FetchDistrictServiceImple fd = new FetchDistrictServiceImple();
        List<District> districtList =fd.getDistrictList();
        
        FetchTalukaServiceImple ft =new FetchTalukaServiceImple();
        List<Taluka> talukaList = ft.getTalukaList();
        
        FetchTownServiceImple fto =new FetchTownServiceImple();
        List<Town> townList = fto.getTownList();
        
        Address a1 = new Address();
        a1.setFlatNo(flatNo);
        a1.setArea(area);
        a1.setCity(city);
        a1.setCountry( countryList.get(0));
        a1.setState( stateList.get(0));
        a1.setDistrict( districtList.get(0));
        a1.setTaluka( talukaList.get(0));
        a1.setTown(townList.get(0));
        a1.setPincode( townList.get(0).getPincode());

        return a1;
    }
}