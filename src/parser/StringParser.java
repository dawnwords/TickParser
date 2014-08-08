package parser;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class StringParser implements Parser {
    @Override
    public String parse(byte[] data) {
        return new String(data);
    }
}
