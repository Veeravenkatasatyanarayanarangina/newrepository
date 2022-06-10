package hjsgadgjksf;

abstract class Hotel 
{
	String hotellocation;
	Hotel() {
	}
	
	abstract void menu();
}
class Ab extends Hotel
{
	String hotellocation;
	public Ab(String hotellocation,String mainlocation) {
		super.hotellocation = mainlocation;
		this.hotellocation = hotellocation;
	}
	public String toString() {
		return "Ab [hotellocation=" + hotellocation + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	void menu() 
	{
		System.out.println("1. dosa , 2. idly");
		
	}
	
}
public class Main 
{
	public static void main(String[] args) 
	{
		Ab ab = new Ab("Mumbai", "us");
		System.out.println(ab.toString());
		ab.menu();
		
	}

}
