package maven.companymanagement.serviceimple.branchserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Branch;
import maven.companymanagement.service.branchservice.DeleteBranchService;

public class DeleteBranchServiceImple implements DeleteBranchService {

    @Override
    public void deleteBranch() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Branch Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();
        Branch b1 = em.find(Branch.class, id);

            em.getTransaction().begin();
            em.remove(b1);
            em.getTransaction().commit();
            System.out.println("Branch Deleted");
    
    }
}