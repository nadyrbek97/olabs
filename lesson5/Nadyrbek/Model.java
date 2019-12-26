public class Model{

	private View view;

	public Model(View view){
		this.view = view;
	}

	public void doAction(String action){

		switch (action){
			case("check"):
				System.out.println("... Checking your inputs ... ");
				System.out.println("-----------------------------");
				check(view.donald, view.gerald, view.robert);
				break;
			case("getAnswer"):
				getAnswer();
				break;
			default:
				System.out.println("... Invalid action  ...");
				System.out.println("-----------------------------");
				break;
		}
	}

	private void check(String donald, String gerald, String robert){

		if(donald.equals("DONALD") && gerald.equals("GERALD") && robert.equals("ROBERT")){
			System.out.println("... Your inputs are right ...");
			System.out.println("-----------------------------");
			// in case all inputs are right we will set View's isInputRight = true
			// to stop do while operator
			view.setIsInputRight();
		}
		else{
			System.out.println("... Your inputs are not correct ...");
			System.out.println("-----------------------------");
		}
	}

	public void getAnswer(){
		System.out.println("... Algorithm is creating now ...");
		System.out.println("---------------------------------");
		System.out.println("We have 10 unique numbers ... ");
		System.out.println("0. D = 5. We already know it");
		System.out.println("1. T = 0. Because 5 + 5 = 10, and second digit is 0 => T = 0.");
		System.out.println("          So we have +1 for next column => L + L + 1 = R");
		System.out.println("2. E = 9. Because O + E = O, so E = 0 or 9. Since T = 0 => E = 9 => and this column must have extra 1");
		System.out.println("3. R = 7. Becasue L + L + 1 = R. R must be an ODD number (1, 3, 5, 7, 9)");
		System.out.println("          Since 5 + G = R. G != 0. R > 5. R = 7 or 9");
		System.out.println("          Since E = 9   => R = 7");
		System.out.println("4. G = 1. Since (extra)1 + O + 9 = O > 10 and it column before  5(D) + G + 1= 7(R) => G = 1");
		System.out.println("5. L = 8. Since A + A + 1 = 9. A is even and that column must has 1(extra), so L + L + 1 > 10.");
		System.out.println("          L must be even and equal to 7 or 17 and > 10 => L = 8");
		System.out.println("6. A = 4. Since A + A + 1 = 9 < 10. A => 4");
		System.out.println("7. N = 6. Since N + 7 = B > 10 and only [2,3,6]. N = 6");
		System.out.println("8. B = 3. Since 6 + 7 = 13 => B = 3");
		System.out.println("9. O = 2. Since only 2 left");
	}

}
