import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level4 extends JPanel{
	
	private static int l4wrong = 0;
	
	private static boolean l4d1 = true;
	private static boolean l4d2 = false;
	private static boolean l4d3 = false;
	private static boolean l4d4 = false;
	private static boolean l4d5 = true;
	private static boolean l4d6 = true;
	private static boolean l4d7 = false;
	private static boolean l4d8 = false;
	private static boolean l4d9 = false;
	private static boolean l4d10 = false;
	private static boolean l4d11 = false;
	private static boolean l4d12 = true;
	private static boolean l4d13 = false;
	private static boolean l4d14 = false;
	private static boolean l4d15 = true;
	private static boolean l4d16 = true;
	private static boolean l4d17 = false;
	private static boolean l4d18 = true;
	private static boolean l4d19 = false;
	private static boolean l4d20 = false;
	private static boolean l4d21 = false;
	private static boolean l4d22 = false;
	private static boolean l4d23 = false;
	private static boolean l4d24 = false;
	private static boolean l4d25 = true;
	private static boolean l4d26 = false;
	private static boolean l4d27 = true;
	private static boolean l4d28 = false;
	private static boolean l4d29 = true;
	private static boolean l4d30 = true;
	private static boolean l4d31 = false;
	private static boolean l4d32 = false;
	private static boolean l4d33 = true;
	private static boolean l4d34 = false;
	private static boolean l4d35 = false;
	private static boolean l4d36 = false;
	private static boolean l4d37 = false;
	private static boolean l4d38 = false;
	private static boolean l4d39 = false;
	private static boolean l4d40 = false;
	private static boolean l4d41 = true;
	private static boolean l4d42 = true;
	private static boolean l4d43 = false;
	private static boolean l4d44 = false;
	private static boolean l4d45 = false;
	private static boolean l4d46 = false;
	private static boolean l4d47 = false;
	private static boolean l4d48 = false;
	private static boolean l4d49 = true;
	private static boolean l4d50 = true;
	private static boolean l4d51 = false;
	private static boolean l4d52 = false;
	private static boolean l4d53 = false;
	private static boolean l4d54 = true;
	private static boolean l4d55 = false;
	private static boolean l4d56 = true;
	private static boolean l4d57 = false;
	private static boolean l4d58 = false;
	private static boolean l4d59 = false;
	private static boolean l4d60 = false;
	private static boolean l4d61 = true;
	private static boolean l4d62 = true;
	private static boolean l4d63 = false;
	private static boolean l4d64 = true;
	private static boolean l4d65 = false;
	private static boolean l4d66 = true;
	private static boolean l4d67 = false;
	private static boolean l4d68 = false;
	private static boolean l4d69 = true;
	private static boolean l4d70 = false;
	private static boolean l4d71 = true;
	private static boolean l4d72 = false;
	private static boolean l4d73 = false;
	private static boolean l4d74 = false;
	private static boolean l4d75 = false;
	private static boolean l4d76 = false;
	private static boolean l4d77 = false;
	private static boolean l4d78 = false;
	private static boolean l4d79 = true;
	private static boolean l4d80 = true;
	private static boolean l4d81 = false;
	private static boolean l4d82 = false;
	private static boolean l4d83 = true;
	private static boolean l4d84 = false;
	private static boolean l4d85 = false;
	private static boolean l4d86 = false;
	private static boolean l4d87 = false;
	private static boolean l4d88 = false;
	private static boolean l4d89 = false;
	private static boolean l4d90 = false;
	private static boolean l4d91 = true;
	private static boolean l4d92 = true;
	private static boolean l4d93 = false;
	private static boolean l4d94 = false;
	private static boolean l4d95 = true;
	private static boolean l4d96 = false;
	private static boolean l4d97 = true;
	private static boolean l4d98 = false;
	private static boolean l4d99 = false;
	private static boolean l4d100 = false;

	public static int isWrong() {
		return l4wrong;
	}

	public static void setWrong(int w) {
		Level4.l4wrong = w;
	}
	
	
	public static boolean isL4d1() {
		return l4d1;
	}

	public static void setL4d1(boolean l4d1) {
		Level4.l4d1 = l4d1;
	}

	public static boolean isL4d2() {
		return l4d2;
	}

	public static void setL4d2(boolean l4d2) {
		Level4.l4d2 = l4d2;
	}

	public static boolean isL4d3() {
		return l4d3;
	}

	public static void setL4d3(boolean l4d3) {
		Level4.l4d3 = l4d3;
	}

	public static boolean isL4d4() {
		return l4d4;
	}

	public static void setL4d4(boolean l4d4) {
		Level4.l4d4 = l4d4;
	}

	public static boolean isL4d5() {
		return l4d5;
	}

	public static void setL4d5(boolean l4d5) {
		Level4.l4d5 = l4d5;
	}

	public static boolean isL4d6() {
		return l4d6;
	}

	public static void setL4d6(boolean l4d6) {
		Level4.l4d6 = l4d6;
	}

	public static boolean isL4d7() {
		return l4d7;
	}

	public static void setL4d7(boolean l4d7) {
		Level4.l4d7 = l4d7;
	}

	public static boolean isL4d8() {
		return l4d8;
	}

	public static void setL4d8(boolean l4d8) {
		Level4.l4d8 = l4d8;
	}

	public static boolean isL4d9() {
		return l4d9;
	}

	public static void setL4d9(boolean l4d9) {
		Level4.l4d9 = l4d9;
	}

	public static boolean isL4d10() {
		return l4d10;
	}

	public static void setL4d10(boolean l4d10) {
		Level4.l4d10 = l4d10;
	}

	public static boolean isL4d11() {
		return l4d11;
	}

	public static void setL4d11(boolean l4d11) {
		Level4.l4d11 = l4d11;
	}

	public static boolean isL4d12() {
		return l4d12;
	}

	public static void setL4d12(boolean l4d12) {
		Level4.l4d12 = l4d12;
	}

	public static boolean isL4d13() {
		return l4d13;
	}

	public static void setL4d13(boolean l4d13) {
		Level4.l4d13 = l4d13;
	}

	public static boolean isL4d14() {
		return l4d14;
	}

	public static void setL4d14(boolean l4d14) {
		Level4.l4d14 = l4d14;
	}

	public static boolean isL4d15() {
		return l4d15;
	}

	public static void setL4d15(boolean l4d15) {
		Level4.l4d15 = l4d15;
	}

	public static boolean isL4d16() {
		return l4d16;
	}

	public static void setL4d16(boolean l4d16) {
		Level4.l4d16 = l4d16;
	}

	public static boolean isL4d17() {
		return l4d17;
	}

	public static void setL4d17(boolean l4d17) {
		Level4.l4d17 = l4d17;
	}

	public static boolean isL4d18() {
		return l4d18;
	}

	public static void setL4d18(boolean l4d18) {
		Level4.l4d18 = l4d18;
	}

	public static boolean isL4d19() {
		return l4d19;
	}

	public static void setL4d19(boolean l4d19) {
		Level4.l4d19 = l4d19;
	}

	public static boolean isL4d20() {
		return l4d20;
	}

	public static void setL4d20(boolean l4d20) {
		Level4.l4d20 = l4d20;
	}

	public static boolean isL4d21() {
		return l4d21;
	}

	public static void setL4d21(boolean l4d21) {
		Level4.l4d21 = l4d21;
	}

	public static boolean isL4d22() {
		return l4d22;
	}

	public static void setL4d22(boolean l4d22) {
		Level4.l4d22 = l4d22;
	}

	public static boolean isL4d23() {
		return l4d23;
	}

	public static void setL4d23(boolean l4d23) {
		Level4.l4d23 = l4d23;
	}

	public static boolean isL4d24() {
		return l4d24;
	}

	public static void setL4d24(boolean l4d24) {
		Level4.l4d24 = l4d24;
	}

	public static boolean isL4d25() {
		return l4d25;
	}

	public static void setL4d25(boolean l4d25) {
		Level4.l4d25 = l4d25;
	}

	public static boolean isL4d26() {
		return l4d26;
	}

	public static void setL4d26(boolean l4d26) {
		Level4.l4d26 = l4d26;
	}

	public static boolean isL4d27() {
		return l4d27;
	}

	public static void setL4d27(boolean l4d27) {
		Level4.l4d27 = l4d27;
	}

	public static boolean isL4d28() {
		return l4d28;
	}

	public static void setL4d28(boolean l4d28) {
		Level4.l4d28 = l4d28;
	}

	public static boolean isL4d29() {
		return l4d29;
	}

	public static void setL4d29(boolean l4d29) {
		Level4.l4d29 = l4d29;
	}

	public static boolean isL4d30() {
		return l4d30;
	}

	public static void setL4d30(boolean l4d30) {
		Level4.l4d30 = l4d30;
	}

	public static boolean isL4d31() {
		return l4d31;
	}

	public static void setL4d31(boolean l4d31) {
		Level4.l4d31 = l4d31;
	}

	public static boolean isL4d32() {
		return l4d32;
	}

	public static void setL4d32(boolean l4d32) {
		Level4.l4d32 = l4d32;
	}

	public static boolean isL4d33() {
		return l4d33;
	}

	public static void setL4d33(boolean l4d33) {
		Level4.l4d33 = l4d33;
	}

	public static boolean isL4d34() {
		return l4d34;
	}

	public static void setL4d34(boolean l4d34) {
		Level4.l4d34 = l4d34;
	}

	public static boolean isL4d35() {
		return l4d35;
	}

	public static void setL4d35(boolean l4d35) {
		Level4.l4d35 = l4d35;
	}

	public static boolean isL4d36() {
		return l4d36;
	}

	public static void setL4d36(boolean l4d36) {
		Level4.l4d36 = l4d36;
	}

	public static boolean isL4d37() {
		return l4d37;
	}

	public static void setL4d37(boolean l4d37) {
		Level4.l4d37 = l4d37;
	}

	public static boolean isL4d38() {
		return l4d38;
	}

	public static void setL4d38(boolean l4d38) {
		Level4.l4d38 = l4d38;
	}

	public static boolean isL4d39() {
		return l4d39;
	}

	public static void setL4d39(boolean l4d39) {
		Level4.l4d39 = l4d39;
	}

	public static boolean isL4d40() {
		return l4d40;
	}

	public static void setL4d40(boolean l4d40) {
		Level4.l4d40 = l4d40;
	}

	public static boolean isL4d41() {
		return l4d41;
	}

	public static void setL4d41(boolean l4d41) {
		Level4.l4d41 = l4d41;
	}

	public static boolean isL4d42() {
		return l4d42;
	}

	public static void setL4d42(boolean l4d42) {
		Level4.l4d42 = l4d42;
	}

	public static boolean isL4d43() {
		return l4d43;
	}

	public static void setL4d43(boolean l4d43) {
		Level4.l4d43 = l4d43;
	}

	public static boolean isL4d44() {
		return l4d44;
	}

	public static void setL4d44(boolean l4d44) {
		Level4.l4d44 = l4d44;
	}

	public static boolean isL4d45() {
		return l4d45;
	}

	public static void setL4d45(boolean l4d45) {
		Level4.l4d45 = l4d45;
	}

	public static boolean isL4d46() {
		return l4d46;
	}

	public static void setL4d46(boolean l4d46) {
		Level4.l4d46 = l4d46;
	}

	public static boolean isL4d47() {
		return l4d47;
	}

	public static void setL4d47(boolean l4d47) {
		Level4.l4d47 = l4d47;
	}

	public static boolean isL4d48() {
		return l4d48;
	}

	public static void setL4d48(boolean l4d48) {
		Level4.l4d48 = l4d48;
	}

	public static boolean isL4d49() {
		return l4d49;
	}

	public static void setL4d49(boolean l4d49) {
		Level4.l4d49 = l4d49;
	}

	public static boolean isL4d50() {
		return l4d50;
	}

	public static void setL4d50(boolean l4d50) {
		Level4.l4d50 = l4d50;
	}

	public static boolean isL4d51() {
		return l4d51;
	}

	public static void setL4d51(boolean l4d51) {
		Level4.l4d51 = l4d51;
	}

	public static boolean isL4d52() {
		return l4d52;
	}

	public static void setL4d52(boolean l4d52) {
		Level4.l4d52 = l4d52;
	}

	public static boolean isL4d53() {
		return l4d53;
	}

	public static void setL4d53(boolean l4d53) {
		Level4.l4d53 = l4d53;
	}

	public static boolean isL4d54() {
		return l4d54;
	}

	public static void setL4d54(boolean l4d54) {
		Level4.l4d54 = l4d54;
	}

	public static boolean isL4d55() {
		return l4d55;
	}

	public static void setL4d55(boolean l4d55) {
		Level4.l4d55 = l4d55;
	}

	public static boolean isL4d56() {
		return l4d56;
	}

	public static void setL4d56(boolean l4d56) {
		Level4.l4d56 = l4d56;
	}

	public static boolean isL4d57() {
		return l4d57;
	}

	public static void setL4d57(boolean l4d57) {
		Level4.l4d57 = l4d57;
	}

	public static boolean isL4d58() {
		return l4d58;
	}

	public static void setL4d58(boolean l4d58) {
		Level4.l4d58 = l4d58;
	}

	public static boolean isL4d59() {
		return l4d59;
	}

	public static void setL4d59(boolean l4d59) {
		Level4.l4d59 = l4d59;
	}

	public static boolean isL4d60() {
		return l4d60;
	}

	public static void setL4d60(boolean l4d60) {
		Level4.l4d60 = l4d60;
	}

	public static boolean isL4d61() {
		return l4d61;
	}

	public static void setL4d61(boolean l4d61) {
		Level4.l4d61 = l4d61;
	}

	public static boolean isL4d62() {
		return l4d62;
	}

	public static void setL4d62(boolean l4d62) {
		Level4.l4d62 = l4d62;
	}

	public static boolean isL4d63() {
		return l4d63;
	}

	public static void setL4d63(boolean l4d63) {
		Level4.l4d63 = l4d63;
	}

	public static boolean isL4d64() {
		return l4d64;
	}

	public static void setL4d64(boolean l4d64) {
		Level4.l4d64 = l4d64;
	}

	public static boolean isL4d65() {
		return l4d65;
	}

	public static void setL4d65(boolean l4d65) {
		Level4.l4d65 = l4d65;
	}

	public static boolean isL4d66() {
		return l4d66;
	}

	public static void setL4d66(boolean l4d66) {
		Level4.l4d66 = l4d66;
	}

	public static boolean isL4d67() {
		return l4d67;
	}

	public static void setL4d67(boolean l4d67) {
		Level4.l4d67 = l4d67;
	}

	public static boolean isL4d68() {
		return l4d68;
	}

	public static void setL4d68(boolean l4d68) {
		Level4.l4d68 = l4d68;
	}

	public static boolean isL4d69() {
		return l4d69;
	}

	public static void setL4d69(boolean l4d69) {
		Level4.l4d69 = l4d69;
	}

	public static boolean isL4d70() {
		return l4d70;
	}

	public static void setL4d70(boolean l4d70) {
		Level4.l4d70 = l4d70;
	}

	public static boolean isL4d71() {
		return l4d71;
	}

	public static void setL4d71(boolean l4d71) {
		Level4.l4d71 = l4d71;
	}

	public static boolean isL4d72() {
		return l4d72;
	}

	public static void setL4d72(boolean l4d72) {
		Level4.l4d72 = l4d72;
	}

	public static boolean isL4d73() {
		return l4d73;
	}

	public static void setL4d73(boolean l4d73) {
		Level4.l4d73 = l4d73;
	}

	public static boolean isL4d74() {
		return l4d74;
	}

	public static void setL4d74(boolean l4d74) {
		Level4.l4d74 = l4d74;
	}

	public static boolean isL4d75() {
		return l4d75;
	}

	public static void setL4d75(boolean l4d75) {
		Level4.l4d75 = l4d75;
	}

	public static boolean isL4d76() {
		return l4d76;
	}

	public static void setL4d76(boolean l4d76) {
		Level4.l4d76 = l4d76;
	}

	public static boolean isL4d77() {
		return l4d77;
	}

	public static void setL4d77(boolean l4d77) {
		Level4.l4d77 = l4d77;
	}

	public static boolean isL4d78() {
		return l4d78;
	}

	public static void setL4d78(boolean l4d78) {
		Level4.l4d78 = l4d78;
	}

	public static boolean isL4d79() {
		return l4d79;
	}

	public static void setL4d79(boolean l4d79) {
		Level4.l4d79 = l4d79;
	}

	public static boolean isL4d80() {
		return l4d80;
	}

	public static void setL4d80(boolean l4d80) {
		Level4.l4d80 = l4d80;
	}

	public static boolean isL4d81() {
		return l4d81;
	}

	public static void setL4d81(boolean l4d81) {
		Level4.l4d81 = l4d81;
	}

	public static boolean isL4d82() {
		return l4d82;
	}

	public static void setL4d82(boolean l4d82) {
		Level4.l4d82 = l4d82;
	}

	public static boolean isL4d83() {
		return l4d83;
	}

	public static void setL4d83(boolean l4d83) {
		Level4.l4d83 = l4d83;
	}

	public static boolean isL4d84() {
		return l4d84;
	}

	public static void setL4d84(boolean l4d84) {
		Level4.l4d84 = l4d84;
	}

	public static boolean isL4d85() {
		return l4d85;
	}

	public static void setL4d85(boolean l4d85) {
		Level4.l4d85 = l4d85;
	}

	public static boolean isL4d86() {
		return l4d86;
	}

	public static void setL4d86(boolean l4d86) {
		Level4.l4d86 = l4d86;
	}

	public static boolean isL4d87() {
		return l4d87;
	}

	public static void setL4d87(boolean l4d87) {
		Level4.l4d87 = l4d87;
	}

	public static boolean isL4d88() {
		return l4d88;
	}

	public static void setL4d88(boolean l4d88) {
		Level4.l4d88 = l4d88;
	}

	public static boolean isL4d89() {
		return l4d89;
	}

	public static void setL4d89(boolean l4d89) {
		Level4.l4d89 = l4d89;
	}

	public static boolean isL4d90() {
		return l4d90;
	}

	public static void setL4d90(boolean l4d90) {
		Level4.l4d90 = l4d90;
	}

	public static boolean isL4d91() {
		return l4d91;
	}

	public static void setL4d91(boolean l4d91) {
		Level4.l4d91 = l4d91;
	}

	public static boolean isL4d92() {
		return l4d92;
	}

	public static void setL4d92(boolean l4d92) {
		Level4.l4d92 = l4d92;
	}

	public static boolean isL4d93() {
		return l4d93;
	}

	public static void setL4d93(boolean l4d93) {
		Level4.l4d93 = l4d93;
	}

	public static boolean isL4d94() {
		return l4d94;
	}

	public static void setL4d94(boolean l4d94) {
		Level4.l4d94 = l4d94;
	}

	public static boolean isL4d95() {
		return l4d95;
	}

	public static void setL4d95(boolean l4d95) {
		Level4.l4d95 = l4d95;
	}

	public static boolean isL4d96() {
		return l4d96;
	}

	public static void setL4d96(boolean l4d96) {
		Level4.l4d96 = l4d96;
	}

	public static boolean isL4d97() {
		return l4d97;
	}

	public static void setL4d97(boolean l4d97) {
		Level4.l4d97 = l4d97;
	}

	public static boolean isL4d98() {
		return l4d98;
	}

	public static void setL4d98(boolean l4d98) {
		Level4.l4d98 = l4d98;
	}

	public static boolean isL4d99() {
		return l4d99;
	}

	public static void setL4d99(boolean l4d99) {
		Level4.l4d99 = l4d99;
	}

	public static boolean isL4d100() {
		return l4d100;
	}

	public static void setL4d100(boolean l4d100) {
		Level4.l4d100 = l4d100;
	}

	public void paint(Graphics g) {
		Graphics2D frame = (Graphics2D) g;
		frame.setColor(Color.BLACK);
		frame.fillRect(50, 50, 1000, 800);
		
		//large boxes
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
		
		//bottom for color selection
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
		
		
		//menu, level, direction buttons
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
		g.drawString("Level 4", 250, 170);
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
//		frame.fillOval(125, 205, 40, 40);
//		frame.fillOval(325, 205, 40, 40);
//		frame.fillOval(375, 205, 40, 40);
//		//row 2
//		frame.fillOval(175, 255, 40, 40);
//		frame.drawOval(325, 255, 40, 40);
//		frame.drawOval(375, 255, 40, 40);
//		frame.drawOval(475, 255, 40, 40);
//		//row 3
//		frame.drawOval(325, 305, 40, 40);
//		frame.fillOval(425, 305, 40, 40);
//		frame.drawOval(525, 305, 40, 40);
//		frame.fillOval(575, 305, 40, 40);
//		//row 4
//		frame.drawOval(225, 355, 40, 40);
//		//row 5
//		frame.drawOval(125, 405, 40, 40);
//		frame.drawOval(175, 405, 40, 40);
//		frame.drawOval(525, 405, 40, 40);
//		frame.fillOval(575, 405, 40, 40);
//		//row 6
//		frame.drawOval(275, 455, 40, 40);
//		frame.fillOval(375, 455, 40, 40);
//		//row 7
//		frame.drawOval(125, 505, 40, 40);
//		frame.drawOval(175, 505, 40, 40);
//		frame.fillOval(275, 505, 40, 40);
//		frame.drawOval(375, 505, 40, 40);
//		frame.drawOval(525, 505, 40, 40);
//		//row 8
//		frame.fillOval(125, 555, 40, 40);
//		frame.drawOval(525, 555, 40, 40);
//		frame.fillOval(575, 555, 40, 40);
//		//row 9
//		frame.drawOval(225, 605, 40, 40);
//		//row 10
//		frame.fillOval(125, 655, 40, 40);
//		frame.fillOval(175, 655, 40, 40);
//		frame.fillOval(325, 655, 40, 40);
//		frame.drawOval(425, 655, 40, 40);
		
		//input dots
		if(l4d1) frame.fillOval(125, 205, 40, 40);
		if(l4d2) frame.drawOval(175, 205, 40, 40);
		if(l4d3) frame.fillOval(225, 205, 40, 40);
		if(l4d4) frame.drawOval(275, 205, 40, 40);
		if(l4d5) frame.fillOval(325, 205, 40, 40);
		if(l4d6) frame.fillOval(375, 205, 40, 40);
		if(l4d7) frame.drawOval(425, 205, 40, 40);
		if(l4d8) frame.fillOval(475, 205, 40, 40);
		if(l4d9) frame.drawOval(525, 205, 40, 40);
		if(l4d10) frame.drawOval(575, 205, 40, 40);
		if(l4d11) frame.drawOval(125, 255, 40, 40);
		if(l4d12) frame.fillOval(175, 255, 40, 40);
		if(l4d13) frame.drawOval(225, 255, 40, 40);
		if(l4d14) frame.fillOval(275, 255, 40, 40);
		if(l4d15) frame.drawOval(325, 255, 40, 40);
		if(l4d16) frame.drawOval(375, 255, 40, 40);
		if(l4d17) frame.fillOval(425, 255, 40, 40);
		if(l4d18) frame.drawOval(475, 255, 40, 40);
		if(l4d19) frame.fillOval(525, 255, 40, 40);
		if(l4d20) frame.fillOval(575, 255, 40, 40);
		if(l4d21) frame.drawOval(125, 305, 40, 40);
		if(l4d22) frame.fillOval(175, 305, 40, 40);
		if(l4d23) frame.fillOval(225, 305, 40, 40);
		if(l4d24) frame.drawOval(275, 305, 40, 40);
		if(l4d25) frame.drawOval(325, 305, 40, 40);
		if(l4d26) frame.fillOval(375, 305, 40, 40);
		if(l4d27) frame.fillOval(425, 305, 40, 40);
		if(l4d28) frame.drawOval(475, 305, 40, 40);
		if(l4d29) frame.drawOval(525, 305, 40, 40);
		if(l4d30) frame.fillOval(575, 305, 40, 40);
		if(l4d31) frame.fillOval(125, 355, 40, 40);
		if(l4d32) frame.drawOval(175, 355, 40, 40);
		if(l4d33) frame.drawOval(225, 355, 40, 40);
		if(l4d34) frame.fillOval(275, 355, 40, 40);
		if(l4d35) frame.fillOval(325, 355, 40, 40);
		if(l4d36) frame.drawOval(375, 355, 40, 40);
		if(l4d37) frame.drawOval(425, 355, 40, 40);
		if(l4d38) frame.fillOval(475, 355, 40, 40);
		if(l4d39) frame.fillOval(525, 355, 40, 40);
		if(l4d40) frame.drawOval(575, 355, 40, 40);
		if(l4d41) frame.drawOval(125, 405, 40, 40);
		if(l4d42) frame.drawOval(175, 405, 40, 40);
		if(l4d43) frame.fillOval(225, 405, 40, 40);
		if(l4d44) frame.fillOval(275, 405, 40, 40);
		if(l4d45) frame.drawOval(325, 405, 40, 40);
		if(l4d46) frame.fillOval(375, 405, 40, 40);
		if(l4d47) frame.fillOval(425, 405, 40, 40);
		if(l4d48) frame.drawOval(475, 405, 40, 40);
		if(l4d49) frame.drawOval(525, 405, 40, 40);
		if(l4d50) frame.fillOval(575, 405, 40, 40);
		if(l4d51) frame.fillOval(125, 455, 40, 40);
		if(l4d52) frame.fillOval(175, 455, 40, 40);
		if(l4d53) frame.drawOval(225, 455, 40, 40);
		if(l4d54) frame.drawOval(275, 455, 40, 40);
		if(l4d55) frame.fillOval(325, 455, 40, 40);
		if(l4d56) frame.fillOval(375, 455, 40, 40);
		if(l4d57) frame.drawOval(425, 455, 40, 40);
		if(l4d58) frame.drawOval(475, 455, 40, 40);
		if(l4d59) frame.fillOval(525, 455, 40, 40);
		if(l4d60) frame.drawOval(575, 455, 40, 40);
		if(l4d61) frame.drawOval(125, 505, 40, 40);
		if(l4d62) frame.drawOval(175, 505, 40, 40);
		if(l4d63) frame.fillOval(225, 505, 40, 40);
		if(l4d64) frame.fillOval(275, 505, 40, 40);
		if(l4d65) frame.drawOval(325, 505, 40, 40);
		if(l4d66) frame.drawOval(375, 505, 40, 40);
		if(l4d67) frame.fillOval(425, 505, 40, 40);
		if(l4d68) frame.fillOval(475, 505, 40, 40);
		if(l4d69) frame.drawOval(525, 505, 40, 40);
		if(l4d70) frame.fillOval(575, 505, 40, 40);
		if(l4d71) frame.fillOval(125, 555, 40, 40);
		if(l4d72) frame.drawOval(175, 555, 40, 40);
		if(l4d73) frame.fillOval(225, 555, 40, 40);
		if(l4d74) frame.drawOval(275, 555, 40, 40);
		if(l4d75) frame.drawOval(325, 555, 40, 40);
		if(l4d76) frame.fillOval(375, 555, 40, 40);
		if(l4d77) frame.drawOval(425, 555, 40, 40);
		if(l4d78) frame.fillOval(475, 555, 40, 40);
		if(l4d79) frame.drawOval(525, 555, 40, 40);
		if(l4d80) frame.fillOval(575, 555, 40, 40);
		if(l4d81) frame.drawOval(125, 605, 40, 40);
		if(l4d82) frame.drawOval(175, 605, 40, 40);
		if(l4d83) frame.drawOval(225, 605, 40, 40);
		if(l4d84) frame.fillOval(275, 605, 40, 40);
		if(l4d85) frame.fillOval(325, 605, 40, 40);
		if(l4d86) frame.drawOval(375, 605, 40, 40);
		if(l4d87) frame.fillOval(425, 605, 40, 40);
		if(l4d88) frame.drawOval(475, 605, 40, 40);
		if(l4d89) frame.fillOval(525, 605, 40, 40);
		if(l4d90) frame.drawOval(575, 605, 40, 40);
		if(l4d91) frame.fillOval(125, 655, 40, 40);
		if(l4d92) frame.fillOval(175, 655, 40, 40);
		if(l4d93) frame.drawOval(225, 655, 40, 40);
		if(l4d94) frame.drawOval(275, 655, 40, 40);
		if(l4d95) frame.fillOval(325, 655, 40, 40);
		if(l4d96) frame.drawOval(375, 655, 40, 40);
		if(l4d97) frame.drawOval(425, 655, 40, 40);
		if(l4d98) frame.fillOval(475, 655, 40, 40);
		if(l4d99) frame.fillOval(525, 655, 40, 40);
		if(l4d100) frame.drawOval(575, 655, 40, 40);
				if(l4wrong>=1)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 100, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 110, 915, 190);
					frame.drawLine(915, 110, 835, 190);
				}
				if(l4wrong>=2)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
					frame.drawRect(825, 200, 100, 100);
					frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 210, 915, 290);
					frame.drawLine(915, 210, 835, 290);
				}
				if(l4wrong>=3)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 300, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 310, 915, 390);
					frame.drawLine(915, 310, 835, 390);
				}
				if(l4wrong>=4)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 400, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 410, 915, 490);
					frame.drawLine(915, 410, 835, 490);
				}
				if(l4wrong>=5)
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
		JFrame frame= new JFrame("Binary Dots: LEVEL 4");	
		frame.getContentPane().add(new Level4());
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.setSize(1100, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		
		JPanel panel = new JPanel();
		frame.add(panel);
				
	}
}
