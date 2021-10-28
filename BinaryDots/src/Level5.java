import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level5 extends JPanel {
	
	private static int l5wrong = 0;
	
	private static boolean l5d1 = true;
	private static boolean l5d2 = true;
	private static boolean l5d3 = false;
	private static boolean l5d4 = false;
	private static boolean l5d5 = false;
	private static boolean l5d6 = false;
	private static boolean l5d7 = false;
	private static boolean l5d8 = false;
	private static boolean l5d9 = false;
	private static boolean l5d10 = false;
	private static boolean l5d11 = false;
	private static boolean l5d12 = false;
	private static boolean l5d13 = true;
	private static boolean l5d14 = true;
	private static boolean l5d15 = false;
	private static boolean l5d16 = true;
	private static boolean l5d17 = false;
	private static boolean l5d18 = false;
	private static boolean l5d19 = false;
	private static boolean l5d20 = true;
	private static boolean l5d21 = true;
	private static boolean l5d22 = false;
	private static boolean l5d23 = false;
	private static boolean l5d24 = false;
	private static boolean l5d25 = false;
	private static boolean l5d26 = false;
	private static boolean l5d27 = true;
	private static boolean l5d28 = false;
	private static boolean l5d29 = true;
	private static boolean l5d30 = false;
	private static boolean l5d31 = false;
	private static boolean l5d32 = false;
	private static boolean l5d33 = false;
	private static boolean l5d34 = false;
	private static boolean l5d35 = false;
	private static boolean l5d36 = true;
	private static boolean l5d37 = true;
	private static boolean l5d38 = false;
	private static boolean l5d39 = false;
	private static boolean l5d40 = false;
	private static boolean l5d41 = true;
	private static boolean l5d42 = true;
	private static boolean l5d43 = true;
	private static boolean l5d44 = true;
	private static boolean l5d45 = false;
	private static boolean l5d46 = false;
	private static boolean l5d47 = true;
	private static boolean l5d48 = false;
	private static boolean l5d49 = true;
	private static boolean l5d50 = false;
	private static boolean l5d51 = false;
	private static boolean l5d52 = false;
	private static boolean l5d53 = false;
	private static boolean l5d54 = false;
	private static boolean l5d55 = false;
	private static boolean l5d56 = false;
	private static boolean l5d57 = false;
	private static boolean l5d58 = false;
	private static boolean l5d59 = false;
	private static boolean l5d60 = false;
	private static boolean l5d61 = false;
	private static boolean l5d62 = false;
	private static boolean l5d63 = true;
	private static boolean l5d64 = false;
	private static boolean l5d65 = true;
	private static boolean l5d66 = false;
	private static boolean l5d67 = false;
	private static boolean l5d68 = true;
	private static boolean l5d69 = false;
	private static boolean l5d70 = true;
	private static boolean l5d71 = false;
	private static boolean l5d72 = true;
	private static boolean l5d73 = false;
	private static boolean l5d74 = false;
	private static boolean l5d75 = false;
	private static boolean l5d76 = true;
	private static boolean l5d77 = false;
	private static boolean l5d78 = false;
	private static boolean l5d79 = false;
	private static boolean l5d80 = false;
	private static boolean l5d81 = false;
	private static boolean l5d82 = false;
	private static boolean l5d83 = true;
	private static boolean l5d84 = false;
	private static boolean l5d85 = false;
	private static boolean l5d86 = false;
	private static boolean l5d87 = false;
	private static boolean l5d88 = true;
	private static boolean l5d89 = true;
	private static boolean l5d90 = true;
	private static boolean l5d91 = true;
	private static boolean l5d92 = false;
	private static boolean l5d93 = false;
	private static boolean l5d94 = false;
	private static boolean l5d95 = true;
	private static boolean l5d96 = false;
	private static boolean l5d97 = false;
	private static boolean l5d98 = false;
	private static boolean l5d99 = false;
	private static boolean l5d100 = false;
	
	public static int isWrong() {
		return l5wrong;
	}

	public static void setWrong(int w) {
		Level5.l5wrong = w;
	}
	
	public static boolean isL5d1() {
		return l5d1;
	}

	public static void setL5d1(boolean l5d1) {
		Level5.l5d1 = l5d1;
	}

	public static boolean isL5d2() {
		return l5d2;
	}

	public static void setL5d2(boolean l5d2) {
		Level5.l5d2 = l5d2;
	}

	public static boolean isL5d3() {
		return l5d3;
	}

	public static void setL5d3(boolean l5d3) {
		Level5.l5d3 = l5d3;
	}

	public static boolean isL5d4() {
		return l5d4;
	}

	public static void setL5d4(boolean l5d4) {
		Level5.l5d4 = l5d4;
	}

	public static boolean isL5d5() {
		return l5d5;
	}

	public static void setL5d5(boolean l5d5) {
		Level5.l5d5 = l5d5;
	}

	public static boolean isL5d6() {
		return l5d6;
	}

	public static void setL5d6(boolean l5d6) {
		Level5.l5d6 = l5d6;
	}

	public static boolean isL5d7() {
		return l5d7;
	}

	public static void setL5d7(boolean l5d7) {
		Level5.l5d7 = l5d7;
	}

	public static boolean isL5d8() {
		return l5d8;
	}

	public static void setL5d8(boolean l5d8) {
		Level5.l5d8 = l5d8;
	}

	public static boolean isL5d9() {
		return l5d9;
	}

	public static void setL5d9(boolean l5d9) {
		Level5.l5d9 = l5d9;
	}

	public static boolean isL5d10() {
		return l5d10;
	}

	public static void setL5d10(boolean l5d10) {
		Level5.l5d10 = l5d10;
	}

	public static boolean isL5d11() {
		return l5d11;
	}

	public static void setL5d11(boolean l5d11) {
		Level5.l5d11 = l5d11;
	}

	public static boolean isL5d12() {
		return l5d12;
	}

	public static void setL5d12(boolean l5d12) {
		Level5.l5d12 = l5d12;
	}

	public static boolean isL5d13() {
		return l5d13;
	}

	public static void setL5d13(boolean l5d13) {
		Level5.l5d13 = l5d13;
	}

	public static boolean isL5d14() {
		return l5d14;
	}

	public static void setL5d14(boolean l5d14) {
		Level5.l5d14 = l5d14;
	}

	public static boolean isL5d15() {
		return l5d15;
	}

	public static void setL5d15(boolean l5d15) {
		Level5.l5d15 = l5d15;
	}

	public static boolean isL5d16() {
		return l5d16;
	}

	public static void setL5d16(boolean l5d16) {
		Level5.l5d16 = l5d16;
	}

	public static boolean isL5d17() {
		return l5d17;
	}

	public static void setL5d17(boolean l5d17) {
		Level5.l5d17 = l5d17;
	}

	public static boolean isL5d18() {
		return l5d18;
	}

	public static void setL5d18(boolean l5d18) {
		Level5.l5d18 = l5d18;
	}

	public static boolean isL5d19() {
		return l5d19;
	}

	public static void setL5d19(boolean l5d19) {
		Level5.l5d19 = l5d19;
	}

	public static boolean isL5d20() {
		return l5d20;
	}

	public static void setL5d20(boolean l5d20) {
		Level5.l5d20 = l5d20;
	}

	public static boolean isL5d21() {
		return l5d21;
	}

	public static void setL5d21(boolean l5d21) {
		Level5.l5d21 = l5d21;
	}

	public static boolean isL5d22() {
		return l5d22;
	}

	public static void setL5d22(boolean l5d22) {
		Level5.l5d22 = l5d22;
	}

	public static boolean isL5d23() {
		return l5d23;
	}

	public static void setL5d23(boolean l5d23) {
		Level5.l5d23 = l5d23;
	}

	public static boolean isL5d24() {
		return l5d24;
	}

	public static void setL5d24(boolean l5d24) {
		Level5.l5d24 = l5d24;
	}

	public static boolean isL5d25() {
		return l5d25;
	}

	public static void setL5d25(boolean l5d25) {
		Level5.l5d25 = l5d25;
	}

	public static boolean isL5d26() {
		return l5d26;
	}

	public static void setL5d26(boolean l5d26) {
		Level5.l5d26 = l5d26;
	}

	public static boolean isL5d27() {
		return l5d27;
	}

	public static void setL5d27(boolean l5d27) {
		Level5.l5d27 = l5d27;
	}

	public static boolean isL5d28() {
		return l5d28;
	}

	public static void setL5d28(boolean l5d28) {
		Level5.l5d28 = l5d28;
	}

	public static boolean isL5d29() {
		return l5d29;
	}

	public static void setL5d29(boolean l5d29) {
		Level5.l5d29 = l5d29;
	}

	public static boolean isL5d30() {
		return l5d30;
	}

	public static void setL5d30(boolean l5d30) {
		Level5.l5d30 = l5d30;
	}

	public static boolean isL5d31() {
		return l5d31;
	}

	public static void setL5d31(boolean l5d31) {
		Level5.l5d31 = l5d31;
	}

	public static boolean isL5d32() {
		return l5d32;
	}

	public static void setL5d32(boolean l5d32) {
		Level5.l5d32 = l5d32;
	}

	public static boolean isL5d33() {
		return l5d33;
	}

	public static void setL5d33(boolean l5d33) {
		Level5.l5d33 = l5d33;
	}

	public static boolean isL5d34() {
		return l5d34;
	}

	public static void setL5d34(boolean l5d34) {
		Level5.l5d34 = l5d34;
	}

	public static boolean isL5d35() {
		return l5d35;
	}

	public static void setL5d35(boolean l5d35) {
		Level5.l5d35 = l5d35;
	}

	public static boolean isL5d36() {
		return l5d36;
	}

	public static void setL5d36(boolean l5d36) {
		Level5.l5d36 = l5d36;
	}

	public static boolean isL5d37() {
		return l5d37;
	}

	public static void setL5d37(boolean l5d37) {
		Level5.l5d37 = l5d37;
	}

	public static boolean isL5d38() {
		return l5d38;
	}

	public static void setL5d38(boolean l5d38) {
		Level5.l5d38 = l5d38;
	}

	public static boolean isL5d39() {
		return l5d39;
	}

	public static void setL5d39(boolean l5d39) {
		Level5.l5d39 = l5d39;
	}

	public static boolean isL5d40() {
		return l5d40;
	}

	public static void setL5d40(boolean l5d40) {
		Level5.l5d40 = l5d40;
	}

	public static boolean isL5d41() {
		return l5d41;
	}

	public static void setL5d41(boolean l5d41) {
		Level5.l5d41 = l5d41;
	}

	public static boolean isL5d42() {
		return l5d42;
	}

	public static void setL5d42(boolean l5d42) {
		Level5.l5d42 = l5d42;
	}

	public static boolean isL5d43() {
		return l5d43;
	}

	public static void setL5d43(boolean l5d43) {
		Level5.l5d43 = l5d43;
	}

	public static boolean isL5d44() {
		return l5d44;
	}

	public static void setL5d44(boolean l5d44) {
		Level5.l5d44 = l5d44;
	}

	public static boolean isL5d45() {
		return l5d45;
	}

	public static void setL5d45(boolean l5d45) {
		Level5.l5d45 = l5d45;
	}

	public static boolean isL5d46() {
		return l5d46;
	}

	public static void setL5d46(boolean l5d46) {
		Level5.l5d46 = l5d46;
	}

	public static boolean isL5d47() {
		return l5d47;
	}

	public static void setL5d47(boolean l5d47) {
		Level5.l5d47 = l5d47;
	}

	public static boolean isL5d48() {
		return l5d48;
	}

	public static void setL5d48(boolean l5d48) {
		Level5.l5d48 = l5d48;
	}

	public static boolean isL5d49() {
		return l5d49;
	}

	public static void setL5d49(boolean l5d49) {
		Level5.l5d49 = l5d49;
	}

	public static boolean isL5d50() {
		return l5d50;
	}

	public static void setL5d50(boolean l5d50) {
		Level5.l5d50 = l5d50;
	}

	public static boolean isL5d51() {
		return l5d51;
	}

	public static void setL5d51(boolean l5d51) {
		Level5.l5d51 = l5d51;
	}

	public static boolean isL5d52() {
		return l5d52;
	}

	public static void setL5d52(boolean l5d52) {
		Level5.l5d52 = l5d52;
	}

	public static boolean isL5d53() {
		return l5d53;
	}

	public static void setL5d53(boolean l5d53) {
		Level5.l5d53 = l5d53;
	}

	public static boolean isL5d54() {
		return l5d54;
	}

	public static void setL5d54(boolean l5d54) {
		Level5.l5d54 = l5d54;
	}

	public static boolean isL5d55() {
		return l5d55;
	}

	public static void setL5d55(boolean l5d55) {
		Level5.l5d55 = l5d55;
	}

	public static boolean isL5d56() {
		return l5d56;
	}

	public static void setL5d56(boolean l5d56) {
		Level5.l5d56 = l5d56;
	}

	public static boolean isL5d57() {
		return l5d57;
	}

	public static void setL5d57(boolean l5d57) {
		Level5.l5d57 = l5d57;
	}

	public static boolean isL5d58() {
		return l5d58;
	}

	public static void setL5d58(boolean l5d58) {
		Level5.l5d58 = l5d58;
	}

	public static boolean isL5d59() {
		return l5d59;
	}

	public static void setL5d59(boolean l5d59) {
		Level5.l5d59 = l5d59;
	}

	public static boolean isL5d60() {
		return l5d60;
	}

	public static void setL5d60(boolean l5d60) {
		Level5.l5d60 = l5d60;
	}

	public static boolean isL5d61() {
		return l5d61;
	}

	public static void setL5d61(boolean l5d61) {
		Level5.l5d61 = l5d61;
	}

	public static boolean isL5d62() {
		return l5d62;
	}

	public static void setL5d62(boolean l5d62) {
		Level5.l5d62 = l5d62;
	}

	public static boolean isL5d63() {
		return l5d63;
	}

	public static void setL5d63(boolean l5d63) {
		Level5.l5d63 = l5d63;
	}

	public static boolean isL5d64() {
		return l5d64;
	}

	public static void setL5d64(boolean l5d64) {
		Level5.l5d64 = l5d64;
	}

	public static boolean isL5d65() {
		return l5d65;
	}

	public static void setL5d65(boolean l5d65) {
		Level5.l5d65 = l5d65;
	}

	public static boolean isL5d66() {
		return l5d66;
	}

	public static void setL5d66(boolean l5d66) {
		Level5.l5d66 = l5d66;
	}

	public static boolean isL5d67() {
		return l5d67;
	}

	public static void setL5d67(boolean l5d67) {
		Level5.l5d67 = l5d67;
	}

	public static boolean isL5d68() {
		return l5d68;
	}

	public static void setL5d68(boolean l5d68) {
		Level5.l5d68 = l5d68;
	}

	public static boolean isL5d69() {
		return l5d69;
	}

	public static void setL5d69(boolean l5d69) {
		Level5.l5d69 = l5d69;
	}

	public static boolean isL5d70() {
		return l5d70;
	}

	public static void setL5d70(boolean l5d70) {
		Level5.l5d70 = l5d70;
	}

	public static boolean isL5d71() {
		return l5d71;
	}

	public static void setL5d71(boolean l5d71) {
		Level5.l5d71 = l5d71;
	}

	public static boolean isL5d72() {
		return l5d72;
	}

	public static void setL5d72(boolean l5d72) {
		Level5.l5d72 = l5d72;
	}

	public static boolean isL5d73() {
		return l5d73;
	}

	public static void setL5d73(boolean l5d73) {
		Level5.l5d73 = l5d73;
	}

	public static boolean isL5d74() {
		return l5d74;
	}

	public static void setL5d74(boolean l5d74) {
		Level5.l5d74 = l5d74;
	}

	public static boolean isL5d75() {
		return l5d75;
	}

	public static void setL5d75(boolean l5d75) {
		Level5.l5d75 = l5d75;
	}

	public static boolean isL5d76() {
		return l5d76;
	}

	public static void setL5d76(boolean l5d76) {
		Level5.l5d76 = l5d76;
	}

	public static boolean isL5d77() {
		return l5d77;
	}

	public static void setL5d77(boolean l5d77) {
		Level5.l5d77 = l5d77;
	}

	public static boolean isL5d78() {
		return l5d78;
	}

	public static void setL5d78(boolean l5d78) {
		Level5.l5d78 = l5d78;
	}

	public static boolean isL5d79() {
		return l5d79;
	}

	public static void setL5d79(boolean l5d79) {
		Level5.l5d79 = l5d79;
	}

	public static boolean isL5d80() {
		return l5d80;
	}

	public static void setL5d80(boolean l5d80) {
		Level5.l5d80 = l5d80;
	}

	public static boolean isL5d81() {
		return l5d81;
	}

	public static void setL5d81(boolean l5d81) {
		Level5.l5d81 = l5d81;
	}

	public static boolean isL5d82() {
		return l5d82;
	}

	public static void setL5d82(boolean l5d82) {
		Level5.l5d82 = l5d82;
	}

	public static boolean isL5d83() {
		return l5d83;
	}

	public static void setL5d83(boolean l5d83) {
		Level5.l5d83 = l5d83;
	}

	public static boolean isL5d84() {
		return l5d84;
	}

	public static void setL5d84(boolean l5d84) {
		Level5.l5d84 = l5d84;
	}

	public static boolean isL5d85() {
		return l5d85;
	}

	public static void setL5d85(boolean l5d85) {
		Level5.l5d85 = l5d85;
	}

	public static boolean isL5d86() {
		return l5d86;
	}

	public static void setL5d86(boolean l5d86) {
		Level5.l5d86 = l5d86;
	}

	public static boolean isL5d87() {
		return l5d87;
	}

	public static void setL5d87(boolean l5d87) {
		Level5.l5d87 = l5d87;
	}

	public static boolean isL5d88() {
		return l5d88;
	}

	public static void setL5d88(boolean l5d88) {
		Level5.l5d88 = l5d88;
	}

	public static boolean isL5d89() {
		return l5d89;
	}

	public static void setL5d89(boolean l5d89) {
		Level5.l5d89 = l5d89;
	}

	public static boolean isL5d90() {
		return l5d90;
	}

	public static void setL5d90(boolean l5d90) {
		Level5.l5d90 = l5d90;
	}

	public static boolean isL5d91() {
		return l5d91;
	}

	public static void setL5d91(boolean l5d91) {
		Level5.l5d91 = l5d91;
	}

	public static boolean isL5d92() {
		return l5d92;
	}

	public static void setL5d92(boolean l5d92) {
		Level5.l5d92 = l5d92;
	}

	public static boolean isL5d93() {
		return l5d93;
	}

	public static void setL5d93(boolean l5d93) {
		Level5.l5d93 = l5d93;
	}

	public static boolean isL5d94() {
		return l5d94;
	}

	public static void setL5d94(boolean l5d94) {
		Level5.l5d94 = l5d94;
	}

	public static boolean isL5d95() {
		return l5d95;
	}

	public static void setL5d95(boolean l5d95) {
		Level5.l5d95 = l5d95;
	}

	public static boolean isL5d96() {
		return l5d96;
	}

	public static void setL5d96(boolean l5d96) {
		Level5.l5d96 = l5d96;
	}

	public static boolean isL5d97() {
		return l5d97;
	}

	public static void setL5d97(boolean l5d97) {
		Level5.l5d97 = l5d97;
	}

	public static boolean isL5d98() {
		return l5d98;
	}

	public static void setL5d98(boolean l5d98) {
		Level5.l5d98 = l5d98;
	}

	public static boolean isL5d99() {
		return l5d99;
	}

	public static void setL5d99(boolean l5d99) {
		Level5.l5d99 = l5d99;
	}
	
	public static boolean isL5d100() {
		return l5d100;
	}

	public static void setL5d100(boolean l5d100) {
		Level5.l5d100 = l5d100;
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
		
		//bottom section for color selection
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
		g.drawString("Level 5", 250, 170);
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
//		//row 2
//		frame.fillOval(225, 255, 40, 40);
//		frame.drawOval(275, 255, 40, 40);
//		frame.fillOval(375, 255, 40, 40);
//		frame.drawOval(575, 255, 40, 40);
//		//row 3
//		frame.drawOval(125, 305, 40, 40);
//		frame.fillOval(425, 305, 40, 40);
//		frame.fillOval(525, 305, 40, 40);
//		//row 4
//		frame.drawOval(375, 355, 40, 40);
//		frame.drawOval(425, 355, 40, 40);
//		//row 5
//		frame.drawOval(125, 405, 40, 40);
//		frame.fillOval(175, 405, 40, 40);
//		frame.drawOval(225, 405, 40, 40);
//		frame.drawOval(275, 405, 40, 40);
//		frame.fillOval(425, 405, 40, 40);
//		frame.drawOval(525, 405, 40, 40);
//		//row 6- empty
//		//row 7
//		frame.fillOval(225, 505, 40, 40);
//		frame.drawOval(325, 505, 40, 40);
//		frame.drawOval(475, 505, 40, 40);
//		frame.drawOval(575, 505, 40, 40);
//		//row 8
//		frame.fillOval(175, 555, 40, 40);
//		frame.fillOval(375, 555, 40, 40);
//		//row 9
//		frame.fillOval(225, 605, 40, 40);
//		frame.drawOval(475, 605, 40, 40);
//		frame.fillOval(525, 605, 40, 40);
//		frame.drawOval(575, 605, 40, 40);
//		//row 10
//		frame.drawOval(125, 655, 40, 40);
//		frame.fillOval(325, 655, 40, 40);
		
		//input dots
		if(l5d1) frame.drawOval(125, 205, 40, 40);
		if(l5d2) frame.drawOval(175, 205, 40, 40);
		if(l5d3) frame.fillOval(225, 205, 40, 40);
		if(l5d4) frame.fillOval(275, 205, 40, 40);
		if(l5d5) frame.drawOval(325, 205, 40, 40);
		if(l5d6) frame.drawOval(375, 205, 40, 40);
		if(l5d7) frame.fillOval(425, 205, 40, 40);
		if(l5d8) frame.fillOval(475, 205, 40, 40);
		if(l5d9) frame.drawOval(525, 205, 40, 40);
		if(l5d10) frame.fillOval(575, 205, 40, 40);
		if(l5d11) frame.fillOval(125, 255, 40, 40);
		if(l5d12) frame.drawOval(175, 255, 40, 40);
		if(l5d13) frame.fillOval(225, 255, 40, 40);
		if(l5d14) frame.drawOval(275, 255, 40, 40);
		if(l5d15) frame.fillOval(325, 255, 40, 40);
		if(l5d16) frame.fillOval(375, 255, 40, 40);
		if(l5d17) frame.drawOval(425, 255, 40, 40);
		if(l5d18) frame.fillOval(475, 255, 40, 40);
		if(l5d19) frame.drawOval(525, 255, 40, 40);
		if(l5d20) frame.drawOval(575, 255, 40, 40);
		if(l5d21) frame.drawOval(125, 305, 40, 40);
		if(l5d22) frame.fillOval(175, 305, 40, 40);
		if(l5d23) frame.drawOval(225, 305, 40, 40);
		if(l5d24) frame.fillOval(275, 305, 40, 40);
		if(l5d25) frame.drawOval(325, 305, 40, 40);
		if(l5d26) frame.fillOval(375, 305, 40, 40);
		if(l5d27) frame.fillOval(425, 305, 40, 40);
		if(l5d28) frame.drawOval(475, 305, 40, 40);
		if(l5d29) frame.fillOval(525, 305, 40, 40);
		if(l5d30) frame.drawOval(575, 305, 40, 40);
		if(l5d31) frame.fillOval(125, 355, 40, 40);
		if(l5d32) frame.drawOval(175, 355, 40, 40);
		if(l5d33) frame.fillOval(225, 355, 40, 40);
		if(l5d34) frame.drawOval(275, 355, 40, 40);
		if(l5d35) frame.fillOval(325, 355, 40, 40);
		if(l5d36) frame.drawOval(375, 355, 40, 40);
		if(l5d37) frame.drawOval(425, 355, 40, 40);
		if(l5d38) frame.fillOval(475, 355, 40, 40);
		if(l5d39) frame.drawOval(525, 355, 40, 40);
		if(l5d40) frame.fillOval(575, 355, 40, 40);
		if(l5d41) frame.drawOval(125, 405, 40, 40);
		if(l5d42) frame.fillOval(175, 405, 40, 40);
		if(l5d43) frame.drawOval(225, 405, 40, 40);
		if(l5d44) frame.drawOval(275, 405, 40, 40);
		if(l5d45) frame.fillOval(325, 405, 40, 40);
		if(l5d46) frame.drawOval(375, 405, 40, 40);
		if(l5d47) frame.fillOval(425, 405, 40, 40);
		if(l5d48) frame.fillOval(475, 405, 40, 40);
		if(l5d49) frame.drawOval(525, 405, 40, 40);
		if(l5d50) frame.fillOval(575, 405, 40, 40);
		if(l5d51) frame.fillOval(125, 455, 40, 40);
		if(l5d52) frame.fillOval(175, 455, 40, 40);
		if(l5d53) frame.drawOval(225, 455, 40, 40);
		if(l5d54) frame.fillOval(275, 455, 40, 40);
		if(l5d55) frame.drawOval(325, 455, 40, 40);
		if(l5d56) frame.fillOval(375, 455, 40, 40);
		if(l5d57) frame.drawOval(425, 455, 40, 40);
		if(l5d58) frame.drawOval(475, 455, 40, 40);
		if(l5d59) frame.fillOval(525, 455, 40, 40);
		if(l5d60) frame.drawOval(575, 455, 40, 40);
		if(l5d61) frame.fillOval(125, 505, 40, 40);
		if(l5d62) frame.drawOval(175, 505, 40, 40);
		if(l5d63) frame.fillOval(225, 505, 40, 40);
		if(l5d64) frame.fillOval(275, 505, 40, 40);
		if(l5d65) frame.drawOval(325, 505, 40, 40);
		if(l5d66) frame.drawOval(375, 505, 40, 40);
		if(l5d67) frame.fillOval(425, 505, 40, 40);
		if(l5d68) frame.drawOval(475, 505, 40, 40);
		if(l5d69) frame.fillOval(525, 505, 40, 40);
		if(l5d70) frame.drawOval(575, 505, 40, 40);
		if(l5d71) frame.drawOval(125, 555, 40, 40);
		if(l5d72) frame.fillOval(175, 555, 40, 40);
		if(l5d73) frame.drawOval(225, 555, 40, 40);
		if(l5d74) frame.drawOval(275, 555, 40, 40);
		if(l5d75) frame.fillOval(325, 555, 40, 40);
		if(l5d76) frame.fillOval(375, 555, 40, 40);
		if(l5d77) frame.drawOval(425, 555, 40, 40);
		if(l5d78) frame.fillOval(475, 555, 40, 40);
		if(l5d79) frame.drawOval(525, 555, 40, 40);
		if(l5d80) frame.fillOval(575, 555, 40, 40);
		if(l5d81) frame.fillOval(125, 605, 40, 40);
		if(l5d82) frame.drawOval(175, 605, 40, 40);
		if(l5d83) frame.fillOval(225, 605, 40, 40);
		if(l5d84) frame.fillOval(275, 605, 40, 40);
		if(l5d85) frame.drawOval(325, 605, 40, 40);
		if(l5d86) frame.fillOval(375, 605, 40, 40);
		if(l5d87) frame.drawOval(425, 605, 40, 40);
		if(l5d88) frame.drawOval(475, 605, 40, 40);
		if(l5d89) frame.fillOval(525, 605, 40, 40);
		if(l5d90) frame.drawOval(575, 605, 40, 40);
		if(l5d91) frame.drawOval(125, 655, 40, 40);
		if(l5d92) frame.fillOval(175, 655, 40, 40);
		if(l5d93) frame.drawOval(225, 655, 40, 40);
		if(l5d94) frame.drawOval(275, 655, 40, 40);
		if(l5d95) frame.fillOval(325, 655, 40, 40);
		if(l5d96) frame.drawOval(375, 655, 40, 40);
		if(l5d97) frame.fillOval(425, 655, 40, 40);
		if(l5d98) frame.drawOval(475, 655, 40, 40);
		if(l5d99) frame.fillOval(525, 655, 40, 40);
		if(l5d100) frame.fillOval(575, 655, 40, 40);
				
				if(l5wrong>=1)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 100, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 110, 915, 190);
					frame.drawLine(915, 110, 835, 190);
				}
				if(l5wrong>=2)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
					frame.drawRect(825, 200, 100, 100);
					frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 210, 915, 290);
					frame.drawLine(915, 210, 835, 290);
				}
				if(l5wrong>=3)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 300, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 310, 915, 390);
					frame.drawLine(915, 310, 835, 390);
				}
				if(l5wrong>=4)
				{
					frame.setColor(Color.RED);
					frame.setStroke(new BasicStroke(5));
			        frame.drawRect(825, 400, 100, 100);
			        frame.setStroke(new BasicStroke(2));
				    frame.drawLine(835, 410, 915, 490);
					frame.drawLine(915, 410, 835, 490);
				}
				if(l5wrong>=5)
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
		JFrame frame= new JFrame("Binary Dots: LEVEL 5");	
		frame.getContentPane().add(new Level5());
		frame.getContentPane().addMouseListener(new ClickListener(frame));
		frame.setSize(1100, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		
		JPanel panel = new JPanel();
		frame.add(panel);
				
	}
}
