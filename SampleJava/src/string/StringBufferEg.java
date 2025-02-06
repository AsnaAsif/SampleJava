package string;

public class StringBufferEg {
	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Hezza");
		s.append("Lian");
		System.out.println(s);
		s.insert(6, " is sister of");
		System.out.println(s);
		s.replace(6, 9, "yes");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.delete(6,10));
		System.out.println(s.capacity());//default of capaity is 16+ then add s contant also
	}

}
