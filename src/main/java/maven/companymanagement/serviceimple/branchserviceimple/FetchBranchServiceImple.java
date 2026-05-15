package maven.companymanagement.serviceimple.branchserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Branch;
import maven.companymanagement.service.branchservice.FetchBranchService;

public class FetchBranchServiceImple implements FetchBranchService {

    @Override
    public List<Branch> getBranchList() {

        EntityManager em = DbConnection.dbCon().createEntityManager();

        List<Branch> branchList =em.createQuery("from Branch", Branch.class).getResultList();
        return branchList;
    }
}