package choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest {
	public static void main(String[] args) {
	Frame f = new Frame("Choice-Select");
	f.setSize(300, 200);
	f.setLayout(null);// 크기와 위치를 직접 작성할때
	
	Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setSize(100, 50); // 창크기
		day.setLocation(100, 70);
		
		f.add(day);
		f.setVisible(true);
		
	}

}
