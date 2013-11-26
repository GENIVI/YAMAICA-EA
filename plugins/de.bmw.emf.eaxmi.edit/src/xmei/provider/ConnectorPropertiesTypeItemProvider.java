/**
 */
package xmei.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.provider.Franca2EA_XMI_SchemaEditPlugin;

import xmei.ConnectorPropertiesType;
import xmei.XmeiPackage;

/**
 * This is the item provider adapter for a {@link xmei.ConnectorPropertiesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorPropertiesTypeItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorPropertiesTypeItemProvider(AdapterFactory adapterFactory)
    {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
    {
        if (itemPropertyDescriptors == null)
        {
            super.getPropertyDescriptors(object);

            addDirectionPropertyDescriptor(object);
            addEaTypePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addStereotypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Direction feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectionPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorPropertiesType_direction_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorPropertiesType_direction_feature", "_UI_ConnectorPropertiesType_type"),
                 XmeiPackage.Literals.CONNECTOR_PROPERTIES_TYPE__DIRECTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ea Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEaTypePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorPropertiesType_eaType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorPropertiesType_eaType_feature", "_UI_ConnectorPropertiesType_type"),
                 XmeiPackage.Literals.CONNECTOR_PROPERTIES_TYPE__EA_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorPropertiesType_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorPropertiesType_name_feature", "_UI_ConnectorPropertiesType_type"),
                 XmeiPackage.Literals.CONNECTOR_PROPERTIES_TYPE__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Stereotype feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStereotypePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorPropertiesType_stereotype_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorPropertiesType_stereotype_feature", "_UI_ConnectorPropertiesType_type"),
                 XmeiPackage.Literals.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ConnectorPropertiesType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectorPropertiesType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object)
    {
        String label = ((ConnectorPropertiesType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ConnectorPropertiesType_type") :
            getString("_UI_ConnectorPropertiesType_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification)
    {
        updateChildren(notification);

        switch (notification.getFeatureID(ConnectorPropertiesType.class))
        {
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__DIRECTION:
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__EA_TYPE:
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__NAME:
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
    {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator()
    {
        return Franca2EA_XMI_SchemaEditPlugin.INSTANCE;
    }

}