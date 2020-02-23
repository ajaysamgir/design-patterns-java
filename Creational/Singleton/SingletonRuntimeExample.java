/******************************************************************************
- Singleton
- Singleton design pattern is responsible for manage lifecycle of instace since creation.
- Singleton should be a thread safe so they are static by nature 
- Singleton class should have private instance and private construtor to manage instance creation 
  and maintain by there own only.
- in below example we have created 2 instance of runtime class which have same address means only one instance 
  is created and that is use across application when needed.
- there is no parameter required when instance going created,  


*****************************************************************/

public class Main
{
	public static void main(String[] args) {
	    Runtime rt1 = Runtime.getRuntime();
	    Runtime rt2 = Runtime.getRuntime();
	    if(rt1 == rt2) {
	      System.out.println("Same");  
	    }
		  
		else {
		    System.out.println("Not Same");
		}
	}
}
