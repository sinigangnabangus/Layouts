import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;


public class FlowLayoutExample {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JButton jb1 = new JButton("Button 1");
		//JButton jb2 = new JButton("Button 2");
		//JButton jb3 = new JButton("Button 3");

		JButton jb1 = new JButton("NORTH");
		JButton jb2 = new JButton("SOUTH");
		JButton jb3 = new JButton("WEST");
		JButton jb4 = new JButton("EAST");
		JButton jb5 = new JButton("CENTER");

		JButton jbb1 = new JButton("NORTH");
		JButton jbb2 = new JButton("SOUTH");
		JButton jbb3 = new JButton("WEST");
		JButton jbb4 = new JButton("EAST");
		JButton jbb5 = new JButton("CENTER");

		//JPanel panel = new JPanel();
		//panel.setLayout(new FlowLayout());
		//panel.add(jb1);
		//panel.add(jb2);
		//panel.add(jb3);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(jbb1, BorderLayout.NORTH);
		panel2.add(jbb2, BorderLayout.SOUTH);
		panel2.add(jbb3, BorderLayout.WEST);
		panel2.add(jbb4, BorderLayout.EAST);
		panel2.add(jbb5, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(jb1, BorderLayout.NORTH);
		panel.add(jb2, BorderLayout.SOUTH);
		panel.add(jb3, BorderLayout.WEST);
		panel.add(jb4, BorderLayout.EAST);
		panel.add(panel2, BorderLayout.CENTER);

		frame.add(panel);
		//frame.pack();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}