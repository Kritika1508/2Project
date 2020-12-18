package piano_p;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.sound.sampled.*;
public class Piano {

	private JFrame frmPiano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano window = new Piano();
					window.frmPiano.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Piano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPiano = new JFrame();
		frmPiano.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 23));
		frmPiano.setTitle("PIANO");
		frmPiano.setBounds(100, 100, 883, 488);
		frmPiano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPiano.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                       try {
                    	   AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Public\\Music\\Sample Music\\Kalimba"));
                    	   Clip clip = AudioSystem.getClip();
                    	   clip.open(audioInputStream);
                    	   clip.start();
                       }
                       catch(Exception e1)
                       {}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(29, 247, 57, 192);
		frmPiano.getContentPane().add(btnNewButton);
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setBounds(111, 247, 57, 192);
		frmPiano.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setBounds(191, 247, 57, 192);
		frmPiano.getContentPane().add(btnE);
		
		JButton btnF_1 = new JButton("F1");
		btnF_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnF_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_1.setBounds(770, 247, 57, 192);
		frmPiano.getContentPane().add(btnF_1);
		
		JButton btnD_1 = new JButton("D1");
		btnD_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnD_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_1.setBounds(673, 247, 73, 192);
		frmPiano.getContentPane().add(btnD_1);
		
		JButton btnC = new JButton("C1");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setBounds(596, 247, 67, 192);
		frmPiano.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setBounds(518, 247, 57, 192);
		frmPiano.getContentPane().add(btnB);
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setBounds(284, 247, 57, 192);
		frmPiano.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setBounds(361, 247, 57, 192);
		frmPiano.getContentPane().add(btnG);
		
		JButton btnH = new JButton("A");
		btnH.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnH.setVerticalAlignment(SwingConstants.BOTTOM);
		btnH.setBounds(442, 247, 57, 192);
		frmPiano.getContentPane().add(btnH);
		
		JButton btnC_1 = new JButton("C#");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
              	   AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Public\\Music\\Sample Music\\Kalimba"));
              	   Clip clip = AudioSystem.getClip();
              	   clip.open(audioInputStream);
              	   clip.start();
                 }
                 catch(Exception e1)
                 {}
		}
			
		});
		btnC_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnC_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_1.setBounds(59, 26, 67, 192);
		frmPiano.getContentPane().add(btnC_1);
		
		JButton btnD_2 = new JButton("D#");
		btnD_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_2.setBounds(147, 26, 67, 192);
		frmPiano.getContentPane().add(btnD_2);
		
		JButton btnC_2 = new JButton("C#1");
		btnC_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnC_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_2.setBounds(629, 26, 73, 192);
		frmPiano.getContentPane().add(btnC_2);
		
		JButton btnD_3 = new JButton("D#1");
		btnD_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_3.setBounds(721, 26, 73, 192);
		frmPiano.getContentPane().add(btnD_3);
		
		JButton btnF_2 = new JButton("F#");
		btnF_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnF_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_2.setBounds(326, 26, 57, 192);
		frmPiano.getContentPane().add(btnF_2);
		
		JButton btnG_1 = new JButton("G#");
		btnG_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnG_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_1.setBounds(393, 26, 69, 192);
		frmPiano.getContentPane().add(btnG_1);
		
		JButton btnBb = new JButton("Bb");
		btnBb.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBb.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBb.setBounds(476, 26, 57, 192);
		frmPiano.getContentPane().add(btnBb);
	}
}
