/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.sfc_provisioningbom.util;

import com.example.sfc_provisioningbom.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage
 * @generated
 */
public class Sfc_provisioningbomAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Sfc_provisioningbomPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sfc_provisioningbomAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Sfc_provisioningbomPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Sfc_provisioningbomSwitch<Adapter> modelSwitch =
    new Sfc_provisioningbomSwitch<Adapter>()
    {
      @Override
      public Adapter caseCommentData(CommentData object)
      {
        return createCommentDataAdapter();
      }
      @Override
      public Adapter caseContractorGroups(ContractorGroups object)
      {
        return createContractorGroupsAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseEquipmentDetails(EquipmentDetails object)
      {
        return createEquipmentDetailsAdapter();
      }
      @Override
      public Adapter caseProvisioningDataModel(ProvisioningDataModel object)
      {
        return createProvisioningDataModelAdapter();
      }
      @Override
      public Adapter caseSLA_Configuration(SLA_Configuration object)
      {
        return createSLA_ConfigurationAdapter();
      }
      @Override
      public Adapter caseSystemParameters(SystemParameters object)
      {
        return createSystemParametersAdapter();
      }
      @Override
      public Adapter caseTehnicalInformation(TehnicalInformation object)
      {
        return createTehnicalInformationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.CommentData <em>Comment Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.CommentData
   * @generated
   */
  public Adapter createCommentDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.ContractorGroups <em>Contractor Groups</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.ContractorGroups
   * @generated
   */
  public Adapter createContractorGroupsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.EquipmentDetails <em>Equipment Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.EquipmentDetails
   * @generated
   */
  public Adapter createEquipmentDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.ProvisioningDataModel <em>Provisioning Data Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel
   * @generated
   */
  public Adapter createProvisioningDataModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.SLA_Configuration <em>SLA Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.SLA_Configuration
   * @generated
   */
  public Adapter createSLA_ConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.SystemParameters <em>System Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.SystemParameters
   * @generated
   */
  public Adapter createSystemParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.sfc_provisioningbom.TehnicalInformation <em>Tehnical Information</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.sfc_provisioningbom.TehnicalInformation
   * @generated
   */
  public Adapter createTehnicalInformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Sfc_provisioningbomAdapterFactory
