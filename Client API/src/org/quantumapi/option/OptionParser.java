/**
 * 
 */
package org.quantumapi.option;

import java.util.HashMap;

/**
 * @author Link
 *
 */
public class OptionParser {
	private HashMap<String, Runnable> actions;

	public OptionParser() {
		actions = new HashMap<>();
	}

	/**
	 * Registers an option with it's corresponding Runnable to run when parsed.
	 * 
	 * @param option
	 *            the option to register
	 * @param action
	 *            the action performed when the option is parsed
	 */
	public void register(String option, Runnable action) {
		actions.putIfAbsent(option, action);
	}

	public void registerAll(String[] options, Runnable[] actions) throws IllegalArgumentException {
		if (options.length != actions.length)
			throw new IllegalArgumentException("Argument array sizes do not match: [String] options[].length: "
					+ options.length + ", [Runnable] actions[].length:" + actions.length);
		for (int i = 0; i < options.length; i++) {

		}
	}

	/**
	 * Parses a single option and executes the Runnable associated with it.
	 * 
	 * @param option
	 *            the option to parse
	 */
	public void parse(String option) {
		actions.getOrDefault(option, new Runnable() {
			@Override
			public void run() {
			}
		}).run();
	}

	/**
	 * Parses all the options given to it and executes the Runnable associated
	 * with it.
	 * 
	 * @param options
	 */
	public void parseAll(String... options) {
		for (String option : options) {
			parse(option);
		}
	}
}
