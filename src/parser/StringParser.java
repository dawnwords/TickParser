package parser;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class StringParser implements Parser {
	@Override
	public String parse(byte[] data) {
		int i = 0;
		for (; i < data.length && data[i] != 0; i++) {
		}
		return new String(data, 0, i);
	}
}
