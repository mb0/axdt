package org.axdt.common.config;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Maps;

public interface IAxdtConfigProvider {
	String EXTENSION_ID = "org.axdt.core.runtime.configProvider";
	String EXTENSION_CONFIG_ID = "id";
	String EXTENSION_CONFIG_CLASS = "class";
	
	IAxdtConfig getAxdtConfig(String name);
	
	class ExtensionDelegate implements IAxdtConfigProvider {
		private final Map<String,IAxdtConfig> axdtConfigs = Maps.newHashMap();
		public IAxdtConfig getAxdtConfig(String configId) {
			if (!axdtConfigs.containsKey(configId)) {
				IAxdtConfig config = getContribution(configId);
				if (config != null)
					axdtConfigs.put(configId, config);
			}
			return axdtConfigs.get(configId);
		}
		protected IAxdtConfig getContribution(String configId) {
			IConfigurationElement contribution = getConfiguration(configId);
			if (contribution == null) return null;
			try {
				Object extension = contribution.createExecutableExtension(EXTENSION_CONFIG_CLASS);
				if (extension != null && extension instanceof IAxdtConfig)
					return (IAxdtConfig) extension;
			} catch (CoreException e) {
				Logger.getLogger(getClass()).error(e);
			}
			return null;
		}
		protected IConfigurationElement getConfiguration(String configId) {
			if (configId == null) return null;
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			for (IConfigurationElement element : registry.getConfigurationElementsFor(EXTENSION_ID)) {
				if (configId.equals(element.getAttribute(EXTENSION_CONFIG_ID)))
					return element;
			}
			return null;
		}
	}
}
