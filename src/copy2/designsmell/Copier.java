package copy2.designsmell;

import java.io.IOException;

public class Copier {

	// remember to reset this flag
	public static boolean scannerFlag = false;

	public static void copy() throws IOException {
		String inputValue = "";
		while (!(inputValue = (scannerFlag ? Scanner.read() : Keyboard.read())).equals("-1")) {
			Printer.write(inputValue);
		}
	}
}