package strings.com;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[6]=30/0;
		}
//		catch(ArithmeticException e){
//			System.out.println("Arithmetic Exception Occurs");
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception Occurs ");
		}
		catch (Exception e) {
			System.out.println("Exception Occurs");
		}
		System.out.println("Rest Of The Code");
	}

}
