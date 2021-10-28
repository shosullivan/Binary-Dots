import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1 extends JPanel implements MouseListener {
	
	private static int l1wrong = 0;
	
	private static boolean d1 = false;
	private static boolean d2 = true;
	private static boolean d3 = true;
	private static boolean d4 = true;
	private static boolean d5 = false;
	private static boolean d6 = false;
	private static boolean d7 = false;
	private static boolean d8 = false;
	private static boolean d9 = false;
	private static boolean d10 = true;
	private static boolean d11 = false;
	private static boolean d12 = true;
	private static boolean d13 = false;
	private static boolean d14 = true;
	private static boolean d15 = false;
	private static boolean d16 = false;
	private static boolean d17 = false;
	private static boolean d18 = false;
	private static boolean d19 = false;
	private static boolean d20 = true;
	private static boolean d21 = false;
	private static boolean d22 = false;
	private static boolean d23 = false;
	private static boolean d24 = false;
	private static boolean d25 = false;
	private static boolean d26 = false;
	private static boolean d27 = true;
	private static boolean d28 = true;
	private static boolean d29 = true;
	private static boolean d30 = false;
	private static boolean d31 = false;
	private static boolean d32 = false;
	private static boolean d33 = true;
	private static boolean d34 = false;
	private static boolean d35 = false;
	private static boolean d36 = false;
	private static boolean d37 = true;
	private static boolean d38 = false;
	private static boolean d39 = false;
	private static boolean d40 = false;
	private static boolean d41 = true;
	private static boolean d42 = false;
	private static boolean d43 = false;
	private static boolean d44 = true;
	private static boolean d45 = true;
	private static boolean d46 = false;
	private static boolean d47 = false;
	private static boolean d48 = true;
	private static boolean d49 = false;
	private static boolean d50 = true;
	private static boolean d51 = false;
	private static boolean d52 = true;
	private static boolean d53 = false;
	private static boolean d54 = false;
	private static boolean d55 = false;
	private static boolean d56 = false;
	private static boolean d57 = false;
	private static boolean d58 = false;
	private static boolean d59 = true;
	private static boolean d60 = false;
	private static boolean d61 = false;
	private static boolean d62 = false;
	private static boolean d63 = true;
	private static boolean d64 = false;
	private static boolean d65 = true;
	private static boolean d66 = true;
	private static boolean d67 = false;
	private static boolean d68 = false;
	private static boolean d69 = false;
	private static boolean d70 = false;
	private static boolean d71 = false;
	private static boolean d72 = false;
	private static boolean d73 = true;
	private static boolean d74 = false;
	private static boolean d75 = false;
	private static boolean d76 = true;
	private static boolean d77 = true;
	private static boolean d78 = false;
	private static boolean d79 = true;
	private static boolean d80 = true;
	private static boolean d81 = true;
	private static boolean d82 = false;
	private static boolean d83 = true;
	private static boolean d84 = false;
	private static boolean d85 = false;
	private static boolean d86 = false;
	private static boolean d87 = true;
	private static boolean d88 = false;
	private static boolean d89 = false;
	private static boolean d90 = true;
	private static boolean d91 = false;
	private static boolean d92 = false;
	private static boolean d93 = true;
	private static boolean d94 = false;
	private static boolean d95 = true;
	private static boolean d96 = true;
	private static boolean d97 = false;
	private static boolean d98 = false;
	private static boolean d99 = false;
	private static boolean d100 = false;
	
	public static int isWrong() {
		return l1wrong;
	}

	public static void setWrong(int w) {
		Level1.l1wrong = w;
	}
	
	public static boolean isD2() {
		return d2;
	}

	public static void setD2(boolean d2) {
		Level1.d2 = d2;
	}

	public static boolean isD3() {
		return d3;
	}

	public static void setD3(boolean d3) {
		Level1.d3 = d3;
	}

	public static boolean isD4() {
		return d4;
	}

	public static void setD4(boolean d4) {
		Level1.d4 = d4;
	}

	public static boolean isD5() {
		return d5;
	}

	public static void setD5(boolean d5) {
		Level1.d5 = d5;
	}

	public static boolean isD6() {
		return d6;
	}

	public static void setD6(boolean d6) {
		Level1.d6 = d6;
	}

	public static boolean isD7() {
		return d7;
	}

	public static void setD7(boolean d7) {
		Level1.d7 = d7;
	}

	public static boolean isD8() {
		return d8;
	}

	public static void setD8(boolean d8) {
		Level1.d8 = d8;
	}

	public static boolean isD9() {
		return d9;
	}

	public static void setD9(boolean d9) {
		Level1.d9 = d9;
	}

	public static boolean isD10() {
		return d10;
	}

	public static void setD10(boolean d10) {
		Level1.d10 = d10;
	}

	public static boolean isD11() {
		return d11;
	}

	public static void setD11(boolean d11) {
		Level1.d11 = d11;
	}

	public static boolean isD12() {
		return d12;
	}

	public static void setD12(boolean d12) {
		Level1.d12 = d12;
	}

	public static boolean isD13() {
		return d13;
	}

	public static void setD13(boolean d13) {
		Level1.d13 = d13;
	}

	public static boolean isD14() {
		return d14;
	}

	public static void setD14(boolean d14) {
		Level1.d14 = d14;
	}

	public static boolean isD15() {
		return d15;
	}

	public static void setD15(boolean d15) {
		Level1.d15 = d15;
	}

	public static boolean isD16() {
		return d16;
	}

	public static void setD16(boolean d16) {
		Level1.d16 = d16;
	}

	public static boolean isD17() {
		return d17;
	}

	public static void setD17(boolean d17) {
		Level1.d17 = d17;
	}

	public static boolean isD18() {
		return d18;
	}

	public static void setD18(boolean d18) {
		Level1.d18 = d18;
	}

	public static boolean isD19() {
		return d19;
	}

	public static void setD19(boolean d19) {
		Level1.d19 = d19;
	}

	public static boolean isD20() {
		return d20;
	}

	public static void setD20(boolean d20) {
		Level1.d20 = d20;
	}

	public static boolean isD21() {
		return d21;
	}

	public static void setD21(boolean d21) {
		Level1.d21 = d21;
	}

	public static boolean isD22() {
		return d22;
	}

	public static void setD22(boolean d22) {
		Level1.d22 = d22;
	}

	public static boolean isD23() {
		return d23;
	}

	public static void setD23(boolean d23) {
		Level1.d23 = d23;
	}

	public static boolean isD24() {
		return d24;
	}

	public static void setD24(boolean d24) {
		Level1.d24 = d24;
	}

	public static boolean isD25() {
		return d25;
	}

	public static void setD25(boolean d25) {
		Level1.d25 = d25;
	}

	public static boolean isD26() {
		return d26;
	}

	public static void setD26(boolean d26) {
		Level1.d26 = d26;
	}

	public static boolean isD27() {
		return d27;
	}

	public static void setD27(boolean d27) {
		Level1.d27 = d27;
	}

	public static boolean isD28() {
		return d28;
	}

	public static void setD28(boolean d28) {
		Level1.d28 = d28;
	}

	public static boolean isD29() {
		return d29;
	}

	public static void setD29(boolean d29) {
		Level1.d29 = d29;
	}

	public static boolean isD30() {
		return d30;
	}

	public static void setD30(boolean d30) {
		Level1.d30 = d30;
	}

	public static boolean isD31() {
		return d31;
	}

	public static void setD31(boolean d31) {
		Level1.d31 = d31;
	}

	public static boolean isD32() {
		return d32;
	}

	public static void setD32(boolean d32) {
		Level1.d32 = d32;
	}

	public static boolean isD33() {
		return d33;
	}

	public static void setD33(boolean d33) {
		Level1.d33 = d33;
	}

	public static boolean isD34() {
		return d34;
	}

	public static void setD34(boolean d34) {
		Level1.d34 = d34;
	}

	public static boolean isD35() {
		return d35;
	}

	public static void setD35(boolean d35) {
		Level1.d35 = d35;
	}

	public static boolean isD36() {
		return d36;
	}

	public static void setD36(boolean d36) {
		Level1.d36 = d36;
	}

	public static boolean isD37() {
		return d37;
	}

	public static void setD37(boolean d37) {
		Level1.d37 = d37;
	}

	public static boolean isD38() {
		return d38;
	}

	public static void setD38(boolean d38) {
		Level1.d38 = d38;
	}

	public static boolean isD39() {
		return d39;
	}

	public static void setD39(boolean d39) {
		Level1.d39 = d39;
	}

	public static boolean isD40() {
		return d40;
	}

	public static void setD40(boolean d40) {
		Level1.d40 = d40;
	}

	public static boolean isD41() {
		return d41;
	}

	public static void setD41(boolean d41) {
		Level1.d41 = d41;
	}

	public static boolean isD42() {
		return d42;
	}

	public static void setD42(boolean d42) {
		Level1.d42 = d42;
	}

	public static boolean isD43() {
		return d43;
	}

	public static void setD43(boolean d43) {
		Level1.d43 = d43;
	}

	public static boolean isD44() {
		return d44;
	}

	public static void setD44(boolean d44) {
		Level1.d44 = d44;
	}

	public static boolean isD45() {
		return d45;
	}

	public static void setD45(boolean d45) {
		Level1.d45 = d45;
	}

	public static boolean isD46() {
		return d46;
	}

	public static void setD46(boolean d46) {
		Level1.d46 = d46;
	}

	public static boolean isD47() {
		return d47;
	}

	public static void setD47(boolean d47) {
		Level1.d47 = d47;
	}

	public static boolean isD48() {
		return d48;
	}

	public static void setD48(boolean d48) {
		Level1.d48 = d48;
	}

	public static boolean isD49() {
		return d49;
	}

	public static void setD49(boolean d49) {
		Level1.d49 = d49;
	}

	public static boolean isD50() {
		return d50;
	}

	public static void setD50(boolean d50) {
		Level1.d50 = d50;
	}

	public static boolean isD51() {
		return d51;
	}

	public static void setD51(boolean d51) {
		Level1.d51 = d51;
	}

	public static boolean isD52() {
		return d52;
	}

	public static void setD52(boolean d52) {
		Level1.d52 = d52;
	}

	public static boolean isD53() {
		return d53;
	}

	public static void setD53(boolean d53) {
		Level1.d53 = d53;
	}

	public static boolean isD54() {
		return d54;
	}

	public static void setD54(boolean d54) {
		Level1.d54 = d54;
	}

	public static boolean isD55() {
		return d55;
	}

	public static void setD55(boolean d55) {
		Level1.d55 = d55;
	}

	public static boolean isD56() {
		return d56;
	}

	public static void setD56(boolean d56) {
		Level1.d56 = d56;
	}

	public static boolean isD57() {
		return d57;
	}

	public static void setD57(boolean d57) {
		Level1.d57 = d57;
	}

	public static boolean isD58() {
		return d58;
	}

	public static void setD58(boolean d58) {
		Level1.d58 = d58;
	}

	public static boolean isD59() {
		return d59;
	}

	public static void setD59(boolean d59) {
		Level1.d59 = d59;
	}

	public static boolean isD60() {
		return d60;
	}

	public static void setD60(boolean d60) {
		Level1.d60 = d60;
	}

	public static boolean isD61() {
		return d61;
	}

	public static void setD61(boolean d61) {
		Level1.d61 = d61;
	}

	public static boolean isD62() {
		return d62;
	}

	public static void setD62(boolean d62) {
		Level1.d62 = d62;
	}

	public static boolean isD63() {
		return d63;
	}

	public static void setD63(boolean d63) {
		Level1.d63 = d63;
	}

	public static boolean isD64() {
		return d64;
	}

	public static void setD64(boolean d64) {
		Level1.d64 = d64;
	}

	public static boolean isD65() {
		return d65;
	}

	public static void setD65(boolean d65) {
		Level1.d65 = d65;
	}

	public static boolean isD66() {
		return d66;
	}

	public static void setD66(boolean d66) {
		Level1.d66 = d66;
	}

	public static boolean isD67() {
		return d67;
	}

	public static void setD67(boolean d67) {
		Level1.d67 = d67;
	}

	public static boolean isD68() {
		return d68;
	}

	public static void setD68(boolean d68) {
		Level1.d68 = d68;
	}

	public static boolean isD69() {
		return d69;
	}

	public static void setD69(boolean d69) {
		Level1.d69 = d69;
	}

	public static boolean isD70() {
		return d70;
	}

	public static void setD70(boolean d70) {
		Level1.d70 = d70;
	}

	public static boolean isD71() {
		return d71;
	}

	public static void setD71(boolean d71) {
		Level1.d71 = d71;
	}

	public static boolean isD72() {
		return d72;
	}

	public static void setD72(boolean d72) {
		Level1.d72 = d72;
	}

	public static boolean isD73() {
		return d73;
	}

	public static void setD73(boolean d73) {
		Level1.d73 = d73;
	}

	public static boolean isD74() {
		return d74;
	}

	public static void setD74(boolean d74) {
		Level1.d74 = d74;
	}

	public static boolean isD75() {
		return d75;
	}

	public static void setD75(boolean d75) {
		Level1.d75 = d75;
	}

	public static boolean isD76() {
		return d76;
	}

	public static void setD76(boolean d76) {
		Level1.d76 = d76;
	}

	public static boolean isD77() {
		return d77;
	}

	public static void setD77(boolean d77) {
		Level1.d77 = d77;
	}

	public static boolean isD78() {
		return d78;
	}

	public static void setD78(boolean d78) {
		Level1.d78 = d78;
	}

	public static boolean isD79() {
		return d79;
	}

	public static void setD79(boolean d79) {
		Level1.d79 = d79;
	}

	public static boolean isD80() {
		return d80;
	}

	public static void setD80(boolean d80) {
		Level1.d80 = d80;
	}

	public static boolean isD81() {
		return d81;
	}

	public static void setD81(boolean d81) {
		Level1.d81 = d81;
	}

	public static boolean isD82() {
		return d82;
	}

	public static void setD82(boolean d82) {
		Level1.d82 = d82;
	}

	public static boolean isD83() {
		return d83;
	}

	public static void setD83(boolean d83) {
		Level1.d83 = d83;
	}

	public static boolean isD84() {
		return d84;
	}

	public static void setD84(boolean d84) {
		Level1.d84 = d84;
	}

	public static boolean isD85() {
		return d85;
	}

	public static void setD85(boolean d85) {
		Level1.d85 = d85;
	}

	public static boolean isD86() {
		return d86;
	}

	public static void setD86(boolean d86) {
		Level1.d86 = d86;
	}

	public static boolean isD87() {
		return d87;
	}

	public static void setD87(boolean d87) {
		Level1.d87 = d87;
	}

	public static boolean isD88() {
		return d88;
	}

	public static void setD88(boolean d88) {
		Level1.d88 = d88;
	}

	public static boolean isD89() {
		return d89;
	}

	public static void setD89(boolean d89) {
		Level1.d89 = d89;
	}

	public static boolean isD90() {
		return d90;
	}

	public static void setD90(boolean d90) {
		Level1.d90 = d90;
	}

	public static boolean isD91() {
		return d91;
	}

	public static void setD91(boolean d91) {
		Level1.d91 = d91;
	}

	public static boolean isD92() {
		return d92;
	}

	public static void setD92(boolean d92) {
		Level1.d92 = d92;
	}

	public static boolean isD93() {
		return d93;
	}

	public static void setD93(boolean d93) {
		Level1.d93 = d93;
	}

	public static boolean isD94() {
		return d94;
	}

	public static void setD94(boolean d94) {
		Level1.d94 = d94;
	}

	public static boolean isD95() {
		return d95;
	}

	public static void setD95(boolean d95) {
		Level1.d95 = d95;
	}

	public static boolean isD96() {
		return d96;
	}

	public static void setD96(boolean d96) {
		Level1.d96 = d96;
	}

	public static boolean isD97() {
		return d97;
	}

	public static void setD97(boolean d97) {
		Level1.d97 = d97;
	}

	public static boolean isD98() {
		return d98;
	}

	public static void setD98(boolean d98) {
		Level1.d98 = d98;
	}

	public static boolean isD99() {
		return d99;
	}

	public static void setD99(boolean d99) {
		Level1.d99 = d99;
	}

	public static boolean isD100() {
		return d100;
	}

	public static void setD100(boolean d100) {
		Level1.d100 = d100;
	}

	public static boolean isD1() {
		return d1;
	}

	public static void setD1(boolean b) {
		d1 = b;
	}
	
	public void paint(Graphics g) {
		Graphics2D frame = (Graphics2D) g;
		frame.setColor(Color.BLACK);
		frame.fillRect(50, 50, 1000, 800);
		
		//big squares
		frame.setColor(Color.WHITE);
		frame.fillRect(120, 200, 500, 500);
		frame.fillRect(700, 50, 350, 800);
		frame.fillRect(275, 725, 200, 100);
		
		frame.setColor(Color.BLACK);
		//vertical lines
		frame.drawLine(120, 250, 620, 250);
		frame.drawLine(120, 300, 620, 300);
		frame.drawLine(120, 350, 620, 350);
		frame.drawLine(120, 400, 620, 400);
		frame.drawLine(120, 450, 620, 450);
		frame.drawLine(120, 500, 620, 500);
		frame.drawLine(120, 550, 620, 550);
		frame.drawLine(120, 600, 620, 600);
		frame.drawLine(120, 650, 620, 650);
		//horizontal lines
		frame.drawLine(170, 200, 170, 700);
		frame.drawLine(220, 200, 220, 700);
		frame.drawLine(270, 200, 270, 700);
		frame.drawLine(320, 200, 320, 700);
		frame.drawLine(370, 200, 370, 700);
		frame.drawLine(420, 200, 420, 700);
		frame.drawLine(470, 200, 470, 700);
		frame.drawLine(520, 200, 520, 700);
		frame.drawLine(570, 200, 570, 700);
		
		//bottom box for color selection
		frame.drawLine(325, 770, 425, 770);
		frame.drawLine(325, 820, 425, 820);
		frame.drawLine(325, 770, 325, 820);
		frame.drawLine(375, 770, 375, 820);
		frame.drawLine(425, 770, 425, 820);
		frame.drawOval(330, 775, 40, 40);
		frame.fillOval(380, 775, 40, 40);
		
		//how to tell which it is set to
		frame.setColor(Color.RED);
		if(GDisplay.isOnFill()==false)
			frame.drawRect(325, 770, 50, 50);
		else if(GDisplay.isOnFill()==true)
			frame.drawRect(375, 770, 50, 50);
		frame.setColor(Color.BLACK);
		
		//menu, levels, and direction buttons
		frame.fillRect(800, 630, 150, 50);
		frame.fillRect(800, 700, 150, 50);
		frame.fillRect(800, 770, 150, 50);
		
		//locations for X's
		frame.setColor(Color.BLACK);
		frame.setStroke(new BasicStroke(5));
        frame.drawRect(825, 100, 100, 100);
		frame.drawRect(825, 200, 100, 100);
		frame.drawRect(825, 300, 100, 100);
		frame.drawRect(825, 400, 100, 100);
		frame.drawRect(825, 500, 100, 100);
		
		//non red x's
		frame.setStroke(new BasicStroke(2));
	    frame.drawLine(835, 110, 915, 190);
		frame.drawLine(915, 110, 835, 190);
		frame.drawLine(835, 210, 915, 290);
		frame.drawLine(915, 210, 835, 290);
		frame.drawLine(835, 310, 915, 390);
		frame.drawLine(915, 310, 835, 390);
		frame.drawLine(835, 410, 915, 490);
		frame.drawLine(915, 410, 835, 490);
		frame.drawLine(835, 510, 915, 590);
		frame.drawLine(915, 510, 835, 590);
		
		Font f = new Font("Monospaced Bold", Font.BOLD, 73);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("Level 1", 250, 170);
		Font f2 = new Font("Monospaced Bold", Font.PLAIN, 20);
		g.setFont(f2);
		g.drawString("Menu", 850, 663);
		g.drawString("Levels", 845, 733);
		g.drawString("Directions", 830, 803);
		g.setColor(Color.BLACK);
		Font f3 = new Font("Monospaced Bold", Font.BOLD, 30);
		g.setFont(f3);
		g.drawString("COLOR:", 320, 755);
		
		
//		//level dots
//		frame.setStroke(new BasicStroke(1));
//		//row 1
//		frame.drawOval(175, 205, 40, 40);
//		frame.fillOval(225, 205, 40, 40);
//		frame.fillOval(275, 205, 40, 40);
//		frame.drawOval(575, 205, 40, 40);
//		//row 2
//		frame.drawOval(175, 255, 40, 40);
//		frame.drawOval(275, 255, 40, 40);
//		frame.drawOval(575, 255, 40, 40);
//		//row 3
//		frame.drawOval(425, 305, 40, 40);
//		frame.fillOval(475, 305, 40, 40);
//		frame.drawOval(525, 305, 40, 40);
//		//row 4
//		frame.drawOval(225, 355, 40, 40);
//		frame.drawOval(425, 355, 40, 40);
//		//row5
//		frame.fillOval(125, 405, 40, 40);
//		frame.drawOval(275, 405, 40, 40);
//		frame.drawOval(325, 405, 40, 40);
//		frame.drawOval(475, 405, 40, 40);
//		frame.drawOval(575, 405, 40, 40);
//		//row 6
//		frame.drawOval(175, 455, 40, 40);
//		frame.fillOval(525, 455, 40, 40);
//		//row 7
//		frame.drawOval(225, 505, 40, 40);
//		frame.drawOval(325, 505, 40, 40);
//		frame.drawOval(375, 505, 40, 40);
//		//row 8
//		frame.drawOval(225, 555, 40, 40);
//		frame.fillOval(375, 555, 40, 40);
//		frame.drawOval(425, 555, 40, 40);
//		frame.fillOval(525, 555, 40, 40);
//		frame.drawOval(575, 555, 40, 40);
//		//row 9
//		frame.fillOval(125, 605, 40, 40);
//		frame.fillOval(225, 605, 40, 40);
//		frame.drawOval(425, 605, 40, 40);
//		frame.drawOval(575, 605, 40, 40);
//		//row 10
//		frame.drawOval(225, 655, 40, 40);
//		frame.drawOval(325, 655, 40, 40);
//		frame.drawOval(375, 655, 40, 40);
		
		//input dots
		if(d1) frame.fillOval(125, 205, 40, 40);
		if(d2) frame.drawOval(175, 205, 40, 40);
		if(d3) frame.fillOval(225, 205, 40, 40);
		if(d4) frame.fillOval(275, 205, 40, 40);
		if(d5) frame.drawOval(325, 205, 40, 40);
		if(d6) frame.drawOval(375, 205, 40, 40);
		if(d7) frame.fillOval(425, 205, 40, 40);
		if(d8) frame.fillOval(475, 205, 40, 40);
		if(d9) frame.drawOval(525, 205, 40, 40);
		if(d10) frame.drawOval(575, 205, 40, 40);
		if(d11) frame.fillOval(125, 255, 40, 40);
		if(d12) frame.drawOval(175, 255, 40, 40);
		if(d13) frame.fillOval(225, 255, 40, 40);
		if(d14) frame.drawOval(275, 255, 40, 40);
		if(d15) frame.fillOval(325, 255, 40, 40);
		if(d16) frame.drawOval(375, 255, 40, 40);
		if(d17) frame.fillOval(425, 255, 40, 40);
		if(d18) frame.drawOval(475, 255, 40, 40);
		if(d19) frame.fillOval(525, 255, 40, 40);
		if(d20) frame.drawOval(575, 255, 40, 40);
		if(d21) frame.drawOval(125, 305, 40, 40);
		if(d22) frame.fillOval(175, 305, 40, 40);
		if(d23) frame.drawOval(225, 305, 40, 40);
		if(d24) frame.fillOval(275, 305, 40, 40);
		if(d25) frame.drawOval(325, 305, 40, 40);
		if(d26) frame.fillOval(375, 305, 40, 40);
		if(d27) frame.drawOval(425, 305, 40, 40);
		if(d28) frame.fillOval(475, 305, 40, 40);
		if(d29) frame.drawOval(525, 305, 40, 40);
		if(d30) frame.fillOval(575, 305, 40, 40);
		if(d31) frame.drawOval(125, 355, 40, 40);
		if(d32) frame.fillOval(175, 355, 40, 40);
		if(d33) frame.drawOval(225, 355, 40, 40);
		if(d34) frame.fillOval(275, 355, 40, 40);
		if(d35) frame.fillOval(325, 355, 40, 40);
		if(d36) frame.drawOval(375, 355, 40, 40);
		if(d37) frame.drawOval(425, 355, 40, 40);
		if(d38) frame.fillOval(475, 355, 40, 40);
		if(d39) frame.drawOval(525, 355, 40, 40);
		if(d40) frame.fillOval(575, 355, 40, 40);
		if(d41) frame.fillOval(125, 405, 40, 40);
		if(d42) frame.drawOval(175, 405, 40, 40);
		if(d43) frame.fillOval(225, 405, 40, 40);
		if(d44) frame.drawOval(275, 405, 40, 40);
		if(d45) frame.drawOval(325, 405, 40, 40);
		if(d46) frame.fillOval(375, 405, 40, 40);
		if(d47) frame.fillOval(425, 405, 40, 40);
		if(d48) frame.drawOval(475, 405, 40, 40);
		if(d49) frame.fillOval(525, 405, 40, 40);
		if(d50) frame.drawOval(575, 405, 40, 40);
		if(d51) frame.drawOval(125, 455, 40, 40);
		if(d52) frame.drawOval(175, 455, 40, 40);
		if(d53) frame.fillOval(225, 455, 40, 40);
		if(d54) frame.drawOval(275, 455, 40, 40);
		if(d55) frame.fillOval(325, 455, 40, 40);
		if(d56) frame.fillOval(375, 455, 40, 40);
		if(d57) frame.drawOval(425, 455, 40, 40);
		if(d58) frame.drawOval(475, 455, 40, 40);
		if(d59) frame.fillOval(525, 455, 40, 40);
		if(d60) frame.fillOval(575, 455, 40, 40);
		if(d61) frame.drawOval(125, 505, 40, 40);
		if(d62) frame.fillOval(175, 505, 40, 40);
		if(d63) frame.drawOval(225, 505, 40, 40);
		if(d64) frame.fillOval(275, 505, 40, 40);
		if(d65) frame.drawOval(325, 505, 40, 40);
		if(d66) frame.drawOval(375, 505, 40, 40);
		if(d67) frame.fillOval(425, 505, 40, 40);
		if(d68) frame.fillOval(475, 505, 40, 40);
		if(d69) frame.drawOval(525, 505, 40, 40);
		if(d70) frame.fillOval(575, 505, 40, 40);
		if(d71) frame.fillOval(125, 555, 40, 40);
		if(d72) frame.fillOval(175, 555, 40, 40);
		if(d73) frame.drawOval(225, 555, 40, 40);
		if(d74) frame.drawOval(275, 555, 40, 40);
		if(d75) frame.fillOval(325, 555, 40, 40);
		if(d76) frame.fillOval(375, 555, 40, 40);
		if(d77) frame.drawOval(425, 555, 40, 40);
		if(d78) frame.drawOval(475, 555, 40, 40);
		if(d79) frame.fillOval(525, 555, 40, 40);
		if(d80) frame.drawOval(575, 555, 40, 40);
		if(d81) frame.fillOval(125, 605, 40, 40);
		if(d82) frame.drawOval(175, 605, 40, 40);
		if(d83) frame.fillOval(225, 605, 40, 40);
		if(d84) frame.drawOval(275, 605, 40, 40);
		if(d85) frame.fillOval(325, 605, 40, 40);
		if(d86) frame.fillOval(375, 605, 40, 40);
		if(d87) frame.drawOval(425, 605, 40, 40);
		if(d88) frame.fillOval(475, 605, 40, 40);
		if(d89) frame.drawOval(525, 605, 40, 40);
		if(d90) frame.fillOval(575, 605, 40, 40);
		if(d91) frame.drawOval(125, 655, 40, 40);
		if(d92) frame.fillOval(175, 655, 40, 40);
		if(d93) frame.drawOval(225, 655, 40, 40);
		if(d94) frame.fillOval(275, 655, 40, 40);
		if(d95) frame.drawOval(325, 655, 40, 40);
		if(d96) frame.drawOval(375, 655, 40, 40);
		if(d97) frame.fillOval(425, 655, 40, 40);
		if(d98) frame.drawOval(475, 655, 40, 40);
		if(d99) frame.fillOval(525, 655, 40, 40);
		if(d100) frame.fillOval(575, 655, 40, 40);
		
		if(l1wrong>=1)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
	        frame.drawRect(825, 100, 100, 100);
	        frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 110, 915, 190);
			frame.drawLine(915, 110, 835, 190);
		}
		if(l1wrong>=2)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
			frame.drawRect(825, 200, 100, 100);
			frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 210, 915, 290);
			frame.drawLine(915, 210, 835, 290);
		}
		if(l1wrong>=3)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
	        frame.drawRect(825, 300, 100, 100);
	        frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 310, 915, 390);
			frame.drawLine(915, 310, 835, 390);
		}
		if(l1wrong>=4)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
	        frame.drawRect(825, 400, 100, 100);
	        frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 410, 915, 490);
			frame.drawLine(915, 410, 835, 490);
		}
		if(l1wrong>=5)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
	        frame.drawRect(825, 500, 100, 100);
			frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 510, 915, 590);
			frame.drawLine(915, 510, 835, 590);
		}
			
	}
	
	public void mouseClicked(MouseEvent e)
	{
		Graphics g=getGraphics();  
        g.setColor(Color.BLACK);  
		if(e.getX()>120&&e.getX()<170&&e.getY()>200&&e.getY()<250)
			g.fillOval(130, 210, 40, 40);
	}
	
	
	
	public static void main(String[] args){
		JFrame frame= new JFrame("Binary Dots: LEVEL 1");	
		frame.getContentPane().add(new Level1());
		frame.setSize(1100, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		
		JPanel panel = new JPanel();
		frame.add(panel);
				
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {	
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
