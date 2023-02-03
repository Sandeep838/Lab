package object;
//how to define a class and field
public class object {
//defining field
	int id;
	String Bname;
	public static void main(String args[]) {
		//create object
		object ob= new object();
		ob.id=101;
		ob.Bname="sandeep";
		System.out.println(ob.id+" "+ob.Bname);
	}
}
