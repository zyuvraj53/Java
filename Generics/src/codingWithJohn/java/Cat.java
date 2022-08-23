package codingWithJohn.java;

public class Cat extends Animal {
	
	private String litterPreference;

	public String getLitterPreference() {
		return litterPreference;
	}

	public void setLitterPreference(String litterPreference) {
		try {
			this.litterPreference = litterPreference;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
