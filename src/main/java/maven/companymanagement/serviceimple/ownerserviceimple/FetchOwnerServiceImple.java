package maven.companymanagement.serviceimple.ownerserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Owner;
import maven.companymanagement.service.ownerservice.FetchOwnerService;

public class FetchOwnerServiceImple implements FetchOwnerService {

    @Override
    public List<Owner> getOwnerList() {

        EntityManager em = DbConnection.dbCon().createEntityManager();
        List<Owner> ownerList =em.createQuery("from Owner", Owner.class).getResultList();
        return ownerList;
    }
}