public class Model {

    private Viewer viewer;
    private String temp;
    private boolean flag=false;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
    }

    public void doAction(String value) {
        switch(value){
            case "Equal":
                getResult();
                flag = false;
                break;
            case "Clear":
                viewer.update("");
                temp = "";
                break;
            default:
                String numberType = changeToNumber(value);
                if (numberType!="undefined") {
                    temp = temp + numberType;
                    viewer.update(value);
                }
        }
         
    }

    private String changeToNumber(String value) {
        switch(value){
            case "Zero":
                return "0";
            case "One":
                return "1";
            case "Two":
                return "2";
            case "Three":
                return "3";
            case "Four":
                return "4";
            case "Five":
                return "5";
            case "Six":
                return "6";
            case "Seven":
                return "7";
            case "Eight":
                return "8";
            case "Nine":
                return "9";
            case "Divide":
                flag = true;
                return "/";
            case "Mult":
                flag = true;
                return "*";
            case "Plus":
                flag = true;
                return "+";
            case "Minus":
                flag = true;
                return "-";
            default:
                return "undefined";
        }
    }

    private void getResult() {
        if (flag) {
            Notation n = new Notation();
            double res = n.getResult(temp);
            viewer.update(temp + "=" + res);
            temp= "";
            flag = false;
        }
    }

}
