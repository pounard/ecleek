/*
 * generated by Xtext
 */
package org.processus.ecleek.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.processus.ecleek.ui.internal.LeekActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LeekExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LeekActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LeekActivator.getInstance().getInjector(LeekActivator.ORG_PROCESSUS_ECLEEK_LEEK);
	}
	
}
