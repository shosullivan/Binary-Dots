import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Base extends JPanel{

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		
		//frame
		g2d.drawRect(0, 0, 500, 500);
		g2d.drawLine(50, 0, 50, 500);
		g2d.drawLine(100, 0, 100, 500);
		g2d.drawLine(150, 0, 150, 500);
		g2d.drawLine(200, 0, 200, 500);
		g2d.drawLine(250, 0, 250, 500);
		g2d.drawLine(300, 0, 300, 500);
		g2d.drawLine(350, 0, 350, 500);
		g2d.drawLine(400, 0, 400, 500);
		g2d.drawLine(450, 0, 450, 500);
		g2d.drawLine(500, 0, 500, 500);
		g2d.drawLine(0, 50, 500, 50);
		g2d.drawLine(0, 100, 500, 100);
		g2d.drawLine(0, 150, 500, 150);
		g2d.drawLine(0, 200, 500, 200);
		g2d.drawLine(0, 250, 500, 250);
		g2d.drawLine(0, 300, 500, 300);
		g2d.drawLine(0, 350, 500, 350);
		g2d.drawLine(0, 400, 500, 400);
		g2d.drawLine(0, 450, 500, 450);
		g2d.drawLine(0, 500, 500, 500);
		
		//row 1
		g2d.drawOval(10, 10, 30, 30);
		g2d.fillOval(60, 10, 30, 30);		
		g2d.fillOval(110, 10, 30, 30);		
		g2d.fillOval(210, 10, 30, 30);		
		g2d.drawOval(260, 10, 30, 30);
		g2d.fillOval(410, 10, 30, 30);		
		g2d.drawOval(460, 10, 30, 30);
		
		//row 2
		g2d.fillOval(60, 60, 30, 30);		
		g2d.drawOval(210, 60, 30, 30);		
		
		//row 3
		g2d.drawOval(160, 110, 30, 30);		
		g2d.drawOval(260, 110, 30, 30);		
		g2d.drawOval(460, 110, 30, 30);		
		
		//row 4
		g2d.drawOval(110, 160, 30, 30);		
		g2d.drawOval(260, 160, 30, 30);		
		g2d.fillOval(310, 160, 30, 30);		
		
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Binary Dots");
		frame.add(new Base());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

