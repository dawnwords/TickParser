package parser;

import java.nio.ByteBuffer;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class DoubleParser implements Parser {
    @Override
    public String parse(byte[] data) {
        return ByteBuffer.wrap(data).getDouble() + "";
    }
}
