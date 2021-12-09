package Project04;
/**
 * Representing Address contains street, city, state and zipCode
 * @author Yulong Chen
 * @version 1.0
 */
public class Address {
	//An address contains street, city, state and zipCode.
	private String street;
	private String city;
	private String state;
	private String zipCode;
    
	/**
	 * Address constructor
	 * @param street The value of street
	 * @param city The value of city
	 * @param state The value of state
	 * @param zipCode The value of zipCode
	 */
	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	/**
	 * Return the value of street
	 * @return Return the value of street
	 */
	public String getStreet() {
		return street;
	}
    /**
     * Change the value of street
     * @param street The value of street
     */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * Return the value of city
	 * @return Return the value of city
	 */
	public String getCity() {
		return city;
	}
	/**
     * Change the value of city
     * @param city The value of city
     */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Return the value of state
	 * @return Return the value of state
	 */
	public String getState() {
		return state;
	}
	/**
     * Change the value of state
     * @param state The value of state
     */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * Return the value of zipCode
	 * @return Return the value of zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
     * Change the value of zipCode
     * @param zipCode The value of zipCode
     */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


}
