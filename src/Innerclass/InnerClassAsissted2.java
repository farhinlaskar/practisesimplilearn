package Innerclass;

public class InnerClassAsissted2 {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	public static void main(String[] args) {
		InnerClassAsissted2  ob=new InnerClassAsissted2 ();  
		ob.display();  


	}

}

