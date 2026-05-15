package maven.companymanagement.serviceimple.ownerserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Owner;
import maven.companymanagement.service.ownerservice.DeleteOwnerService;

public class DeleteOwnerServiceImple implements DeleteOwnerService {

    @Override
    public void deleteOwner() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Owner Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();
        Owner o1 = em.find(Owner.class, id);

            em.getTransaction().begin();
            em.remove(o1);
            em.getTransaction().commit();
            System.out.println("Owner Deleted");
        }


    }
