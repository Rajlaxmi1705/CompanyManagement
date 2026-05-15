package maven.companymanagement.test;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;

import maven.companymanagement.entity.*;

import maven.companymanagement.serviceimple.addressserviceimple.*;
import maven.companymanagement.serviceimple.branchserviceimple.*;
import maven.companymanagement.serviceimple.companyserviceimple.*;
import maven.companymanagement.serviceimple.countryserviceimple.*;
import maven.companymanagement.serviceimple.deptserviceimple.*;
import maven.companymanagement.serviceimple.districtserviceimple.*;
import maven.companymanagement.serviceimple.employeeserviceimple.*;
import maven.companymanagement.serviceimple.managerserviceimple.*;
import maven.companymanagement.serviceimple.ownerserviceimple.*;
import maven.companymanagement.serviceimple.stateserviceimple.*;
import maven.companymanagement.serviceimple.talukaserviceimple.*;
import maven.companymanagement.serviceimple.townserviceimple.AddTownServiceImple;
import maven.companymanagement.serviceimple.townserviceimple.DeleteTownServiceImple;
import maven.companymanagement.serviceimple.townserviceimple.FetchTownServiceImple;
import maven.companymanagement.serviceimple.townserviceimple.UpdateTownServiceImple;


public class Test {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        int choice = 0;

