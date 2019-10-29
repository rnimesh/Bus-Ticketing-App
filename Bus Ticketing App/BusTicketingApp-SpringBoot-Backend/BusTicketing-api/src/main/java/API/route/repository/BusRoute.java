package API.route.repository;

public interface BusRoute {
	
	/**
	 * Method to get the Decryption Algorithm type.
	 *
	 * @return String
	 */
	String getBusType();
	/**
	 * Method to get the Decryption Algorithm type.
	 *
	 * @param a
	 * @param b
	 * @return int
	 */
	
	double applyAlgorithm(double distance);

}
