public class StrategyDesignPattern
{
	public static void main (String [] args)
	{
		ShopingCart sc1 = new ShopingCart (15, 28, 1);
		ShopingCart sc2 = new ShopingCart (15, 28, 2);

		sc1.showPrice ();
		sc2.showPrice ();
	}
}

class ShopingCart
{
	float foodprice = 0.0f;
	float nonfoodprice = 0.0f;
	float price = 0.0f;


	ShopingCart (float fp, float nfp, int usertype)
	{
		this.foodprice = fp;
		this.nonfoodprice = nfp;

		if (usertype == 1) //teacher
		{
			calculateForTeacher ();
		}
		else //student
		{
			calculateForStudent ();
		}
	}

	public void calculateForTeacher ()
	{
		this.price = this.foodprice * 0.9f + this.nonfoodprice * 0.8f;
	}

	public void calculateForStudent ()
	{
		this.price = this.foodprice * 0.7f + this.nonfoodprice * 0.7f;
	}

	public void showPrice () { System.out.println ("Price = "+this.price); }
}