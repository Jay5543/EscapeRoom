import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {


    /*
    Plan - Escape Room
    Make a GUI
    Make scenarios
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
    static JButton lookAtDresser;
    // dresser buttons
    static JButton dresserOpenerThing;
    static JButton note;

    //phone stuff
    static JButton phone;
    static JRadioButton momMessage, dadMessage, unKnownMessage, zachMessage, aignerMessage;
    static ButtonGroup phoneMessages = new ButtonGroup();
    static JButton checkMessages;

    //Door Buttons
    static JButton unLock;
    static JButton goToTheDoor;
    static JButton backToMain;

    //secrect buttons
    static JButton hiddenButton;


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

        //Dailog
        static  JLabel homeScreen;
        static JLabel bedDialog;
        static JLabel phoneDialog;
            static JLabel momResponce;
            static JLabel dadResponces;
            static JLabel unknowmResponces;
            static JLabel zachResponces;
            static JLabel aignerResponce;
        static JLabel passcodeDialog;

        //PassCode Label
        static JLabel passCodeDisplay;

        //Messages labels
        static JLabel momMessageLog;
        static JLabel dadMessageLog;
        static JLabel unKnownMessageLog;
        static JLabel zachMessageLog;
        static JLabel aignerMessageLog;

        static ImageIcon window;
        static JLabel windowLabel;


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

        EscapeRoomGamePanel.add(goToTheDoor);
        goToTheDoor.setBounds(100, 200, 100, 20);
        goToTheDoor.addActionListener(new doorButtonListener());

        unLock = new JButton("Unlock");
        EscapeRoomGamePanel.add(unLock);
        unLock.setBounds(100, 200, 100, 20);
        unLock.addActionListener(new passWord());
        EscapeRoomGamePanel.remove(unLock);



        // Bed buttons
        bedButtonThatMakesYouLookUnderTheBed = new JButton("Under Bed");
        bedButtonThatMakesYouLookUnderTheBed.setBounds(400, 500, 100, 20);
        bedButtonThatMakesYouLookUnderTheBed.addActionListener(new underBedButtonListener());

        bedButtonThatMakesYouLookOnTheBed = new JButton("Top of the Bed");
        bedButtonThatMakesYouLookOnTheBed.setBounds(400, 200, 200, 20);
        bedButtonThatMakesYouLookOnTheBed.addActionListener(new UpperBedListener());

        lookAtDresser = new JButton("Dresser");
        lookAtDresser.setBounds(600, 300, 100, 20);
        lookAtDresser.addActionListener(new dresserListener());

        //Dresser buttons
        dresserOpenerThing = new JButton("Dresser thing ");
        dresserOpenerThing.setBounds(400, 200, 100, 20);

        //top of bed buttons
        phone = new JButton("Phone");
        phone.setBounds(600, 200, 100, 20);
        EscapeRoomGamePanel.add(phone);
        EscapeRoomGamePanel.remove(phone);
        phone.addActionListener(new phoneMessagesListener());

        //phone messages
        momMessage = new JRadioButton("Mother");
        momMessage.setBounds(200, 200, 100, 20);
        dadMessage = new JRadioButton("Father");
        dadMessage.setBounds(200, 300, 100, 20);
        unKnownMessage = new JRadioButton("UNKNOWN NUMBER");
        unKnownMessage.setBounds(200, 400, 200, 20);
        zachMessage = new JRadioButton("Zack");
        zachMessage.setBounds(200, 500, 100, 20);
        aignerMessage = new JRadioButton("Bestie");
        aignerMessage.setBounds(200, 600, 100, 20);

        phoneMessages.add(momMessage);
        phoneMessages.add(dadMessage);
        phoneMessages.add(unKnownMessage);
        phoneMessages.add(zachMessage);
        phoneMessages.add(aignerMessage);

        EscapeRoomGamePanel.add(momMessage);
        EscapeRoomGamePanel.add(dadMessage);
        EscapeRoomGamePanel.add(unKnownMessage);
        EscapeRoomGamePanel.add(zachMessage);
        EscapeRoomGamePanel.add(aignerMessage);

        EscapeRoomGamePanel.remove(momMessage);
        EscapeRoomGamePanel.remove(dadMessage);
        EscapeRoomGamePanel.remove(unKnownMessage);
        EscapeRoomGamePanel.remove(zachMessage);
        EscapeRoomGamePanel.remove(aignerMessage);

        checkMessages = new JButton("Check messages");
        checkMessages.setBounds(600, 600, 150, 20);
        EscapeRoomGamePanel.add(checkMessages);
        EscapeRoomGamePanel.remove(checkMessages);
        checkMessages.addActionListener(new checkMessages());


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

        hiddenButton = new JButton();
        hiddenButton.setBounds(0, 0, 10, 10);
        EscapeRoomGamePanel.remove(hiddenButton);
        hiddenButton.addActionListener(new hiddenButtonListener());

        //Labels
        homeScreen = new JLabel("What? ... How did I wake up standing up?");
        EscapeRoomGamePanel.add(homeScreen);
        homeScreen.setBounds(400, 200, 500, 40);

        bedDialog = new JLabel("My bed is a mess i really need to clean it up.");
        EscapeRoomGamePanel.add(bedDialog);
        bedDialog.setBounds(400, 50, 500, 40);
        EscapeRoomGamePanel.remove(bedDialog);

        phoneDialog = new JLabel("The same people, the only people I need");
        EscapeRoomGamePanel.add(phoneDialog);
        phoneDialog.setBounds(400, 200, 500, 40);
        EscapeRoomGamePanel.remove(phoneDialog);

        momResponce = new JLabel("Dad has it doesn't he");
        EscapeRoomGamePanel.add(momResponce);
        momResponce.setBounds(400, 200, 500, 40);
        EscapeRoomGamePanel.remove(momResponce);

        dadResponces = new JLabel("I knew it");
        EscapeRoomGamePanel.add(dadResponces);
        dadResponces.setBounds(400, 200, 500, 40);
        EscapeRoomGamePanel.remove(dadResponces);

        unknowmResponces = new JLabel("...");
        EscapeRoomGamePanel.add(unknowmResponces);
        unknowmResponces.setBounds(400, 200, 500, 40);
        EscapeRoomGamePanel.remove(unknowmResponces);

        zachResponces = new JLabel("Man NO");
        EscapeRoomGamePanel.add(zachResponces);
        zachResponces.setBounds(400, 200, 500, 40);
        EscapeRoomGamePanel.remove(zachResponces);

        aignerResponce = new JLabel("I LOVE MY GF... Your playing as me btw...");
        EscapeRoomGamePanel.add(aignerResponce);
        aignerResponce.setBounds(400, 200, 500, 40);
        EscapeRoomGamePanel.remove(aignerResponce);

        passcodeDialog = new JLabel("What this was never on my door");
        EscapeRoomGamePanel.add(passcodeDialog);
        passcodeDialog.setBounds(400, 200, 500, 40);
        EscapeRoomGamePanel.remove(passcodeDialog);

        passCodeDisplay = new JLabel("ESCAPED");
        EscapeRoomGamePanel.add(passCodeDisplay);
        passCodeDisplay.setBounds(600, 200, 100, 20);

        momMessageLog = new JLabel("STOP LEAVING YOUR CHARGER - 1");
        momMessageLog.setBounds(600, 400, 400, 300);
        dadMessageLog = new JLabel("LOL I have your charger - 5");
        dadMessageLog.setBounds(600, 400, 400, 300);
        unKnownMessageLog = new JLabel("ΔΚΛΓ - 9");
        unKnownMessageLog.setBounds(600, 400, 400, 300);
        zachMessageLog = new JLabel("Bro can you do my essay? - 3");
        zachMessageLog.setBounds(600, 400, 400, 300);
        aignerMessageLog = new JLabel("Jeremy I LOVE YOU HABIBI. I want to watch star later when I get back from band.");
        aignerMessageLog.setBounds(600, 400, 400, 300);
        EscapeRoomGamePanel.remove(momMessageLog);
        EscapeRoomGamePanel.remove(dadMessageLog);
        EscapeRoomGamePanel.remove(unKnownMessageLog);
        EscapeRoomGamePanel.remove(zachMessageLog);
        EscapeRoomGamePanel.remove(aignerMessageLog);

        window = new ImageIcon("C:\\Users\\jerem\\IdeaProjects\\EscapeRoom\\src\\creppy window.jpg");
        windowLabel = new JLabel();

        windowLabel.setIcon(window);
        EscapeRoomGamePanel.add(windowLabel);
        windowLabel.setBounds(0, -1000, 4000, 3000);

        EscapeRoomGamePanel.remove(windowLabel);

        EscapeRoomGamePanel.validate();



        //.setVisible
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

        EscapeRoomGamePanel.remove(homeScreen);
        EscapeRoomGamePanel.add(passcodeDialog);
        EscapeRoomGamePanel.add(unLock);
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

        EscapeRoomGamePanel.removeAll();
        EscapeRoomGamePanel.add(phone);
        EscapeRoomGamePanel.add(backToMain);
        EscapeRoomGamePanel.updateUI();

    }
    public static void underBed(){

        EscapeRoomGameWindow.dispose();
        JOptionPane.showMessageDialog(null, "YOU DIE");

    }
    public static void phone(){
        EscapeRoomGamePanel.removeAll();
        EscapeRoomGamePanel.add(phoneDialog);
        EscapeRoomGamePanel.remove(bedDialog);
        EscapeRoomGamePanel.add(momMessage);
        EscapeRoomGamePanel.add(dadMessage);
        EscapeRoomGamePanel.add(unKnownMessage);
        EscapeRoomGamePanel.add(zachMessage);
        EscapeRoomGamePanel.add(aignerMessage);
        EscapeRoomGamePanel.add(checkMessages);
        EscapeRoomGamePanel.add(backToMain);
        EscapeRoomGamePanel.updateUI();

    }
    public static void phoneLog(){
        if (momMessage.isSelected()){
            EscapeRoomGamePanel.remove(phoneDialog);
            EscapeRoomGamePanel.remove(dadMessageLog);
            EscapeRoomGamePanel.remove(momMessageLog);
            EscapeRoomGamePanel.remove(unKnownMessageLog);
            EscapeRoomGamePanel.remove(zachMessageLog);
            EscapeRoomGamePanel.remove(aignerMessageLog);
            EscapeRoomGamePanel.remove(dadResponces);
            EscapeRoomGamePanel.remove(unknowmResponces);
            EscapeRoomGamePanel.remove(zachResponces);
            EscapeRoomGamePanel.remove(aignerResponce);
            EscapeRoomGamePanel.add(momMessageLog);
            EscapeRoomGamePanel.add(momResponce);
            EscapeRoomGamePanel.updateUI();
        }
        if (dadMessage.isSelected()){
            EscapeRoomGamePanel.remove(phoneDialog);
            EscapeRoomGamePanel.remove(momMessageLog);
            EscapeRoomGamePanel.remove(unKnownMessageLog);
            EscapeRoomGamePanel.remove(zachMessageLog);
            EscapeRoomGamePanel.remove(aignerMessageLog);
            EscapeRoomGamePanel.remove(momResponce);
            EscapeRoomGamePanel.remove(unknowmResponces);
            EscapeRoomGamePanel.remove(zachResponces);
            EscapeRoomGamePanel.remove(aignerResponce);
            EscapeRoomGamePanel.add(dadMessageLog);
            EscapeRoomGamePanel.add(dadResponces);
            EscapeRoomGamePanel.updateUI();
        }
        if (unKnownMessage.isSelected()){
            EscapeRoomGamePanel.remove(phoneDialog);
            EscapeRoomGamePanel.remove(zachMessageLog);
            EscapeRoomGamePanel.remove(aignerMessageLog);
            EscapeRoomGamePanel.remove(dadMessageLog);
            EscapeRoomGamePanel.remove(momMessageLog);
            EscapeRoomGamePanel.remove(momResponce);
            EscapeRoomGamePanel.remove(dadResponces);
            EscapeRoomGamePanel.remove(zachResponces);
            EscapeRoomGamePanel.remove(aignerResponce);
            EscapeRoomGamePanel.add(unKnownMessageLog);
            EscapeRoomGamePanel.add(unknowmResponces);
            EscapeRoomGamePanel.updateUI();
        }
        if (zachMessage.isSelected()){
            EscapeRoomGamePanel.remove(phoneDialog);
            EscapeRoomGamePanel.remove(unKnownMessageLog);
            EscapeRoomGamePanel.remove(aignerMessageLog);
            EscapeRoomGamePanel.remove(dadMessageLog);
            EscapeRoomGamePanel.remove(momMessageLog);
            EscapeRoomGamePanel.remove(momResponce);
            EscapeRoomGamePanel.remove(dadResponces);
            EscapeRoomGamePanel.remove(unknowmResponces);
            EscapeRoomGamePanel.remove(aignerResponce);
            EscapeRoomGamePanel.add(zachMessageLog);
            EscapeRoomGamePanel.add(zachResponces);
            EscapeRoomGamePanel.updateUI();

        }
        if (aignerMessage.isSelected()){
            EscapeRoomGamePanel.remove(phoneDialog);
            EscapeRoomGamePanel.remove(momMessageLog);
            EscapeRoomGamePanel.remove(unKnownMessageLog);
            EscapeRoomGamePanel.remove(zachMessageLog);
            EscapeRoomGamePanel.remove(dadMessageLog);
            EscapeRoomGamePanel.remove(momResponce);
            EscapeRoomGamePanel.remove(dadResponces);
            EscapeRoomGamePanel.remove(unknowmResponces);
            EscapeRoomGamePanel.remove(zachResponces);
            EscapeRoomGamePanel.add(aignerMessageLog);
            EscapeRoomGamePanel.add(aignerResponce);
            EscapeRoomGamePanel.updateUI();

        }
    }
    public static void unLockDoor(){

        if (topLeftNumber1.isSelected()){
            if (middleMiddleNumber5.isSelected()){
                if (bottomRightNumber9.isSelected()){
                    if (topRightNumber3.isSelected()){
                        EscapeRoomGameWindow.dispose();
                        JOptionPane.showMessageDialog(null, "Escaped");
                    }
                }
            }
        }
        if(topMiddleNumber2.isSelected()){
            JOptionPane.showMessageDialog(null, "Wrong Password");
        }
        if (middleLeftNumber4.isSelected()){
            JOptionPane.showMessageDialog(null, "Wrong Password");
        }
        if (middleRightNumber6.isSelected()){
            JOptionPane.showMessageDialog(null, "Wrong Password");
        }
        if (bottomLeftNumber7.isSelected()){
            JOptionPane.showMessageDialog(null, "Wrong Password");
        }
        if (bottomMiddleNumber8.isSelected()){
            JOptionPane.showMessageDialog(null, "Wrong Password");
        }

    }
    public static void windowShower(){

        EscapeRoomGamePanel.removeAll();
      EscapeRoomGamePanel.add(windowLabel);

        EscapeRoomGamePanel.updateUI();


    }
    //photos
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
            EscapeRoomGamePanel.remove(homeScreen);
            EscapeRoomGamePanel.remove(goToTheDoor);
            EscapeRoomGamePanel.remove(bedButtonThatBringsYouToTheBed);
            EscapeRoomGamePanel.add(bedDialog);
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
            JOptionPane.showMessageDialog(null, "Full Screen Please");
            EscapeRoomGamePanel.add(hiddenButton);
        }
    }
    private static class note implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "Remember to check you phone");
        }
    }
    private static class UpperBedListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            upperBed();
        }
    }
    private static class phoneMessagesListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            phone();
        }
    }
    private static class checkMessages implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            phoneLog();
        }
    }
    private static class underBedButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            underBed();
        }
    }
    private static class passWord implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            unLockDoor();
        }
    }
    private static class hiddenButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            windowShower();
            EscapeRoomGamePanel.updateUI();
        }
    }
    //paints

    private class speechBubble extends JPanel{
        public speechBubble(){

        }
    }

}