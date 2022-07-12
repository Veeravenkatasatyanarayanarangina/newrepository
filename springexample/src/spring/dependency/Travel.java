package spring.dependency;

public class Travel implements Journy
{
	Vehicle v;
	public void setV(Vehicle v)
	{
		this.v = v;
	}
	public void startJourny() {
		// TODO Auto-generated method stub
		System.out.println("journy started...............");
		v.move();
		
	}

}
