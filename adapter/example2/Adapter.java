public class Adapter extends RequiredClass {
	public void sayHello(int times) {
		ExsisClass exsis = new ExsisClass();

		for(int i=0;i<times;i++) {
			exsis.sayHello();
		}
	}
}