package copy3.designsmell;

import copy3.designsmell.Keyboard;
import copy3.designsmell.Printer;
import copy3.designsmell.Scanner;

public class Copier {

	// remember to reset these flags
	public static boolean scannerFlag = false;
	public static boolean databaseFlag = false;

	public static void copy() throws Exception {
		String inputValue = "";
		while (!(inputValue = (scannerFlag ? Scanner.read() : Keyboard.read())).equals("-1")) {
			if (databaseFlag) {
				Database.write(inputValue);
			} else {
				Printer.write(inputValue);
			}
		}
	}
}