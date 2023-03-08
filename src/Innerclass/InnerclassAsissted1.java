package Innerclass;

public class InnerclassAsissted1 {

    private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Let us start learning Inner Classes");}  
	   }  

	public static void main(String[] args) {

		InnerclassAsissted1 obj=new InnerclassAsissted1();
		InnerclassAsissted1.Inner in=obj.new Inner();  
		in.hello();  


	}

}
