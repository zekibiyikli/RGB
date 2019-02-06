import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	static JFrame frame;
	static JPanel panel;
	static JLabel red,green,blue;
	static JTextField redtf,greentf,bluetf;
	static JLabel result;
	static JButton check;
	static String redValue,greenValue,blueValue;
	public static void main(String[] args) {
		frame=new JFrame("Kim Milyoner Olmak Ýster");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		red=new JLabel("Kýrmýzý:");
		red.setSize(50,50);
		red.setLocation(50,50);
		panel.add(red);
		
		green=new JLabel("Yeþil:");
		green.setSize(50,50);
		green.setLocation(50,100);
		panel.add(green);
		
		blue=new JLabel("Mavi:");
		blue.setSize(50,50);
		blue.setLocation(50,150);
		panel.add(blue);
		
		redtf=new JTextField();
		redtf.setSize(100,30);
		redtf.setLocation(100,60);
		panel.add(redtf);
		
		greentf=new JTextField();
		greentf.setSize(100,30);
		greentf.setLocation(100,110);
		panel.add(greentf);
		
		bluetf=new JTextField();
		bluetf.setSize(100,30);
		bluetf.setLocation(100,160);
		panel.add(bluetf);
		
		result=new JLabel("-");
		result.setSize(100,30);
		result.setLocation(300,160);
		panel.add(result);
		
		
		check=new JButton("");
		check.setSize(200, 45);
		check.setLocation(100,250);
		check.addActionListener(new Action());
		panel.add(check);
		
		
		frame.add(panel);
		frame.repaint();

	}
	
	public static void process(String red,String green,String blue) {
		int red2=Integer.parseInt(red);
		int green2=Integer.parseInt(green);
		int blue2=Integer.parseInt(blue);
		check.setBackground(new Color(red2,green2,blue2));
		String hex1,hex2,hex3;
		
		hex1=Integer.toHexString(red2).toUpperCase();
		hex2=Integer.toHexString(green2).toUpperCase();
		hex3=Integer.toHexString(blue2).toUpperCase();

		if(hex1.length()==1) {
			hex1=hex1+hex1;
		}
		if(hex2.length()==1) {
			hex2=hex2+hex2;
		}		
		if(hex3.length()==1) {
			hex3=hex3+hex3;
		}
		result.setText("#"+hex1+hex2+hex3);
	}
	
	static class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==check){
				 redValue=redtf.getText().toUpperCase();
				 greenValue=greentf.getText().toUpperCase();
				 blueValue=bluetf.getText().toUpperCase();
				 
				 process(redValue,greenValue,blueValue);
				
			}
			
		}
	}

}
