public class Model {

    private Viewer viewer;
    private String temp;
    private ReversePolishNotation reversePolishNotation;

    private String expression;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        reversePolishNotation = new ReversePolishNotation();
        temp = "";
    }

    public void doAction(String value) {

        switch (value){
            case ("="):
                temp = convertStringToInt(temp);
                int answer = reversePolishNotation.reverse(temp);
                System.out.println("Infix expression: " + temp);
                System.out.println("Answer: " + answer);
                temp = convertIntToString(String.valueOf(answer));
                viewer.update(temp);
                break;
            case ("Clear"):
                System.out.println("You have cleared everything ... ");
                viewer.clearTextField();
                temp = "";
                break;
            default:
                temp += value;
                viewer.update(temp);
                break;
        }

    }

    private String convertIntToString(String num){
        char[] defInt={'0','1','2','3','4','5','6','7','8','9'};
        char[] defChar={'G','%','F','$','X','#','Y','@','D','!'};

        char[] charArrayNum=num.toCharArray();
        int charArraySize=charArrayNum.length;

        for(int i=0;i<charArraySize;i++) {
            for(int j=0;j<defInt.length;j++)
                if(charArrayNum[i]==defInt[j]){
                    charArrayNum[i]=defChar[j];
                    break;
                }
        }

        String result = new String(charArrayNum);
        return result;
    }

    private String convertStringToInt(String stringSymbol){
        char[] defInt={'0','1','2','3','4','5','6','7','8','9'};
        char[] defChar={'G','%','F','$','X','#','Y','@','D','!'};

        char[] charArraySymbol=stringSymbol.toCharArray();
        int charArraySize=charArraySymbol.length;

        for(int i=0;i<charArraySize;i++){
            for(int j=0;j<defChar.length;j++)
                if(charArraySymbol[i]==defChar[j]){
                    charArraySymbol[i]=defInt[j];
                    break;
                }
        }

        String result = new String(charArraySymbol);
        return result;
    }

}
