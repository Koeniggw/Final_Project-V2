//@author Graham Koenig, Tanner Daria, Alex Hils, Maggie Korte
//@version 1.0
//@since  11/30/2021


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Game implements ActionListener {

  //Declaring all of our objects used in Game using Hungarian naming convention
  JButton btnAnswer1, btnAnswer2, btnAnswer3, btnAnswer4;
  JLabel lblQuestion;
  JButton btnQuest1, btnQuest2, btnQuest3, btnQuest4, btnQuest5, btnQuest6;
  JLabel lblCat1, lblCat2, lblCat3;
  JLabel lblScore;
  int intScore;

  JFrame f = new JFrame("Welcome to Jeopardy!");
  JFrame q = new JFrame();

  static ArrayList<Question> questionArrayList;


  Game() {
    // JFrame f = new JFrame("Welcome to Jeopardy!");
    // f.setLayout(new FlowLayout());
    f.setLayout(null);
    f.setSize(750, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //initializing the buttons for different questions
    btnQuest1 = new JButton("55");
    btnQuest2 = new JButton("10");
    btnQuest3 = new JButton("5");
    btnQuest4 = new JButton("10");
    btnQuest5 = new JButton("5");
    btnQuest6 = new JButton("10");

    //setting the size of buttons
    btnQuest1.setBounds(50, 150, 100, 40);
    btnQuest2.setBounds(50, 250, 100, 40);
    btnQuest3.setBounds(200, 150, 100, 40);
    btnQuest4.setBounds(200, 250, 100, 40);
    btnQuest5.setBounds(350, 150, 100, 40);
    btnQuest6.setBounds(350, 250, 100, 40);

    //adding the action listener
    btnQuest1.addActionListener(this);
    btnQuest2.addActionListener(this);
    btnQuest3.addActionListener(this);
    btnQuest4.addActionListener(this);
    btnQuest5.addActionListener(this);
    btnQuest6.addActionListener(this);

    //initializing the labels for categories and one for players score
    lblCat1 = new JLabel("Category 1");
    lblCat1.setBounds(50, 80, 100, 40);
    lblCat2 = new JLabel("Category 2");
    lblCat2.setBounds(200, 80, 100, 40);
    lblCat3 = new JLabel("Category 3");
    lblCat3.setBounds(350, 80, 100, 40);
    lblScore = new JLabel("Score: " + intScore);
    lblScore.setBounds(10, 0, 100, 100);

    //adding the buttons and labels to the main f frame
    f.add(btnQuest1);
    f.add(btnQuest2);
    f.add(btnQuest3);
    f.add(btnQuest4);
    f.add(btnQuest5);
    f.add(btnQuest6);
    f.add(lblCat1);
    f.add(lblCat2);
    f.add(lblCat3);
    f.add(lblScore);

    //setting f to be visible on start up and q not visible
    f.setVisible(true);
    q.setVisible(false);

    //setting the size of q
    q.setLayout(null);
    q.setSize(400, 300);
    // q.setVisible(true);
    //q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //initializing buttons and labels for the question frame q
    lblQuestion = new JLabel("Quest");
    btnAnswer1 = new JButton("1");
    btnAnswer2 = new JButton("2");
    btnAnswer3 = new JButton("3");
    btnAnswer4 = new JButton("4");
    btnConfirm = new JButton("CONFIRM");

    //setting the bounds and size of buttons
    lblQuestion.setBounds(20, 20, 100, 100);
    btnAnswer1.setBounds(20, 80, 100, 60);
    btnAnswer2.setBounds(20, 200, 100, 60);
    btnAnswer3.setBounds(180, 80, 100, 60);
    btnAnswer4.setBounds(180, 200, 100, 60);
    btnConfirm.setBounds(250, 0, 100, 60);


    //adding all objects to the q frame
    q.add(lblQuestion);
    q.add(btnAnswer1);
    q.add(btnAnswer2);
    q.add(btnAnswer3);
    q.add(btnAnswer4);
    q.add(btnConfirm);

    // addWindowListener(new WindowAdaptor());

  }
  /*
   * void Question(){ // private JFrame q = new JFrame (""); q.setLayout(new
   * FlowLayout()); q.setSize(180, 100); //q.setVisible(false);
   * 
   * lblQuestion = new JLabel(""); btnAnswer1 = new JButton(""); btnAnswer2 = new
   * JButton(""); btnAnswer3 = new JButton(""); btnAnswer4 = new JButton("");
   * 
   * q.add(lblQuestion); q.add(btnAnswer1); q.add(btnAnswer1); q.add(btnAnswer1);
   * }
   */


public void game(String[] args){
  questionArrayList = new ArrayList<Question>();
   String qst = "";
   String ans1 = "";
   String ans2 = "";
   String ans3 = "";
   String ans4 = "";
   String correctAns = "";
   String points = "";
   String category = "";


    try
  {
    FileReader myFile;
    myFile = new FileReader("trivia.txt");
    BufferedReader reader = new BufferedReader(myFile);

    while (reader.ready()) {
      qst = reader.readLine();
      ans1 = reader.readLine();
      ans2 = reader.readLine();
      ans3 = reader.readLine();
      ans4 = reader.readLine();
      correctAns = reader.readLine();
      points = reader.readLine();
      category = reader.readLine();
    }
    reader.close();
  }catch(
  IOException e)
  {
    lblQuestion.setText("an error occurred" + e);
  }
}

  public void actionPerformed(ActionEvent ae) {
    // might need to add score from question to cumulative score???
    // int intScore = new Integer.parseInt();

    if (ae.getSource() == btnQuest1) {
      // need to import the questions from a file. Need to look back how to do!!!
      q.setVisible(true);
      f.setVisible(false);
      // f.dispose();
      // Question QuestionWindow = new Question();

      lblQuestion.setText();
      btnAnswer1.setText(ans1);
      btnAnswer2.setText("Answer 2");
      btnAnswer3.setText("Answer 3");
      btnAnswer4.setText("Answer 4");

    }
  }
}