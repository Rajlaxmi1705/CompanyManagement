package maven.companymanagement.service.townservice;

import java.util.List;

import maven.companymanagement.entity.Town;

public interface FetchTownService {

    List<Town> getTownList();
}