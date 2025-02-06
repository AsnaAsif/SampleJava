package string;

public class StringExample {

	public static void main(String[] args) {
		String name="Asna";
		name=name.concat("Asif");
		String k="HEZZA";
		k=k.concat("Lian");
		System.out.println(k);
		String s1="sanu";
		String s2="Ryan";
		String s3="SANU";
		System.out.println(s1.equals(s3));//exact equal
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(name);
	    System.out.println(name.length());
		System.out.println(s1.compareTo(s3));
		
		String s4="Hello";
		char ch =s4.charAt((4));
		System.out.println(ch);
		
//	z\\\5	System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		String s5="   Hezza";
		System.out.println(s5.trim());
		
		String s6="java is simple and powerful";
		System.out.println(s6.replace("java","python"));
		System.out.println(s6.startsWith("jav"));
		System.out.println(s6.endsWith("ple"));
		
		int a=10;
		String s8=String.valueOf(a);
		System.out.println(s8+10);//to get 1010
		System.out.println(s6.contains("simple"));
		System.out.println(s6.contains("dynamic"));
		
		
		
		
		
		}
}

