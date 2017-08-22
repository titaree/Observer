
public class ObserverPattemDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		new PlusTenObserver(subject);
		//15 1111 17
		
		System.out.print("First state change: 15");
		subject.setState(15);
		subject.setState(10);

	}

}
