/**
 * ChocolateChips extends ToppingsDecorator
 * @author Adam Nguyen
 *
 */
public class ChocolateChips extends ToppingsDecorator {
	/**
	 * icecream variable taken into constructor to create an instance of it 
	 */
	IceCream icecream;
	public ChocolateChips(IceCream icecream)
	{
		this.icecream=icecream;
	}
	/**
	 * toString adds description of chocolate chips to icecream
	 */
	public String toString()
	{
		return icecream.toString()+" + chocolate chips";
	}
	/**
	 * getCost adds cost of chocolate chips(.3) to icecream
	 */
	public double getCost()
	{
		return icecream.getCost()+.3;
	}

}
