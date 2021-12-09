package Project04;
/**
 * Representing a driver to start
 * @author Yulong Chen
 * @version 1.0
 */
public class Driver{
	public static void main(String[] args) {
		Helper h = new Helper();		
			try {
				h.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
