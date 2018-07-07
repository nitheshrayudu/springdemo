package com.nith.springu;

public class triangle 
{	
	private String sds; 
	private int height;

	public triangle(int height , String sds)
	{
		this.height=height;
		this.sds =sds;
		
	}
	
	public int getHeight() 
	{
		return height;
	}
	
	
	public String getSds() 
	{
		return sds;
	}

//	public String getSds() {
//		return sds;
//	}
//	public void setSds(String sds) {
//		this.sds = sds;
//	}
	public void draw()
	{	
		System.out.println(getSds()+"Traingle Drawn" + getHeight());
	}
}
