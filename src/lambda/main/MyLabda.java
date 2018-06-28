package lambda.main;
import lambda.interfaces.LmbAdd;
import lambda.interfaces.LmbPrint;
import lambda.interfaces.LmbPrintParameter;

public class MyLabda {

	public static void main(String[] args) {
			//Lambda Print implementing
		LmbPrint lmbPrint = () -> System.out.println("Hello World"); 
			//Lambda PrintParameter implementing
		LmbPrintParameter lmbPrintParameter = (Object obj) -> {
			System.out.println(obj.toString());
		};
			//Lambda Add implementing
		LmbAdd lmbAdd = (int x, int y) -> x + y;
		
			//Testing
		lmbPrint.print();
		lmbPrintParameter.printParameter(lmbAdd.add(1, 2));
		
	}

}	