package parser;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class ShortParser implements Parser {
    @Override
    public String parse(byte[] data) {
        int result = data[0] << 8 + data[1];
        return result + "";
    }
}
