package org.axdt.core.ui.img;

import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import org.axdt.core.ui.CoreUiActivator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

import com.google.common.collect.Maps;

/**
 * @author mb0
 */
public class AxdtImageHelper implements BundleListener, AxdtImages {
	private static AxdtImageHelper instance;

	private final AbstractUIPlugin plugin;
	private final String pathSuffix = "icons/";
	private final Map<ImageDescriptor, Image> registry = Maps.newHashMap();
	
	public static AxdtImageHelper getInstance() {
		if (instance == null)
			instance = new AxdtImageHelper();
		return instance;
	}

	private AxdtImageHelper() {
		plugin = CoreUiActivator.getPlugin();
		plugin.getBundle().getBundleContext().addBundleListener(this);
	}

	public Image getImage(ImageDescriptor descriptor) {
		if (descriptor == null) {
			descriptor = ImageDescriptor.getMissingImageDescriptor();
		}
		synchronized (registry) {
			Image result = registry.get(descriptor);
			if (result != null) {
				return result;
			}
			result = descriptor.createImage();
			if (result != null) {
				registry.put(descriptor, result);
			}
			return result;
		}
	}

	public void dispose() {
		// in case another plug-in stop triggered the disposal
		plugin.getBundle().getBundleContext().removeBundleListener(this);
		synchronized (registry) {
			for (Iterator<Image> iter = registry.values().iterator(); iter
					.hasNext();) {
				Image image = iter.next();
				image.dispose();
			}
			registry.clear();
		}
	}

	public Image getImage(String imageName) {
		String imgname = imageName == null ? DEFAULT : imageName;
		if (imgname != null) {
			Image result = null;
			URL imgUrl = plugin.getBundle().getEntry(pathSuffix + imgname);
			if (imgUrl != null) {
				ImageDescriptor id = null;
				result = plugin.getImageRegistry().get(imgUrl.toExternalForm());
				if (result == null) {
					id = ImageDescriptor.createFromURL(imgUrl);
					if (id != null) {
						result = id.createImage();
						plugin.getImageRegistry().put(imgUrl.toExternalForm(),
								result);
					}
				}
				return result;
			}
			if (!imgname.equals(NOT_FOUND)) {
				return getImage(NOT_FOUND);
			}
		}
		return null;
	}

	public void bundleChanged(BundleEvent event) {
		if (event.getType() == BundleEvent.STOPPED) {
			dispose();
		}
	}
}
