package Com.Oops;

public class BaseClassJava {
	
	public void publicmethod()
	{
		System.out.println("this is public method");
		
	}
	
	private void privatemethod()
	{
		System.out.println("this is private method");
		
	}
	
	protected void protectedmethod()
	{
		System.out.println("this is protected method");
		
	}
	
	void defaultmethod()
	{
		System.out.println("this is default method");
		
	}

	public static void main(String[] args) {
		
		BaseClassJava BaseClassJavaref=new BaseClassJava();
		BaseClassJavaref.publicmethod();
		BaseClassJavaref.privatemethod();
		BaseClassJavaref.protectedmethod();
		BaseClassJavaref.defaultmethod();
		
		
		

	}

}
