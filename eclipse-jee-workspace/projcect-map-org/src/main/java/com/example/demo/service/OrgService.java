package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Organisation;

public interface OrgService {
	List<Organisation> getOrg();
	void saveOrg(Organisation organisation);
	void deleteOrg(long id);
	void updateOrg(Organisation organisation,Long id);
	void saveOrgId(Organisation organisation, Long id);
	Organisation getById(Long id);

}
