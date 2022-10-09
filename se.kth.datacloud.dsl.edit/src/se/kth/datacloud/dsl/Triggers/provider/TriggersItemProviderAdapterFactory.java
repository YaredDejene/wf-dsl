/**
 */
package se.kth.datacloud.dsl.Triggers.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import se.kth.datacloud.dsl.Triggers.util.TriggersAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggersItemProviderAdapterFactory extends TriggersAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.ScheduleTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTriggerItemProvider scheduleTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.ScheduleTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduleTriggerAdapter() {
		if (scheduleTriggerItemProvider == null) {
			scheduleTriggerItemProvider = new ScheduleTriggerItemProvider(this);
		}

		return scheduleTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.ExternalEventTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalEventTriggerItemProvider externalEventTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.ExternalEventTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalEventTriggerAdapter() {
		if (externalEventTriggerItemProvider == null) {
			externalEventTriggerItemProvider = new ExternalEventTriggerItemProvider(this);
		}

		return externalEventTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.OneTimeTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneTimeTriggerItemProvider oneTimeTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.OneTimeTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOneTimeTriggerAdapter() {
		if (oneTimeTriggerItemProvider == null) {
			oneTimeTriggerItemProvider = new OneTimeTriggerItemProvider(this);
		}

		return oneTimeTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.CronScheduleTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CronScheduleTriggerItemProvider cronScheduleTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.CronScheduleTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCronScheduleTriggerAdapter() {
		if (cronScheduleTriggerItemProvider == null) {
			cronScheduleTriggerItemProvider = new CronScheduleTriggerItemProvider(this);
		}

		return cronScheduleTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalScheduleTriggerItemProvider intervalScheduleTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervalScheduleTriggerAdapter() {
		if (intervalScheduleTriggerItemProvider == null) {
			intervalScheduleTriggerItemProvider = new IntervalScheduleTriggerItemProvider(this);
		}

		return intervalScheduleTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollDatabaseTriggerItemProvider pollDatabaseTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPollDatabaseTriggerAdapter() {
		if (pollDatabaseTriggerItemProvider == null) {
			pollDatabaseTriggerItemProvider = new PollDatabaseTriggerItemProvider(this);
		}

		return pollDatabaseTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollMessageQueueTriggerItemProvider pollMessageQueueTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPollMessageQueueTriggerAdapter() {
		if (pollMessageQueueTriggerItemProvider == null) {
			pollMessageQueueTriggerItemProvider = new PollMessageQueueTriggerItemProvider(this);
		}

		return pollMessageQueueTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollWebServiceTriggerItemProvider pollWebServiceTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPollWebServiceTriggerAdapter() {
		if (pollWebServiceTriggerItemProvider == null) {
			pollWebServiceTriggerItemProvider = new PollWebServiceTriggerItemProvider(this);
		}

		return pollWebServiceTriggerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (scheduleTriggerItemProvider != null) scheduleTriggerItemProvider.dispose();
		if (externalEventTriggerItemProvider != null) externalEventTriggerItemProvider.dispose();
		if (oneTimeTriggerItemProvider != null) oneTimeTriggerItemProvider.dispose();
		if (cronScheduleTriggerItemProvider != null) cronScheduleTriggerItemProvider.dispose();
		if (intervalScheduleTriggerItemProvider != null) intervalScheduleTriggerItemProvider.dispose();
		if (pollDatabaseTriggerItemProvider != null) pollDatabaseTriggerItemProvider.dispose();
		if (pollMessageQueueTriggerItemProvider != null) pollMessageQueueTriggerItemProvider.dispose();
		if (pollWebServiceTriggerItemProvider != null) pollWebServiceTriggerItemProvider.dispose();
	}

}