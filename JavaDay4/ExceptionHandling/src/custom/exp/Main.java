package custom.exp;

public class Main {

	public static void main(String[] args) {

		try {
		
		throw new LowBalanceExpception();
		}
		catch (LowBalanceExpception e) {

			e.printStackTrace();
		
		}
	}

}
