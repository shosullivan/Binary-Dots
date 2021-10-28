import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;

public class GDisplay {

	private JPanel contentPane;
	
	private static boolean running = true;

	private static boolean isOnMenu = false;
	private static boolean isOnDirections = false;
	private static boolean isOnLevels = true;
	private static boolean isOnL1 = false;
	private static boolean isOnL2 = false;
	private static boolean isOnL3 = false;
	private static boolean isOnL4 = false;
	private static boolean isOnL5 = false;
	private static boolean change = false;
	private static boolean paintJob = false;
	
	private static boolean isOnFill = true;
	
//	private static boolean isOnLoser = false;
	
	
	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public static boolean change() {
		return change;
	}

	public static void setChange(boolean b) {
		change = b;
	}
	
//	public static boolean isOnLoser() {
//		return isOnLoser;
//	}
//
//	public static void setLoser(boolean b) {
//		isOnLoser = b;
//	}
//	
	public static boolean paintJob() {
		return paintJob;
	}

	public static void setpaintJob(boolean b) {
		paintJob = b;
	}
	
	public static boolean isOnFill() {
		return isOnFill;
	}

	public static void setisOnFill(boolean b) {
		isOnFill = b;
	}
	
	public static boolean isOnMenu() {
		return isOnMenu;
	}

	public static void setOnMenu(boolean b) {
		isOnMenu = b;
	}

	public static boolean isOnDirections() {
		return isOnDirections;
	}

	public static void setOnDirections(boolean b) {
		isOnDirections = b;
	}

	public static boolean isOnLevels() {
		return isOnLevels;
	}

	public static void setOnLevels(boolean b) {
		isOnLevels = b;
	}

	public static boolean isOnL1() {
		return isOnL1;
	}

	public static void setOnL1(boolean b) {
		isOnL1 = b;
	}

	public static boolean isOnL2() {
		return isOnL2;
	}

	public static void setOnL2(boolean b) {
		isOnL2 = b;
	}

	public static boolean isOnL3() {
		return isOnL3;
	}

	public static void setOnL3(boolean b) {
		isOnL3 = b;
	}

	public static boolean isOnL4() {
		return isOnL4;
	}

	public static void setOnL4(boolean b) {
		isOnL4 = b;
	}

	public static boolean isOnL5() {
		return isOnL5;
	}

	public static void setOnL5(boolean b) {
		isOnL5 = b;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int x;
	private int y;
	
	
	public GDisplay(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setSize(1100,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

//		if(isOnMenu==true)
//			frame.getContentPane().add(new Menu());
//		if(isOnDirections==true)
//			frame.getContentPane().add(new Directions());
//		if(isOnLevels==true)
//			frame.getContentPane().add(new Levels());
//		if(isOnL1==true)
//			frame.getContentPane().add(new Level1());
//		if(isOnL2==true)
//			frame.getContentPane().add(new Level2());
//		if(isOnL3==true)
//			frame.getContentPane().add(new Level3());
//		if(isOnL4==true)
//			frame.getContentPane().add(new Level4());
//		if(isOnL5==true)
//			frame.getContentPane().add(new Level5());
//		frame.getContentPane().addMouseListener(new ClickListener(frame));

		start(frame);
//		if(change==true)
//		{
//			change=false;
//			if(isOnMenu==true)
//				frame.getContentPane().add(new Menu());
//			if(isOnDirections==true)
//				frame.getContentPane().add(new Directions());
//			if(isOnLevels==true)
//				frame.getContentPane().add(new Levels());
//			if(isOnL1==true)
//				frame.getContentPane().add(new Level1());
//			if(isOnL2==true)
//				frame.getContentPane().add(new Level2());
//			if(isOnL3==true)
//				frame.getContentPane().add(new Level3());
//			if(isOnL4==true)
//				frame.getContentPane().add(new Level4());
//			if(isOnL5==true)
//				frame.getContentPane().add(new Level5());
//			frame.getContentPane().addMouseListener(new ClickListener(frame));
//			
//		}
		
		if(paintJob=true)
			frame.repaint();
	}
	
	public static void setPanel(JPanel panel, JFrame frame)
	{
		frame.getContentPane().removeAll();
		frame.getContentPane().add(panel);
		frame.repaint();
		
	}
	
	public static void start(JFrame frame)
	{
//		JFrame frame= new JFrame();
//		frame.setSize(1100,1000);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);

		if(isOnMenu==true)
			setPanel(new Menu(), frame);
		if(isOnDirections==true)
			setPanel(new Directions(), frame);
		if(isOnLevels==true)
			setPanel(new Levels(), frame);
		if(isOnL1==true)
			setPanel(new Level1(), frame);
		if(isOnL2==true)
			setPanel(new Level2(), frame);
		if(isOnL3==true)
			setPanel(new Level3(), frame);
		if(isOnL4==true)
			setPanel(new Level4(), frame);
		if(isOnL5==true)
			setPanel(new Level5(), frame);
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.repaint();
//		if(change==true)
//		{
//			change=false;
//			if(isOnMenu==true)
//				frame.getContentPane().add(new Menu());
//			if(isOnDirections==true)
//				frame.getContentPane().add(new Directions());
//			if(isOnLevels==true)
//				frame.getContentPane().add(new Levels());
//			if(isOnL1==true)
//				frame.getContentPane().add(new Level1());
//			if(isOnL2==true)
//				frame.getContentPane().add(new Level2());
//			if(isOnL3==true)
//				frame.getContentPane().add(new Level3());
//			if(isOnL4==true)
//				frame.getContentPane().add(new Level4());
//			if(isOnL5==true)
//				frame.getContentPane().add(new Level5());
//			frame.getContentPane().addMouseListener(new ClickListener(frame));
//			
//		}
//		
		if(paintJob=true)
			frame.repaint();
	}
	
}

