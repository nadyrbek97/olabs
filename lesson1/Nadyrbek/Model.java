public class Model {

    private Viewer viewer;
    private String temporary;

    public Model(Viewer viewer) {
        this.viewer = viewer;
            temporary = "";
    }

    public void doAction(String value) {
        temporary = temporary + value;

    viewer.update(temporary);
    }
}
