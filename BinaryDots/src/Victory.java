import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Victory extends JPanel {

	public void paint(Graphics g) {
		Graphics2D frame = (Graphics2D) g;
		frame.setColor(Color.BLACK);
		frame.fillRect(50, 50, 500, 650);
		
		frame.setColor(Color.WHITE);
		frame.fillRect(150, 600, 130, 60);
		frame.fillRect(320, 600, 130, 60);
		

		g.setColor(Color.WHITE);
		Font f = new Font("Monospaced Bold", Font.BOLD, 70);
		Font f2 = new Font("Monospaced Bold", Font.PLAIN, 50);
		g.setFont(f);
		g.drawString("VICTORY!", 132, 175);
		frame.setStroke(new BasicStroke(5));
		frame.drawRect(100, 100, 400, 100);
		
		g.setFont(f2);
		g.drawString("Congragulations ", 110, 320);
		g.drawString("you have won:", 130, 370);
		g.setFont(f);
		g.drawString("Binary Dots", 100, 470);
		
		Font f3 = new Font("Monospaced Bold", Font.PLAIN, 20);
		g.setFont(f3);
		g.setColor(Color.BLACK);
		g.drawString("    MENU", 160, 635);
		g.drawString("   LEVELS", 330, 635);
		

//		g.setColor(Color.BLACK);
//		g.drawString("   MENU", 160, 635);
//		g.drawString("DIRECTIONS", 310, 635);
//		Font f3 = new Font("Monospaced Bold", Font.BOLD, 30);
//		g.setFont(f3);
//		g.drawString("LEVEL 1", 135, 340);
//		g.drawString("LEVEL 2", 325, 340);
//		g.drawString("LEVEL 3", 135, 440);
//		g.drawString("LEVEL 4", 325, 440);
//		g.drawString("LEVEL 5", 230, 540);
//		

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Binary Dots: Victory");
		frame.getContentPane().add(new Victory());
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.setSize(600, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

//		JPanel panel = new JPanel();
//		frame.add(panel);

	}
}
