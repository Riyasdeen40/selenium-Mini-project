package org.system;

public class Desktop extends Computer {
	
	public void deskTop()
	{
		System.out.println("27 inch");
	}
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		Computer ct = new Computer();
		 obj.computerModel();
		 obj.deskTop();
		
	}

}
