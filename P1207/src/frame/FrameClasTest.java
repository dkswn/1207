package frame;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
public class FrameClasTest {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		Dimension d = f.getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width/2-150, screenSize.height/2-100); // 150은 넓이의 /2 100도 /2넓이의 한 가운데맞춤
		f.setVisible(true);
	}
	

}
