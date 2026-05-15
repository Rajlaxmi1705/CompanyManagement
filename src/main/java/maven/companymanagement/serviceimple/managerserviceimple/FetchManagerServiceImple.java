package maven.companymanagement.serviceimple.managerserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Manager;
import maven.companymanagement.service.managerservice.FetchManagerService;

public class FetchManagerServiceImple implements FetchManagerService {

    @Override
    public List<Manager> getManagerList() {

        EntityManager em = DbConnection.dbCon().createEntityManager();

        List<Manager> managerList =
                em.createQuery("from Manager", Manager.class)
                .getResultList();

        return managerList;
    }
}