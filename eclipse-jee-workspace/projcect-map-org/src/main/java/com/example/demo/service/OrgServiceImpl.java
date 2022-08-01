package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Organisation;
import com.example.demo.repository.OrganisationRepo;
@Service
public class OrgServiceImpl implements OrgService{
	@Autowired
	public OrganisationRepo organisationRepo;
	@Override
	public List<Organisation> getOrg() {
		return organisationRepo.findAll() ;
	}
	@Override
	public void saveOrg(Organisation organisation) {
		this.organisationRepo.save(organisation);
			}
	
	@Override
	public void saveOrgId(Organisation organisation,Long id) {
		this.organisationRepo.save(organisation);
			}
	@Override
	public void updateOrg(Organisation organisation,Long id) {
		Organisation orgupdate=organisationRepo.findById(id).get();
		orgupdate.setName(organisation.getName());
		organisationRepo.save(orgupdate);		
	}

	@Override
	public void deleteOrg(long id) {
		organisationRepo.deleteById(id);
		
	}
	@Override
	public Organisation getById(Long id) {
		return organisationRepo.findById(id).get();
	}
}
