import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Panel extends JPanel {

	Panel(){
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setPaint(Color.orange);
		g2D.setStroke(new BasicStroke(30));
		g2D.drawLine(220, 200, 750, 2200);
		
		//g2D.setPaint(Color.pink);
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.fillRect(0, 0, 100, 200);
		
		g2D.setPaint(Color.magenta);
		//g2D.drawOval(100, 100, 100, 100);
		g2D.fillOval(150, 150, 100, 100);
		g2D.fillOval(150, 230, 100, 100);
		//g2D.fillOval(200, 250, 100, 100);
		g2D.fillOval(250, 150, 100, 100);
		g2D.fillOval(250, 230, 100, 100);
		
		g2D.setPaint(Color.green);
		g2D.fillOval(225, 140, 50, 100);
		g2D.fillOval(240, 210, 100, 50);
		g2D.fillOval(155, 210, 100, 50);
		g2D.fillOval(225, 230, 50, 100);
		
		g2D.fillOval(275, 350, 100, 30);
		g2D.fillOval(170, 410, 100, 30);
		//g2D.fillOval(300, 450, 100, 30);
		
		//int[] xPoints = {150,250,350};
		//int[] yPoints = {300,150,300};
		//g2D.setPaint(Color.green);
		//g2D.drawPolygon(xPoints, yPoints, 1);
		//g2D.fillPolygon(xPoints, yPoints, 3);
		//g2D.fillPolygon(xPoints, yPoints, 2);
		
		g2D.setPaint(Color.yellow);
		//g2D.drawArc(200, 200, 100, 100, 0, 360);
		g2D.fillArc(225, 210, 50, 50, 0, 360);
		//g2D.setPaint(Color.white);
		//g2D.fillArc(200, 200, 100, 100, 180, 180);
		
		g2D.setPaint(Color.black);
		g2D.setFont(new Font("Ink Free", Font.BOLD,25));
		g2D.drawString("Mochamad Hafidh Dwyanto", 100, 50);
		g2D.drawString("211511043", 170, 70);
		
		g2D.setPaint(Color.blue);
		g2D.setFont(new Font("Ink Free", Font.BOLD,25));
		g2D.drawString("Gambar Bunga", 150, 100);
	}

}
