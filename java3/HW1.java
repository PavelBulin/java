/**
* Java Level 3. HW1
*
*@author Pavel Bulin
*@version 03/25/2019 
*@link https://github.com/PavelBulin/java.git
*/

public class HW1 { 

	public static void main(String args[]) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"one", "two", "three", "four", "five"};
		Ex1<Integer> intEx1 = new Ex1<Integer>(intArray);
		intEx1.replElm();
		System.out.println();
		Ex1<String> strEx1 = new Ex1<String>(strArray);
		strEx1.replElm();
	}
}