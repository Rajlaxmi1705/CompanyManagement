package maven.companymanagement.serviceimple.countryserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Country;
import maven.companymanagement.service.countryservice.UpdateCountryService;

public class UpdateCountryServiceImple implements UpdateCountryService {

    @Override
    public void updateCountry() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Country Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();

        Country c1 = em.find(Country.class, id);

            System.out.println("Enter New Country Name");
            c1.setName(s1.next());
            System.out.println("Enter New Region");
            c1.setRegion(s1.next());
            em.getTransaction().begin();
            em.merge(c1);
            em.getTransaction().commit();
            System.out.println("Country Updated");
       
            System.out.println("Country Not Found");
        
    }
}