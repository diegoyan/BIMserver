/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store;

import org.bimserver.emf.IdEObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getId <em>Id</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getProject <em>Project</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#isFinalized <em>Finalized</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.database.store.StorePackage#getConcreteRevision()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface ConcreteRevision extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.database.store.Project#getConcreteRevisions <em>Concrete Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Project()
	 * @see org.bimserver.database.store.Project#getConcreteRevisions
	 * @model opposite="concreteRevisions" required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Finalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalized</em>' attribute.
	 * @see #setFinalized(boolean)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Finalized()
	 * @model
	 * @generated
	 */
	boolean isFinalized();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#isFinalized <em>Finalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalized</em>' attribute.
	 * @see #isFinalized()
	 * @generated
	 */
	void setFinalized(boolean value);

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(byte[])
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Checksum()
	 * @model
	 * @generated
	 */
	byte[] getChecksum();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(byte[] value);

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.database.store.Revision}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.database.store.Revision#getConcreteRevisions <em>Concrete Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Revisions()
	 * @see org.bimserver.database.store.Revision#getConcreteRevisions
	 * @model opposite="concreteRevisions"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // ConcreteRevision
