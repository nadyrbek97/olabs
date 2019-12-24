import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Viewer {

    private JTextField textField;

    public Viewer() {

        Controller controller = new Controller(this);

        textField = new JTextField();
        textField.setFont(new java.awt.Font("Alergia", java.awt.Font.BOLD, 25));
        textField.setForeground(java.awt.Color.magenta);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setBounds(50, 50, 230, 50);

	JPanel panel = getCenterJPanel(controller);
        panel.setBounds(0, 0, 350, 350);

        JFrame frame = new JFrame("Calcalator MVC");
        frame.setSize(400, 420);
        frame.setLocation(100, 50);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }

    private JPanel getCenterJPanel(Controller controller) {

        JButton buttonDelete = new JButton("<--");
        buttonDelete.setBounds(290, 50, 50, 50);
        buttonDelete.addActionListener(controller);
        buttonDelete.setActionCommand("Delete");

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(290, 110, 50, 50);
	buttonClear.addActionListener(controller);
        buttonClear.setActionCommand("Clear");

        JButton buttonSeven = new JButton("@");
        buttonSeven.setBounds(50, 110, 50, 50);
        buttonSeven.setForeground(java.awt.Color.magenta);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("@");

        JButton buttonEight = new JButton("D");
        buttonEight.setBounds(110, 110, 50, 50);
        buttonEight.setForeground(java.awt.Color.magenta);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("D");

        JButton buttonNine = new JButton("!");
        buttonNine.setBounds(170, 110, 50, 50);
        buttonNine.setForeground(java.awt.Color.magenta);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("!");

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(230, 110, 50, 50);
        buttonDivide.addActionListener(controller);
        buttonDivide.setActionCommand("/");

        JButton buttonFour = new JButton("X");
        buttonFour.setBounds(50, 170, 50, 50);
        buttonFour.setForeground(java.awt.Color.magenta);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("X");

        JButton buttonFive = new JButton("#");
        buttonFive.setBounds(110, 170, 50, 50);
        buttonFive.setForeground(java.awt.Color.magenta);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("#");

        JButton buttonSix = new JButton("Y");
        buttonSix.setBounds(170, 170, 50, 50);
        buttonSix.setForeground(java.awt.Color.magenta);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Y");

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setBounds(230, 170, 50, 50);
        buttonMultiplication.addActionListener(controller);
        buttonMultiplication.setActionCommand("*");

        JButton buttonPercent = new JButton("%");
        buttonPercent.setBounds(290, 170, 50, 50);
        buttonPercent.addActionListener(controller);
        buttonPercent.setActionCommand("%");

        JButton buttonOne = new JButton("%");
        buttonOne.setBounds(50, 230, 50, 50);
        buttonOne.setForeground(java.awt.Color.magenta);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("%");

        JButton buttonTwo = new JButton("F");
        buttonTwo.setBounds(110, 230, 50, 50);
        buttonTwo.setForeground(java.awt.Color.magenta);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("F");

        JButton buttonThree = new JButton("$");
        buttonThree.setBounds(170, 230, 50, 50);
        buttonThree.setForeground(java.awt.Color.magenta);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("$");

        JButton buttonZero = new JButton("G");
        buttonZero.setBounds(50, 290, 110, 50);
        buttonZero.setForeground(java.awt.Color.magenta);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("G");

        JButton buttonComma = new JButton(",");
        buttonComma.setBounds(170, 290, 50, 50);
        buttonComma.addActionListener(controller);
        buttonComma.setActionCommand(",");

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(230, 290, 50, 50);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("+");

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(230, 230, 50, 50);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("-");

        JButton buttonEqually = new JButton("=");
        buttonEqually.setBounds(290, 230, 50, 110);
        buttonEqually.addActionListener(controller);
        buttonEqually.setActionCommand("=");

	JPanel panel = new JPanel();
	panel.setLayout(null);
        panel.add(buttonDelete);

        panel.add(buttonSeven);
        panel.add(buttonEight);
        panel.add(buttonNine);
        panel.add(buttonDivide);

        panel.add(buttonFour);
        panel.add(buttonFive);
        panel.add(buttonSix);
        panel.add(buttonMultiplication);
        panel.add(buttonPercent);

        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        panel.add(buttonMinus);
        panel.add(buttonEqually);

        panel.add(buttonZero);
        panel.add(buttonComma);
        panel.add(buttonPlus);
        panel.add(buttonClear);

	return panel;
    }

    public void update(String value) {
        textField.setText(value);
    }

    public String getText(){
        return textField.getText();
    }

    public void clearTextField(){
        textField.setText("");
    }
}
