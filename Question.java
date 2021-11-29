//@author Graham Koenig, Tanner Daria, Alex Hils, Maggie Korte
//@version 1.0
//@since  11/30/2021


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Question {
  // public static void main(String[] args){

  //declaring private Strings
  private String qst;
  private String ans1;
  private String ans2;
  private String ans3;
  private String ans4;
  private int correctAns;
  private int points;
  private String category;

  Question(String aQst, String aAns1, String aAns2, String aAns3, String aAns4, int aCorrectAns, int aPoints,
      String aCategory) {
    qst = aQst;
    ans1 = aAns1;
    ans2 = aAns2;
    ans3 = aAns3;
    ans4 = aAns4;
    correctAns = aCorrectAns;
    points = aPoints;
    category = aCategory;
  }

  void setQst(String theQuestion) {
    qst = theQuestion;
  }

  void setAns1(String theAns1) {
    ans1 = theAns1;
  }

  void setAns2(String theAns2) {
    ans2 = theAns2;
  }

  void setAns3(String theAns3) {
    ans3 = theAns3;
  }

  void setAns4(String theAns4) {
    ans4 = theAns4;
  }

  void setCorrectAns(int theCorrectAns) {
    correctAns = theCorrectAns;
  }

  void setPoints(int thePoints) {
    points = thePoints;
  }

  void setCategory(String theCategory) {
    category = theCategory;
  }

  String getQst() {
    return qst;
  }

  String getAns1() {
    return ans1;
  }

  String getAns2() {
    return ans2;
  }

  String getAns3() {
    return ans3;
  }

  String getAns4() {
    return ans4;
  }

  int getCorrectAns() {
    return correctAns;
  }

  int getPoints() {
    return points;
  }

  String getCategory() {
    return category;
  }

  JLabel lblQuestion;
  JButton btnAnswer1,btnAnswer2, btnAnswer3, btnAnswer4;
/*
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

    }
    reader.close();
  }catch(
  IOException exception)
  {

  }
*/
  // public void actionPerformed(ActionEvent ae){}

}

/*
 * 
 * 
 * Question(){ JFrame q = new JFrame (""); //q.setLayout(new FlowLayout());
 * q.setLayout(null); q.setSize(400, 300); q.setVisible(true);
 * q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * 
 * lblQuestion = new JLabel("Question 1"); btnAnswer1 = new JButton("1");
 * btnAnswer2 = new JButton("2"); btnAnswer3 = new JButton("3"); btnAnswer4 =
 * new JButton("4"); 
 * 
 * lblQuestion.setBounds(20, 20, 100,100); btnAnswer1.setBounds(20,80,100,60);
 * btnAnswer2.setBounds(20,200,100,60); btnAnswer3.setBounds(180,80,100,60);
 * btnAnswer4.setBounds(180,200,100,60); btnConfirm.setBounds(250,0 ,100,60);
 * 
 * 
 * q.add(lblQuestion); q.add(btnAnswer1); q.add(btnAnswer2); q.add(btnAnswer3);
 * q.add(btnAnswer4); q.add(btnConfirm); }
 * 
 */
