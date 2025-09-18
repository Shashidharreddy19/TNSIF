package Abstractions;

	public abstract class shape {
		protected float area;
		
		abstract void calArea(); 
		
		public void show()
		{
			System.out.println("The area of shape is "+area);
		}
		
	}