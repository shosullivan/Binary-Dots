import javax.swing.*;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Binary Dots");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("hello");
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(label);
		
		JButton start = new JButton("START");
		panel.add(start);
		
	}
}


