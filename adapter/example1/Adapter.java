public class Adapter extends ExsisClass implements RequiredInterface {
	public void sayHello(int times) {
		for(int i=0;i<times;i++) {
			super.sayHello();
		}
	}
}