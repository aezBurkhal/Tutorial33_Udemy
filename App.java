class Machine {
	public void start() {
		System.out.println("Starting machine ...");
	}
}

interface Plant {
	//method
	public void grow();
}
public class App {

	public static void main(String[] args) {
		
		//variable declaration
		Machine machine1  = new Machine() {
			//can override methods 
			@Override public void start() {
				System.out.println("Camera snapping....");
			}
		};
		
		machine1.start();
		
		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant growing");
			}
			
		};
		plant1.grow();
	}

}
