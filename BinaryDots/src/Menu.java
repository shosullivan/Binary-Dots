import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class Menu extends JPanel {
	
	public void paint(Graphics g) {
		Graphics2D frame = (Graphics2D) g;
		frame.setColor(Color.BLACK);
		frame.fillRect(50, 50, 500, 650);
		frame.setColor(Color.WHITE);
		frame.fillRect(150, 250, 300, 300);
		frame.setColor(Color.BLACK);
		frame.drawLine(250, 250, 250, 550);
		frame.drawLine(350, 250, 350, 550);
		frame.drawLine(150, 350, 450, 350);
		frame.drawLine(150, 450, 450, 450);
		frame.fillOval(160, 260, 80, 80);
		frame.fillOval(260, 260, 80, 80);
		frame.drawOval(360, 260, 80, 80);
		frame.drawOval(160, 360, 80, 80);
		frame.fillOval(360, 360, 80, 80);
		frame.drawOval(160, 460, 80, 80);
		frame.fillOval(260, 460, 80, 80);
		frame.drawOval(360, 460, 80, 80);
		
		//menu and direction buttons
		frame.setColor(Color.WHITE);
		frame.fillRect(150, 600, 110, 50);
		frame.fillRect(290, 600, 160, 50);
		
		
		
		Font f = new Font("Monospaced Bold", Font.BOLD, 73);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("Binary Dots", 100, 170);
		Font f2 = new Font("Monospaced Bold", Font.PLAIN, 20);
		g.setFont(f2);
		g.setColor(Color.BLACK);
		g.drawString(" LEVELS", 160, 632);
		g.drawString("DIRECTIONS", 310, 632);
		
		
	}
	
	final class Motion implements MouseListener{

		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args){
		/*JFrame frame= new JFrame("Binary Dots");	
		frame.getContentPane().add(new Menu());
		//frame.getContentPane().addMouseListener(new Motion());
		frame.setSize(600, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		*/
		/*JPanel panel = new JPanel();
		frame.add(panel);
		JButton start = new JButton("START");
		panel.add(start);
		JButton directions = new JButton("DIRECTIONS");
		panel.add(directions);
		*/
		
	}
	
	

}
