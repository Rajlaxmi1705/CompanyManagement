package maven.companymanagement.serviceimple.deptserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Dept;
import maven.companymanagement.service.deptservice.DeleteDeptService;

public class DeleteDeptServiceImple implements DeleteDeptService {

    @Override
    public void deleteDept() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Dept Id");
        int id = s1.nextInt();
        EntityManager em = DbConnection.dbCon().createEntityManager();
        Dept d1 = em.find(Dept.class, id);

            em.getTransaction().begin();
            em.remove(d1);
            em.getTransaction().commit();
            System.out.println("Dept Deleted");
     
    }
}