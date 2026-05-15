package maven.companymanagement.serviceimple.companyserviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Branch;
import maven.companymanagement.entity.Company;
import maven.companymanagement.entity.Owner;
import maven.companymanagement.service.addressservice.FetchAddressService;
import maven.companymanagement.service.addressservice.UpdateAddressService;
import maven.companymanagement.service.branchservice.FetchBranchService;
import maven.companymanagement.service.companyservice.UpdateCompanyService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;
import maven.companymanagement.serviceimple.branchserviceimple.FetchBranchServiceImple;
import maven.companymanagement.serviceimple.ownerserviceimple.FetchOwnerServiceImple;

public class UpdateCompanyServiceImple implements UpdateCompanyService {

	@Override
	public void updateCompany() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbCon().createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter company id");
		int id=sc.nextInt();
		
		Company c1=em.find(Company.class, id);
		System.out.println("eneter company new name");
		String name=sc.next();
		
		FetchBranchService fb=new FetchBranchServiceImple();
		List<Branch>branchList=fb.getBranchList();
		
		FetchAddressService fa=new FetchAddressServiceImple();
		List<Address>addressList=fa.getAddressList();
		
		 FetchOwnerServiceImple fo = new FetchOwnerServiceImple();
         List<Owner> ownerList = fo.getOwnerList();
         System.out.println(ownerList);
         
         System.out.println("Select Owner Index");
         int oIndex = sc.nextInt();

         c1.setBranches(branchList);
         c1.setAddress(addressList);
         c1.setOwner(ownerList.get(oIndex));

         em.getTransaction().begin();
         em.merge(c1);
         em.getTransaction().commit();

         System.out.println("Company Updated");
     }

}
