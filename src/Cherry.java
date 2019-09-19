/**
 * Cherry extends ToppingsDecorator
 * @author Adam Nguyen
 *
 */
public class Cherry extends ToppingsDecorator{
	/**
	 * icecream variable taken into constructor to create an instance of it 
	 */
	IceCream icecream;
	public Cherry(IceCream icecream)
	{
		this.icecream=icecream;
	}
	/**
	 * toString adds description a cherry on top to icecream
	 */
	public String toString()
	{
		return icecream.toString()+" + a cherry on top";
	}
	/**
	 * getCost adds cost of a cost of cherry(.4) to icecream
	 */
	public double getCost()
	{
		return icecream.getCost()+.4;
	}

}
