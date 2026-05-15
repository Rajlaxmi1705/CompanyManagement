package maven.companymanagement.serviceimple.districtserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.District;
import maven.companymanagement.service.districtservice.UpdateDistrictService;

public class UpdateDistrictServiceImple implements UpdateDistrictService {

    @Override
    public void updateDistrict() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter District Id");
        int id = s1.nextInt();
        EntityManager em =DbConnection.dbCon().createEntityManager();
        District d1 = em.find(District.class, id);
            System.out.println("Enter New District Name");
            d1.setName(s1.next());
            em.getTransaction().begin();
            em.merge(d1);
            em.getTransaction().commit();
            System.out.println(" district updated");
    }
}