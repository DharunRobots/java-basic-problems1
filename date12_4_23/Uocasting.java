

package date12_4_23;

class  Parent{  
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }

	public void showMessage() {
		// TODO Auto-generated method stub
		
	}  
	}  
	  
	class Child extends Parent {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	} 

public class Uocasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Parent obj1 = (Parent) new Child();  
	      Parent obj2 = (Parent) new Child();   
	      obj1.PrintData();  
	      obj2.PrintData();  
	}

}
