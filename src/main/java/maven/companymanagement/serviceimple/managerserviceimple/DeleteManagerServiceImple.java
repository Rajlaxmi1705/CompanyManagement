package maven.companymanagement.serviceimple.managerserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Manager;
import maven.companymanagement.service.managerservice.DeleteManagerService;

public class DeleteManagerServiceImple implements DeleteManagerService {

    @Override
    public void deleteManager() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Manager Id");
        int id = s1.nextInt();
        EntityManager em = DbConnection.dbCon().createEntityManager();
        Manager m1 = em.find(Manager.class, id);

            em.getTransaction().begin();
            em.remove(m1);
            em.getTransaction().commit();
           System.out.println("Manager Deleted");
      
    }
}