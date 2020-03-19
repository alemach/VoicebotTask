package com.dronn.voicebot.service;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This needs to be singleton because OpenCSV calls one for each of its threads
 * and since this module relies on user input to sort out exceptions it gets messy and confusing.
 */
public class UserFeedbackImpl implements UserFeedback {

	private static UserFeedback INSTANCE = null;

	private UserFeedbackImpl() {
	}

	public static synchronized UserFeedback getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UserFeedbackImpl();
		}
		return INSTANCE;
	}

	@Override
	public synchronized BigDecimal getUserFeedback(String failureMsg, String valueToConvert) {
		Scanner scanner = new Scanner(System.in);
		String decision = "";
		BigDecimal value = null;
		System.out.println(failureMsg + ": " + valueToConvert);
		System.out.println("Type ignore / abort / correct:");
		input:
		while (scanner.hasNext()) {
			decision = scanner.next();
			switch (decision) {
				case "abort":
					System.exit(1);
				case "ignore":
					return null;
				case "correct":
					break input;
			}
			System.out.println("Type ignore / abort / correct:");
		}
		if (decision.equals("correct")) {
			System.out.printf("Enter correct value (%s.##)%n", "#".repeat(valueToConvert.length() - 3));
			while (!scanner.hasNextBigDecimal()) {
				System.out.printf("Enter correct value (%s.##)%n", "#".repeat(valueToConvert.length() - 3));
				scanner.next();
			}
			value = scanner.nextBigDecimal();
		}

		return value;
	}
}
