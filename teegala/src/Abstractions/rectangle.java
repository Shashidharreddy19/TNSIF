package Abstractions;

public class rectangle extends shape{

	private int height = 5,width=2;
	
	public rectangle(int height,int width)
	{
		this.width = width;
		this.height = height;
	}
	void calArea()
	{
		super.area=height*width;
	}
}