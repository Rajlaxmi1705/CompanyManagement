package maven.companymanagement.serviceimple.branchserviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Branch;
import maven.companymanagement.entity.Dept;
import maven.companymanagement.entity.Manager;
import maven.companymanagement.service.branchservice.UpdateBranchService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;
import maven.companymanagement.serviceimple.deptserviceimple.FetchDeptServiceImple;
import maven.companymanagement.serviceimple.managerserviceimple.FetchManagerServiceImple;

public class UpdateBranchServiceImple implements UpdateBranchService {

    @Override
    public void updateBranch() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Branch Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();

        Branch b1 = em.find(Branch.class, id);

            System.out.println("Enter New Branch Name");
            b1.setName(s1.next());

            FetchAddressServiceImple fa = new FetchAddressServiceImple();
            List<Address> addressList = fa.getAddressList();

            System.out.println(addressList);
            System.out.println("Select Address Index");
            int aIndex = s1.nextInt();

            FetchManagerServiceImple fm = new FetchManagerServiceImple();
            List<Manager> managerList = fm.getManagerList();

            System.out.println(managerList);
            System.out.println("Select Manager Index");
            int mIndex = s1.nextInt();

            FetchDeptServiceImple fd = new FetchDeptServiceImple();
            List<Dept> deptList = fd.getDeptList();

            b1.setAddress(addressList.get(aIndex));
            b1.setManager(managerList.get(mIndex));
            b1.setDepts(deptList);

            em.getTransaction().begin();
            em.merge(b1);
            em.getTransaction().commit();

            System.out.println("Branch Updated");
    }
}