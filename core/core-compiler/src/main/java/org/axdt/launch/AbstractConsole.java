package org.axdt.launch;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import com.google.common.collect.Lists;

/**
 * @author nkuebler
 * @author mb0
 */
public abstract class AbstractConsole extends MessageConsole {
	
	@SuppressWarnings("unchecked")
	public static <T extends AbstractConsole> T setConsole(
			T newConsole) {
		return setConsole(newConsole, (Class<T>)newConsole.getClass());
	}

	public static <T extends AbstractConsole> T setConsole(
			T newConsole, Class<T> type) {
		IConsoleManager consoleManager = ConsolePlugin.getDefault()
				.getConsoleManager();
		List<T> toRemove = Lists.newArrayList();
		for (IConsole c : consoleManager.getConsoles())
			if (type.isInstance(c))
				toRemove.add(type.cast(c));
		consoleManager.removeConsoles(toRemove.toArray(
				new IConsole[toRemove.size()]));
		consoleManager.addConsoles(new IConsole[] { newConsole });
		consoleManager.showConsoleView(newConsole);
		return newConsole;
	}

	public AbstractConsole(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
		configure();
	}

	protected void configure() {
	}

	public void appendAsync(final String str, final int colorCode) {
		final Display display = Display.getDefault();
		display.asyncExec(new Runnable() {
			public void run() {
				Color color = colorCode < 0 ? null : display
						.getSystemColor(colorCode);
				append(str, color);
			}
		});
	}

	public void append(String str) {
		append(str, null);
	}

	public void append(String str, Color color) {
		MessageConsoleStream stream = newMessageStream();
		if (color != null)
			stream.setColor(color);
		stream.println(str);
		try {
			stream.close();
		} catch (IOException e) {
			Logger.getLogger(getClass()).error("error closing console stream",
					e);
		}
	}
}
