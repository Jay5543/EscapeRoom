import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {


    /*
    Plan - Escape Room
    Make a GUI
    Make searios
     */

    // J-Frame
    static JFrame EscapeRoomGameWindow;
    // J-Panel
    static JPanel EscapeRoomGamePanel;
    // J-button
    //Bed Buttons
    static JButton bedButtonThatBringsYouToTheBed;
    static JButton bedButtonThatMakesYouLookUnderTheBed;
    static JButton bedButtonThatMakesYouLookOnTheBed;
    static JButton pickUpThePhoneFromTheBed;
    static JButton lookAtDresser;
    // dresser buttons
    static JButton dresserOpenerThing;
    static JButton note;

    //Door Buttons
    static JButton doorKnob;
    static JButton goToTheDoor;
    static JButton backToMain;

    //Pass Code
    static JCheckBox topLeftNumber1;
    static JCheckBox topMiddleNumber2;
    static JCheckBox topRightNumber3;
    static JCheckBox middleRightNumber6;
    static JCheckBox middleMiddleNumber5;
    static JCheckBox middleLeftNumber4;
    static JCheckBox bottomLeftNumber7;
    static JCheckBox bottomMiddleNumber8;
    static JCheckBox bottomRightNumber9;
    // J-Labels

        //PassCode Label
        static JLabel passCodeDisplay;


    // J-Text Field
    public static void main(String[] args) {

        gui();




    }

    //GUI
    public static void gui() {
        //Window
        EscapeRoomGameWindow = new JFrame("ESCAPE ROOM");
        EscapeRoomGameWindow.setSize(1350, 750);
        EscapeRoomGameWindow.setLocationRelativeTo(null);
        EscapeRoomGameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel

        EscapeRoomGamePanel = new JPanel();
        EscapeRoomGameWindow.add(EscapeRoomGamePanel);
        EscapeRoomGamePanel.setVisible(true);
        EscapeRoomGameWindow.setVisible(true);
        EscapeRoomGamePanel.setLayout(null);

        //Buttons
        bedButtonThatBringsYouToTheBed = new JButton("Bed");

        goToTheDoor = new JButton("Door");

        //Buttons on the opening screen

        EscapeRoomGamePanel.add(bedButtonThatBringsYouToTheBed);
        bedButtonThatBringsYouToTheBed.setBounds(900, 400, 100, 20);
        bedButtonThatBringsYouToTheBed.addActionListener( new bedButtonListener());

        EscapeRoomGamePanel.add(goToTheDoor);
        goToTheDoor.setBounds(100, 200, 100, 20);
        goToTheDoor.addActionListener(new doorButtonListener());

        // Bed buttons
        bedButtonThatMakesYouLookUnderTheBed = new JButton("Under Bed");
        bedButtonThatMakesYouLookUnderTheBed.setBounds(400, 500, 100, 20);

        bedButtonThatMakesYouLookOnTheBed = new JButton("Top of the Bed");
        bedButtonThatMakesYouLookOnTheBed.setBounds(400, 200, 200, 20);

        lookAtDresser = new JButton("Dresser");
        lookAtDresser.setBounds(600, 300, 100, 20);
        lookAtDresser.addActionListener(new dresserListener());

        //Dresser buttons
        dresserOpenerThing = new JButton("Dresser thing ");
        dresserOpenerThing.setBounds(400, 200, 100, 20);
        //dresserOpenerThing.addActionListener(new ());


        //Door Buttons on Panel
        topRightNumber3 = new JCheckBox("3");
        topLeftNumber1 = new JCheckBox("1");
        topMiddleNumber2 = new JCheckBox("2");
        middleLeftNumber4 = new JCheckBox("4");
        middleMiddleNumber5 = new JCheckBox("5");
        middleRightNumber6 = new JCheckBox("6");
        bottomLeftNumber7 = new JCheckBox("7");
        bottomMiddleNumber8 = new JCheckBox("8");
        bottomRightNumber9 = new JCheckBox("9");
        backToMain = new JButton("BACK");

        EscapeRoomGamePanel.add(topLeftNumber1);
        topLeftNumber1.setBounds(400, 300, 100, 20);
        EscapeRoomGamePanel.add(topRightNumber3);
        topRightNumber3.setBounds(600, 300, 100, 20);
        EscapeRoomGamePanel.add(topMiddleNumber2);
        topMiddleNumber2.setBounds(500, 300, 100, 20);
        EscapeRoomGamePanel.add(middleLeftNumber4);
        middleLeftNumber4.setBounds(400, 400, 100, 20);
        EscapeRoomGamePanel.add(middleMiddleNumber5);
        middleMiddleNumber5.setBounds(500, 400, 100, 20);
        EscapeRoomGamePanel.add(middleRightNumber6);
        middleRightNumber6.setBounds(600, 400, 100, 20);
        EscapeRoomGamePanel.add(bottomLeftNumber7);
        bottomLeftNumber7.setBounds(400, 500, 100, 20);
        EscapeRoomGamePanel.add(bottomMiddleNumber8);
        bottomMiddleNumber8.setBounds(500, 500, 100, 20);
        EscapeRoomGamePanel.add(bottomRightNumber9);
        bottomRightNumber9.setBounds(600, 500, 100, 20);
        EscapeRoomGamePanel.add(backToMain);

        backToMain.setBounds(400, 600, 100, 20);
        backToMain.addActionListener(new backToMainListener());

        //Labels

        passCodeDisplay = new JLabel("ESCAPED");
        EscapeRoomGamePanel.add(passCodeDisplay);
        passCodeDisplay.setBounds(600, 200, 100, 20);

        //.setVisable
        EscapeRoomGamePanel.setVisible(true);
        EscapeRoomGameWindow.setVisible(true);

        EscapeRoomGamePanel.remove(topLeftNumber1);
        EscapeRoomGamePanel.remove(topMiddleNumber2);
        EscapeRoomGamePanel.remove(topRightNumber3);
        EscapeRoomGamePanel.remove(middleLeftNumber4);
        EscapeRoomGamePanel.remove(middleMiddleNumber5);
        EscapeRoomGamePanel.remove(middleRightNumber6);
        EscapeRoomGamePanel.remove(bottomLeftNumber7);
        EscapeRoomGamePanel.remove(bottomMiddleNumber8);
        EscapeRoomGamePanel.remove(bottomRightNumber9);
        EscapeRoomGamePanel.remove(backToMain);
        passCodeDisplay.setVisible(false);
        EscapeRoomGamePanel.updateUI();


    }


    //Bed


    //Door
    public static void door() {
        EscapeRoomGamePanel.add(topLeftNumber1);
        EscapeRoomGamePanel.add(topMiddleNumber2);
        EscapeRoomGamePanel.add(topRightNumber3);
        EscapeRoomGamePanel.add(middleLeftNumber4);
        EscapeRoomGamePanel.add(middleMiddleNumber5);
        EscapeRoomGamePanel.add(middleRightNumber6);
        EscapeRoomGamePanel.add(bottomLeftNumber7);
        EscapeRoomGamePanel.add(bottomMiddleNumber8);
        EscapeRoomGamePanel.add(bottomRightNumber9);
        EscapeRoomGamePanel.add(backToMain);

        passCodeDisplay = new JLabel("Try Again");
        if (topLeftNumber1.isSelected()) {
            EscapeRoomGamePanel.add(passCodeDisplay);
            EscapeRoomGamePanel.updateUI();
        } else {
            EscapeRoomGamePanel.add(passCodeDisplay);
            EscapeRoomGamePanel.updateUI();
        }

        EscapeRoomGamePanel.updateUI();

    }
    public static void passCode(){

    }
    public static void back(){
        EscapeRoomGamePanel.removeAll();
        EscapeRoomGamePanel.add(goToTheDoor);
        EscapeRoomGamePanel.add(bedButtonThatBringsYouToTheBed);
        EscapeRoomGamePanel.updateUI();
    }
    public static void dresser(){
       // I have to call it here weird but ok
        dresserOpenerThing = new JButton("Open");
        dresserOpenerThing.setBounds(600, 400, 100, 20);
        dresserOpenerThing.addActionListener(new dresserOpenerThingListener());
        note = new JButton("Note");
        note.setBounds(600, 200, 100, 20);
        note.addActionListener(new note());
        EscapeRoomGamePanel.removeAll();
        EscapeRoomGamePanel.add(dresserOpenerThing);
        EscapeRoomGamePanel.add(note);
        EscapeRoomGamePanel.add(backToMain);
        EscapeRoomGamePanel.updateUI();

    }

    public static void upperBed(){

    }
    public static void underBed(){

    }
    public static void phone(){

    }
    public static void unLockDoor(){

    }
    public static void openDresser(){

        //Esc

    }
    //button actions listeners
    private static class backToMainListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            back();
        }
    }

    private static class doorButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
             EscapeRoomGamePanel.remove(bedButtonThatBringsYouToTheBed);
             EscapeRoomGamePanel.remove(goToTheDoor);
             EscapeRoomGamePanel.updateUI();

             door();

        }
    }

    private static class bedButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            EscapeRoomGamePanel.remove(goToTheDoor);
            EscapeRoomGamePanel.remove(bedButtonThatBringsYouToTheBed);
            EscapeRoomGamePanel.add(bedButtonThatMakesYouLookUnderTheBed);
            EscapeRoomGamePanel.add(bedButtonThatMakesYouLookOnTheBed);
            EscapeRoomGamePanel.add(lookAtDresser);
            EscapeRoomGamePanel.add(backToMain);
            EscapeRoomGamePanel.updateUI();
        }
    }
    private static class dresserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dresser();
            EscapeRoomGamePanel.updateUI();
        }
    }
    private static class dresserOpenerThingListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "Empty");
        }
    }
    private static class note implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "Remember to check you phone");
        }
    }

}