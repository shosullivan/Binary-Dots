import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Levels extends JPanel {
	
	public void paint(Graphics g) {
		Graphics2D frame = (Graphics2D) g;
		frame.setColor(Color.BLACK);
		frame.fillRect(50, 50, 500, 650);
		frame.setColor(Color.WHITE);
		frame.fillRect(120, 300, 150, 60);
		frame.fillRect(310, 300, 150, 60);
		frame.fillRect(120, 400, 150, 60);
		frame.fillRect(310, 400, 150, 60);
		frame.fillRect(215, 500, 150, 60);
		frame.fillRect(150, 600, 110, 60);
		frame.fillRect(290, 600, 160, 60);
		
		
		
		Font f = new Font("Monospaced Bold", Font.BOLD, 73);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("Binary Dots", 100, 170);
		g.drawString("Levels", 200, 270);
		Font f2 = new Font("Monospaced Bold", Font.PLAIN, 20);
		g.setFont(f2);
		g.setColor(Color.BLACK);
		g.drawString("   MENU", 160, 635);
		g.drawString("DIRECTIONS", 310, 635);
		Font f3 = new Font("Monospaced Bold", Font.BOLD, 30);
		g.setFont(f3);
		g.drawString("LEVEL 1", 135, 340);
		g.drawString("LEVEL 2", 325, 340);
		g.drawString("LEVEL 3", 135, 440);
		g.drawString("LEVEL 4", 325, 440);
		g.drawString("LEVEL 5", 230, 540);
		
		
		
	}
	
	public static void main(String[] args){
		JFrame frame= new JFrame("Binary Dots: LEVELS");	
		frame.getContentPane().add(new Levels());
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.setSize(600, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		
//		JPanel panel = new JPanel();
//		frame.add(panel);
				
	}
}
