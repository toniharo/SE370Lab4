package Poker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainApp extends JFrame {
    public MainApp() {

        String[] face={"ace","2","3","4","5","6","7","8","9","10","jack", "queen","king"};
        String[] suit={"spades","diamonds","clubs","hearts"};

        JFrame frame = new JFrame();
        frame.setTitle("Poker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1235,800);
        frame.setVisible(true);
        JButton shuffleButton = new JButton("Shuffle");
        frame.add(shuffleButton, BorderLayout.SOUTH);

        //FRAME STATS



        JLabel[] deck=new JLabel[52];


        int w=0; //Width
        int h=0; //Height
        int f=0; //Face
        int s=0; //Suit

        for(int i=0;i<=51;i++)
        {
            deck[i]=getImage(w,h,face[f],suit[s]); //Give deck[i] an image
            frame.add(deck[i]); //Add to frame

            if(f==12) //Change suit
            {
                w=0; //Start back at left side of screen
                f=0; //Reset face back to 0
                h=h+125; //Lower height to next row
                s++; //Change suit
            }
            else {
                w=w+95; //Shift to right
                f++; //Move up a value for face
            }

        }

        //make the button work
        shuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){shuffleDeck(deck);}
        });
        //removeAll(deck);
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
        for(int i=0;i<=51;i++)
        {
            deck[i].setIcon(null);
        }
    }

    public static void main(String[] args){
        new MainApp();
    }
    public void shuffleDeck(JLabel[] deck) {

        Random rand = new Random();/*
        //[] deck = new JLabel[0];
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Get a random index

            // Swap the cards
            JLabel temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

         */
        int gone = rand.nextInt(deck.length);
        deck[gone].setIcon(null);

    }

}
