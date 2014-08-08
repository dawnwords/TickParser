
typedef struct
{
	short cmd;
	short length;
}__PACKED__ _HEAD;

typedef struct
{
	char		exch_code[2];
	char		contract_code[CONTRACT_LENGTH];
	char		vari_code[8];
	char		deliv_date[8];
	double		open_price;
	double		buy_price;
	int			buy_qty;
	double		sell_price;
	int			sell_qty;
	double		new_price;
	double		top_price;
	double		low_price;
	int			done_qty;
	double		rf_price;
	double		rlimit_price;
	double		flimit_price;
	double		his_top_price;
	double		his_low_price;
	int			hold_qty;
	double		yest_settle_price;
	double		yest_close_price;
	double		today_settle_price;
	double		done_amt;
	int			hands;
	char		timestamp[13];
	char		date[9];
//--------------------------------------
	double		buy_price2;
	int			buy_qty2;
	double		buy_price3;
	int			buy_qty3;
	double		buy_price4;
	int			buy_qty4;
	double		buy_price5;
	int			buy_qty5;
	double		sell_price2;
	int			sell_qty2;
	double		sell_price3;
	int			sell_qty3;
	double		sell_price4;
	int			sell_qty4;
	double		sell_price5;
	int			sell_qty5;
	char		longtimestamp[21];
}__PACKED__ _PRICE2;

typedef struct
{
	_HEAD head;
	union
	{
		char buffer[8192];
		_PRICE1	price;
	}data;
}__PACKED__ _OLDTRADEMSG;

typedef struct
{
	_HEAD head;
	union
	{
		char buffer[8192];
		_PRICE2 price;
	}data;
}__PACKED__ _NEWTRADEMSG;

