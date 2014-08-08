package parser;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class IntParser implements Parser {
    @Override
    public String parse(byte[] data) {
        int result = data[0] << 24;
        result += data[1] << 16;
        result += data[2] << 8;
        result += data[3];
        return result + "";
    }
}
