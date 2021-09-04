package telusko;

class FinalDemoA{
	private int DAY;

	/**
	 * @return the dAY
	 */
	public int getDAY() {
		return DAY;
	}

	/**
	 * @param dAY the dAY to set
	 */
	public void setDAY(int dAY) {
		DAY = dAY;
	}


}

public class FinalDemo {

	public static void main(String[] args) {
		
		FinalDemoA fd = new FinalDemoA();
		fd.setDAY(5);
		System.out.println(fd.getDAY()); 

	}

}
