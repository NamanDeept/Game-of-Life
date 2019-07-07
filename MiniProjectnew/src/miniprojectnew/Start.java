/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectnew;

/**
 *
 * @author LENOVO
 */import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Start {
	  private JButton helpButton;
	  private JButton exitButton;
	  private JButton startButton;
	  private JPanel headerPanel;
	  private JPanel footerPanel;
	  private JPanel centerPanel;
	  private JLabel labelGame;
	  private JLabel labelIcon;
	  
	  public Start(){
		  BorderLayout borderLayout = new BorderLayout();
		  JFrame frame = new JFrame("GAME OF LIFE");
		  frame.setLayout(borderLayout);
		  headerPanel = new JPanel();
		  labelGame = new JLabel("Welcome to Game of Life");
		  labelGame.setFont(new Font("Monospaced", Font.BOLD, 30));
		  headerPanel.add(labelGame);
		  frame.add(headerPanel,BorderLayout.NORTH);
		  ImageIcon img = new ImageIcon(this.getClass().getResource("img/gameoflifelogo.png"));
		  labelIcon = new JLabel(img);
		  centerPanel = new JPanel();
		  centerPanel.add(labelIcon);
		  frame.add(centerPanel,BorderLayout.CENTER);
		  footerPanel = new JPanel();
                  
		  footerPanel.setLayout(new FlowLayout(FlowLayout.CENTER,100,160));
		  startButton = new JButton("PLAY");
		  ImageIcon img1 = new ImageIcon(this.getClass().getResource("img/play.png"));
		  startButton.setIcon(img1);
		  startButton.setFont(new Font("Tahoma",Font.BOLD,18));
		  // startButton.setPreferredSize(new Dimension(120,80));
		  Border emptyBorder = BorderFactory.createEmptyBorder();
		  startButton.setBorder(emptyBorder);
		  startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Display st=new Display();
                frame.dispose();
                st.setVisible(true);
            }
          });
		  footerPanel.add(startButton);
		  helpButton = new JButton("HELP");
		  ImageIcon img2 = new ImageIcon(this.getClass().getResource("img/help icon.png"));
		  helpButton.setIcon(img2);
		  helpButton.setFont(new Font("Tahoma",Font.BOLD,18));
		  Border emptyBorder1 = BorderFactory.createEmptyBorder();
		  helpButton.setBorder(emptyBorder1);
		  helpButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Help help=new Help();
                help.setVisible(true);
            }
          });
		  footerPanel.add(helpButton);
		  exitButton = new JButton("EXIT");
		  ImageIcon img3 = new ImageIcon(this.getClass().getResource("img/exit.png"));
		  exitButton.setIcon(img3);
		  exitButton.setFont(new Font("Tahoma",Font.BOLD,18));
		  Border emptyBorder2 = BorderFactory.createEmptyBorder();
		  exitButton.setBorder(emptyBorder2);
		  exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              frame.dispose();
            }
        });
		  footerPanel.add(exitButton);
		  frame.add(footerPanel, BorderLayout.SOUTH);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setVisible(true);
		  frame.setSize(800, 600);
	  }
public static void main(String []args) {
	  new Start();
  }
}

