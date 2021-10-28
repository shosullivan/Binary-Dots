import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level3 extends JPanel{
	
	private static int l3wrong = 0;
	
	private static boolean l3d1 = true;
	private static boolean l3d2 = true;
	private static boolean l3d3 = false;
	private static boolean l3d4 = false;
	private static boolean l3d5 = true;
	private static boolean l3d6 = false;
	private static boolean l3d7 = true;
	private static boolean l3d8 = false;
	private static boolean l3d9 = false;
	private static boolean l3d10 = false;
	private static boolean l3d11 = true;
	private static boolean l3d12 = true;
	private static boolean l3d13 = true;
	private static boolean l3d14 = true;
	private static boolean l3d15 = false;
	private static boolean l3d16 = false;
	private static boolean l3d17 = false;
	private static boolean l3d18 = true;
	private static boolean l3d19 = true;
	private static boolean l3d20 = false;
	private static boolean l3d21 = false;
	private static boolean l3d22 = true;
	private static boolean l3d23 = false;
	private static boolean l3d24 = false;
	private static boolean l3d25 = false;
	private static boolean l3d26 = true;
	private static boolean l3d27 = true;
	private static boolean l3d28 = false;
	private static boolean l3d29 = false;
	private static boolean l3d30 = false;
	private static boolean l3d31 = false;
	private static boolean l3d32 = false;
	private static boolean l3d33 = true;
	private static boolean l3d34 = false;
	private static boolean l3d35 = false;
	private static boolean l3d36 = false;
	private static boolean l3d37 = true;
	private static boolean l3d38 = false;
	private static boolean l3d39 = true;
	private static boolean l3d40 = true;
	private static boolean l3d41 = false;
	private static boolean l3d42 = true;
	private static boolean l3d43 = false;
	private static boolean l3d44 = false;
	private static boolean l3d45 = false;
	private static boolean l3d46 = true;
	private static boolean l3d47 = true;
	private static boolean l3d48 = false;
	private static boolean l3d49 = false;
	private static boolean l3d50 = false;
	private static boolean l3d51 = false;
	private static boolean l3d52 = false;
	private static boolean l3d53 = true;
	private static boolean l3d54 = true;
	private static boolean l3d55 = false;
	private static boolean l3d56 = false;
	private static boolean l3d57 = false;
	private static boolean l3d58 = false;
	private static boolean l3d59 = false;
	private static boolean l3d60 = false;
	private static boolean l3d61 = false;
	private static boolean l3d62 = false;
	private static boolean l3d63 = true;
	private static boolean l3d64 = false;
	private static boolean l3d65 = false;
	private static boolean l3d66 = false;
	private static boolean l3d67 = true;
	private static boolean l3d68 = false;
	private static boolean l3d69 = false;
	private static boolean l3d70 = false;
	private static boolean l3d71 = false;
	private static boolean l3d72 = true;
	private static boolean l3d73 = false;
	private static boolean l3d74 = false;
	private static boolean l3d75 = true;
	private static boolean l3d76 = false;
	private static boolean l3d77 = false;
	private static boolean l3d78 = true;
	private static boolean l3d79 = true;
	private static boolean l3d80 = true;
	private static boolean l3d81 = false;
	private static boolean l3d82 = false;
	private static boolean l3d83 = false;
	private static boolean l3d84 = false;
	private static boolean l3d85 = false;
	private static boolean l3d86 = false;
	private static boolean l3d87 = false;
	private static boolean l3d88 = true;
	private static boolean l3d89 = true;
	private static boolean l3d90 = false;
	private static boolean l3d91 = false;
	private static boolean l3d92 = true;
	private static boolean l3d93 = true;
	private static boolean l3d94 = false;
	private static boolean l3d95 = true;
	private static boolean l3d96 = true;
	private static boolean l3d97 = true;
	private static boolean l3d98 = true;
	private static boolean l3d99 = false;
	private static boolean l3d100 = false;
	
	public static int isWrong() {
		return l3wrong;
	}

	public static void setWrong(int w) {
		Level3.l3wrong = w;
	}
	
	public static boolean isL3d1() {
		return l3d1;
	}

	public static void setL3d1(boolean l3d1) {
		Level3.l3d1 = l3d1;
	}

	public static boolean isL3d2() {
		return l3d2;
	}

	public static void setL3d2(boolean l3d2) {
		Level3.l3d2 = l3d2;
	}

	public static boolean isL3d3() {
		return l3d3;
	}

	public static void setL3d3(boolean l3d3) {
		Level3.l3d3 = l3d3;
	}

	public static boolean isL3d4() {
		return l3d4;
	}

	public static void setL3d4(boolean l3d4) {
		Level3.l3d4 = l3d4;
	}

	public static boolean isL3d5() {
		return l3d5;
	}

	public static void setL3d5(boolean l3d5) {
		Level3.l3d5 = l3d5;
	}

	public static boolean isL3d6() {
		return l3d6;
	}

	public static void setL3d6(boolean l3d6) {
		Level3.l3d6 = l3d6;
	}

	public static boolean isL3d7() {
		return l3d7;
	}

	public static void setL3d7(boolean l3d7) {
		Level3.l3d7 = l3d7;
	}

	public static boolean isL3d8() {
		return l3d8;
	}

	public static void setL3d8(boolean l3d8) {
		Level3.l3d8 = l3d8;
	}

	public static boolean isL3d9() {
		return l3d9;
	}

	public static void setL3d9(boolean l3d9) {
		Level3.l3d9 = l3d9;
	}

	public static boolean isL3d10() {
		return l3d10;
	}

	public static void setL3d10(boolean l3d10) {
		Level3.l3d10 = l3d10;
	}

	public static boolean isL3d11() {
		return l3d11;
	}

	public static void setL3d11(boolean l3d11) {
		Level3.l3d11 = l3d11;
	}

	public static boolean isL3d12() {
		return l3d12;
	}

	public static void setL3d12(boolean l3d12) {
		Level3.l3d12 = l3d12;
	}

	public static boolean isL3d13() {
		return l3d13;
	}

	public static void setL3d13(boolean l3d13) {
		Level3.l3d13 = l3d13;
	}

	public static boolean isL3d14() {
		return l3d14;
	}

	public static void setL3d14(boolean l3d14) {
		Level3.l3d14 = l3d14;
	}

	public static boolean isL3d15() {
		return l3d15;
	}

	public static void setL3d15(boolean l3d15) {
		Level3.l3d15 = l3d15;
	}

	public static boolean isL3d16() {
		return l3d16;
	}

	public static void setL3d16(boolean l3d16) {
		Level3.l3d16 = l3d16;
	}

	public static boolean isL3d17() {
		return l3d17;
	}

	public static void setL3d17(boolean l3d17) {
		Level3.l3d17 = l3d17;
	}

	public static boolean isL3d18() {
		return l3d18;
	}

	public static void setL3d18(boolean l3d18) {
		Level3.l3d18 = l3d18;
	}

	public static boolean isL3d19() {
		return l3d19;
	}

	public static void setL3d19(boolean l3d19) {
		Level3.l3d19 = l3d19;
	}

	public static boolean isL3d20() {
		return l3d20;
	}

	public static void setL3d20(boolean l3d20) {
		Level3.l3d20 = l3d20;
	}

	public static boolean isL3d21() {
		return l3d21;
	}

	public static void setL3d21(boolean l3d21) {
		Level3.l3d21 = l3d21;
	}

	public static boolean isL3d22() {
		return l3d22;
	}

	public static void setL3d22(boolean l3d22) {
		Level3.l3d22 = l3d22;
	}

	public static boolean isL3d23() {
		return l3d23;
	}

	public static void setL3d23(boolean l3d23) {
		Level3.l3d23 = l3d23;
	}

	public static boolean isL3d24() {
		return l3d24;
	}

	public static void setL3d24(boolean l3d24) {
		Level3.l3d24 = l3d24;
	}

	public static boolean isL3d25() {
		return l3d25;
	}

	public static void setL3d25(boolean l3d25) {
		Level3.l3d25 = l3d25;
	}

	public static boolean isL3d26() {
		return l3d26;
	}

	public static void setL3d26(boolean l3d26) {
		Level3.l3d26 = l3d26;
	}

	public static boolean isL3d27() {
		return l3d27;
	}

	public static void setL3d27(boolean l3d27) {
		Level3.l3d27 = l3d27;
	}

	public static boolean isL3d28() {
		return l3d28;
	}

	public static void setL3d28(boolean l3d28) {
		Level3.l3d28 = l3d28;
	}

	public static boolean isL3d29() {
		return l3d29;
	}

	public static void setL3d29(boolean l3d29) {
		Level3.l3d29 = l3d29;
	}

	public static boolean isL3d30() {
		return l3d30;
	}

	public static void setL3d30(boolean l3d30) {
		Level3.l3d30 = l3d30;
	}

	public static boolean isL3d31() {
		return l3d31;
	}

	public static void setL3d31(boolean l3d31) {
		Level3.l3d31 = l3d31;
	}

	public static boolean isL3d32() {
		return l3d32;
	}

	public static void setL3d32(boolean l3d32) {
		Level3.l3d32 = l3d32;
	}

	public static boolean isL3d33() {
		return l3d33;
	}

	public static void setL3d33(boolean l3d33) {
		Level3.l3d33 = l3d33;
	}

	public static boolean isL3d34() {
		return l3d34;
	}

	public static void setL3d34(boolean l3d34) {
		Level3.l3d34 = l3d34;
	}

	public static boolean isL3d35() {
		return l3d35;
	}

	public static void setL3d35(boolean l3d35) {
		Level3.l3d35 = l3d35;
	}

	public static boolean isL3d36() {
		return l3d36;
	}

	public static void setL3d36(boolean l3d36) {
		Level3.l3d36 = l3d36;
	}

	public static boolean isL3d37() {
		return l3d37;
	}

	public static void setL3d37(boolean l3d37) {
		Level3.l3d37 = l3d37;
	}

	public static boolean isL3d38() {
		return l3d38;
	}

	public static void setL3d38(boolean l3d38) {
		Level3.l3d38 = l3d38;
	}

	public static boolean isL3d39() {
		return l3d39;
	}

	public static void setL3d39(boolean l3d39) {
		Level3.l3d39 = l3d39;
	}

	public static boolean isL3d40() {
		return l3d40;
	}

	public static void setL3d40(boolean l3d40) {
		Level3.l3d40 = l3d40;
	}

	public static boolean isL3d41() {
		return l3d41;
	}

	public static void setL3d41(boolean l3d41) {
		Level3.l3d41 = l3d41;
	}

	public static boolean isL3d42() {
		return l3d42;
	}

	public static void setL3d42(boolean l3d42) {
		Level3.l3d42 = l3d42;
	}

	public static boolean isL3d43() {
		return l3d43;
	}

	public static void setL3d43(boolean l3d43) {
		Level3.l3d43 = l3d43;
	}

	public static boolean isL3d44() {
		return l3d44;
	}

	public static void setL3d44(boolean l3d44) {
		Level3.l3d44 = l3d44;
	}

	public static boolean isL3d45() {
		return l3d45;
	}

	public static void setL3d45(boolean l3d45) {
		Level3.l3d45 = l3d45;
	}

	public static boolean isL3d46() {
		return l3d46;
	}

	public static void setL3d46(boolean l3d46) {
		Level3.l3d46 = l3d46;
	}

	public static boolean isL3d47() {
		return l3d47;
	}

	public static void setL3d47(boolean l3d47) {
		Level3.l3d47 = l3d47;
	}

	public static boolean isL3d48() {
		return l3d48;
	}

	public static void setL3d48(boolean l3d48) {
		Level3.l3d48 = l3d48;
	}

	public static boolean isL3d49() {
		return l3d49;
	}

	public static void setL3d49(boolean l3d49) {
		Level3.l3d49 = l3d49;
	}

	public static boolean isL3d50() {
		return l3d50;
	}

	public static void setL3d50(boolean l3d50) {
		Level3.l3d50 = l3d50;
	}

	public static boolean isL3d51() {
		return l3d51;
	}

	public static void setL3d51(boolean l3d51) {
		Level3.l3d51 = l3d51;
	}

	public static boolean isL3d52() {
		return l3d52;
	}

	public static void setL3d52(boolean l3d52) {
		Level3.l3d52 = l3d52;
	}

	public static boolean isL3d53() {
		return l3d53;
	}

	public static void setL3d53(boolean l3d53) {
		Level3.l3d53 = l3d53;
	}

	public static boolean isL3d54() {
		return l3d54;
	}

	public static void setL3d54(boolean l3d54) {
		Level3.l3d54 = l3d54;
	}

	public static boolean isL3d55() {
		return l3d55;
	}

	public static void setL3d55(boolean l3d55) {
		Level3.l3d55 = l3d55;
	}

	public static boolean isL3d56() {
		return l3d56;
	}

	public static void setL3d56(boolean l3d56) {
		Level3.l3d56 = l3d56;
	}

	public static boolean isL3d57() {
		return l3d57;
	}

	public static void setL3d57(boolean l3d57) {
		Level3.l3d57 = l3d57;
	}

	public static boolean isL3d58() {
		return l3d58;
	}

	public static void setL3d58(boolean l3d58) {
		Level3.l3d58 = l3d58;
	}

	public static boolean isL3d59() {
		return l3d59;
	}

	public static void setL3d59(boolean l3d59) {
		Level3.l3d59 = l3d59;
	}

	public static boolean isL3d60() {
		return l3d60;
	}

	public static void setL3d60(boolean l3d60) {
		Level3.l3d60 = l3d60;
	}

	public static boolean isL3d61() {
		return l3d61;
	}

	public static void setL3d61(boolean l3d61) {
		Level3.l3d61 = l3d61;
	}

	public static boolean isL3d62() {
		return l3d62;
	}

	public static void setL3d62(boolean l3d62) {
		Level3.l3d62 = l3d62;
	}

	public static boolean isL3d63() {
		return l3d63;
	}

	public static void setL3d63(boolean l3d63) {
		Level3.l3d63 = l3d63;
	}

	public static boolean isL3d64() {
		return l3d64;
	}

	public static void setL3d64(boolean l3d64) {
		Level3.l3d64 = l3d64;
	}

	public static boolean isL3d65() {
		return l3d65;
	}

	public static void setL3d65(boolean l3d65) {
		Level3.l3d65 = l3d65;
	}

	public static boolean isL3d66() {
		return l3d66;
	}

	public static void setL3d66(boolean l3d66) {
		Level3.l3d66 = l3d66;
	}

	public static boolean isL3d67() {
		return l3d67;
	}

	public static void setL3d67(boolean l3d67) {
		Level3.l3d67 = l3d67;
	}

	public static boolean isL3d68() {
		return l3d68;
	}

	public static void setL3d68(boolean l3d68) {
		Level3.l3d68 = l3d68;
	}

	public static boolean isL3d69() {
		return l3d69;
	}

	public static void setL3d69(boolean l3d69) {
		Level3.l3d69 = l3d69;
	}

	public static boolean isL3d70() {
		return l3d70;
	}

	public static void setL3d70(boolean l3d70) {
		Level3.l3d70 = l3d70;
	}

	public static boolean isL3d71() {
		return l3d71;
	}

	public static void setL3d71(boolean l3d71) {
		Level3.l3d71 = l3d71;
	}

	public static boolean isL3d72() {
		return l3d72;
	}

	public static void setL3d72(boolean l3d72) {
		Level3.l3d72 = l3d72;
	}

	public static boolean isL3d73() {
		return l3d73;
	}

	public static void setL3d73(boolean l3d73) {
		Level3.l3d73 = l3d73;
	}

	public static boolean isL3d74() {
		return l3d74;
	}

	public static void setL3d74(boolean l3d74) {
		Level3.l3d74 = l3d74;
	}

	public static boolean isL3d75() {
		return l3d75;
	}

	public static void setL3d75(boolean l3d75) {
		Level3.l3d75 = l3d75;
	}

	public static boolean isL3d76() {
		return l3d76;
	}

	public static void setL3d76(boolean l3d76) {
		Level3.l3d76 = l3d76;
	}

	public static boolean isL3d77() {
		return l3d77;
	}

	public static void setL3d77(boolean l3d77) {
		Level3.l3d77 = l3d77;
	}

	public static boolean isL3d78() {
		return l3d78;
	}

	public static void setL3d78(boolean l3d78) {
		Level3.l3d78 = l3d78;
	}

	public static boolean isL3d79() {
		return l3d79;
	}

	public static void setL3d79(boolean l3d79) {
		Level3.l3d79 = l3d79;
	}

	public static boolean isL3d80() {
		return l3d80;
	}

	public static void setL3d80(boolean l3d80) {
		Level3.l3d80 = l3d80;
	}

	public static boolean isL3d81() {
		return l3d81;
	}

	public static void setL3d81(boolean l3d81) {
		Level3.l3d81 = l3d81;
	}

	public static boolean isL3d82() {
		return l3d82;
	}

	public static void setL3d82(boolean l3d82) {
		Level3.l3d82 = l3d82;
	}

	public static boolean isL3d83() {
		return l3d83;
	}

	public static void setL3d83(boolean l3d83) {
		Level3.l3d83 = l3d83;
	}

	public static boolean isL3d84() {
		return l3d84;
	}

	public static void setL3d84(boolean l3d84) {
		Level3.l3d84 = l3d84;
	}

	public static boolean isL3d85() {
		return l3d85;
	}

	public static void setL3d85(boolean l3d85) {
		Level3.l3d85 = l3d85;
	}

	public static boolean isL3d86() {
		return l3d86;
	}

	public static void setL3d86(boolean l3d86) {
		Level3.l3d86 = l3d86;
	}

	public static boolean isL3d87() {
		return l3d87;
	}

	public static void setL3d87(boolean l3d87) {
		Level3.l3d87 = l3d87;
	}

	public static boolean isL3d88() {
		return l3d88;
	}

	public static void setL3d88(boolean l3d88) {
		Level3.l3d88 = l3d88;
	}

	public static boolean isL3d89() {
		return l3d89;
	}

	public static void setL3d89(boolean l3d89) {
		Level3.l3d89 = l3d89;
	}

	public static boolean isL3d90() {
		return l3d90;
	}

	public static void setL3d90(boolean l3d90) {
		Level3.l3d90 = l3d90;
	}

	public static boolean isL3d91() {
		return l3d91;
	}

	public static void setL3d91(boolean l3d91) {
		Level3.l3d91 = l3d91;
	}

	public static boolean isL3d92() {
		return l3d92;
	}

	public static void setL3d92(boolean l3d92) {
		Level3.l3d92 = l3d92;
	}

	public static boolean isL3d93() {
		return l3d93;
	}

	public static void setL3d93(boolean l3d93) {
		Level3.l3d93 = l3d93;
	}

	public static boolean isL3d94() {
		return l3d94;
	}

	public static void setL3d94(boolean l3d94) {
		Level3.l3d94 = l3d94;
	}

	public static boolean isL3d95() {
		return l3d95;
	}

	public static void setL3d95(boolean l3d95) {
		Level3.l3d95 = l3d95;
	}

	public static boolean isL3d96() {
		return l3d96;
	}

	public static void setL3d96(boolean l3d96) {
		Level3.l3d96 = l3d96;
	}

	public static boolean isL3d97() {
		return l3d97;
	}

	public static void setL3d97(boolean l3d97) {
		Level3.l3d97 = l3d97;
	}

	public static boolean isL3d98() {
		return l3d98;
	}

	public static void setL3d98(boolean l3d98) {
		Level3.l3d98 = l3d98;
	}

	public static boolean isL3d99() {
		return l3d99;
	}

	public static void setL3d99(boolean l3d99) {
		Level3.l3d99 = l3d99;
	}

	public static boolean isL3d100() {
		return l3d100;
	}

	public static void setL3d100(boolean l3d100) {
		Level3.l3d100 = l3d100;
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
		
		//bottom location for color selection
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
		g.drawString("Level 3", 250, 170);
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
//		frame.drawOval(175, 205, 40, 40);
//		frame.drawOval(325, 205, 40, 40);
//		frame.fillOval(425, 205, 40, 40);
//		//row 2
//		frame.drawOval(125, 255, 40, 40);
//		frame.fillOval(175, 255, 40, 40);
//		frame.drawOval(225, 255, 40, 40);
//		frame.drawOval(275, 255, 40, 40);
//		frame.fillOval(475, 255, 40, 40);
//		frame.drawOval(525, 255, 40, 40);
//		//row 3
//		frame.drawOval(175, 305, 40, 40);
//		frame.fillOval(375, 305, 40, 40);
//		frame.drawOval(425, 305, 40, 40);
//		//row 4
//		frame.drawOval(225, 355, 40, 40);
//		frame.fillOval(425, 355, 40, 40);
//		frame.drawOval(525, 355, 40, 40);
//		frame.fillOval(575, 355, 40, 40);
//		//row 5
//		frame.fillOval(175, 405, 40, 40);
//		frame.drawOval(375, 405, 40, 40);
//		frame.fillOval(425, 405, 40, 40);
//		//row 6
//		frame.drawOval(225, 455, 40, 40);
//		frame.drawOval(275, 455, 40, 40);
//		//row 7
//		frame.drawOval(225, 505, 40, 40);
//		frame.drawOval(425, 505, 40, 40);
//		//row 8
//		frame.fillOval(175, 555, 40, 40);
//		frame.fillOval(325, 555, 40, 40);
//		frame.fillOval(475, 555, 40, 40);
//		frame.drawOval(525, 555, 40, 40);
//		frame.drawOval(575, 555, 40, 40);
//		//row 9
//		frame.fillOval(475, 605, 40, 40);
//		frame.drawOval(525, 605, 40, 40);
//		//row 10
//		frame.drawOval(175, 655, 40, 40);
//		frame.fillOval(225, 655, 40, 40);
//		frame.drawOval(325, 655, 40, 40);
//		frame.drawOval(375, 655, 40, 40);
//		frame.fillOval(425, 655, 40, 40);
//		frame.drawOval(475, 655, 40, 40);
			
		//input dots
		if(l3d1) frame.drawOval(125, 205, 40, 40);
		if(l3d2) frame.drawOval(175, 205, 40, 40);
		if(l3d3) frame.fillOval(225, 205, 40, 40);
		if(l3d4) frame.fillOval(275, 205, 40, 40);
		if(l3d5) frame.drawOval(325, 205, 40, 40);
		if(l3d6) frame.drawOval(375, 205, 40, 40);
		if(l3d7) frame.fillOval(425, 205, 40, 40);
		if(l3d8) frame.drawOval(475, 205, 40, 40);
		if(l3d9) frame.fillOval(525, 205, 40, 40);
		if(l3d10) frame.fillOval(575, 205, 40, 40);
		if(l3d11) frame.drawOval(125, 255, 40, 40);
		if(l3d12) frame.fillOval(175, 255, 40, 40);
		if(l3d13) frame.drawOval(225, 255, 40, 40);
		if(l3d14) frame.drawOval(275, 255, 40, 40);
		if(l3d15) frame.fillOval(325, 255, 40, 40);
		if(l3d16) frame.fillOval(375, 255, 40, 40);
		if(l3d17) frame.drawOval(425, 255, 40, 40);
		if(l3d18) frame.fillOval(475, 255, 40, 40);
		if(l3d19) frame.drawOval(525, 255, 40, 40);
		if(l3d20) frame.fillOval(575, 255, 40, 40);
		if(l3d21) frame.fillOval(125, 305, 40, 40);
		if(l3d22) frame.drawOval(175, 305, 40, 40);
		if(l3d23) frame.fillOval(225, 305, 40, 40);
		if(l3d24) frame.drawOval(275, 305, 40, 40);
		if(l3d25) frame.fillOval(325, 305, 40, 40);
		if(l3d26) frame.fillOval(375, 305, 40, 40);
		if(l3d27) frame.drawOval(425, 305, 40, 40);
		if(l3d28) frame.drawOval(475, 305, 40, 40);
		if(l3d29) frame.fillOval(525, 305, 40, 40);
		if(l3d30) frame.drawOval(575, 305, 40, 40);
		if(l3d31) frame.fillOval(125, 355, 40, 40);
		if(l3d32) frame.drawOval(175, 355, 40, 40);
		if(l3d33) frame.drawOval(225, 355, 40, 40);
		if(l3d34) frame.fillOval(275, 355, 40, 40);
		if(l3d35) frame.drawOval(325, 355, 40, 40);
		if(l3d36) frame.drawOval(375, 355, 40, 40);
		if(l3d37) frame.fillOval(425, 355, 40, 40);
		if(l3d38) frame.fillOval(475, 355, 40, 40);
		if(l3d39) frame.drawOval(525, 355, 40, 40);
		if(l3d40) frame.fillOval(575, 355, 40, 40);
		if(l3d41) frame.drawOval(125, 405, 40, 40);
		if(l3d42) frame.fillOval(175, 405, 40, 40);
		if(l3d43) frame.fillOval(225, 405, 40, 40);
		if(l3d44) frame.drawOval(275, 405, 40, 40);
		if(l3d45) frame.fillOval(325, 405, 40, 40);
		if(l3d46) frame.drawOval(375, 405, 40, 40);
		if(l3d47) frame.fillOval(425, 405, 40, 40);
		if(l3d48) frame.drawOval(475, 405, 40, 40);
		if(l3d49) frame.fillOval(525, 405, 40, 40);
		if(l3d50) frame.drawOval(575, 405, 40, 40);
		if(l3d51) frame.fillOval(125, 455, 40, 40);
		if(l3d52) frame.fillOval(175, 455, 40, 40);
		if(l3d53) frame.drawOval(225, 455, 40, 40);
		if(l3d54) frame.drawOval(275, 455, 40, 40);
		if(l3d55) frame.fillOval(325, 455, 40, 40);
		if(l3d56) frame.fillOval(375, 455, 40, 40);
		if(l3d57) frame.drawOval(425, 455, 40, 40);
		if(l3d58) frame.fillOval(475, 455, 40, 40);
		if(l3d59) frame.drawOval(525, 455, 40, 40);
		if(l3d60) frame.drawOval(575, 455, 40, 40);
		if(l3d61) frame.fillOval(125, 505, 40, 40);
		if(l3d62) frame.drawOval(175, 505, 40, 40);
		if(l3d63) frame.drawOval(225, 505, 40, 40);
		if(l3d64) frame.fillOval(275, 505, 40, 40);
		if(l3d65) frame.drawOval(325, 505, 40, 40);
		if(l3d66) frame.fillOval(375, 505, 40, 40);
		if(l3d67) frame.drawOval(425, 505, 40, 40);
		if(l3d68) frame.drawOval(475, 505, 40, 40);
		if(l3d69) frame.fillOval(525, 505, 40, 40);
		if(l3d70) frame.fillOval(575, 505, 40, 40);
		if(l3d71) frame.drawOval(125, 555, 40, 40);
		if(l3d72) frame.fillOval(175, 555, 40, 40);
		if(l3d73) frame.fillOval(225, 555, 40, 40);
		if(l3d74) frame.drawOval(275, 555, 40, 40);
		if(l3d75) frame.fillOval(325, 555, 40, 40);
		if(l3d76) frame.drawOval(375, 555, 40, 40);
		if(l3d77) frame.fillOval(425, 555, 40, 40);
		if(l3d78) frame.fillOval(475, 555, 40, 40);
		if(l3d79) frame.drawOval(525, 555, 40, 40);
		if(l3d80) frame.drawOval(575, 555, 40, 40);
		if(l3d81) frame.drawOval(125, 605, 40, 40);
		if(l3d82) frame.fillOval(175, 605, 40, 40);
		if(l3d83) frame.drawOval(225, 605, 40, 40);
		if(l3d84) frame.fillOval(275, 605, 40, 40);
		if(l3d85) frame.drawOval(325, 605, 40, 40);
		if(l3d86) frame.fillOval(375, 605, 40, 40);
		if(l3d87) frame.drawOval(425, 605, 40, 40);
		if(l3d88) frame.fillOval(475, 605, 40, 40);
		if(l3d89) frame.drawOval(525, 605, 40, 40);
		if(l3d90) frame.fillOval(575, 605, 40, 40);
		if(l3d91) frame.fillOval(125, 655, 40, 40);
		if(l3d92) frame.drawOval(175, 655, 40, 40);
		if(l3d93) frame.fillOval(225, 655, 40, 40);
		if(l3d94) frame.fillOval(275, 655, 40, 40);
		if(l3d95) frame.drawOval(325, 655, 40, 40);
		if(l3d96) frame.drawOval(375, 655, 40, 40);
		if(l3d97) frame.fillOval(425, 655, 40, 40);
		if(l3d98) frame.drawOval(475, 655, 40, 40);
		if(l3d99) frame.fillOval(525, 655, 40, 40);
		if(l3d100) frame.drawOval(575, 655, 40, 40);
				
		if(l3wrong>=1)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
		    frame.drawRect(825, 100, 100, 100);
		    frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 110, 915, 190);
			frame.drawLine(915, 110, 835, 190);
		}
		if(l3wrong>=2)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
			frame.drawRect(825, 200, 100, 100);
			frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 210, 915, 290);
			frame.drawLine(915, 210, 835, 290);
		}
		if(l3wrong>=3)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
		    frame.drawRect(825, 300, 100, 100);
		    frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 310, 915, 390);
			frame.drawLine(915, 310, 835, 390);
		}
		if(l3wrong>=4)
		{
			frame.setColor(Color.RED);
			frame.setStroke(new BasicStroke(5));
		    frame.drawRect(825, 400, 100, 100);
		    frame.setStroke(new BasicStroke(2));
		    frame.drawLine(835, 410, 915, 490);
			frame.drawLine(915, 410, 835, 490);
		}
		if(l3wrong>=5)
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
		JFrame frame= new JFrame("Binary Dots: LEVEL 3");	
		frame.getContentPane().add(new Level3());
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.setSize(1100, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		
		JPanel panel = new JPanel();
		frame.add(panel);
				
	}
}
