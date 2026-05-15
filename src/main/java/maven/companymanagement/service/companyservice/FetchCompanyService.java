package maven.companymanagement.service.companyservice;

import java.util.List;

import maven.companymanagement.entity.Company;

public interface FetchCompanyService {

    List<Company> getCompanyList();
}