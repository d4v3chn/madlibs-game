import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MadLibs extends JFrame {
	private JTextField adjTxt;
	private JTextField colorTxt;
	private JTextField verbTxt;
	private JTextField nounTxt;
	private JLabel mainTxtVar;
	
	public void getMadLibs() {
		String adjective = adjTxt.getText();
		String color = colorTxt.getText();
		String verb = verbTxt.getText();
		String noun = nounTxt.getText();
		
		String text = "The " + color +" dragon " + verb +" at the " +
				adjective + " " + noun;
		text += '\n' + "And everyone lived happily ever after.";
		text += '\n' + "The end.";
		
		mainTxtVar.setText(text);
		
		
	}
	
	
	public MadLibs() {
		setTitle("Mad Libs");
		
		JLabel lblNewLabel = new JLabel("Wacky Shmacky Zahaha Mad Libs");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 34));
		
		JLabel lblNewLabel_1 = new JLabel("Enter an adjective:");
		
		adjTxt = new JTextField();
		adjTxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter a color:");
		
		colorTxt = new JTextField();
		colorTxt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter a past Verb:");
		
		verbTxt = new JTextField();
		verbTxt.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Enter a Noun:");
		
		nounTxt = new JTextField();
		nounTxt.setColumns(10);
		
		JButton goButton = new JButton("Press here to view your Mad Libs monstrosity");
		goButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getMadLibs();
			}
		});
		
		mainTxtVar = new JLabel("");
		mainTxtVar.setForeground(SystemColor.inactiveCaption);
		mainTxtVar.setFont(new Font("Vladimir Script", Font.BOLD, 15));
		mainTxtVar.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(126)
					.addComponent(goButton, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
					.addGap(126))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(50)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(verbTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(41)
									.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(nounTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(adjTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(41)
									.addComponent(lblNewLabel_2)
									.addGap(18)
									.addComponent(colorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(16)
							.addComponent(lblNewLabel)))
					.addContainerGap(16, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addComponent(mainTxtVar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(14))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_1))
						.addComponent(adjTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_2))
						.addComponent(colorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_1_1))
						.addComponent(verbTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_2_1))
						.addComponent(nounTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(goButton)
					.addGap(18)
					.addComponent(mainTxtVar, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}

	public static void main(String[] args) {
		

	}
}
