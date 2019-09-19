/**
 * Sprinkles class extends ToppingsDecorator
 * @author Adam Nguyen
 *
 */
public class Sprinkles extends ToppingsDecorator{
	/**
	 * icecream variable taken into constructor to create an instance of it 
	 */
	IceCream icecream;
	public Sprinkles(IceCream icecream)
	{
		this.icecream=icecream;
	}
	/**
	 * toString adds description of sprinkles to icecream
	 */
	public String toString()
	{
		return icecream.toString()+" + sprinkles";
	}
	/**
	 * getCost adds cost of sprinkles(.2) to icecream
	 */
	public double getCost()
	{
		return icecream.getCost()+.2;
	}
	

}
