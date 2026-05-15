package maven.companymanagement.serviceimple.townserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Town;
import maven.companymanagement.service.townservice.DeleteTownService;

public class DeleteTownServiceImple implements DeleteTownService {

    @Override
    public void deleteTown() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Town Id");
        int id = s1.nextInt();
        EntityManager em = DbConnection.dbCon().createEntityManager();
        Town t1 = em.find(Town.class, id);
            em.getTransaction().begin();
            em.remove(t1);
            em.getTransaction().commit();
            System.out.println("Town Deleted");
       
    }
}