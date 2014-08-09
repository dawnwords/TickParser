package run;

import data.DataType;
import data.LengthTypePair;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class Parameter {
	private static final int CONTRACT_LENGTH = 21;
	private static List<LengthTypePair> map = new LinkedList<LengthTypePair>();
	private static final String[] TITLE = { "cmd", "length", "exch_code",
			"contract_code", "vari_code", "deliv_date", "open_price",
			"buy_price", "buy_qty", "sell_price", "sell_qty", "new_price",
			"top_price", "low_price", "done_qty", "rf_price", "rlimit_price",
			"flimit_price", "his_top_price", "his_low_price", "hold_qty",
			"yest_settle_price", "yest_close_price", "today_settle_price",
			"done_amt", "hands", "timestamp", "date", "buy_price2", "buy_qty2",
			"buy_price3", "buy_qty3", "buy_price4", "buy_qty4", "buy_price5",
			"buy_qty5", "sell_price2", "sell_qty2", "sell_price3", "sell_qty3",
			"sell_price4", "sell_qty4", "sell_price5", "sell_qty5",
			"longtimestamp" };

	static {
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

	public static int getEntryLength() {
		int result = 0;
		for (LengthTypePair pair : map) {
			result += pair.length;
		}
		return result;
	}

	public static List<LengthTypePair> getMap() {
		return map;
	}

	public static String[] getTitle() {
		return TITLE;
	}

}
