package com.eclipsesource.example.modelserver;

import org.eclipse.emfcloud.modelserver.common.utils.MultiBinding;
import org.eclipse.emfcloud.modelserver.emf.configuration.EPackageConfiguration;
import org.eclipse.emfcloud.modelserver.emf.di.DefaultModelServerModule;

public class ExampleModelServerModule extends DefaultModelServerModule {

	@Override
	protected void configureEPackages(final MultiBinding<EPackageConfiguration> binding) {
		super.configureEPackages(binding);
		binding.add(ExampleModelEPackageConfiguration.class);
	}

}
