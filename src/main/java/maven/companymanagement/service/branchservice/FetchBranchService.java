package maven.companymanagement.service.branchservice;

import java.util.List;

import maven.companymanagement.entity.Branch;

public interface FetchBranchService {
    List<Branch> getBranchList();
}