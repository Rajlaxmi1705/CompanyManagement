package maven.companymanagement.serviceimple.stateserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.State;
import maven.companymanagement.service.stateservice.FetchStateService;

public class FetchStateServiceImple implements FetchStateService {

    @Override
    public List<State> getStateList() {

        EntityManager em =DbConnection.dbCon().createEntityManager();
        List<State> stateList = em.createQuery("from State", State.class).getResultList();
        return stateList;
    }
}