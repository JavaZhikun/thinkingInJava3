package p8_2;

public class PrivateOverride 
{
	//private
	private void f()
	{
		System.out.println("private f()");
	}
	
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}

}

class Derived extends PrivateOverride
{
	public void f()
	{
		System.out.println("public f()");
	}
}