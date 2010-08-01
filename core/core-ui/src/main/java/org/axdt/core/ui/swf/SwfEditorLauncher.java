/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.ui.swf;

import java.net.MalformedURLException;
import java.net.URL;

import org.axdt.core.swf.IAxdtSwfPlayer;
import org.axdt.core.swf.IAxdtSwfPlayerInstance;
import org.axdt.core.ui.preferences.CorePreferences;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.PlatformUI;

/**
 * @author mb0
 */
public class SwfEditorLauncher implements IEditorLauncher {

	protected String playerId;

	public SwfEditorLauncher() {
		this(CorePreferences.CHOICE_PREFERENCE);
	}

	public SwfEditorLauncher(String playerId) {
		this.playerId = playerId;
	}

	public void open(IPath file) {
		try {
			open(file.toFile().toURL());
		} catch (MalformedURLException e) {
			MessageDialog.openError(PlatformUI.getWorkbench().getDisplay()
					.getActiveShell(), "Error opening browser at path ",
					e.getLocalizedMessage());
		}
	}

	public IAxdtSwfPlayerInstance open(URL url) {
		CorePreferences corePref = CorePreferences.getInstance();
		if (CorePreferences.CHOICE_PREFERENCE.equals(playerId)
				|| playerId == null) {
			IPreferenceStore store = corePref.getStore();
			playerId = store.getString(CorePreferences.OPEN_PLAYER);
		}
		IAxdtSwfPlayer player = corePref.getPlayer(playerId);
		try {
			return player.launch(url);
		} catch (Exception e) {
			MessageDialog.openError(PlatformUI.getWorkbench().getDisplay()
					.getActiveShell(), "Error opening player",
					e.getLocalizedMessage());
			return null;
		}
	}

	public static class Runner implements Runnable {

		protected final String playerId;
		protected final URL url;
		protected IAxdtSwfPlayerInstance playerInstance;

		public Runner(String playerId, URL url) {
			this.playerId = playerId;
			this.url = url;
		}
		
		public void run() {
			playerInstance = new SwfEditorLauncher(playerId).open(url);
		}
		public IAxdtSwfPlayerInstance getPlayerInstance() {
			return playerInstance;
		}
	}
}
