//
// AUTO-GENERATED BY BDS GENERATOR. DO NO EDIT THIS FILE, AS CHANGES WILL BE OVERWRITTEN.
// Derived from BOM (model name 'com.example.sfc_provisioningbom').
//     

// This file is a case class service implementation
package com.example.sfc_provisioningbom.da.service.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

public class ContractorGroupsServiceImpl
		extends
			com.tibco.bds.common.da.service.impl.BaseDACommonServiceImpl
		implements
			com.example.sfc_provisioningbom.da.service.ContractorGroupsService {

	public ContractorGroupsServiceImpl() {

		// CID emailID
		cidAttributes
				.add(com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
						.getContractorGroups_EmailID());

		// Searchable loginName
		searchableAttributes
				.add(com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
						.getContractorGroups_LoginName());

		// Searchable contractorGroupName
		searchableAttributes
				.add(com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
						.getContractorGroups_ContractorGroupName());

	}

	@Override
	public EClass getObjectClass() {
		return com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
				.getContractorGroups();
	}

	protected EFactory getFactory() {
		return com.example.sfc_provisioningbom.Sfc_provisioningbomFactory.eINSTANCE;
	}
}
