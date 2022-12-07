package easyAdater;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FlowTest extends WindowAdapter{
	private Frame frame;
	private Button button1, button2, button3;
	
	public FlowTest() {
		frame = new Frame("adapter example");
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());// 편함
//		frame.setLayout(null);
		
//		button1.setSize(50,50);  //노가다
//		button1.setLocation(10, 30);
//		frame.add(button1);
		
//		button2.setSize(50,50);
//		button2.setLocation(70,30);
		
//		button3.setSize(50,50); // 창크기
//		button3.setLocation(130, 30); // 위치
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest g = new FlowTest();
		g.startFrame();
		
	}

}
