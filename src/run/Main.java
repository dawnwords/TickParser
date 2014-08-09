package run;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import data.LengthTypePair;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class Main {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream(Parameter.getInputPath());
		PrintWriter out = new PrintWriter(new File(Parameter.getOutputPath()));

		out.println(getTitle());
		String entry;
		while ((entry = readEntry(in)) != null) {
			out.println(entry);
		}
		in.close();
		out.close();
	}

	private static String getTitle() {
		String result = "";
		for (String title : Parameter.getTitle()) {
			result += title + ",";
		}
		return result;
	}

	private static String readEntry(FileInputStream in) throws IOException {
		byte[] entry = new byte[Parameter.getEntryLength()];

		if (in.read(entry) > 0) {
			String result = "";
			int i = 0;
			for (LengthTypePair pair : Parameter.getMap()) {
				byte[] b = new byte[pair.length];
				for (int j = 0; j < pair.length; j++, i++) {
					b[j] = entry[i];
				}
				result += pair.type.getParser().parse(b) + ",";
			}
			return result;
		}
		return null;
	}
}
