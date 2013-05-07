
public class PointlessClass extends NullPointerException {

	public PointlessClass() {
		System.out.println("program is working");

		System.err.println("program stopped working");
	}


	public static void main(String[] args) {
		throw new PointlessClass();
	}

}
