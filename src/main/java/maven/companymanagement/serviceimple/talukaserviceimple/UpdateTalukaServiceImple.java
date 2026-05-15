package maven.companymanagement.serviceimple.talukaserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Taluka;
import maven.companymanagement.service.talukaservice.UpdateTalukaService;

public class UpdateTalukaServiceImple implements UpdateTalukaService {

    @Override
    public void updateTaluka() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Taluka Id");
        int id = s1.nextInt();
        EntityManager em = DbConnection.dbCon().createEntityManager();
        Taluka t1 = em.find(Taluka.class, id);
            System.out.println("Enter New Taluka Name");
            t1.setName(s1.next());
            em.getTransaction().begin();
            em.merge(t1);
            em.getTransaction().commit();
            System.out.println("Taluka Updated");

    }
}