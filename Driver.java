package Project04;

public class Driver {
	public static void main(String[] args) {
		Helper h = new Helper();
		try {
			h.creat();
		} catch (TreeException e) {
			e.printStackTrace();
		}
	}
}
