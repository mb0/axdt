package org.axdt.core.swf;

import java.net.URL;

import org.axdt.common.IAxdtExtension;

/**
 * @author nkuebler
 * @author mb0
 */
public interface IAxdtSwfPlayer extends IAxdtExtension {
	String EXTENSION_ID = "org.axdt.core.runtime.swfPlayer";
	
	IAxdtSwfPlayerInstance launch(URL target) throws Exception;
	boolean isAvailable();
}
