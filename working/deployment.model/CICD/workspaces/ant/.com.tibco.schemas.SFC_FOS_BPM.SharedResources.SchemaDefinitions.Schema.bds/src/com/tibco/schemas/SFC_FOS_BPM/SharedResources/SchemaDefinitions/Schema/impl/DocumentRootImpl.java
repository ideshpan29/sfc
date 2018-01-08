
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSFeatureMap;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSFeatureMapImpl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getCreateresource <em>Createresource</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getCreateresourceinput <em>Createresourceinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getCreateresourceoutput <em>Createresourceoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFetchresource <em>Fetchresource</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFetchresourceinput <em>Fetchresourceinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFetchresourceoutput <em>Fetchresourceoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getGetprocessinstances <em>Getprocessinstances</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getGetprocessinstancesinput <em>Getprocessinstancesinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getGetprocessinstancesoutput <em>Getprocessinstancesoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getLdapentry <em>Ldapentry</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getLdapentryinput <em>Ldapentryinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getLdapentryinputrepeat <em>Ldapentryinputrepeat</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getLdapentryoutput <em>Ldapentryoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getParsecsv <em>Parsecsv</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getReesourcecreationandmapping <em>Reesourcecreationandmapping</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getReportgeneration <em>Reportgeneration</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getSearchprocessinstances <em>Searchprocessinstances</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getSearchprocessinstancesinput <em>Searchprocessinstancesinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getSearchprocessinstancesoutput <em>Searchprocessinstancesoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getWorkitemcompletion <em>Workitemcompletion</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getWorkitemcompletioninput <em>Workitemcompletioninput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getWorkitemcompletionoutput <em>Workitemcompletionoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getCreateresourceinputTypeBDSInternalSerializationElement <em>Createresourceinput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getCreateresourceoutputTypeBDSInternalSerializationElement <em>Createresourceoutput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getCreateresourceTypeBDSInternalSerializationElement <em>Createresource Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFaultTypeBDSInternalSerializationElement <em>Fault Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFetchresourceinputTypeBDSInternalSerializationElement <em>Fetchresourceinput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFetchresourceoutputTypeBDSInternalSerializationElement <em>Fetchresourceoutput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getFetchresourceTypeBDSInternalSerializationElement <em>Fetchresource Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getGetprocessinstancesinputTypeBDSInternalSerializationElement <em>Getprocessinstancesinput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getGetprocessinstancesoutputTypeBDSInternalSerializationElement <em>Getprocessinstancesoutput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getGetprocessinstancesTypeBDSInternalSerializationElement <em>Getprocessinstances Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getInputTypeBDSInternalSerializationElement <em>Input Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getLdapentryinputrepeatTypeBDSInternalSerializationElement <em>Ldapentryinputrepeat Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getLdapentryinputTypeBDSInternalSerializationElement <em>Ldapentryinput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getLdapentryTypeBDSInternalSerializationElement <em>Ldapentry Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getParsecsvTypeBDSInternalSerializationElement <em>Parsecsv Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getPi_cancelledTypeBDSInternalSerializationElement <em>Pi cancelled Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getPi_completeTypeBDSInternalSerializationElement <em>Pi complete Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getPi_haltedTypeBDSInternalSerializationElement <em>Pi halted Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getPi_startedTypeBDSInternalSerializationElement <em>Pi started Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getReesourcecreationandmappingTypeBDSInternalSerializationElement <em>Reesourcecreationandmapping Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getReportgenerationTypeBDSInternalSerializationElement <em>Reportgeneration Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getResourceTypeBDSInternalSerializationElement <em>Resource Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getRootTypeBDSInternalSerializationElement <em>Root Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getSearchprocessinstancesinputTypeBDSInternalSerializationElement <em>Searchprocessinstancesinput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getSearchprocessinstancesoutputTypeBDSInternalSerializationElement <em>Searchprocessinstancesoutput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getSearchprocessinstancesTypeBDSInternalSerializationElement <em>Searchprocessinstances Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getSearchrecordTypeBDSInternalSerializationElement <em>Searchrecord Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getUsersTypeBDSInternalSerializationElement <em>Users Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getWorkitemcompletioninputTypeBDSInternalSerializationElement <em>Workitemcompletioninput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getWorkitemcompletionoutputTypeBDSInternalSerializationElement <em>Workitemcompletionoutput Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl#getWorkitemcompletionTypeBDSInternalSerializationElement <em>Workitemcompletion Type BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected BDSFeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * The default value of the '{@link #getLdapentryoutput() <em>Ldapentryoutput</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLdapentryoutput()
   * @generated
   * @ordered
   */
  protected static final String LDAPENTRYOUTPUT_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SchemaPackage.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSFeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, SchemaPackage.DOCUMENT_ROOT__MIXED));
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SchemaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SchemaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceType getCreateresource()
  {
    return (createresourceType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresource(createresourceType newCreateresource, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCE, newCreateresource, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresource(createresourceType newCreateresource)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCE, newCreateresource);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceinputType getCreateresourceinput()
  {
    return (createresourceinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEINPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresourceinput(createresourceinputType newCreateresourceinput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEINPUT, newCreateresourceinput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresourceinput(createresourceinputType newCreateresourceinput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEINPUT, newCreateresourceinput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceoutputType getCreateresourceoutput()
  {
    return (createresourceoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEOUTPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresourceoutput(createresourceoutputType newCreateresourceoutput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEOUTPUT, newCreateresourceoutput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresourceoutput(createresourceoutputType newCreateresourceoutput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEOUTPUT, newCreateresourceoutput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public faultType getFault()
  {
    return (faultType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FAULT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFault(faultType newFault, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FAULT, newFault, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFault(faultType newFault)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FAULT, newFault);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceType getFetchresource()
  {
    return (fetchresourceType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresource(fetchresourceType newFetchresource, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCE, newFetchresource, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresource(fetchresourceType newFetchresource)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCE, newFetchresource);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceinputType getFetchresourceinput()
  {
    return (fetchresourceinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEINPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresourceinput(fetchresourceinputType newFetchresourceinput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEINPUT, newFetchresourceinput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresourceinput(fetchresourceinputType newFetchresourceinput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEINPUT, newFetchresourceinput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceoutputType getFetchresourceoutput()
  {
    return (fetchresourceoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresourceoutput(fetchresourceoutputType newFetchresourceoutput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT, newFetchresourceoutput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresourceoutput(fetchresourceoutputType newFetchresourceoutput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT, newFetchresourceoutput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesType getGetprocessinstances()
  {
    return (getprocessinstancesType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstances(getprocessinstancesType newGetprocessinstances, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCES, newGetprocessinstances, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstances(getprocessinstancesType newGetprocessinstances)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCES, newGetprocessinstances);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesinputType getGetprocessinstancesinput()
  {
    return (getprocessinstancesinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstancesinput(getprocessinstancesinputType newGetprocessinstancesinput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT, newGetprocessinstancesinput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstancesinput(getprocessinstancesinputType newGetprocessinstancesinput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT, newGetprocessinstancesinput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesoutputType getGetprocessinstancesoutput()
  {
    return (getprocessinstancesoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstancesoutput(getprocessinstancesoutputType newGetprocessinstancesoutput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT, newGetprocessinstancesoutput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstancesoutput(getprocessinstancesoutputType newGetprocessinstancesoutput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT, newGetprocessinstancesoutput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryType getLdapentry()
  {
    return (ldapentryType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentry(ldapentryType newLdapentry, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRY, newLdapentry, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentry(ldapentryType newLdapentry)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRY, newLdapentry);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputType getLdapentryinput()
  {
    return (ldapentryinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentryinput(ldapentryinputType newLdapentryinput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUT, newLdapentryinput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryinput(ldapentryinputType newLdapentryinput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUT, newLdapentryinput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputrepeatType getLdapentryinputrepeat()
  {
    return (ldapentryinputrepeatType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentryinputrepeat(ldapentryinputrepeatType newLdapentryinputrepeat, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT, newLdapentryinputrepeat, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryinputrepeat(ldapentryinputrepeatType newLdapentryinputrepeat)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT, newLdapentryinputrepeat);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLdapentryoutput()
  {
    return (String)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYOUTPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryoutput(String newLdapentryoutput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYOUTPUT, newLdapentryoutput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parsecsvType getParsecsv()
  {
    return (parsecsvType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__PARSECSV, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParsecsv(parsecsvType newParsecsv, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__PARSECSV, newParsecsv, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParsecsv(parsecsvType newParsecsv)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__PARSECSV, newParsecsv);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reesourcecreationandmappingType getReesourcecreationandmapping()
  {
    return (reesourcecreationandmappingType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReesourcecreationandmapping(reesourcecreationandmappingType newReesourcecreationandmapping, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING, newReesourcecreationandmapping, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReesourcecreationandmapping(reesourcecreationandmappingType newReesourcecreationandmapping)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING, newReesourcecreationandmapping);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reportgenerationType getReportgeneration()
  {
    return (reportgenerationType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__REPORTGENERATION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReportgeneration(reportgenerationType newReportgeneration, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__REPORTGENERATION, newReportgeneration, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReportgeneration(reportgenerationType newReportgeneration)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__REPORTGENERATION, newReportgeneration);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rootType getRoot()
  {
    return (rootType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__ROOT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(rootType newRoot, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__ROOT, newRoot, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(rootType newRoot)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__ROOT, newRoot);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesType getSearchprocessinstances()
  {
    return (searchprocessinstancesType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstances(searchprocessinstancesType newSearchprocessinstances, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES, newSearchprocessinstances, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstances(searchprocessinstancesType newSearchprocessinstances)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES, newSearchprocessinstances);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesinputType getSearchprocessinstancesinput()
  {
    return (searchprocessinstancesinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstancesinput(searchprocessinstancesinputType newSearchprocessinstancesinput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT, newSearchprocessinstancesinput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstancesinput(searchprocessinstancesinputType newSearchprocessinstancesinput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT, newSearchprocessinstancesinput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesoutputType getSearchprocessinstancesoutput()
  {
    return (searchprocessinstancesoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstancesoutput(searchprocessinstancesoutputType newSearchprocessinstancesoutput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT, newSearchprocessinstancesoutput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstancesoutput(searchprocessinstancesoutputType newSearchprocessinstancesoutput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT, newSearchprocessinstancesoutput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionType getWorkitemcompletion()
  {
    return (workitemcompletionType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletion(workitemcompletionType newWorkitemcompletion, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETION, newWorkitemcompletion, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletion(workitemcompletionType newWorkitemcompletion)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETION, newWorkitemcompletion);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletioninputType getWorkitemcompletioninput()
  {
    return (workitemcompletioninputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletioninput(workitemcompletioninputType newWorkitemcompletioninput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT, newWorkitemcompletioninput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletioninput(workitemcompletioninputType newWorkitemcompletioninput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT, newWorkitemcompletioninput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionoutputType getWorkitemcompletionoutput()
  {
    return (workitemcompletionoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletionoutput(workitemcompletionoutputType newWorkitemcompletionoutput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT, newWorkitemcompletionoutput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletionoutput(workitemcompletionoutputType newWorkitemcompletionoutput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT, newWorkitemcompletionoutput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceinputType getCreateresourceinputTypeBDSInternalSerializationElement()
  {
    return (createresourceinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresourceinputTypeBDSInternalSerializationElement(createresourceinputType newCreateresourceinputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateresourceinputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresourceinputTypeBDSInternalSerializationElement(createresourceinputType newCreateresourceinputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateresourceinputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceoutputType getCreateresourceoutputTypeBDSInternalSerializationElement()
  {
    return (createresourceoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresourceoutputTypeBDSInternalSerializationElement(createresourceoutputType newCreateresourceoutputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateresourceoutputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresourceoutputTypeBDSInternalSerializationElement(createresourceoutputType newCreateresourceoutputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateresourceoutputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceType getCreateresourceTypeBDSInternalSerializationElement()
  {
    return (createresourceType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresourceTypeBDSInternalSerializationElement(createresourceType newCreateresourceTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateresourceTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresourceTypeBDSInternalSerializationElement(createresourceType newCreateresourceTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateresourceTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public faultType getFaultTypeBDSInternalSerializationElement()
  {
    return (faultType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFaultTypeBDSInternalSerializationElement(faultType newFaultTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFaultTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFaultTypeBDSInternalSerializationElement(faultType newFaultTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFaultTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceinputType getFetchresourceinputTypeBDSInternalSerializationElement()
  {
    return (fetchresourceinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresourceinputTypeBDSInternalSerializationElement(fetchresourceinputType newFetchresourceinputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFetchresourceinputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresourceinputTypeBDSInternalSerializationElement(fetchresourceinputType newFetchresourceinputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFetchresourceinputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceoutputType getFetchresourceoutputTypeBDSInternalSerializationElement()
  {
    return (fetchresourceoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresourceoutputTypeBDSInternalSerializationElement(fetchresourceoutputType newFetchresourceoutputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFetchresourceoutputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresourceoutputTypeBDSInternalSerializationElement(fetchresourceoutputType newFetchresourceoutputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFetchresourceoutputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceType getFetchresourceTypeBDSInternalSerializationElement()
  {
    return (fetchresourceType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresourceTypeBDSInternalSerializationElement(fetchresourceType newFetchresourceTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFetchresourceTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresourceTypeBDSInternalSerializationElement(fetchresourceType newFetchresourceTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newFetchresourceTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesinputType getGetprocessinstancesinputTypeBDSInternalSerializationElement()
  {
    return (getprocessinstancesinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstancesinputTypeBDSInternalSerializationElement(getprocessinstancesinputType newGetprocessinstancesinputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetprocessinstancesinputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstancesinputTypeBDSInternalSerializationElement(getprocessinstancesinputType newGetprocessinstancesinputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetprocessinstancesinputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesoutputType getGetprocessinstancesoutputTypeBDSInternalSerializationElement()
  {
    return (getprocessinstancesoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstancesoutputTypeBDSInternalSerializationElement(getprocessinstancesoutputType newGetprocessinstancesoutputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetprocessinstancesoutputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstancesoutputTypeBDSInternalSerializationElement(getprocessinstancesoutputType newGetprocessinstancesoutputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetprocessinstancesoutputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesType getGetprocessinstancesTypeBDSInternalSerializationElement()
  {
    return (getprocessinstancesType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstancesTypeBDSInternalSerializationElement(getprocessinstancesType newGetprocessinstancesTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetprocessinstancesTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstancesTypeBDSInternalSerializationElement(getprocessinstancesType newGetprocessinstancesTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetprocessinstancesTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inputType getInputTypeBDSInternalSerializationElement()
  {
    return (inputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputTypeBDSInternalSerializationElement(inputType newInputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newInputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputTypeBDSInternalSerializationElement(inputType newInputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newInputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputrepeatType getLdapentryinputrepeatTypeBDSInternalSerializationElement()
  {
    return (ldapentryinputrepeatType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentryinputrepeatTypeBDSInternalSerializationElement(ldapentryinputrepeatType newLdapentryinputrepeatTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newLdapentryinputrepeatTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryinputrepeatTypeBDSInternalSerializationElement(ldapentryinputrepeatType newLdapentryinputrepeatTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newLdapentryinputrepeatTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputType getLdapentryinputTypeBDSInternalSerializationElement()
  {
    return (ldapentryinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentryinputTypeBDSInternalSerializationElement(ldapentryinputType newLdapentryinputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newLdapentryinputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryinputTypeBDSInternalSerializationElement(ldapentryinputType newLdapentryinputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newLdapentryinputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryType getLdapentryTypeBDSInternalSerializationElement()
  {
    return (ldapentryType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentryTypeBDSInternalSerializationElement(ldapentryType newLdapentryTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newLdapentryTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryTypeBDSInternalSerializationElement(ldapentryType newLdapentryTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newLdapentryTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parsecsvType getParsecsvTypeBDSInternalSerializationElement()
  {
    return (parsecsvType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParsecsvTypeBDSInternalSerializationElement(parsecsvType newParsecsvTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newParsecsvTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParsecsvTypeBDSInternalSerializationElement(parsecsvType newParsecsvTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newParsecsvTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_cancelledType getPi_cancelledTypeBDSInternalSerializationElement()
  {
    return (pi_cancelledType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPi_cancelledTypeBDSInternalSerializationElement(pi_cancelledType newPi_cancelledTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_cancelledTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPi_cancelledTypeBDSInternalSerializationElement(pi_cancelledType newPi_cancelledTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_cancelledTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_completeType getPi_completeTypeBDSInternalSerializationElement()
  {
    return (pi_completeType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPi_completeTypeBDSInternalSerializationElement(pi_completeType newPi_completeTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_completeTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPi_completeTypeBDSInternalSerializationElement(pi_completeType newPi_completeTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_completeTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_haltedType getPi_haltedTypeBDSInternalSerializationElement()
  {
    return (pi_haltedType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPi_haltedTypeBDSInternalSerializationElement(pi_haltedType newPi_haltedTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_haltedTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPi_haltedTypeBDSInternalSerializationElement(pi_haltedType newPi_haltedTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_haltedTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_startedType getPi_startedTypeBDSInternalSerializationElement()
  {
    return (pi_startedType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPi_startedTypeBDSInternalSerializationElement(pi_startedType newPi_startedTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_startedTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPi_startedTypeBDSInternalSerializationElement(pi_startedType newPi_startedTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPi_startedTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reesourcecreationandmappingType getReesourcecreationandmappingTypeBDSInternalSerializationElement()
  {
    return (reesourcecreationandmappingType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReesourcecreationandmappingTypeBDSInternalSerializationElement(reesourcecreationandmappingType newReesourcecreationandmappingTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newReesourcecreationandmappingTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReesourcecreationandmappingTypeBDSInternalSerializationElement(reesourcecreationandmappingType newReesourcecreationandmappingTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newReesourcecreationandmappingTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reportgenerationType getReportgenerationTypeBDSInternalSerializationElement()
  {
    return (reportgenerationType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReportgenerationTypeBDSInternalSerializationElement(reportgenerationType newReportgenerationTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newReportgenerationTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReportgenerationTypeBDSInternalSerializationElement(reportgenerationType newReportgenerationTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newReportgenerationTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resourceType getResourceTypeBDSInternalSerializationElement()
  {
    return (resourceType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceTypeBDSInternalSerializationElement(resourceType newResourceTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newResourceTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceTypeBDSInternalSerializationElement(resourceType newResourceTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newResourceTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rootType getRootTypeBDSInternalSerializationElement()
  {
    return (rootType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootTypeBDSInternalSerializationElement(rootType newRootTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newRootTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootTypeBDSInternalSerializationElement(rootType newRootTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newRootTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesinputType getSearchprocessinstancesinputTypeBDSInternalSerializationElement()
  {
    return (searchprocessinstancesinputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstancesinputTypeBDSInternalSerializationElement(searchprocessinstancesinputType newSearchprocessinstancesinputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchprocessinstancesinputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstancesinputTypeBDSInternalSerializationElement(searchprocessinstancesinputType newSearchprocessinstancesinputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchprocessinstancesinputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesoutputType getSearchprocessinstancesoutputTypeBDSInternalSerializationElement()
  {
    return (searchprocessinstancesoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstancesoutputTypeBDSInternalSerializationElement(searchprocessinstancesoutputType newSearchprocessinstancesoutputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchprocessinstancesoutputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstancesoutputTypeBDSInternalSerializationElement(searchprocessinstancesoutputType newSearchprocessinstancesoutputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchprocessinstancesoutputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesType getSearchprocessinstancesTypeBDSInternalSerializationElement()
  {
    return (searchprocessinstancesType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstancesTypeBDSInternalSerializationElement(searchprocessinstancesType newSearchprocessinstancesTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchprocessinstancesTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstancesTypeBDSInternalSerializationElement(searchprocessinstancesType newSearchprocessinstancesTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchprocessinstancesTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchrecordType getSearchrecordTypeBDSInternalSerializationElement()
  {
    return (searchrecordType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchrecordTypeBDSInternalSerializationElement(searchrecordType newSearchrecordTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchrecordTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchrecordTypeBDSInternalSerializationElement(searchrecordType newSearchrecordTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchrecordTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public usersType getUsersTypeBDSInternalSerializationElement()
  {
    return (usersType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUsersTypeBDSInternalSerializationElement(usersType newUsersTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newUsersTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsersTypeBDSInternalSerializationElement(usersType newUsersTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newUsersTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletioninputType getWorkitemcompletioninputTypeBDSInternalSerializationElement()
  {
    return (workitemcompletioninputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletioninputTypeBDSInternalSerializationElement(workitemcompletioninputType newWorkitemcompletioninputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newWorkitemcompletioninputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletioninputTypeBDSInternalSerializationElement(workitemcompletioninputType newWorkitemcompletioninputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newWorkitemcompletioninputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionoutputType getWorkitemcompletionoutputTypeBDSInternalSerializationElement()
  {
    return (workitemcompletionoutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletionoutputTypeBDSInternalSerializationElement(workitemcompletionoutputType newWorkitemcompletionoutputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newWorkitemcompletionoutputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletionoutputTypeBDSInternalSerializationElement(workitemcompletionoutputType newWorkitemcompletionoutputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newWorkitemcompletionoutputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionType getWorkitemcompletionTypeBDSInternalSerializationElement()
  {
    return (workitemcompletionType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletionTypeBDSInternalSerializationElement(workitemcompletionType newWorkitemcompletionTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newWorkitemcompletionTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletionTypeBDSInternalSerializationElement(workitemcompletionType newWorkitemcompletionTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SchemaPackage.Literals.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newWorkitemcompletionTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SchemaPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case SchemaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case SchemaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE:
        return basicSetCreateresource(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT:
        return basicSetCreateresourceinput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT:
        return basicSetCreateresourceoutput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FAULT:
        return basicSetFault(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE:
        return basicSetFetchresource(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT:
        return basicSetFetchresourceinput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT:
        return basicSetFetchresourceoutput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES:
        return basicSetGetprocessinstances(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT:
        return basicSetGetprocessinstancesinput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT:
        return basicSetGetprocessinstancesoutput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY:
        return basicSetLdapentry(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT:
        return basicSetLdapentryinput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT:
        return basicSetLdapentryinputrepeat(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV:
        return basicSetParsecsv(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING:
        return basicSetReesourcecreationandmapping(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION:
        return basicSetReportgeneration(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__ROOT:
        return basicSetRoot(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES:
        return basicSetSearchprocessinstances(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT:
        return basicSetSearchprocessinstancesinput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT:
        return basicSetSearchprocessinstancesoutput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION:
        return basicSetWorkitemcompletion(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT:
        return basicSetWorkitemcompletioninput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT:
        return basicSetWorkitemcompletionoutput(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCreateresourceinputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCreateresourceoutputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCreateresourceTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetFaultTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetFetchresourceinputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetFetchresourceoutputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetFetchresourceTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetGetprocessinstancesinputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetGetprocessinstancesoutputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetGetprocessinstancesTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetInputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetLdapentryinputrepeatTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetLdapentryinputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetLdapentryTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetParsecsvTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetPi_cancelledTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetPi_completeTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetPi_haltedTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetPi_startedTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetReesourcecreationandmappingTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetReportgenerationTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetResourceTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetRootTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSearchprocessinstancesinputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSearchprocessinstancesoutputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSearchprocessinstancesTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSearchrecordTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetUsersTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetWorkitemcompletioninputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetWorkitemcompletionoutputTypeBDSInternalSerializationElement(null, msgs);
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetWorkitemcompletionTypeBDSInternalSerializationElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SchemaPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case SchemaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case SchemaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE:
        return getCreateresource();
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT:
        return getCreateresourceinput();
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT:
        return getCreateresourceoutput();
      case SchemaPackage.DOCUMENT_ROOT__FAULT:
        return getFault();
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE:
        return getFetchresource();
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT:
        return getFetchresourceinput();
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT:
        return getFetchresourceoutput();
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES:
        return getGetprocessinstances();
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT:
        return getGetprocessinstancesinput();
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT:
        return getGetprocessinstancesoutput();
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY:
        return getLdapentry();
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT:
        return getLdapentryinput();
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT:
        return getLdapentryinputrepeat();
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYOUTPUT:
        return getLdapentryoutput();
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV:
        return getParsecsv();
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING:
        return getReesourcecreationandmapping();
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION:
        return getReportgeneration();
      case SchemaPackage.DOCUMENT_ROOT__ROOT:
        return getRoot();
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES:
        return getSearchprocessinstances();
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT:
        return getSearchprocessinstancesinput();
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT:
        return getSearchprocessinstancesoutput();
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION:
        return getWorkitemcompletion();
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT:
        return getWorkitemcompletioninput();
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT:
        return getWorkitemcompletionoutput();
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateresourceinputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateresourceoutputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateresourceTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFaultTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFetchresourceinputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFetchresourceoutputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFetchresourceTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetprocessinstancesinputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetprocessinstancesoutputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetprocessinstancesTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getInputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getLdapentryinputrepeatTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getLdapentryinputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getLdapentryTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getParsecsvTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_cancelledTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_completeTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_haltedTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_startedTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getReesourcecreationandmappingTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getReportgenerationTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getResourceTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getRootTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchprocessinstancesinputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchprocessinstancesoutputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchprocessinstancesTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchrecordTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getUsersTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWorkitemcompletioninputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWorkitemcompletionoutputTypeBDSInternalSerializationElement();
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWorkitemcompletionTypeBDSInternalSerializationElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SchemaPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE:
        setCreateresource((createresourceType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT:
        setCreateresourceinput((createresourceinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT:
        setCreateresourceoutput((createresourceoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FAULT:
        setFault((faultType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE:
        setFetchresource((fetchresourceType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT:
        setFetchresourceinput((fetchresourceinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT:
        setFetchresourceoutput((fetchresourceoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES:
        setGetprocessinstances((getprocessinstancesType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT:
        setGetprocessinstancesinput((getprocessinstancesinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT:
        setGetprocessinstancesoutput((getprocessinstancesoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY:
        setLdapentry((ldapentryType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT:
        setLdapentryinput((ldapentryinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT:
        setLdapentryinputrepeat((ldapentryinputrepeatType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYOUTPUT:
        setLdapentryoutput((String)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV:
        setParsecsv((parsecsvType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING:
        setReesourcecreationandmapping((reesourcecreationandmappingType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION:
        setReportgeneration((reportgenerationType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__ROOT:
        setRoot((rootType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES:
        setSearchprocessinstances((searchprocessinstancesType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT:
        setSearchprocessinstancesinput((searchprocessinstancesinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT:
        setSearchprocessinstancesoutput((searchprocessinstancesoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION:
        setWorkitemcompletion((workitemcompletionType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT:
        setWorkitemcompletioninput((workitemcompletioninputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT:
        setWorkitemcompletionoutput((workitemcompletionoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateresourceinputTypeBDSInternalSerializationElement((createresourceinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateresourceoutputTypeBDSInternalSerializationElement((createresourceoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateresourceTypeBDSInternalSerializationElement((createresourceType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFaultTypeBDSInternalSerializationElement((faultType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFetchresourceinputTypeBDSInternalSerializationElement((fetchresourceinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFetchresourceoutputTypeBDSInternalSerializationElement((fetchresourceoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFetchresourceTypeBDSInternalSerializationElement((fetchresourceType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetprocessinstancesinputTypeBDSInternalSerializationElement((getprocessinstancesinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetprocessinstancesoutputTypeBDSInternalSerializationElement((getprocessinstancesoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetprocessinstancesTypeBDSInternalSerializationElement((getprocessinstancesType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setInputTypeBDSInternalSerializationElement((inputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setLdapentryinputrepeatTypeBDSInternalSerializationElement((ldapentryinputrepeatType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setLdapentryinputTypeBDSInternalSerializationElement((ldapentryinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setLdapentryTypeBDSInternalSerializationElement((ldapentryType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setParsecsvTypeBDSInternalSerializationElement((parsecsvType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_cancelledTypeBDSInternalSerializationElement((pi_cancelledType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_completeTypeBDSInternalSerializationElement((pi_completeType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_haltedTypeBDSInternalSerializationElement((pi_haltedType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_startedTypeBDSInternalSerializationElement((pi_startedType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setReesourcecreationandmappingTypeBDSInternalSerializationElement((reesourcecreationandmappingType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setReportgenerationTypeBDSInternalSerializationElement((reportgenerationType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setResourceTypeBDSInternalSerializationElement((resourceType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setRootTypeBDSInternalSerializationElement((rootType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchprocessinstancesinputTypeBDSInternalSerializationElement((searchprocessinstancesinputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchprocessinstancesoutputTypeBDSInternalSerializationElement((searchprocessinstancesoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchprocessinstancesTypeBDSInternalSerializationElement((searchprocessinstancesType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchrecordTypeBDSInternalSerializationElement((searchrecordType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setUsersTypeBDSInternalSerializationElement((usersType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWorkitemcompletioninputTypeBDSInternalSerializationElement((workitemcompletioninputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWorkitemcompletionoutputTypeBDSInternalSerializationElement((workitemcompletionoutputType)newValue);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWorkitemcompletionTypeBDSInternalSerializationElement((workitemcompletionType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SchemaPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case SchemaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case SchemaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE:
        setCreateresource((createresourceType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT:
        setCreateresourceinput((createresourceinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT:
        setCreateresourceoutput((createresourceoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FAULT:
        setFault((faultType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE:
        setFetchresource((fetchresourceType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT:
        setFetchresourceinput((fetchresourceinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT:
        setFetchresourceoutput((fetchresourceoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES:
        setGetprocessinstances((getprocessinstancesType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT:
        setGetprocessinstancesinput((getprocessinstancesinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT:
        setGetprocessinstancesoutput((getprocessinstancesoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY:
        setLdapentry((ldapentryType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT:
        setLdapentryinput((ldapentryinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT:
        setLdapentryinputrepeat((ldapentryinputrepeatType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYOUTPUT:
        setLdapentryoutput(LDAPENTRYOUTPUT_EDEFAULT);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV:
        setParsecsv((parsecsvType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING:
        setReesourcecreationandmapping((reesourcecreationandmappingType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION:
        setReportgeneration((reportgenerationType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__ROOT:
        setRoot((rootType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES:
        setSearchprocessinstances((searchprocessinstancesType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT:
        setSearchprocessinstancesinput((searchprocessinstancesinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT:
        setSearchprocessinstancesoutput((searchprocessinstancesoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION:
        setWorkitemcompletion((workitemcompletionType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT:
        setWorkitemcompletioninput((workitemcompletioninputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT:
        setWorkitemcompletionoutput((workitemcompletionoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateresourceinputTypeBDSInternalSerializationElement((createresourceinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateresourceoutputTypeBDSInternalSerializationElement((createresourceoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateresourceTypeBDSInternalSerializationElement((createresourceType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFaultTypeBDSInternalSerializationElement((faultType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFetchresourceinputTypeBDSInternalSerializationElement((fetchresourceinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFetchresourceoutputTypeBDSInternalSerializationElement((fetchresourceoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setFetchresourceTypeBDSInternalSerializationElement((fetchresourceType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetprocessinstancesinputTypeBDSInternalSerializationElement((getprocessinstancesinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetprocessinstancesoutputTypeBDSInternalSerializationElement((getprocessinstancesoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetprocessinstancesTypeBDSInternalSerializationElement((getprocessinstancesType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setInputTypeBDSInternalSerializationElement((inputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setLdapentryinputrepeatTypeBDSInternalSerializationElement((ldapentryinputrepeatType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setLdapentryinputTypeBDSInternalSerializationElement((ldapentryinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setLdapentryTypeBDSInternalSerializationElement((ldapentryType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setParsecsvTypeBDSInternalSerializationElement((parsecsvType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_cancelledTypeBDSInternalSerializationElement((pi_cancelledType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_completeTypeBDSInternalSerializationElement((pi_completeType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_haltedTypeBDSInternalSerializationElement((pi_haltedType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPi_startedTypeBDSInternalSerializationElement((pi_startedType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setReesourcecreationandmappingTypeBDSInternalSerializationElement((reesourcecreationandmappingType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setReportgenerationTypeBDSInternalSerializationElement((reportgenerationType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setResourceTypeBDSInternalSerializationElement((resourceType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setRootTypeBDSInternalSerializationElement((rootType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchprocessinstancesinputTypeBDSInternalSerializationElement((searchprocessinstancesinputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchprocessinstancesoutputTypeBDSInternalSerializationElement((searchprocessinstancesoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchprocessinstancesTypeBDSInternalSerializationElement((searchprocessinstancesType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchrecordTypeBDSInternalSerializationElement((searchrecordType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setUsersTypeBDSInternalSerializationElement((usersType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWorkitemcompletioninputTypeBDSInternalSerializationElement((workitemcompletioninputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWorkitemcompletionoutputTypeBDSInternalSerializationElement((workitemcompletionoutputType)null);
        return;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWorkitemcompletionTypeBDSInternalSerializationElement((workitemcompletionType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SchemaPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case SchemaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case SchemaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE:
        return getCreateresource() != null;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT:
        return getCreateresourceinput() != null;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT:
        return getCreateresourceoutput() != null;
      case SchemaPackage.DOCUMENT_ROOT__FAULT:
        return getFault() != null;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE:
        return getFetchresource() != null;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT:
        return getFetchresourceinput() != null;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT:
        return getFetchresourceoutput() != null;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES:
        return getGetprocessinstances() != null;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT:
        return getGetprocessinstancesinput() != null;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT:
        return getGetprocessinstancesoutput() != null;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY:
        return getLdapentry() != null;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT:
        return getLdapentryinput() != null;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT:
        return getLdapentryinputrepeat() != null;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYOUTPUT:
        return LDAPENTRYOUTPUT_EDEFAULT == null ? getLdapentryoutput() != null : !LDAPENTRYOUTPUT_EDEFAULT.equals(getLdapentryoutput());
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV:
        return getParsecsv() != null;
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING:
        return getReesourcecreationandmapping() != null;
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION:
        return getReportgeneration() != null;
      case SchemaPackage.DOCUMENT_ROOT__ROOT:
        return getRoot() != null;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES:
        return getSearchprocessinstances() != null;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT:
        return getSearchprocessinstancesinput() != null;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT:
        return getSearchprocessinstancesoutput() != null;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION:
        return getWorkitemcompletion() != null;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT:
        return getWorkitemcompletioninput() != null;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT:
        return getWorkitemcompletionoutput() != null;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateresourceinputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateresourceoutputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateresourceTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFaultTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFetchresourceinputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFetchresourceoutputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getFetchresourceTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetprocessinstancesinputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetprocessinstancesoutputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetprocessinstancesTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getInputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getLdapentryinputrepeatTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getLdapentryinputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getLdapentryTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getParsecsvTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_cancelledTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_completeTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_haltedTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPi_startedTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getReesourcecreationandmappingTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getReportgenerationTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getResourceTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getRootTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchprocessinstancesinputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchprocessinstancesoutputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchprocessinstancesTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchrecordTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getUsersTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWorkitemcompletioninputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWorkitemcompletionoutputTypeBDSInternalSerializationElement() != null;
      case SchemaPackage.DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWorkitemcompletionTypeBDSInternalSerializationElement() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
