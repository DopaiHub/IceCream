/**
 * base abstract class to force toString and getCost method
 * @author Adam Nguyen
 *
 */
public abstract class IceCream {
	/**
	 * description required
	 */
	protected String description;
	
	/**
	 * returns description
	 */
	public String toString()
	{
		return description;
	}
	/**
	 * requires cost, double
	 * @return
	 */
	public abstract double getCost();

}
