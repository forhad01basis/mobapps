
public class OopMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

    OOP oopObj=new OOP(3.0f,5.0f,3.0f);
    OOP oopObj1=new OOP(3.0f,5.0f);
    OOP oopObj2=new OOP(3.0f);  
    
    System.out.println(oopObj.GetGpa());
    System.out.println(oopObj1.GetGpa());
    System.out.println(oopObj2.GetGpa());

	}

}
