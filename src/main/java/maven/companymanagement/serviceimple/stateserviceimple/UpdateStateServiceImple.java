package maven.companymanagement.serviceimple.stateserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.State;
import maven.companymanagement.service.stateservice.UpdateStateService;

public class UpdateStateServiceImple implements UpdateStateService {

    @Override
    public void updateState() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter State Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();

        State s2 = em.find(State.class, id);
            System.out.println("Enter New State Name");
            s2.setName(s1.next());
            em.getTransaction().begin();
            em.merge(s2);
            em.getTransaction().commit();
           
    
    }
}