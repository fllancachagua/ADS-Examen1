package copy1;

import java.io.IOException;

import copy1.Keyboard;
import copy1.Printer;

public class Copier {

	public static void copy() throws IOException {
		String inputValue = "";
		while (!(inputValue = Keyboard.read()).equals("-1")) {
			Printer.write(inputValue);
		}
	}
}