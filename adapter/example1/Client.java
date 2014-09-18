public class Client {
	private RequiredInterface test = null;

	public void setAdapter(RequiredInterface test) {
		this.test = test;
	}

	public RequiredInterface getTest() {
		return test;
	}

	public static void main(String[] a) {
		Adapter adapter = new Adapter();
		Client client = new Client();
		client.setAdapter(adapter);

		if(client.getTest() != null) {
			client.getTest().sayHello(5);
		}
	}
}