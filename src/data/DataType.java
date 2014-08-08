package data;

import parser.*;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public enum DataType {
    SHORT(new ShortParser()), INT(new IntParser()),
    DOUBLE(new DoubleParser()), STRING(new StringParser());

    private Parser parser;

    private DataType(Parser parser) {
        this.parser = parser;
    }

    public Parser getParser() {
        return parser;
    }
}
