
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.resourceTypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.resourceTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.resourceTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class resourceTypeImpl extends EObjectImpl implements resourceType
{
  /**
   * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuid()
   * @generated
   * @ordered
   */
  protected static final String GUID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuid()
   * @generated
   * @ordered
   */
  protected String guid = GUID_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected resourceTypeImpl()
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
    return SchemaPackage.Literals.RESOURCE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGuid()
  {
    return guid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuid(String newGuid)
  {
    String oldGuid = guid;
    guid = newGuid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESOURCE_TYPE__GUID, oldGuid, guid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESOURCE_TYPE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESOURCE_TYPE__NAME, oldName, name));
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
      case SchemaPackage.RESOURCE_TYPE__GUID:
        return getGuid();
      case SchemaPackage.RESOURCE_TYPE__LABEL:
        return getLabel();
      case SchemaPackage.RESOURCE_TYPE__NAME:
        return getName();
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
      case SchemaPackage.RESOURCE_TYPE__GUID:
        setGuid((String)newValue);
        return;
      case SchemaPackage.RESOURCE_TYPE__LABEL:
        setLabel((String)newValue);
        return;
      case SchemaPackage.RESOURCE_TYPE__NAME:
        setName((String)newValue);
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
      case SchemaPackage.RESOURCE_TYPE__GUID:
        setGuid(GUID_EDEFAULT);
        return;
      case SchemaPackage.RESOURCE_TYPE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SchemaPackage.RESOURCE_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case SchemaPackage.RESOURCE_TYPE__GUID:
        return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
      case SchemaPackage.RESOURCE_TYPE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SchemaPackage.RESOURCE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (guid: ");
    result.append(guid);
    result.append(", label: ");
    result.append(label);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setGuid(Object value)
  {
    // Call the default set, passing in the converted value
    setGuid(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setLabel(Object value)
  {
    // Call the default set, passing in the converted value
    setLabel(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setName(Object value)
  {
    // Call the default set, passing in the converted value
    setName(BDSTypeConversions.convertToString(value));
  }
} //resourceTypeImpl