        while (choice != 49) {

            System.out.println("====== COUNTRY ======");
            System.out.println("1.Add Country");
            System.out.println("2.Fetch Country");
            System.out.println("3.Update Country");
            System.out.println("4.Delete Country");

            System.out.println("====== STATE ======");
            System.out.println("5.Add State");
            System.out.println("6.Fetch State");
            System.out.println("7.Update State");
            System.out.println("8.Delete State");

            System.out.println("====== DISTRICT ======");
            System.out.println("9.Add District");
            System.out.println("10.Fetch District");
            System.out.println("11.Update District");
            System.out.println("12.Delete District");

            System.out.println("====== TALUKA ======");
            System.out.println("13.Add Taluka");
            System.out.println("14.Fetch Taluka");
            System.out.println("15.Update Taluka");
            System.out.println("16.Delete Taluka");

            System.out.println("====== TOWN ======");
            System.out.println("17.Add Town");
            System.out.println("18.Fetch Town");
            System.out.println("19.Update Town");
            System.out.println("20.Delete Town");

            System.out.println("====== ADDRESS ======");
            System.out.println("21.Add Address");
            System.out.println("22.Fetch Address");
            System.out.println("23.Update Address");
            System.out.println("24.Delete Address");

            System.out.println("====== EMPLOYEE ======");
            System.out.println("25.Add Employee");
            System.out.println("26.Fetch Employee");
            System.out.println("27.Update Employee");
            System.out.println("28.Delete Employee");

            System.out.println("====== DEPT ======");
            System.out.println("29.Add Dept");
            System.out.println("30.Fetch Dept");
            System.out.println("31.Update Dept");
            System.out.println("32.Delete Dept");

            System.out.println("====== MANAGER ======");
            System.out.println("33.Add Manager");
            System.out.println("34.Fetch Manager");
            System.out.println("35.Update Manager");
            System.out.println("36.Delete Manager");

            System.out.println("====== OWNER ======");
            System.out.println("37.Add Owner");
            System.out.println("38.Fetch Owner");
            System.out.println("39.Update Owner");
            System.out.println("40.Delete Owner");

            System.out.println("====== BRANCH ======");
            System.out.println("41.Add Branch");
            System.out.println("42.Fetch Branch");
            System.out.println("43.Update Branch");
            System.out.println("44.Delete Branch");

            System.out.println("====== COMPANY ======");
            System.out.println("45.Add Company");
            System.out.println("46.Fetch Company");
            System.out.println("47.Update Company");
            System.out.println("48.Delete Company");

            System.out.println("49.Exit");

            System.out.println("Enter Choice");
            choice = s1.nextInt();

            EntityManager em = DbConnection.dbCon().createEntityManager();

            switch (choice) {

            case 1:

                AddCountryServiceImple ac = new AddCountryServiceImple();
                Country c1 = ac.addCountry();

                em.getTransaction().begin();
                em.persist(c1);
                em.getTransaction().commit();

                break;

            case 2:

                FetchCountryServiceImple fc = new FetchCountryServiceImple();
                System.out.println(fc.getCountryList());
                break;

            case 3:

                UpdateCountryServiceImple uc = new UpdateCountryServiceImple();
                uc.updateCountry();
                break;

            case 4:

                DeleteCountryServiceImple dc = new DeleteCountryServiceImple();
                dc.deleteCountry();

                break;

            case 5:

                AddStateServiceImple as = new AddStateServiceImple();
               State st = as.addState();

                em.getTransaction().begin();
                em.persist(st);
                em.getTransaction().commit();

                break;

            case 6:

                FetchStateServiceImple fs = new FetchStateServiceImple();
                System.out.println(fs.getStateList());

                break;

            case 7:

                UpdateStateServiceImple us = new UpdateStateServiceImple();
                us.updateState();

                break;

            case 8:

                DeleteStateServiceImple ds = new DeleteStateServiceImple();
                ds.deleteState();

                break;

            case 9:

                AddDistrictServiceImple ad = new AddDistrictServiceImple();
                District d1 = ad.addDistrict();

                em.getTransaction().begin();
                em.persist(d1);
                em.getTransaction().commit();

                break;

            case 10:

                FetchDistrictServiceImple fd = new FetchDistrictServiceImple();
                System.out.println(fd.getDistrictList());

                break;

            case 11:

                UpdateDistrictServiceImple ud = new UpdateDistrictServiceImple();
                ud.updateDistrict();

                break;

            case 12:

                DeleteDistrictServiceImple dd = new DeleteDistrictServiceImple();
                dd.deleteDistrict();

                break;

            case 13:

                AddTalukaServiceImple at = new AddTalukaServiceImple();
                Taluka t1 = at.addTaluka();

                em.getTransaction().begin();
                em.persist(t1);
                em.getTransaction().commit();

                break;

            case 14:

                FetchTalukaServiceImple ft = new FetchTalukaServiceImple();
                System.out.println(ft.getTalukaList());

                break;

            case 15:

                UpdateTalukaServiceImple ut = new UpdateTalukaServiceImple();
                ut.updateTaluka();

                break;

            case 16:

                DeleteTalukaServiceImple dt = new DeleteTalukaServiceImple();
                dt.deleteTaluka();

                break;

            case 17:

                AddTownServiceImple ato = new AddTownServiceImple();

                Town to = ato.addTown();
                em.getTransaction().begin();
                em.persist(to);
                em.getTransaction().commit();

                break;

            case 18:

                FetchTownServiceImple fto = new FetchTownServiceImple();
                System.out.println(fto.getTownList());

                break;

            case 19:

                UpdateTownServiceImple uto = new UpdateTownServiceImple();
                uto.updateTown();

                break;

            case 20:

                DeleteTownServiceImple dto = new DeleteTownServiceImple();
                dto.deleteTown();

                break;

            case 21:

                AddAddressServiceImple aa = new AddAddressServiceImple();

                Address a1 = aa.addAddress();
                em.getTransaction().begin();
                em.persist(a1);
                em.getTransaction().commit();

                break;

            case 22:

                FetchAddressServiceImple fa = new FetchAddressServiceImple();
                System.out.println(fa.getAddressList());

                break;

            case 23:

                UpdateAddressServiceImple ua = new UpdateAddressServiceImple();
                ua.updateAddress();

                break;

            case 24:

                DeleteAddressServiceImple da = new DeleteAddressServiceImple();
                da.deleteAddress();

                break;

            case 25:

                AddEmployeeServiceImple ae = new AddEmployeeServiceImple();

                Employee e1 = ae.addEmployee();
                em.getTransaction().begin();
                em.persist(e1);
                em.getTransaction().commit();
                break;

            case 26:

                FetchEmployeeServiceImple fe = new FetchEmployeeServiceImple();
                System.out.println(fe.getEmployeeList());

                break;

            case 27:

                UpdateEmployeeServiceImple ue = new UpdateEmployeeServiceImple();
                ue.updateEmployee();

                break;

            case 28:

                DeleteEmployeeServiceImple de = new DeleteEmployeeServiceImple();
                de.deleteEmployee();

                break;

            case 29:

                AddDeptServiceImple ade = new AddDeptServiceImple();

                Dept d2 = ade.addDept();

                em.getTransaction().begin();
                em.persist(d2);
                em.getTransaction().commit();

                break;

            case 30:

                FetchDeptServiceImple fde = new FetchDeptServiceImple();
                System.out.println(fde.getDeptList());

                break;

            case 31:

                UpdateDeptServiceImple ude = new UpdateDeptServiceImple();
                ude.updateDept();
                break;

            case 32:

                DeleteDeptServiceImple dde = new DeleteDeptServiceImple();
                dde.deleteDept();

                break;

            case 33:

                AddManagerServiceImple am = new AddManagerServiceImple();
                Manager m1 = am.addManager();
                em.getTransaction().begin();
                em.persist(m1);
                em.getTransaction().commit();

                break;

            case 34:

                FetchManagerServiceImple fm = new FetchManagerServiceImple();
                System.out.println(fm.getManagerList());
                break;

            case 35:

                UpdateManagerServiceImple um = new UpdateManagerServiceImple();
                um.updateManager();
                break;

            case 36:

                DeleteManagerServiceImple dm = new DeleteManagerServiceImple();
                dm.deleteManager();

                break;

            case 37:

                AddOwnerServiceImple ao = new AddOwnerServiceImple();
                Owner o1 = ao.addOwner();
                em.getTransaction().begin();
                em.persist(o1);
                em.getTransaction().commit();

                break;

            case 38:

                FetchOwnerServiceImple fo = new FetchOwnerServiceImple();
                System.out.println(fo.getOwnerList());

                break;

            case 39:

                UpdateOwnerServiceImple uo = new UpdateOwnerServiceImple();
                uo.updateOwner();

                break;

            case 40:

                DeleteOwnerServiceImple do1 = new DeleteOwnerServiceImple();
                do1.deleteOwner();

                break;

            case 41:

                AddBranchServiceImple ab = new AddBranchServiceImple();
                Branch b1 = ab.addBranch();

                em.getTransaction().begin();
                em.persist(b1);
                em.getTransaction().commit();

                break;

            case 42:

                FetchBranchServiceImple fb = new FetchBranchServiceImple();

                System.out.println(fb.getBranchList());

                break;

            case 43:

                UpdateBranchServiceImple ub = new UpdateBranchServiceImple();

                ub.updateBranch();

                break;

            case 44:

                DeleteBranchServiceImple db = new DeleteBranchServiceImple();

                db.deleteBranch();

                break;

            case 45:

                AddCompanyServiceImple acs = new AddCompanyServiceImple();

                Company c2 = acs.addCompany();

                em.getTransaction().begin();
                em.persist(c2);
                em.getTransaction().commit();

                break;

            case 46:

                FetchCompanyServiceImple fcs = new FetchCompanyServiceImple();
                System.out.println(fcs.getCompanyList());

                break;

            case 47:

                UpdateCompanyServiceImple ucs = new UpdateCompanyServiceImple();
                ucs.updateCompany();

                break;

            case 48:

                DeleteCompanyServiceImple dcs = new DeleteCompanyServiceImple();
                dcs.deleteCompany();

                break;

            case 49:
            	System.exit(0);

                break;

            default:

                System.out.println("Invalid Choice");
            }

            em.close();
        }
    }
}