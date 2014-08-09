package run;

import java.io.FileInputStream;
import java.io.IOException;

import data.LengthTypePair;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class Main {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("tick");
		readEntry(in);
		readEntry(in);
		readEntry(in);
		in.close();
	}

	private static void readEntry(FileInputStream in) throws IOException {
		byte[] entry = new byte[MapHolder.getEntryLength()];
		in.read(entry);

		int i = 0;
		for (LengthTypePair pair : MapHolder.getMap()) {
			byte[] b = new byte[pair.length];
			for (int j = 0; j < pair.length; j++, i++) {
				b[j] = entry[i];
			}
			System.out.print(pair.type.getParser().parse(b) + "\t");
		}
		System.out.println();
	}
}
