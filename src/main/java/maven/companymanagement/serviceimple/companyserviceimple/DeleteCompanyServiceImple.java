package maven.companymanagement.serviceimple.companyserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Company;
import maven.companymanagement.service.companyservice.DeleteCompanyService;

public class DeleteCompanyServiceImple implements DeleteCompanyService{

	@Override
	public void deleteCompany() {

		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Company Id");
	        int id = scanner.nextInt();
	        EntityManager em=DbConnection.dbCon().createEntityManager();
	        em.getTransaction().begin();
	        Company c1= em.find(Company.class, id);
            em.remove(c1);
            em.getTransaction().commit();

            System.out.println("Company Deleted");
	}
  
}
