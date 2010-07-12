package org.axdt.asdoc.access;

import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.access.IDefinitionProvider;

public interface IAsdocDefinitionProvider extends IDefinitionProvider {
	Iterable<AsdocRoot> getDocRoots();
}
