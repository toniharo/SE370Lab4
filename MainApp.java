package Poker;

import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {

    public MainApp() {

        String[] face={"ace","2","3","4","5","6","7","8","9","10","jack", "queen","king"};
        String[] suit={"spades","diamonds","clubs","hearts"};

        JFrame frame = new JFrame();
        frame.setTitle("Poker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1235,800);
        frame.setVisible(true);

        //FRAME STATS


        JLabel[] deck=new JLabel[51];


        int w=0; //Width
        int h=0; //Height
        int f=0; //Face
        int s=0; //Suit

        for(int i=0;i<51;i++)
        {
            deck[i]=getImage(w,h,face[f],suit[s]); //Give deck[i] an image
            frame.add(deck[i]); //Add to frame
            w=w+95; //Shift to right
            f++; //Move up a value for face

            if(i==12) //Change Spades to Diamonds
            {
                w=0; //Start back at left side of screen
                f=f-13; //Reset face back to 0
                h=h+125; //Lower height to next row
                s++; //Change suit
            }
            else if(i==25) //Change Diamonds to Clubs
            {
                w=0; //Start back at left side of screen
                f=f-13; //Reset face back to 0
                h=h+125; //Lower height to next row
                s++; //Change suit
            }
            else if(i==38) //Change
            {
                w=0; //Start back at left side of screen
                f=f-13; //Reset face back to 0
                h=h+125; //Lower height to next row
                s++; //Change suit
            }
        }
        deck[0].

    }

    public JLabel getImage(int width, int height,String value, String suit) {
        ImageIcon OG = new ImageIcon(value+"_of_"+ suit +".png");
        //VALUE AND SUIT WILL MOST LIKELY BE CHANGED TO JUST A REGULAR NUMBER VALUE TO A INT VALUE
        Image test=OG.getImage();
        Image newTest=test.getScaledInstance(95,125,java.awt.Image.SCALE_SMOOTH);
        OG=new ImageIcon(newTest);
        JLabel picture = new JLabel();
        picture.setIcon(OG);
        picture.setBounds(width,height,95,125);
        return picture;
    }

    public void removeAll(JLabel[] deck)
    {
        for(int i=0;i<51;i++)
        {
            deck[i].removeAll();
        }
    }

    public static void main(String[] args){
        new MainApp();
    }

}
