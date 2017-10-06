package baslotto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public class Application {

	public static void main(String[] args) {
		String number = "212";
		String price = "+100";
//		threeNumber(number, price);
//		twoNumber("50", "+500000");
//		String test = "23";
//		Set<String> todLotto = seperateTod(number);
//		Iterator<String> iterator = todLotto.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.format(formatter));
	}

	public static void threeNumber(String number, String price) {
		// notsame
		if (!(Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) || Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
				|| Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))) {
			if (Pattern.matches("\\d{3}\\+\\d{3}", price)) {
				System.out.println("1A");
			}
			if (Pattern.matches("\\d{3}\\-", price)) {
				System.out.println("1B");
			}
			if (Pattern.matches("\\+\\d{3}", price) | Pattern.matches("0\\+\\d{3}", price)) {
				System.out.println("1C");
			}

		}
		// same two
		if ((Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) || Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
				|| Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))
				&& !(Pattern.matches("(?:\\d{1})(\\d{1})\\1", number)
						&& Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
						&& Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))) {
			if (Pattern.matches("\\d{3}\\+\\d{3}", price)) {
				System.out.println("2A");
			}
			if (Pattern.matches("\\d{3}\\-", price)) {
				System.out.println("2B");
			}
			if (Pattern.matches("\\+\\d{3}", price) | Pattern.matches("0\\+\\d{3}", price)) {
				System.out.println("2C");
			}

		}
		// same three
		if (Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) && Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
				&& Pattern.matches("(\\d{1})(?:\\d{1})\\1", number)) {
			if (Pattern.matches("\\d{3}\\+\\d{3}", price)) {
				System.out.println("3A");
			}
			if (Pattern.matches("\\d{3}\\-", price)) {
				System.out.println("3B");
			}
			if (Pattern.matches("\\+\\d{3}", price)) {
				System.out.println("3C");
			}
		}
	}

	public static void twoNumber(String number, String price) {
		// 50+50 top bot
		if (Pattern.matches("\\d{3}+\\d{3}", price)) {

		}
		// 50+50- top bot switch
		if (Pattern.matches("\\d{3}+\\d{3}\\-", price)) {

		}
		// 50- top switch
		if (Pattern.matches("\\d{3}\\-", price)) {

		}
		// 50 top
		if (Pattern.matches("\\d{3}", price)) {

		}
		// +50- || 0+50- bot switch
		if (Pattern.matches("\\+\\d{1,6}\\-", price) || Pattern.matches("0\\+\\d{1,6}\\-", price)) {
			
		}
		// +50 || 0+50 bot
		if (Pattern.matches("\\+\\d{1,6}", price) || Pattern.matches("0\\+\\d{1,6}", price)) {
			System.out.println("true");
		}

	}
	
	private static Set<String> seperateTod(String threeLotto) {
		Set<String> todLotto = new HashSet();
		String firstNumber = threeLotto.substring(0, 1);
		String secondNumber = threeLotto.substring(1, 2);
		String thirdNumber = threeLotto.substring(2);
		todLotto.add(firstNumber + secondNumber + thirdNumber);
		todLotto.add(firstNumber + thirdNumber + secondNumber);
		todLotto.add(secondNumber + firstNumber + thirdNumber);
		todLotto.add(secondNumber + thirdNumber + firstNumber);
		todLotto.add(thirdNumber + firstNumber + secondNumber);
		todLotto.add(thirdNumber + secondNumber + firstNumber);
		return todLotto;
	}
	
}
