package parser;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class DoubleParser implements Parser {
	@Override
	public String parse(byte[] data) {
		return String.format("%.2f", Double.longBitsToDouble(getLong(data)));
	}

	private long getLong(byte[] bytes) {
		return (0xffL & (long) bytes[0]) | (0xff00L & ((long) bytes[1] << 8))
				| (0xff0000L & ((long) bytes[2] << 16))
				| (0xff000000L & ((long) bytes[3] << 24))
				| (0xff00000000L & ((long) bytes[4] << 32))
				| (0xff0000000000L & ((long) bytes[5] << 40))
				| (0xff000000000000L & ((long) bytes[6] << 48))
				| (0xff00000000000000L & ((long) bytes[7] << 56));
	}
}
