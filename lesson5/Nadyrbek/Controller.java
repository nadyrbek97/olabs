public class Controller{

	Model model;

	public Controller(View view){
		this.model = new Model(view);
	}

	public void actionListener(String action){
		model.doAction(action);
	}

}
