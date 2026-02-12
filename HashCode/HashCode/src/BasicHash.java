import java.util.Objects;

public class BasicHash {
	public static void main(String[] args) {
		
		Admin admin1 = new Admin(101," Prachi");
		Admin admin2= new Admin(102, "Aditi");
		Admin admin3 = new Admin(103, "Komal");
		Admin admin4 = new Admin(104, "Shraddha");
		
		System.out.println(admin1.hashCode());
		System.out.println(admin2.hashCode());
		System.out.println(admin3.hashCode());
		System.out.println(admin4.hashCode());
		
	}

}


class Admin
{
	private int id;
	private String name;
	
	
	public Admin(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	/*@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}*/
	
}