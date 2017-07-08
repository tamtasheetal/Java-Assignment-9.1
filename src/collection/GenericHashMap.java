package collection;

//This java file is inside package named package1 inside src folder.
import java.util.*;       
//importing all classes from java's util library.

public class GenericHashMap
{
	public static void main(String[] args)        
 //main function declaration. 
	{
		HashMap<Integer,String> employeeDetails = new HashMap<Integer,String>();
 //Creating HashMap to store the Employee details.
		
	//Detail of Emp1 
		Integer keyCode=new Integer(1);       
	//This will Create the first key or employee code.
		String valueName="Aditya";          
	//This will Create a String to map with the key.
		employeeDetails.put(keyCode, valueName);       
		
	//Detail of Emp2
        keyCode=new Integer(2);       
	    valueName="Harman";          
	  //This will Create a String to map with the key.
	    employeeDetails.put(keyCode, valueName);       
	//Putting the key and String is mapped to it in HashMap.
	    
	  //Detail of Emp3
        keyCode=new Integer(3);       
	    valueName="Vinay";          
	 //This will Create a String to map with the key.
	    employeeDetails.put(keyCode, valueName);       
	    
	    
	    //Detail of Emp4
        keyCode=new Integer(4);       
	    valueName="Sheetal";          
	    employeeDetails.put(keyCode, valueName);       
	    
	    //Details of 4th Employees are added in HashMap.
	    
	    Iterator<Integer> listReader=employeeDetails.keySet().iterator();
	    
	    while(listReader.hasNext())        
	    {
	    	Integer codeEncrypt = (Integer) listReader.next();      
	    	
	    	System.out.println("Employee ID is "+codeEncrypt.toString()+" and Name of Employee is "+employeeDetails.get(codeEncrypt));
	    	              
	    }
	    
	}    

}   

