
public class DemoApp {
	static OutputManager om = new OutputManager();
	static WonderfulManager wm = new WonderfulManager();
	public static void main(String[] args) {
		System.out.println("Hello from Demo!");
		om.echo();
		wm.giveMeWonder();
	}

}
