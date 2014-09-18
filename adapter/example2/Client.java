public class Client {
	private RequiredClass required = null;

	public void setRequiredClass(RequiredClass required) {
		this.required = required;
	}

	public RequiredClass getRequiredClass() {
		return this.required;
	}

	public static void main(String[] a) {
		Adapter adapter = new Adapter();
		Client client = new Client();
		client.setRequiredClass(adapter);

		if(client.getRequiredClass()!=null) {
			client.getRequiredClass().sayHello(5);
		}
	}
}