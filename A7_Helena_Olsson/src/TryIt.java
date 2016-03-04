import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// call the method, x, y and a color of choice 
		drawMushroom(0, 0, Color.RED);
		drawMushroom(17, 0,Color.GREEN);
		
	}
		
	// This Method draws the mushroom. 
	public void drawMushroom(int x, int y, Color r) {

		PixelController px = PixelController.getInstance(Screen.MEDEA_3);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* Colors in the array */ 
		Color b = Color.BLACK;
		Color w = Color.WHITE;
		Color n = null;
		
		Color[][] superMushroom = {
				{n,n,n,n,n,b,b,b,b,b,b,n,n,n,n,n},
				{n,n,n,b,b,r,r,r,r,w,w,b,b,n,n,n},
				{n,n,b,w,w,r,r,r,r,w,w,w,w,b,n,n},
				{n,b,w,w,r,r,r,r,r,r,w,w,w,w,b,n},
				{n,b,w,r,r,w,w,w,w,r,r,w,w,w,b,n},
				{b,r,r,r,w,w,w,w,w,w,r,r,r,r,r,b},
				{b,r,r,r,w,w,w,w,w,w,r,r,w,w,r,b},
				{b,w,r,r,w,w,w,w,w,w,r,w,w,w,w,b},
				{b,w,w,r,r,w,w,w,w,r,r,w,w,w,w,b},
				{b,w,w,r,r,r,r,r,r,r,r,r,w,w,r,b},
				{b,w,r,r,b,b,b,b,b,b,b,b,r,r,r,b},
				{n,b,b,b,w,w,b,w,w,b,w,w,b,b,b,n},
				{n,n,b,w,w,w,b,w,w,b,w,w,w,b,n,n},
				{n,n,b,w,w,w,w,w,w,w,w,w,w,b,n,n},
				{n,n,n,b,w,w,w,w,w,w,w,w,b,n,n,n},
				{n,n,n,n,b,b,b,b,b,b,b,b,n,n,n,n}
		}; 
		/* loops out the color of the mushroom from the array */
		for(int i = 15; i >= 0; i --) {
			for(int j = 0; j < 16; j ++) {
				if(superMushroom[i][j] != null ){
					px.setPixel(x + i, y + j, superMushroom[i][j]);
					//System.out.print(superMushroom[y][x].toString());
				}
			}
		} 
		
		
	}
}