package string;

public class StringBuliderEg {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Asna");
		s.append("lian");
		System.out.println(s);
		s.insert(4, "Hezza");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.capacity());
		

	}

}
