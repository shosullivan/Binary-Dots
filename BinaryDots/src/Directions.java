import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Directions extends JPanel {
	
	public void paint(Graphics g) {
		Graphics2D frame = (Graphics2D) g;
		frame.setColor(Color.BLACK);
		frame.fillRect(50, 50, 500, 800);
		
		//tip for user
		frame.setColor(Color.RED);
		frame.fillRect(150, 700, 300, 80);
		frame.setColor(Color.WHITE);
		Font tip = new Font("Monospaced Bold", Font.BOLD, 13);
		g.setFont(tip);
		g.drawString("TIP: Do not touch circles even if", 160, 725);
		g.drawString("they are already there, an X may be given", 160, 750);
		
		frame.setColor(Color.WHITE);
		frame.fillRect(150, 600, 110, 60);
		frame.fillRect(290, 600, 160, 60);
		frame.fillRect(115, 300, 370, 280);
		
		
		Font f = new Font("Monospaced Bold", Font.BOLD, 73);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("Binary Dots", 100, 170);
		g.drawString("Directions", 122, 270);
		Font f2 = new Font("Monospaced Bold", Font.PLAIN, 20);
		g.setFont(f2);
		g.setColor(Color.BLACK);
		g.drawString("   MENU", 160, 635);
		g.drawString("LEVELS", 330, 635);
		Font f3 = new Font("Monospaced Bold", Font.BOLD, 15);
		g.setFont(f3);
		g.drawString("GOAL: Fill in the empty spots with the correct dot", 130, 320);
		g.drawString("DIRECTIONS:", 130, 340);
		g.drawString("-Select color on bottom of page", 150, 360);
		g.drawString("-Click empty spot to place dot", 150, 380);
		g.drawString("-If correct, the spot will fill in", 150, 400);
		g.drawString("-If incorrect, the spot will fill, but an X is gained", 150, 420);
		g.drawString("-5 X's and the level is failed", 150, 440);
		g.drawString("RULES:", 130, 460);
		g.drawString("-Cannot have more than 2 dots of the same", 150, 480);
		g.drawString(" color next to each other", 150, 500);
		g.drawString("-Each row and column always has an equal", 150, 520);
		g.drawString(" number of each color", 150, 540);
		g.drawString("-Each row and column is unique, no repeats", 150, 560);
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		JFrame frame= new JFrame("Binary Dots: DIRECTIONS");	
		frame.getContentPane().add(new Directions());
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.setSize(600, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		
//		JPanel panel = new JPanel();
//		frame.add(panel);
				
	}
}
