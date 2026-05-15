package maven.companymanagement.serviceimple.stateserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.State;
import maven.companymanagement.service.stateservice.DeleteStateService;

public class DeleteStateServiceImple implements DeleteStateService {

    @Override
    public void deleteState() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter State Id");
        int id = s1.nextInt();

        EntityManager em =DbConnection.dbCon().createEntityManager();
        State s2 = em.find(State.class, id);
            em.getTransaction().begin();
            em.remove(s2);
            em.getTransaction().commit();
       
    }
}