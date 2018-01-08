//
// AUTO-GENERATED BY BDS GENERATOR. DO NO EDIT THIS FILE, AS CHANGES WILL BE OVERWRITTEN.
// Derived from BOM (model name 'com.example.sfc_provisioningbom').
//     

// This file is the ContractorGroups Case Access Class(CAC) Implementation Class
package com.example.sfc_provisioningbom.si.cac.impl;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import com.tibco.bds.api.dto.CaseCriteriaDTO;
import com.tibco.bds.api.dto.util.BDSTypeConversions;
import com.tibco.bds.services.CaseDataAccessFault;
import com.tibco.bds.services.CaseDataChangedFault;
import com.tibco.bds.services.CaseModelReferenceFault;
import com.tibco.bds.services.CaseReferenceFault;
import com.tibco.bds.services.InternalServiceFault;
import com.tibco.bds.services.SecurityFault;
import com.tibco.bds.common.exception.BDSSIException;
import com.tibco.bds.common.si.PaginatedList;
import com.tibco.bds.common.si.impl.CACImpl;
import com.tibco.bds.common.si.exception.ApplicationError;

import org.eclipse.emf.ecore.EObject;

public class ContractorGroupsCACImpl extends CACImpl
		implements
			com.example.sfc_provisioningbom.si.cac.ContractorGroupsCAC {

	public ContractorGroupsCACImpl() {
		super(com.example.sfc_provisioningbom.si.Activator.getBundleVersion(),
				"com.example.sfc_provisioningbom.ContractorGroups");
	}

	@Override
	public Object create(Object obj) throws CaseDataAccessFault,
			CaseModelReferenceFault, InternalServiceFault, SecurityFault,
			IllegalArgumentException, MalformedURLException, BDSSIException,
			ApplicationError {
		return siService.createCaseObject(obj);
	}

	@SuppressWarnings("unchecked")
	public List<com.example.sfc_provisioningbom.ContractorGroups> read(
			List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> refs)
			throws CaseDataAccessFault, CaseModelReferenceFault,
			CaseReferenceFault, InternalServiceFault, SecurityFault,
			IllegalArgumentException, MalformedURLException, BDSSIException {
		return siService.readCase(refs);
	}

	@SuppressWarnings("unchecked")
	public List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> update(
			List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> refs,
			List<com.example.sfc_provisioningbom.ContractorGroups> objs)
			throws CaseDataAccessFault, CaseDataChangedFault,
			CaseModelReferenceFault, CaseReferenceFault, InternalServiceFault,
			SecurityFault, IllegalArgumentException, MalformedURLException,
			BDSSIException, ApplicationError {
		return (List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef>) siService
				.updateCaseObject(refs, objs);
	}

	public void deleteRefs(
			List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> refs)
			throws CaseDataAccessFault, CaseDataChangedFault,
			CaseModelReferenceFault, CaseReferenceFault, InternalServiceFault,
			SecurityFault, IllegalArgumentException, MalformedURLException,
			BDSSIException, ApplicationError {
		siService.deleteCaseByRefObject(refs);
	}

	@Override
	public com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef findByEmailID(
			Object id) throws CaseDataAccessFault, CaseModelReferenceFault,
			InternalServiceFault, SecurityFault, BDSSIException {
		com.example.sfc_provisioningbom.ContractorGroups obj = com.example.sfc_provisioningbom.Sfc_provisioningbomFactory.eINSTANCE
				.createContractorGroups();
		obj.setEmailID(BDSTypeConversions.convertToString(id));
		return (com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef) siService
				.findCaseByCID(obj);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> find(
			com.example.sfc_provisioningbom.ContractorGroups obj)
			throws CaseDataAccessFault, CaseModelReferenceFault,
			InternalServiceFault, SecurityFault, BDSSIException {
		return siService.findCaseByExample(obj);
	}

	@Override
	@SuppressWarnings("unchecked")
	public PaginatedList<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> find(
			com.example.sfc_provisioningbom.ContractorGroups obj,
			Object startIndex, Object pageSize) throws CaseDataAccessFault,
			CaseModelReferenceFault, InternalServiceFault, SecurityFault,
			BDSSIException {
		return siService.findCaseByExample(obj, startIndex, pageSize);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> findAll()
			throws CaseDataAccessFault, CaseModelReferenceFault,
			InternalServiceFault, SecurityFault, BDSSIException {
		return siService.findAllCases();
	}

	@Override
	@SuppressWarnings("unchecked")
	public PaginatedList<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> findAll(
			Object startIndex, Object pageSize) throws CaseDataAccessFault,
			CaseModelReferenceFault, InternalServiceFault, SecurityFault,
			BDSSIException {
		return siService.findAllCases(startIndex, pageSize);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> findByCriteria(
			Object criteriaOrQueryString) throws CaseDataAccessFault,
			CaseModelReferenceFault, InternalServiceFault, SecurityFault,
			BDSSIException, ApplicationError {
		return siService.findCaseByCriteriaObject(criteriaOrQueryString);
	}

	@Override
	@SuppressWarnings("unchecked")
	public PaginatedList<com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef> findByCriteria(
			String query, Object startIndex, Object pageSize)
			throws CaseDataAccessFault, CaseModelReferenceFault,
			InternalServiceFault, SecurityFault, BDSSIException {
		return siService.findCaseByCriteria(query, startIndex, pageSize);
	}

	@Override
	public void deleteByEmailID(Object id) throws CaseDataAccessFault,
			CaseModelReferenceFault, InternalServiceFault, SecurityFault,
			CaseReferenceFault, CaseDataChangedFault, BDSSIException,
			ApplicationError {
		if (id instanceof List) {
			@SuppressWarnings("unchecked")
			List<Object> objectList = (List<Object>) id;
			List<EObject> objs = new ArrayList<EObject>();
			for (Object idObj : objectList) {
				com.example.sfc_provisioningbom.ContractorGroups obj = com.example.sfc_provisioningbom.Sfc_provisioningbomFactory.eINSTANCE
						.createContractorGroups();
				obj.setEmailID(BDSTypeConversions.convertToString(idObj));
				objs.add(obj);
			}
			siService.deleteCasesByCID(objs);
		} else {
			com.example.sfc_provisioningbom.ContractorGroups obj = com.example.sfc_provisioningbom.Sfc_provisioningbomFactory.eINSTANCE
					.createContractorGroups();
			obj.setEmailID(BDSTypeConversions.convertToString(id));
			siService.deleteCaseByCID(obj);
		}
	}

}