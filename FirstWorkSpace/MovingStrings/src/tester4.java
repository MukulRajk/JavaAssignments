import java.awt.*;

class MoveCircle extends Frame implements Runnable{
	private int x;
	Thread t1;
	
	public MoveCircle() {
		x=500;
		Thread t1=new Thread(this,"T");
		
		t1.start();
		
	}
	
	public void paint(Graphics g) {
		//g.drawOval(x,50,50,50);
		g.fillOval(x, 50, 50, 50);
		g.setColor(Color.RED);
		//g.setFont(new Font("Cambria",50,50));
	
	}

	@Override
	public void run() {
		while(true) {
		x--;
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			
			
		}
		if(x==0) {
			x++;
			}
		
			else {
				continue;
			}
		repaint();}
			
	}



}
public class tester4 {
public static void main(String args[]) {
	MoveCircle mc=new MoveCircle();
	mc.setVisible(true);
	mc.setSize(500, 500);
	
}
}
