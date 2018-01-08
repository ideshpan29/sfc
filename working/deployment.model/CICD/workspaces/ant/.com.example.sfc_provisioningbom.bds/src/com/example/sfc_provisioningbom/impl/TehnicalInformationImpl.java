
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.EquipmentDetails;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;
import com.example.sfc_provisioningbom.TehnicalInformation;

import com.example.sfc_provisioningbom.bdsutil.BDSCopyUtil;

import com.example.sfc_provisioningbom.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import com.example.sfc_provisioningbom.bdsutil.BDSNotifyingCalendar;
import com.example.sfc_provisioningbom.bdsutil.BDSTypeConversions;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tehnical Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getCarrierVLAN <em>Carrier VLAN</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getCarrierIP <em>Carrier IP</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getAggPoint <em>Agg Point</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getClientVLAN <em>Client VLAN</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getClientIP <em>Client IP</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getSFCPOPPE <em>SFCPOPPE</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl#getModifiedDate <em>Modified Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class TehnicalInformationImpl extends EObjectImpl implements TehnicalInformation
{
  /**
   * The default value of the '{@link #getCarrierVLAN() <em>Carrier VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarrierVLAN()
   * @generated
   * @ordered
   */
  protected static final String CARRIER_VLAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarrierVLAN() <em>Carrier VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarrierVLAN()
   * @generated
   * @ordered
   */
  protected String carrierVLAN = CARRIER_VLAN_EDEFAULT;

  /**
   * The default value of the '{@link #getCarrierIP() <em>Carrier IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarrierIP()
   * @generated
   * @ordered
   */
  protected static final String CARRIER_IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarrierIP() <em>Carrier IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarrierIP()
   * @generated
   * @ordered
   */
  protected String carrierIP = CARRIER_IP_EDEFAULT;

  /**
   * The default value of the '{@link #getAggPoint() <em>Agg Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggPoint()
   * @generated
   * @ordered
   */
  protected static final String AGG_POINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAggPoint() <em>Agg Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggPoint()
   * @generated
   * @ordered
   */
  protected String aggPoint = AGG_POINT_EDEFAULT;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final String PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected String port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getClientVLAN() <em>Client VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientVLAN()
   * @generated
   * @ordered
   */
  protected static final String CLIENT_VLAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClientVLAN() <em>Client VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientVLAN()
   * @generated
   * @ordered
   */
  protected String clientVLAN = CLIENT_VLAN_EDEFAULT;

  /**
   * The default value of the '{@link #getClientIP() <em>Client IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientIP()
   * @generated
   * @ordered
   */
  protected static final String CLIENT_IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClientIP() <em>Client IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientIP()
   * @generated
   * @ordered
   */
  protected String clientIP = CLIENT_IP_EDEFAULT;

  /**
   * The default value of the '{@link #getSFCPOPPE() <em>SFCPOPPE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSFCPOPPE()
   * @generated
   * @ordered
   */
  protected static final String SFCPOPPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSFCPOPPE() <em>SFCPOPPE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSFCPOPPE()
   * @generated
   * @ordered
   */
  protected String sfcpoppe = SFCPOPPE_EDEFAULT;

  /**
   * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortType()
   * @generated
   * @ordered
   */
  protected static final String PORT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortType()
   * @generated
   * @ordered
   */
  protected String portType = PORT_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquipment()
   * @generated
   * @ordered
   */
  protected EList<EquipmentDetails> equipment;

  /**
   * The default value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiedBy()
   * @generated
   * @ordered
   */
  protected static final String MODIFIED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiedBy()
   * @generated
   * @ordered
   */
  protected String modifiedBy = MODIFIED_BY_EDEFAULT;

  /**
   * The default value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiedDate()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar MODIFIED_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiedDate()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar modifiedDate = MODIFIED_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TehnicalInformationImpl()
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
    return Sfc_provisioningbomPackage.Literals.TEHNICAL_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCarrierVLAN()
  {
    return carrierVLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCarrierVLAN(String newCarrierVLAN)
  {
    String oldCarrierVLAN = carrierVLAN;
    carrierVLAN = newCarrierVLAN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_VLAN, oldCarrierVLAN, carrierVLAN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCarrierIP()
  {
    return carrierIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCarrierIP(String newCarrierIP)
  {
    String oldCarrierIP = carrierIP;
    carrierIP = newCarrierIP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_IP, oldCarrierIP, carrierIP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAggPoint()
  {
    return aggPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggPoint(String newAggPoint)
  {
    String oldAggPoint = aggPoint;
    aggPoint = newAggPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__AGG_POINT, oldAggPoint, aggPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(String newPort)
  {
    String oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClientVLAN()
  {
    return clientVLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientVLAN(String newClientVLAN)
  {
    String oldClientVLAN = clientVLAN;
    clientVLAN = newClientVLAN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_VLAN, oldClientVLAN, clientVLAN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClientIP()
  {
    return clientIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientIP(String newClientIP)
  {
    String oldClientIP = clientIP;
    clientIP = newClientIP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_IP, oldClientIP, clientIP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSFCPOPPE()
  {
    return sfcpoppe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSFCPOPPE(String newSFCPOPPE)
  {
    String oldSFCPOPPE = sfcpoppe;
    sfcpoppe = newSFCPOPPE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__SFCPOPPE, oldSFCPOPPE, sfcpoppe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPortType()
  {
    return portType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortType(String newPortType)
  {
    String oldPortType = portType;
    portType = newPortType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT_TYPE, oldPortType, portType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EquipmentDetails> getEquipment()
  {
    if (equipment == null)
    {
      equipment = new BDSEObjectContainmentEList<EquipmentDetails>(EquipmentDetails.class, this, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__EQUIPMENT);
    }
    return equipment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModifiedBy()
  {
    return modifiedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifiedBy(String newModifiedBy)
  {
    String oldModifiedBy = modifiedBy;
    modifiedBy = newModifiedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_BY, oldModifiedBy, modifiedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getModifiedDate()
  {
    return modifiedDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifiedDate(XMLGregorianCalendar newModifiedDate)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newModifiedDate != modifiedDate)
    { 
      if (modifiedDate instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)modifiedDate).cancelNotification();
      }
      if (newModifiedDate != null)
      {
        newModifiedDate = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newModifiedDate), this, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_DATE);
      }
    }
    XMLGregorianCalendar oldModifiedDate = modifiedDate;
    modifiedDate = newModifiedDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_DATE, oldModifiedDate, modifiedDate));
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
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__EQUIPMENT:
        return ((InternalEList<?>)getEquipment()).basicRemove(otherEnd, msgs);
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
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_VLAN:
        return getCarrierVLAN();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_IP:
        return getCarrierIP();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__AGG_POINT:
        return getAggPoint();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT:
        return getPort();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_VLAN:
        return getClientVLAN();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_IP:
        return getClientIP();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__SFCPOPPE:
        return getSFCPOPPE();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT_TYPE:
        return getPortType();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__EQUIPMENT:
        return getEquipment();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_BY:
        return getModifiedBy();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_DATE:
        return getModifiedDate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_VLAN:
        setCarrierVLAN((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_IP:
        setCarrierIP((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__AGG_POINT:
        setAggPoint((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT:
        setPort((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_VLAN:
        setClientVLAN((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_IP:
        setClientIP((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__SFCPOPPE:
        setSFCPOPPE((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT_TYPE:
        setPortType((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__EQUIPMENT:
        getEquipment().clear();
        getEquipment().addAll((Collection<? extends EquipmentDetails>)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_BY:
        setModifiedBy((String)newValue);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_DATE:
        setModifiedDate((XMLGregorianCalendar)newValue);
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
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_VLAN:
        setCarrierVLAN(CARRIER_VLAN_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_IP:
        setCarrierIP(CARRIER_IP_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__AGG_POINT:
        setAggPoint(AGG_POINT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_VLAN:
        setClientVLAN(CLIENT_VLAN_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_IP:
        setClientIP(CLIENT_IP_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__SFCPOPPE:
        setSFCPOPPE(SFCPOPPE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT_TYPE:
        setPortType(PORT_TYPE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__EQUIPMENT:
        getEquipment().clear();
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_BY:
        setModifiedBy(MODIFIED_BY_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_DATE:
        setModifiedDate(MODIFIED_DATE_EDEFAULT);
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
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_VLAN:
        return CARRIER_VLAN_EDEFAULT == null ? carrierVLAN != null : !CARRIER_VLAN_EDEFAULT.equals(carrierVLAN);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CARRIER_IP:
        return CARRIER_IP_EDEFAULT == null ? carrierIP != null : !CARRIER_IP_EDEFAULT.equals(carrierIP);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__AGG_POINT:
        return AGG_POINT_EDEFAULT == null ? aggPoint != null : !AGG_POINT_EDEFAULT.equals(aggPoint);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT:
        return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_VLAN:
        return CLIENT_VLAN_EDEFAULT == null ? clientVLAN != null : !CLIENT_VLAN_EDEFAULT.equals(clientVLAN);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__CLIENT_IP:
        return CLIENT_IP_EDEFAULT == null ? clientIP != null : !CLIENT_IP_EDEFAULT.equals(clientIP);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__SFCPOPPE:
        return SFCPOPPE_EDEFAULT == null ? sfcpoppe != null : !SFCPOPPE_EDEFAULT.equals(sfcpoppe);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__PORT_TYPE:
        return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__EQUIPMENT:
        return equipment != null && !equipment.isEmpty();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_BY:
        return MODIFIED_BY_EDEFAULT == null ? modifiedBy != null : !MODIFIED_BY_EDEFAULT.equals(modifiedBy);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION__MODIFIED_DATE:
        return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
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
    result.append(" (carrierVLAN: ");
    result.append(carrierVLAN);
    result.append(", carrierIP: ");
    result.append(carrierIP);
    result.append(", aggPoint: ");
    result.append(aggPoint);
    result.append(", port: ");
    result.append(port);
    result.append(", clientVLAN: ");
    result.append(clientVLAN);
    result.append(", clientIP: ");
    result.append(clientIP);
    result.append(", SFCPOPPE: ");
    result.append(sfcpoppe);
    result.append(", portType: ");
    result.append(portType);
    result.append(", modifiedBy: ");
    result.append(modifiedBy);
    result.append(", modifiedDate: ");
    result.append(modifiedDate);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setCarrierVLAN(Object value)
  {
    // Call the default set, passing in the converted value
    setCarrierVLAN(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setCarrierIP(Object value)
  {
    // Call the default set, passing in the converted value
    setCarrierIP(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setAggPoint(Object value)
  {
    // Call the default set, passing in the converted value
    setAggPoint(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setPort(Object value)
  {
    // Call the default set, passing in the converted value
    setPort(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setClientVLAN(Object value)
  {
    // Call the default set, passing in the converted value
    setClientVLAN(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setClientIP(Object value)
  {
    // Call the default set, passing in the converted value
    setClientIP(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setSFCPOPPE(Object value)
  {
    // Call the default set, passing in the converted value
    setSFCPOPPE(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setPortType(Object value)
  {
    // Call the default set, passing in the converted value
    setPortType(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setModifiedBy(Object value)
  {
    // Call the default set, passing in the converted value
    setModifiedBy(BDSTypeConversions.convertToString(value));
  }
} //TehnicalInformationImpl
