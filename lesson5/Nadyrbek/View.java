import java.util.Scanner;

public class View{
	private boolean isInputRight = false;
	public String donald, gerald, robert;
	private String action;

	public View(){
		Controller controller = new Controller(this);
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Please enter 'DONALD' with uppper case: ");
			donald = input.nextLine();
			System.out.println("Please enter 'GERALD' with upper case: ");
			gerald = input.nextLine();
			System.out.println("Please enter 'ROBERT' with upper case: ");
			robert = input.nextLine();
			action = "check";
			controller.actionListener(action);

		} while(!isInputRight);
		action = "getAnswer";
		controller.actionListener(action);
	}

	public void setIsInputRight(){
		isInputRight= true;
	}


}
