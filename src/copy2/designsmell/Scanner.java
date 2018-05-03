package copy2.designsmell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import common.Util;

public class Scanner {

	public static String read() throws IOException {
		Util.outputInLine("Scanner - Enter String:");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferedReader.readLine();
	}

}