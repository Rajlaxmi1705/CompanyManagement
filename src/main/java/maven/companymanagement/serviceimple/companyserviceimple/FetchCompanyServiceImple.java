package maven.companymanagement.serviceimple.companyserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Company;
import maven.companymanagement.service.companyservice.FetchCompanyService;

public class FetchCompanyServiceImple implements FetchCompanyService{

	@Override
	public List<Company> getCompanyList() {
		EntityManager em=DbConnection.dbCon().createEntityManager();
		List<Company>companylist=em.createQuery("from company",Company.class).getResultList();
		return companylist;
	}

}
