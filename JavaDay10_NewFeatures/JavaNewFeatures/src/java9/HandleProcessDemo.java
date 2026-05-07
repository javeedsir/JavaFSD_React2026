package java9;

public class HandleProcessDemo {

	public static void main(String[] args) {


		ProcessHandle current = ProcessHandle.current();
        System.out.println("PID: " + current.pid());

        current.children().forEach(p ->
            System.out.println("Child PID: " + p.pid())
        );

		
	}

}
