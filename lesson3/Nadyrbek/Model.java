public class Model {

    private Viewer viewer;
    private String temp;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
    }

    public void doAction(String value) {

	// TO DO YOUR CODE
	temp = value;

	viewer.update(temp);
    }

}
