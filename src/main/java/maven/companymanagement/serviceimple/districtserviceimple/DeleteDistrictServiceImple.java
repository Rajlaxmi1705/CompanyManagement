package maven.companymanagement.serviceimple.districtserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.District;
import maven.companymanagement.service.districtservice.DeleteDistrictService;

public class DeleteDistrictServiceImple implements DeleteDistrictService {

    @Override
    public void deleteDistrict() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter District Id");
        int id = s1.nextInt();
        EntityManager em = DbConnection.dbCon().createEntityManager();
        District d1 = em.find(District.class, id);
            em.getTransaction().begin();
            em.remove(d1);
            em.getTransaction().commit();
            System.out.println("District Deleted");
       
    }
}