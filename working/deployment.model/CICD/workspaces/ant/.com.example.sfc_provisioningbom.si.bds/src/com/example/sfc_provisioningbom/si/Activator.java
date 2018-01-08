package com.example.sfc_provisioningbom.si;

import java.util.Dictionary;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static String bundleVersion;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

	public static String getBundleVersion() {
		if (getContext() != null) {
			if (bundleVersion == null) {
				Bundle bundle = getContext().getBundle();
				Dictionary<?, ?> headers = bundle.getHeaders();
				Object bvValue = headers.get(Constants.BUNDLE_VERSION);
				if (bvValue != null) {
					bundleVersion = (String) bvValue;
				}
			}
		} else {
			bundleVersion = null;
		}
		return bundleVersion;
	}
}
