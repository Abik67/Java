//8. Print the sum, difference, and product of two complex numbers by creating a class named
//'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.

public class Complex
{
	private int real;
	private int imag;
	
	public Complex()
	{}
	
	public Complex (int r,int i)
	{
		real=r;
		imag=i;
		
	}
	public static Complex add(Complex c1,Complex c2)
	{
         Complex result = new Complex();
         
         result.real = c1.real + c2.real;
         result.imag = c1.imag + c2.imag;
         return result;
    }
	   public static Complex product(Complex c1,Complex c2) {
         Complex result2=new Complex();
    
         result2.real = (c1.real * c2.real) + (c1.imag*c2.imag * (-1));
         result2.imag = (c1.real*c2.imag) + (c1.imag*c2.real);
         return result2;
    }
	


	public void show()
	{
		System.out.println(real+"+"+imag+"i");
	}
	
	
	public static void main( String[] args)
	{
		Complex n1= new Complex(5,2);
		Complex n2= new Complex(4,3);
		System.out.print("First complex Number : " );
		n1.show();
		System.out.print("Second complex Number : " );
		n2.show();
		
		Complex result=add(n1,n2);
		
		System.out.println("Summation is : " );
		result.show();
		Complex result2=product(n1,n2);
			System.out.println("Product is : " );
		result2.show();
		
		
	}
	
}