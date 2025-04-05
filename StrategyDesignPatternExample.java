public class StrategyDesignPatternExample
{
	public static void main (String [] args)
	{
		CostStrategy cs1 = new TeacherStrategy ();
		CostStrategy cs2 = new StudentStrategy ();

		ShopingCart sc1 = new ShopingCart (15, 28, cs1);
		ShopingCart sc2 = new ShopingCart (15, 28, cs2);

		sc1.showPrice ();
		sc2.showPrice ();
	}
}

class CostStrategy
{
	float fooddiscount = 0.0f;
	float nonfooddiscount = 0.0f;

	public float calculatePrice (float food, float nonfood){return 0.0f;}
}

class TeacherStrategy extends CostStrategy
{
	TeacherStrategy ()
	{
		this.fooddiscount = 0.9f;
		this.nonfooddiscount = 0.8f;
	}
	public float calculatePrice (float food, float nonfood){return food * this.fooddiscount+nonfood * this.nonfooddiscount;}


}

class StudentStrategy extends CostStrategy
{
	StudentStrategy ()
	{
		this.fooddiscount = 0.7f;
		this.nonfooddiscount = 0.7f;
	}
	public float calculatePrice (float food, float nonfood){return food * this.fooddiscount+nonfood * this.nonfooddiscount;}

}

class ShopingCart
{
	float foodprice = 0.0f;
	float nonfoodprice = 0.0f;
	float price = 0.0f;


	ShopingCart (float fp, float nfp, CostStrategy cs)
	{
		this.foodprice = fp;
		this.nonfoodprice = nfp;
		this.price = cs.calculatePrice (fp, nfp);
	}

	public void showPrice ()
	{
		System.out.println ("Food actual Price = "+this.foodprice + ", non food actual price = " + this.nonfoodprice +", Price = "+this.price);
	}
}