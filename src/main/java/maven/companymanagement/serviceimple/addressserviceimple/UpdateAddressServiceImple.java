package maven.companymanagement.serviceimple.addressserviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Country;
import maven.companymanagement.entity.District;
import maven.companymanagement.entity.State;
import maven.companymanagement.entity.Taluka;
import maven.companymanagement.entity.Town;

import maven.companymanagement.service.addressservice.UpdateAddressService;

import maven.companymanagement.serviceimple.countryserviceimple.FetchCountryServiceImple;
import maven.companymanagement.serviceimple.districtserviceimple.FetchDistrictServiceImple;
import maven.companymanagement.serviceimple.stateserviceimple.FetchStateServiceImple;
import maven.companymanagement.serviceimple.talukaserviceimple.FetchTalukaServiceImple;
import maven.companymanagement.serviceimple.townserviceimple.FetchTownServiceImple;

public class UpdateAddressServiceImple implements UpdateAddressService {

    @Override
    public void updateAddress() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Address Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();

        Address a1 = em.find(Address.class, id);

            System.out.println("Enter New Flat Number");
            a1.setFlatNo(s1.next());

            System.out.println("Enter New Area");
            a1.setArea(s1.next());

            System.out.println("Enter New City");
            a1.setCity(s1.next());
            FetchCountryServiceImple fc = new FetchCountryServiceImple();

            List<Country> countryList = fc.getCountryList();

            System.out.println(countryList);

            System.out.println("Select Country Index");
            int cIndex = s1.nextInt();

            FetchStateServiceImple fs = new FetchStateServiceImple();

            List<State> stateList = fs.getStateList();
            System.out.println(stateList);
            System.out.println("Select State Index");
            int sIndex = s1.nextInt();

            FetchDistrictServiceImple fd =new FetchDistrictServiceImple();
            List<District> districtList = fd.getDistrictList();
            System.out.println(districtList);

            System.out.println("Select District Index");
            int dIndex = s1.nextInt();

            FetchTalukaServiceImple ft =new FetchTalukaServiceImple();
            List<Taluka> talukaList = ft.getTalukaList();
            System.out.println(talukaList);

            System.out.println("Select Taluka Index");
            int tIndex = s1.nextInt();
            
            FetchTownServiceImple fto =new FetchTownServiceImple();
            List<Town> townList =fto.getTownList();
            System.out.println(townList);

            System.out.println("Select Town Index");
            int townIndex = s1.nextInt();

            a1.setCountry(countryList.get(cIndex));
            a1.setState(stateList.get(sIndex));
            a1.setDistrict(districtList.get(dIndex));
            a1.setTaluka( talukaList.get(tIndex));
            a1.setTown(townList.get(townIndex));
            a1.setPincode(townList.get(townIndex).getPincode());
            em.getTransaction().begin();
            em.merge(a1);
            em.getTransaction().commit();

            System.out.println("Address Updated");
   
    }
}