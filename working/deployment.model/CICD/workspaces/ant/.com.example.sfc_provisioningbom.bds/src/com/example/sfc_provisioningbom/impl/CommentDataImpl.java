
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.CommentData;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;

import com.example.sfc_provisioningbom.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.CommentDataImpl#getAddedby <em>Addedby</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.CommentDataImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.CommentDataImpl#getStepName <em>Step Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.CommentDataImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class CommentDataImpl extends EObjectImpl implements CommentData
{
  /**
   * The default value of the '{@link #getAddedby() <em>Addedby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddedby()
   * @generated
   * @ordered
   */
  protected static final String ADDEDBY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddedby() <em>Addedby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddedby()
   * @generated
   * @ordered
   */
  protected String addedby = ADDEDBY_EDEFAULT;

  /**
   * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected static final String COMMENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected String comments = COMMENTS_EDEFAULT;

  /**
   * The default value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStepName()
   * @generated
   * @ordered
   */
  protected static final String STEP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStepName()
   * @generated
   * @ordered
   */
  protected String stepName = STEP_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final String TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected String time = TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommentDataImpl()
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
    return Sfc_provisioningbomPackage.Literals.COMMENT_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddedby()
  {
    return addedby;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddedby(String newAddedby)
  {
    String oldAddedby = addedby;
    addedby = newAddedby;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.COMMENT_DATA__ADDEDBY, oldAddedby, addedby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComments()
  {
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComments(String newComments)
  {
    String oldComments = comments;
    comments = newComments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.COMMENT_DATA__COMMENTS, oldComments, comments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStepName()
  {
    return stepName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStepName(String newStepName)
  {
    String oldStepName = stepName;
    stepName = newStepName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.COMMENT_DATA__STEP_NAME, oldStepName, stepName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(String newTime)
  {
    String oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.COMMENT_DATA__TIME, oldTime, time));
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
      case Sfc_provisioningbomPackage.COMMENT_DATA__ADDEDBY:
        return getAddedby();
      case Sfc_provisioningbomPackage.COMMENT_DATA__COMMENTS:
        return getComments();
      case Sfc_provisioningbomPackage.COMMENT_DATA__STEP_NAME:
        return getStepName();
      case Sfc_provisioningbomPackage.COMMENT_DATA__TIME:
        return getTime();
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
      case Sfc_provisioningbomPackage.COMMENT_DATA__ADDEDBY:
        setAddedby((String)newValue);
        return;
      case Sfc_provisioningbomPackage.COMMENT_DATA__COMMENTS:
        setComments((String)newValue);
        return;
      case Sfc_provisioningbomPackage.COMMENT_DATA__STEP_NAME:
        setStepName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.COMMENT_DATA__TIME:
        setTime((String)newValue);
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
      case Sfc_provisioningbomPackage.COMMENT_DATA__ADDEDBY:
        setAddedby(ADDEDBY_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.COMMENT_DATA__COMMENTS:
        setComments(COMMENTS_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.COMMENT_DATA__STEP_NAME:
        setStepName(STEP_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.COMMENT_DATA__TIME:
        setTime(TIME_EDEFAULT);
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
      case Sfc_provisioningbomPackage.COMMENT_DATA__ADDEDBY:
        return ADDEDBY_EDEFAULT == null ? addedby != null : !ADDEDBY_EDEFAULT.equals(addedby);
      case Sfc_provisioningbomPackage.COMMENT_DATA__COMMENTS:
        return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
      case Sfc_provisioningbomPackage.COMMENT_DATA__STEP_NAME:
        return STEP_NAME_EDEFAULT == null ? stepName != null : !STEP_NAME_EDEFAULT.equals(stepName);
      case Sfc_provisioningbomPackage.COMMENT_DATA__TIME:
        return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
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
    result.append(" (addedby: ");
    result.append(addedby);
    result.append(", comments: ");
    result.append(comments);
    result.append(", stepName: ");
    result.append(stepName);
    result.append(", time: ");
    result.append(time);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setAddedby(Object value)
  {
    // Call the default set, passing in the converted value
    setAddedby(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setComments(Object value)
  {
    // Call the default set, passing in the converted value
    setComments(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setStepName(Object value)
  {
    // Call the default set, passing in the converted value
    setStepName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setTime(Object value)
  {
    // Call the default set, passing in the converted value
    setTime(BDSTypeConversions.convertToString(value));
  }
} //CommentDataImpl
