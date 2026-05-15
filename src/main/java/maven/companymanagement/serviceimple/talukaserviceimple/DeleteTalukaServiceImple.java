package maven.companymanagement.serviceimple.talukaserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Taluka;
import maven.companymanagement.service.talukaservice.DeleteTalukaService;

public class DeleteTalukaServiceImple implements DeleteTalukaService {

    @Override
    public void deleteTaluka() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Taluka Id");
        int id = s1.nextInt();
        EntityManager em =DbConnection.dbCon().createEntityManager();
        Taluka t1 = em.find(Taluka.class, id);
            em.getTransaction().begin();
            em.remove(t1);
            em.getTransaction().commit();
            System.out.println("Taluka Deleted");
        
    }
}