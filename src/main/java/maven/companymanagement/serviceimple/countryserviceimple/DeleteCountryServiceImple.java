package maven.companymanagement.serviceimple.countryserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Country;
import maven.companymanagement.service.countryservice.DeleteCountryService;

public class DeleteCountryServiceImple implements DeleteCountryService {

    @Override
    public void deleteCountry() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Country Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();
        Country c1 = em.find(Country.class, id);
            em.getTransaction().begin();
            em.remove(c1);
            em.getTransaction().commit();
            System.out.println("Country Deleted");
            System.out.println("Country Not Found");
    }
}