public class Wilder{

	private String firstName;
	private boolean aware;

	public Wilder(String firstName){
		this.firstName = firstName;
	}

	public Wilder(String firstName, boolean aware){
		this.firstName = firstName;
		this.aware = true;
	}
	
	public void setAware(boolean aware) {
        	this.aware = aware;
	}
	
	public void setFirstName(String firstName){
		 this.firstName = firstName;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public boolean isAware(){
		return this.aware;
	}

	public String whoAmI(){
		if(isAware() == true)
			return "Je m'appelle " + this.getFirstName() + " et je suis aware";
		else
			return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
	}
}
