public class Model {

    private Viewer viewer;
    private String temporary;

    private char[] letters = {'G', '%', 'F', '$', 'X', '#', 'Y', '@', 'D', '!'};

    private int firstNumber;
    private int secondNumber;
    private String sum;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        this.temporary = "";
    }

    public void doAction(String value) {

        switch (value){
            case ("+"):
                String firstInput = viewer.getText();
                viewer.clearTextField();
                this.temporary = "";
                firstNumber = deCodeStringToInt(firstInput);
                System.out.println("Encoded First Number: " + firstInput);
                System.out.println("First Number: " + firstNumber);
                break;
            case ("="):
                String secondInput = viewer.getText();
                secondNumber = deCodeStringToInt(secondInput);
                System.out.println("Encoded Second Number: " + secondInput);
                System.out.println("Second Number: " + secondNumber);
                System.out.println("Numeric Sum: " + (firstNumber + secondNumber));
                sum = enCodeIntToString(firstNumber + secondNumber);
                viewer.update(temporary=sum);
                System.out.println("Encoded Sum: " + sum);
                this.temporary = "";
                firstNumber = 0;
                secondNumber = 0;
                break;
            case ("C"):
                System.out.println("You have cleared everything ... ");
                viewer.clearTextField();
                this.temporary = "";
                break;
            default:
                temporary = temporary + value;
                viewer.update(temporary);
                break;
        }

    }

    private int deCodeStringToInt(String text){
        // create array of digits
        int[] resultArray = new int[text.length()];
        for (int i = 0; i < text.length(); i++){
            for( int j = 0; j <= 9; j++){
                if (text.charAt(i) == letters[j]){
                    // get digits as an index of 'letters' array
                    resultArray[i] = j;
		    break;
                }
            }
        }
        // concat digits
        int result = 0;
        for(int i = 0; i < text.length(); i++){
            result = result * 10 + resultArray[i];
        }
        return result;
    }

    private String enCodeIntToString(int number){
        // convert number to Array of chars
        char[] digits = String.valueOf(number).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            // convert char to int
            int digit = Character.getNumericValue(digits[i]);
            for (int j = 0; j <= 9; j++) {
                if (digit == j){
                    // update numeric char to String char
                    digits[i] = letters[j];
		    break;
                }
            }
        }
        // convert char array to String
        String result = new String(digits);
        return result;
    }

}
