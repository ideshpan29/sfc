//
// AUTO-GENERATED BY BDS GENERATOR. DO NO EDIT THIS FILE, AS CHANGES WILL BE OVERWRITTEN.
// Derived from BOM (model name 'com.example.sfc_provisioningbom').
//     

// This file is a case class service implementation
package com.example.sfc_provisioningbom.da.service.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

public class SLA_ConfigurationServiceImpl
		extends
			com.tibco.bds.common.da.service.impl.BaseDACommonServiceImpl
		implements
			com.example.sfc_provisioningbom.da.service.SLA_ConfigurationService {

	public SLA_ConfigurationServiceImpl() {

		// CID SLALevel
		cidAttributes
				.add(com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
						.getSLA_Configuration_SLALevel());

		// CID taskName
		cidAttributes
				.add(com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
						.getSLA_Configuration_TaskName());

		// CID processName
		cidAttributes
				.add(com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
						.getSLA_Configuration_ProcessName());

		// Searchable enableDisableFlag
		searchableAttributes
				.add(com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
						.getSLA_Configuration_EnableDisableFlag());

	}

	@Override
	public EClass getObjectClass() {
		return com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.eINSTANCE
				.getSLA_Configuration();
	}

	protected EFactory getFactory() {
		return com.example.sfc_provisioningbom.Sfc_provisioningbomFactory.eINSTANCE;
	}
}
