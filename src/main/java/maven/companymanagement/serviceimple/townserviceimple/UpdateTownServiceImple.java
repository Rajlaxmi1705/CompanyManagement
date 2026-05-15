package maven.companymanagement.serviceimple.townserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Town;
import maven.companymanagement.service.townservice.UpdateTownService;

public class UpdateTownServiceImple implements UpdateTownService {

    @Override
    public void updateTown() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Town Id");
        int id = s1.nextInt();
        
        EntityManager em = DbConnection.dbCon().createEntityManager();
        Town t1 = em.find(Town.class, id);
            System.out.println("Enter New Town Name");
            t1.setName(s1.next());

            System.out.println("Enter New Town Pincode");
            t1.setPincode(s1.nextInt());
            em.getTransaction().begin();
            em.merge(t1);
            em.getTransaction().commit();

            System.out.println("Town Updated");
     

    }
}