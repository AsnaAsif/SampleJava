package demo;

public class DemoSample2Aggegration {
	int weight;
	String fathername;
	DemoSample add;
	
	public DemoSample2Aggegration (int weight,String fathername,DemoSample add)
	{
	this.weight=weight;
	this.fathername=fathername;
	this.add=add;
	}
	public void details()
	{
	System.out.println(weight);
	System.out.println(fathername);
	System.out.println(add.name);
	System.out.println(add.age);
	
	}
	public static void main(String[] args) {
		DemoSample obj=new DemoSample("ASNA",89);
		DemoSample2Aggegration  obj1=new DemoSample2Aggegration (38,"abdul rasheed",obj);
		obj1.details();
				

	}

}
