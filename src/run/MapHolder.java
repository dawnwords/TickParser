package run;

import data.DataType;
import data.LengthTypePair;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class MapHolder {
    public static final int CONTRACT_LENGTH = 10;
    public static final int ENTRY_LEN = 2 + 2 + 8192;
    private static List<LengthTypePair> map = new LinkedList<LengthTypePair>();

    private MapHolder() {
        map.add(new LengthTypePair(2, DataType.SHORT));
        map.add(new LengthTypePair(2, DataType.SHORT));
        map.add(new LengthTypePair(2, DataType.STRING));
        map.add(new LengthTypePair(CONTRACT_LENGTH, DataType.STRING));
        map.add(new LengthTypePair(8, DataType.STRING));
        map.add(new LengthTypePair(8, DataType.STRING));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(13, DataType.STRING));
        map.add(new LengthTypePair(9, DataType.STRING));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(8, DataType.DOUBLE));
        map.add(new LengthTypePair(4, DataType.INT));
        map.add(new LengthTypePair(21, DataType.STRING));
    }

    public static List<LengthTypePair> getMap() {
        return map;
    }

}
