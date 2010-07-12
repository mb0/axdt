package org.axdt.common.config;

import org.eclipse.core.resources.IResource;

public interface IAxdtConfig {
	String getConfigId();
	
    boolean getBoolean(IResource resource, String name);
    int getInt(IResource resource, String name);
    double getDouble(IResource resource, String name);
	String getString(IResource resource, String name);
}
