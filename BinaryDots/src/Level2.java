import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level2 extends JPanel {
	
	private static int l2wrong = 0;
	
	
	private static boolean l2d1 = true;
	private static boolean l2d2 = true;
	private static boolean l2d3 = true;
	private static boolean l2d4 = false;
	private static boolean l2d5 = true;
	private static boolean l2d6 = true;
	private static boolean l2d7 = false;
	private static boolean l2d8 = false;
	private static boolean l2d9 = true;
	private static boolean l2d10 = true;
	private static boolean l2d11 = false;
	private static boolean l2d12 = true;
	private static boolean l2d13 = false;
	private static boolean l2d14 = false;
	private static boolean l2d15 = true;
	private static boolean l2d16 = false;
	private static boolean l2d17 = false;
	private static boolean l2d18 = false;
	private static boolean l2d19 = true;
	private static boolean l2d20 = false;
	private static boolean l2d21 = true;
	private static boolean l2d22 = false;
	private static boolean l2d23 = false;
	private static boolean l2d24 = false;
	private static boolean l2d25 = false;
	private static boolean l2d26 = false;
	private static boolean l2d27 = false;
	private static boolean l2d28 = false;
	private static boolean l2d29 = false;
	private static boolean l2d30 = true;
	private static boolean l2d31 = false;
	private static boolean l2d32 = false;
	private static boolean l2d33 = true;
	private static boolean l2d34 = false;
	private static boolean l2d35 = false;
	private static boolean l2d36 = true;
	private static boolean l2d37 = true;
	private static boolean l2d38 = false;
	private static boolean l2d39 = false;
	private static boolean l2d40 = false;
	private static boolean l2d41 = false;
	private static boolean l2d42 = false;
	private static boolean l2d43 = true;
	private static boolean l2d44 = false;
	private static boolean l2d45 = false;
	private static boolean l2d46 = false;
	private static boolean l2d47 = false;
	private static boolean l2d48 = false;
	private static boolean l2d49 = false;
	private static boolean l2d50 = true;
	private static boolean l2d51 = false;
	private static boolean l2d52 = false;
	private static boolean l2d53 = false;
	private static boolean l2d54 = false;
	private static boolean l2d55 = true;
	private static boolean l2d56 = false;
	private static boolean l2d57 = false;
	private static boolean l2d58 = true;
	private static boolean l2d59 = false;
	private static boolean l2d60 = false;
	private static boolean l2d61 = false;
	private static boolean l2d62 = false;
	private static boolean l2d63 = false;
	private static boolean l2d64 = false;
	private static boolean l2d65 = false;
	private static boolean l2d66 = true;
	private static boolean l2d67 = false;
	private static boolean l2d68 = true;
	private static boolean l2d69 = true;
	private static boolean l2d70 = true;
	private static boolean l2d71 = true;
	private static boolean l2d72 = true;
	private static boolean l2d73 = false;
	private static boolean l2d74 = true;
	private static boolean l2d75 = false;
	private static boolean l2d76 = false;
	private static boolean l2d77 = false;
	private static boolean l2d78 = false;
	private static boolean l2d79 = false;
	private static boolean l2d80 = true;
	private static boolean l2d81 = false;
	private static boolean l2d82 = false;
	private static boolean l2d83 = false;
	private static boolean l2d84 = true;
	private static boolean l2d85 = false;
	private static boolean l2d86 = true;
	private static boolean l2d87 = false;
	private static boolean l2d88 = true;
	private static boolean l2d89 = false;
	private static boolean l2d90 = true;
	private static boolean l2d91 = false;
	private static boolean l2d92 = false;
	private static boolean l2d93 = false;
	private static boolean l2d94 = false;
	private static boolean l2d95 = false;
	private static boolean l2d96 = false;
	private static boolean l2d97 = false;
	private static boolean l2d98 = true;
	private static boolean l2d99 = true;
	private static boolean l2d100 = false;
	
	public static int isWrong() {
		return l2wrong;
	}

	public static void setWrong(int w) {
		Level2.l2wrong = w;
	}
	
	
	public static boolean isL2d1() {
		return l2d1;
	}

	public static void setL2d1(boolean l2d1) {
		Level2.l2d1 = l2d1;
	}

	public static boolean isL2d2() {
		return l2d2;
	}

	public static void setL2d2(boolean l2d2) {
		Level2.l2d2 = l2d2;
	}

	public static boolean isL2d3() {
		return l2d3;
	}

	public static void setL2d3(boolean l2d3) {
		Level2.l2d3 = l2d3;
	}

	public static boolean isL2d4() {
		return l2d4;
	}

	public static void setL2d4(boolean l2d4) {
		Level2.l2d4 = l2d4;
	}

	public static boolean isL2d5() {
		return l2d5;
	}

	public static void setL2d5(boolean l2d5) {
		Level2.l2d5 = l2d5;
	}

	public static boolean isL2d6() {
		return l2d6;
	}

	public static void setL2d6(boolean l2d6) {
		Level2.l2d6 = l2d6;
	}

	public static boolean isL2d7() {
		return l2d7;
	}

	public static void setL2d7(boolean l2d7) {
		Level2.l2d7 = l2d7;
	}

	public static boolean isL2d8() {
		return l2d8;
	}

	public static void setL2d8(boolean l2d8) {
		Level2.l2d8 = l2d8;
	}

	public static boolean isL2d9() {
		return l2d9;
	}

	public static void setL2d9(boolean l2d9) {
		Level2.l2d9 = l2d9;
	}

	public static boolean isL2d10() {
		return l2d10;
	}

	public static void setL2d10(boolean l2d10) {
		Level2.l2d10 = l2d10;
	}

	public static boolean isL2d11() {
		return l2d11;
	}

	public static void setL2d11(boolean l2d11) {
		Level2.l2d11 = l2d11;
	}

	public static boolean isL2d12() {
		return l2d12;
	}

	public static void setL2d12(boolean l2d12) {
		Level2.l2d12 = l2d12;
	}

	public static boolean isL2d13() {
		return l2d13;
	}

	public static void setL2d13(boolean l2d13) {
		Level2.l2d13 = l2d13;
	}

	public static boolean isL2d14() {
		return l2d14;
	}

	public static void setL2d14(boolean l2d14) {
		Level2.l2d14 = l2d14;
	}

	public static boolean isL2d15() {
		return l2d15;
	}

	public static void setL2d15(boolean l2d15) {
		Level2.l2d15 = l2d15;
	}

	public static boolean isL2d16() {
		return l2d16;
	}

	public static void setL2d16(boolean l2d16) {
		Level2.l2d16 = l2d16;
	}

	public static boolean isL2d17() {
		return l2d17;
	}

	public static void setL2d17(boolean l2d17) {
		Level2.l2d17 = l2d17;
	}

	public static boolean isL2d18() {
		return l2d18;
	}

	public static void setL2d18(boolean l2d18) {
		Level2.l2d18 = l2d18;
	}

	public static boolean isL2d19() {
		return l2d19;
	}

	public static void setL2d19(boolean l2d19) {
		Level2.l2d19 = l2d19;
	}

	public static boolean isL2d20() {
		return l2d20;
	}

	public static void setL2d20(boolean l2d20) {
		Level2.l2d20 = l2d20;
	}

	public static boolean isL2d21() {
		return l2d21;
	}

	public static void setL2d21(boolean l2d21) {
		Level2.l2d21 = l2d21;
	}

	public static boolean isL2d22() {
		return l2d22;
	}

	public static void setL2d22(boolean l2d22) {
		Level2.l2d22 = l2d22;
	}

	public static boolean isL2d23() {
		return l2d23;
	}

	public static void setL2d23(boolean l2d23) {
		Level2.l2d23 = l2d23;
	}

	public static boolean isL2d24() {
		return l2d24;
	}

	public static void setL2d24(boolean l2d24) {
		Level2.l2d24 = l2d24;
	}

	public static boolean isL2d25() {
		return l2d25;
	}

	public static void setL2d25(boolean l2d25) {
		Level2.l2d25 = l2d25;
	}

	public static boolean isL2d26() {
		return l2d26;
	}

	public static void setL2d26(boolean l2d26) {
		Level2.l2d26 = l2d26;
	}

	public static boolean isL2d27() {
		return l2d27;
	}

	public static void setL2d27(boolean l2d27) {
		Level2.l2d27 = l2d27;
	}

	public static boolean isL2d28() {
		return l2d28;
	}

	public static void setL2d28(boolean l2d28) {
		Level2.l2d28 = l2d28;
	}

	public static boolean isL2d29() {
		return l2d29;
	}

	public static void setL2d29(boolean l2d29) {
		Level2.l2d29 = l2d29;
	}

	public static boolean isL2d30() {
		return l2d30;
	}

	public static void setL2d30(boolean l2d30) {
		Level2.l2d30 = l2d30;
	}

	public static boolean isL2d31() {
		return l2d31;
	}

	public static void setL2d31(boolean l2d31) {
		Level2.l2d31 = l2d31;
	}

	public static boolean isL2d32() {
		return l2d32;
	}

	public static void setL2d32(boolean l2d32) {
		Level2.l2d32 = l2d32;
	}

	public static boolean isL2d33() {
		return l2d33;
	}

	public static void setL2d33(boolean l2d33) {
		Level2.l2d33 = l2d33;
	}

	public static boolean isL2d34() {
		return l2d34;
	}

	public static void setL2d34(boolean l2d34) {
		Level2.l2d34 = l2d34;
	}

	public static boolean isL2d35() {
		return l2d35;
	}

	public static void setL2d35(boolean l2d35) {
		Level2.l2d35 = l2d35;
	}

	public static boolean isL2d36() {
		return l2d36;
	}

	public static void setL2d36(boolean l2d36) {
		Level2.l2d36 = l2d36;
	}

	public static boolean isL2d37() {
		return l2d37;
	}

	public static void setL2d37(boolean l2d37) {
		Level2.l2d37 = l2d37;
	}

	public static boolean isL2d38() {
		return l2d38;
	}

	public static void setL2d38(boolean l2d38) {
		Level2.l2d38 = l2d38;
	}

	public static boolean isL2d39() {
		return l2d39;
	}

	public static void setL2d39(boolean l2d39) {
		Level2.l2d39 = l2d39;
	}

	public static boolean isL2d40() {
		return l2d40;
	}

	public static void setL2d40(boolean l2d40) {
		Level2.l2d40 = l2d40;
	}

	public static boolean isL2d41() {
		return l2d41;
	}

	public static void setL2d41(boolean l2d41) {
		Level2.l2d41 = l2d41;
	}

	public static boolean isL2d42() {
		return l2d42;
	}

	public static void setL2d42(boolean l2d42) {
		Level2.l2d42 = l2d42;
	}

	public static boolean isL2d43() {
		return l2d43;
	}

	public static void setL2d43(boolean l2d43) {
		Level2.l2d43 = l2d43;
	}

	public static boolean isL2d44() {
		return l2d44;
	}

	public static void setL2d44(boolean l2d44) {
		Level2.l2d44 = l2d44;
	}

	public static boolean isL2d45() {
		return l2d45;
	}

	public static void setL2d45(boolean l2d45) {
		Level2.l2d45 = l2d45;
	}

	public static boolean isL2d46() {
		return l2d46;
	}

	public static void setL2d46(boolean l2d46) {
		Level2.l2d46 = l2d46;
	}

	public static boolean isL2d47() {
		return l2d47;
	}

	public static void setL2d47(boolean l2d47) {
		Level2.l2d47 = l2d47;
	}

	public static boolean isL2d48() {
		return l2d48;
	}

	public static void setL2d48(boolean l2d48) {
		Level2.l2d48 = l2d48;
	}

	public static boolean isL2d49() {
		return l2d49;
	}

	public static void setL2d49(boolean l2d49) {
		Level2.l2d49 = l2d49;
	}

	public static boolean isL2d50() {
		return l2d50;
	}

	public static void setL2d50(boolean l2d50) {
		Level2.l2d50 = l2d50;
	}

	public static boolean isL2d51() {
		return l2d51;
	}

	public static void setL2d51(boolean l2d51) {
		Level2.l2d51 = l2d51;
	}

	public static boolean isL2d52() {
		return l2d52;
	}

	public static void setL2d52(boolean l2d52) {
		Level2.l2d52 = l2d52;
	}

	public static boolean isL2d53() {
		return l2d53;
	}

	public static void setL2d53(boolean l2d53) {
		Level2.l2d53 = l2d53;
	}

	public static boolean isL2d54() {
		return l2d54;
	}

	public static void setL2d54(boolean l2d54) {
		Level2.l2d54 = l2d54;
	}

	public static boolean isL2d55() {
		return l2d55;
	}

	public static void setL2d55(boolean l2d55) {
		Level2.l2d55 = l2d55;
	}

	public static boolean isL2d56() {
		return l2d56;
	}

	public static void setL2d56(boolean l2d56) {
		Level2.l2d56 = l2d56;
	}

	public static boolean isL2d57() {
		return l2d57;
	}

	public static void setL2d57(boolean l2d57) {
		Level2.l2d57 = l2d57;
	}

	public static boolean isL2d58() {
		return l2d58;
	}

	public static void setL2d58(boolean l2d58) {
		Level2.l2d58 = l2d58;
	}

	public static boolean isL2d59() {
		return l2d59;
	}

	public static void setL2d59(boolean l2d59) {
		Level2.l2d59 = l2d59;
	}

	public static boolean isL2d60() {
		return l2d60;
	}

	public static void setL2d60(boolean l2d60) {
		Level2.l2d60 = l2d60;
	}

	public static boolean isL2d61() {
		return l2d61;
	}

	public static void setL2d61(boolean l2d61) {
		Level2.l2d61 = l2d61;
	}

	public static boolean isL2d62() {
		return l2d62;
	}

	public static void setL2d62(boolean l2d62) {
		Level2.l2d62 = l2d62;
	}

	public static boolean isL2d63() {
		return l2d63;
	}

	public static void setL2d63(boolean l2d63) {
		Level2.l2d63 = l2d63;
	}

	public static boolean isL2d64() {
		return l2d64;
	}

	public static void setL2d64(boolean l2d64) {
		Level2.l2d64 = l2d64;
	}

	public static boolean isL2d65() {
		return l2d65;
	}

	public static void setL2d65(boolean l2d65) {
		Level2.l2d65 = l2d65;
	}

	public static boolean isL2d66() {
		return l2d66;
	}

	public static void setL2d66(boolean l2d66) {
		Level2.l2d66 = l2d66;
	}

	public static boolean isL2d67() {
		return l2d67;
	}

	public static void setL2d67(boolean l2d67) {
		Level2.l2d67 = l2d67;
	}

	public static boolean isL2d68() {
		return l2d68;
	}

	public static void setL2d68(boolean l2d68) {
		Level2.l2d68 = l2d68;
	}

	public static boolean isL2d69() {
		return l2d69;
	}

	public static void setL2d69(boolean l2d69) {
		Level2.l2d69 = l2d69;
	}

	public static boolean isL2d70() {
		return l2d70;
	}

	public static void setL2d70(boolean l2d70) {
		Level2.l2d70 = l2d70;
	}

	public static boolean isL2d71() {
		return l2d71;
	}

	public static void setL2d71(boolean l2d71) {
		Level2.l2d71 = l2d71;
	}

	public static boolean isL2d72() {
		return l2d72;
	}

	public static void setL2d72(boolean l2d72) {
		Level2.l2d72 = l2d72;
	}

	public static boolean isL2d73() {
		return l2d73;
	}

	public static void setL2d73(boolean l2d73) {
		Level2.l2d73 = l2d73;
	}

	public static boolean isL2d74() {
		return l2d74;
	}

	public static void setL2d74(boolean l2d74) {
		Level2.l2d74 = l2d74;
	}

	public static boolean isL2d75() {
		return l2d75;
	}

	public static void setL2d75(boolean l2d75) {
		Level2.l2d75 = l2d75;
	}

	public static boolean isL2d76() {
		return l2d76;
	}

	public static void setL2d76(boolean l2d76) {
		Level2.l2d76 = l2d76;
	}

	public static boolean isL2d77() {
		return l2d77;
	}

	public static void setL2d77(boolean l2d77) {
		Level2.l2d77 = l2d77;
	}

	public static boolean isL2d78() {
		return l2d78;
	}

	public static void setL2d78(boolean l2d78) {
		Level2.l2d78 = l2d78;
	}

	public static boolean isL2d79() {
		return l2d79;
	}

	public static void setL2d79(boolean l2d79) {
		Level2.l2d79 = l2d79;
	}

	public static boolean isL2d80() {
		return l2d80;
	}

	public static void setL2d80(boolean l2d80) {
		Level2.l2d80 = l2d80;
	}

	public static boolean isL2d81() {
		return l2d81;
	}

	public static void setL2d81(boolean l2d81) {
		Level2.l2d81 = l2d81;
	}

	public static boolean isL2d82() {
		return l2d82;
	}

	public static void setL2d82(boolean l2d82) {
		Level2.l2d82 = l2d82;
	}

	public static boolean isL2d83() {
		return l2d83;
	}

	public static void setL2d83(boolean l2d83) {
		Level2.l2d83 = l2d83;
	}

	public static boolean isL2d84() {
		return l2d84;
	}

	public static void setL2d84(boolean l2d84) {
		Level2.l2d84 = l2d84;
	}

	public static boolean isL2d85() {
		return l2d85;
	}

	public static void setL2d85(boolean l2d85) {
		Level2.l2d85 = l2d85;
	}

	public static boolean isL2d86() {
		return l2d86;
	}

	public static void setL2d86(boolean l2d86) {
		Level2.l2d86 = l2d86;
	}

	public static boolean isL2d87() {
		return l2d87;
	}

	public static void setL2d87(boolean l2d87) {
		Level2.l2d87 = l2d87;
	}

	public static boolean isL2d88() {
		return l2d88;
	}

	public static void setL2d88(boolean l2d88) {
		Level2.l2d88 = l2d88;
	}

	public static boolean isL2d89() {
		return l2d89;
	}

	public static void setL2d89(boolean l2d89) {
		Level2.l2d89 = l2d89;
	}

	public static boolean isL2d90() {
		return l2d90;
	}

	public static void setL2d90(boolean l2d90) {
		Level2.l2d90 = l2d90;
	}

	public static boolean isL2d91() {
		return l2d91;
	}

	public static void setL2d91(boolean l2d91) {
		Level2.l2d91 = l2d91;
	}

	public static boolean isL2d92() {
		return l2d92;
	}

	public static void setL2d92(boolean l2d92) {
		Level2.l2d92 = l2d92;
	}

	public static boolean isL2d93() {
		return l2d93;
	}

	public static void setL2d93(boolean l2d93) {
		Level2.l2d93 = l2d93;
	}

	public static boolean isL2d94() {
		return l2d94;
	}

	public static void setL2d94(boolean l2d94) {
		Level2.l2d94 = l2d94;
	}

	public static boolean isL2d95() {
		return l2d95;
	}

	public static void setL2d95(boolean l2d95) {
		Level2.l2d95 = l2d95;
	}

	public static boolean isL2d96() {
		return l2d96;
	}

	public static void setL2d96(boolean l2d96) {
		Level2.l2d96 = l2d96;
	}

	public static boolean isL2d97() {
		return l2d97;
	}

	public static void setL2d97(boolean l2d97) {
		Level2.l2d97 = l2d97;
	}

	public static boolean isL2d98() {
		return l2d98;
	}

	public static void setL2d98(boolean l2d98) {
		Level2.l2d98 = l2d98;
	}

	public static boolean isL2d99() {
		return l2d99;
	}

	public static void setL2d99(boolean l2d99) {
		Level2.l2d99 = l2d99;
	}

	public static boolean isL2d100() {
		return l2d100;
	}

	public static void setL2d100(boolean l2d100) {
		Level2.l2d100 = l2d100;
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
		frame.drawLine(120, 700, 620, 700);
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
		frame.drawLine(620, 200, 620, 700);
		
		//bottom drawings for color selection
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
		else
			frame.drawRect(375, 770, 50, 50);
		frame.setColor(Color.BLACK);
		
		//menu, levels and directions buttons
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
		g.drawString("Level 2", 250, 170);
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
//		frame.drawOval(125, 205, 40, 40);
//		frame.fillOval(175, 205, 40, 40);
//		frame.fillOval(225, 205, 40, 40);
//		frame.fillOval(325, 205, 40, 40);
//		frame.drawOval(375, 205, 40, 40);
//		frame.fillOval(525, 205, 40, 40);
//		frame.drawOval(575, 205, 40, 40);
//		//row 2
//		frame.fillOval(175, 255, 40, 40);
//		frame.drawOval(325, 255, 40, 40);
//		//row 3
//		frame.drawOval(275, 305, 40, 40);
//		frame.drawOval(375, 305, 40, 40);
//		frame.drawOval(575, 305, 40, 40);
//		//row 4
//		frame.drawOval(225, 355, 40, 40);
//		frame.drawOval(375, 355, 40, 40);
//		frame.fillOval(425, 355, 40, 40);
//		//row 5
//		frame.drawOval(225, 405, 40, 40);
//		frame.fillOval(575, 405, 40, 40);
//		//row 6
//		frame.drawOval(325, 455, 40, 40);
//		frame.fillOval(475, 455, 40, 40);
//		//row 7
//		frame.fillOval(375, 505, 40, 40);
//		frame.drawOval(475, 505, 40, 40);
//		frame.drawOval(525, 505, 40, 40);
//		frame.fillOval(575, 505, 40, 40);
//		//row 8
//		frame.fillOval(125, 555, 40, 40);
//		frame.drawOval(175, 555, 40, 40);
//		frame.drawOval(275, 555, 40, 40);
//		frame.drawOval(575, 555, 40, 40);
//		//row 9
//		frame.drawOval(275, 605, 40, 40);
//		frame.drawOval(375, 605, 40, 40);
//		frame.fillOval(475, 605, 40, 40);
//		frame.drawOval(575, 605, 40, 40);
//		//row 10
//		frame.drawOval(475, 655, 40, 40);
//		frame.drawOval(525, 655, 40, 40);
				
		//input dots
				if(l2d1) frame.drawOval(125, 205, 40, 40);
				if(l2d2) frame.fillOval(175, 205, 40, 40);
				if(l2d3) frame.fillOval(225, 205, 40, 40);
				if(l2d4) frame.drawOval(275, 205, 40, 40);
				if(l2d5) frame.fillOval(325, 205, 40, 40);
				if(l2d6) frame.drawOval(375, 205, 40, 40);
				if(l2d7) frame.drawOval(425, 205, 40, 40);
				if(l2d8) frame.fillOval(475, 205, 40, 40);
				if(l2d9) frame.fillOval(525, 205, 40, 40);
				if(l2d10) frame.drawOval(575, 205, 40, 40);
				if(l2d11) frame.drawOval(125, 255, 40, 40);
				if(l2d12) frame.fillOval(175, 255, 40, 40);
				if(l2d13) frame.drawOval(225, 255, 40, 40);
				if(l2d14) frame.fillOval(275, 255, 40, 40);
				if(l2d15) frame.drawOval(325, 255, 40, 40);
				if(l2d16) frame.fillOval(375, 255, 40, 40);
				if(l2d17) frame.drawOval(425, 255, 40, 40);
				if(l2d18) frame.drawOval(475, 255, 40, 40);
				if(l2d19) frame.fillOval(525, 255, 40, 40);
				if(l2d20) frame.fillOval(575, 255, 40, 40);
				if(l2d21) frame.fillOval(125, 305, 40, 40);
				if(l2d22) frame.drawOval(175, 305, 40, 40);
				if(l2d23) frame.fillOval(225, 305, 40, 40);
				if(l2d24) frame.drawOval(275, 305, 40, 40);
				if(l2d25) frame.fillOval(325, 305, 40, 40);
				if(l2d26) frame.drawOval(375, 305, 40, 40);
				if(l2d27) frame.fillOval(425, 305, 40, 40);
				if(l2d28) frame.fillOval(475, 305, 40, 40);
				if(l2d29) frame.drawOval(525, 305, 40, 40);
				if(l2d30) frame.drawOval(575, 305, 40, 40);
				if(l2d31) frame.fillOval(125, 355, 40, 40);
				if(l2d32) frame.drawOval(175, 355, 40, 40);
				if(l2d33) frame.drawOval(225, 355, 40, 40);
				if(l2d34) frame.fillOval(275, 355, 40, 40);
				if(l2d35) frame.drawOval(325, 355, 40, 40);
				if(l2d36) frame.drawOval(375, 355, 40, 40);
				if(l2d37) frame.fillOval(425, 355, 40, 40);
				if(l2d38) frame.fillOval(475, 355, 40, 40);
				if(l2d39) frame.drawOval(525, 355, 40, 40);
				if(l2d40) frame.fillOval(575, 355, 40, 40);
				if(l2d41) frame.drawOval(125, 405, 40, 40);
				if(l2d42) frame.fillOval(175, 405, 40, 40);
				if(l2d43) frame.drawOval(225, 405, 40, 40);
				if(l2d44) frame.drawOval(275, 405, 40, 40);
				if(l2d45) frame.fillOval(325, 405, 40, 40);
				if(l2d46) frame.fillOval(375, 405, 40, 40);
				if(l2d47) frame.drawOval(425, 405, 40, 40);
				if(l2d48) frame.drawOval(475, 405, 40, 40);
				if(l2d49) frame.fillOval(525, 405, 40, 40);
				if(l2d50) frame.fillOval(575, 405, 40, 40);
				if(l2d51) frame.fillOval(125, 455, 40, 40);
				if(l2d52) frame.drawOval(175, 455, 40, 40);
				if(l2d53) frame.fillOval(225, 455, 40, 40);
				if(l2d54) frame.fillOval(275, 455, 40, 40);
				if(l2d55) frame.drawOval(325, 455, 40, 40);
				if(l2d56) frame.drawOval(375, 455, 40, 40);
				if(l2d57) frame.fillOval(425, 455, 40, 40);
				if(l2d58) frame.fillOval(475, 455, 40, 40);
				if(l2d59) frame.drawOval(525, 455, 40, 40);
				if(l2d60) frame.drawOval(575, 455, 40, 40);
				if(l2d61) frame.drawOval(125, 505, 40, 40);
				if(l2d62) frame.fillOval(175, 505, 40, 40);
				if(l2d63) frame.drawOval(225, 505, 40, 40);
				if(l2d64) frame.fillOval(275, 505, 40, 40);
				if(l2d65) frame.drawOval(325, 505, 40, 40);
				if(l2d66) frame.fillOval(375, 505, 40, 40);
				if(l2d67) frame.fillOval(425, 505, 40, 40);
				if(l2d68) frame.drawOval(475, 505, 40, 40);
				if(l2d69) frame.drawOval(525, 505, 40, 40);
				if(l2d70) frame.fillOval(575, 505, 40, 40);
				if(l2d71) frame.fillOval(125, 555, 40, 40);
				if(l2d72) frame.drawOval(175, 555, 40, 40);
				if(l2d73) frame.fillOval(225, 555, 40, 40);
				if(l2d74) frame.drawOval(275, 555, 40, 40);
				if(l2d75) frame.fillOval(325, 555, 40, 40);
				if(l2d76) frame.fillOval(375, 555, 40, 40);
				if(l2d77) frame.drawOval(425, 555, 40, 40);
				if(l2d78) frame.drawOval(475, 555, 40, 40);
				if(l2d79) frame.fillOval(525, 555, 40, 40);
				if(l2d80) frame.drawOval(575, 555, 40, 40);
				if(l2d81) frame.fillOval(125, 605, 40, 40);
				if(l2d82) frame.fillOval(175, 605, 40, 40);
				if(l2d83) frame.drawOval(225, 605, 40, 40);
				if(l2d84) frame.drawOval(275, 605, 40, 40);
				if(l2d85) frame.fillOval(325, 605, 40, 40);
				if(l2d86) frame.drawOval(375, 605, 40, 40);
				if(l2d87) frame.drawOval(425, 605, 40, 40);
				if(l2d88) frame.fillOval(475, 605, 40, 40);
				if(l2d89) frame.fillOval(525, 605, 40, 40);
				if(l2d90) frame.drawOval(575, 605, 40, 40);
				if(l2d91) frame.drawOval(125, 655, 40, 40);
				if(l2d92) frame.drawOval(175, 655, 40, 40);
				if(l2d93) frame.fillOval(225, 655, 40, 40);
				if(l2d94) frame.fillOval(275, 655, 40, 40);
				if(l2d95) frame.drawOval(325, 655, 40, 40);
				if(l2d96) frame.fillOval(375, 655, 40, 40);
				if(l2d97) frame.fillOval(425, 655, 40, 40);
				if(l2d98) frame.drawOval(475, 655, 40, 40);
				if(l2d99) frame.drawOval(525, 655, 40, 40);
				if(l2d100) frame.fillOval(575, 655, 40, 40);
				
				if(l2wrong>=1)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 100, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 110, 915, 190);
					frame.drawLine(915, 110, 835, 190);
				}
				if(l2wrong>=2)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
					frame.drawRect(825, 200, 100, 100);
					frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 210, 915, 290);
					frame.drawLine(915, 210, 835, 290);
				}
				if(l2wrong>=3)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 300, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 310, 915, 390);
					frame.drawLine(915, 310, 835, 390);
				}
				if(l2wrong>=4)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 400, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 410, 915, 490);
					frame.drawLine(915, 410, 835, 490);
				}
				if(l2wrong>=5)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 500, 100, 100);
					frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 510, 915, 590);
					frame.drawLine(915, 510, 835, 590);
				}
	}
	
	public static void main(String[] args){
		JFrame frame= new JFrame("Binary Dots: LEVEL 2");	
		frame.getContentPane().add(new Level2());
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.setSize(1100, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		
		JPanel panel = new JPanel();
		frame.add(panel);
				
	}
}
