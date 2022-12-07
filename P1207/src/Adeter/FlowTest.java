package Adeter;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class FlowTest implements WindowListener{
		private Frame frame;
		private Button Button1, Button2, Button3;
		
		public FlowTest() {
			frame  = new Frame("adapter example");
			Button1 = new Button("Ok");
			Button2 = new Button("Open");
			Button3 = new Button("Close");
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		public void windowClosed(WindowEvent e) {}  // import java.awt.event.WindowAdater로 코드를 줄일 수 있다
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowOpened(WindowEvent e) {}
		
		public void startFrame() {
			frame.addWindowListener(this);
			frame.setLayout(new FlowLayout());
			
			frame.add(Button1);
			frame.add(Button2);
			frame.add(Button3);
			frame.setSize(300, 300);
			frame.setVisible(true);
		}
	public static void main(String[] args) {
		FlowTest g= new FlowTest();
		g.startFrame();
		
	}

}
