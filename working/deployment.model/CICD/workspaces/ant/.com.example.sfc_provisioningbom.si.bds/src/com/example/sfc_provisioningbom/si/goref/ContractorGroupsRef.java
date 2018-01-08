//
// AUTO-GENERATED BY BDS GENERATOR. DO NO EDIT THIS FILE, AS CHANGES WILL BE OVERWRITTEN.
// Derived from BOM (model name 'com.example.sfc_provisioningbom').
//     

// This file is a case/global class ref interface.
package com.example.sfc_provisioningbom.si.goref;

import java.net.MalformedURLException;
import java.util.List;
import com.tibco.bds.services.CaseDataAccessFault;
import com.tibco.bds.services.CaseDataChangedFault;
import com.tibco.bds.services.CaseModelReferenceFault;
import com.tibco.bds.services.CaseReferenceFault;
import com.tibco.bds.services.InternalServiceFault;
import com.tibco.bds.services.SecurityFault;
import com.tibco.bds.common.exception.BDSSIException;
import com.tibco.bds.common.si.PaginatedList;
import com.tibco.bds.common.si.exception.ApplicationError;
import com.tibco.bds.api.dto.CaseCriteriaDTO;

public interface ContractorGroupsRef extends com.tibco.bds.api.goref.GORef {

	public com.example.sfc_provisioningbom.ContractorGroups readContractorGroups()
			throws CaseDataAccessFault, CaseModelReferenceFault,
			InternalServiceFault, SecurityFault, CaseReferenceFault,
			BDSSIException;

	public com.example.sfc_provisioningbom.si.goref.ContractorGroupsRef updateContractorGroups(
			com.example.sfc_provisioningbom.ContractorGroups obj)
			throws CaseDataAccessFault, CaseModelReferenceFault,
			InternalServiceFault, SecurityFault, CaseReferenceFault,
			CaseDataChangedFault, IllegalArgumentException,
			MalformedURLException, BDSSIException, ApplicationError;

	public void deleteContractorGroups() throws CaseDataAccessFault,
			CaseModelReferenceFault, InternalServiceFault, SecurityFault,
			CaseReferenceFault, CaseDataChangedFault, BDSSIException,
			ApplicationError;

}
