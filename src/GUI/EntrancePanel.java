package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import Models.Weitress;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntrancePanel extends JPanel {
	
	public AcademyBar root;
	public JTextField textField;
	
	public EntrancePanel(AcademyBar root) {
		setBackground(Color.DARK_GRAY);
		this.root = root;
		
		JLabel lblWelcomeToAcademy = new JLabel("WELCOME TO ACADEMY BAR SYSTEM");
		lblWelcomeToAcademy.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToAcademy.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		lblWelcomeToAcademy.setForeground(Color.WHITE);
		
		JLabel lblWeitressEntrance = new JLabel("Weitress Entrance");
		lblWeitressEntrance.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblWeitressEntrance.setForeground(Color.WHITE);
		lblWeitressEntrance.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		JButton enterButton = new JButton("ENTER");
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkPin();
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblWeitressEntrance, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
								.addComponent(lblWelcomeToAcademy, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(231)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(enterButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
								.addComponent(textField, Alignment.LEADING))
							.addGap(233))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(lblWelcomeToAcademy)
					.addGap(114)
					.addComponent(lblWeitressEntrance)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(enterButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(123, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		
	}

	
	private void checkPin() {
		if(this.textField.getText().length() > 0) {
			boolean isFound = false;
			
			for (Weitress weitress : root.weitreses) {
				if(weitress.pinCode.equals(this.textField.getText())) {
					System.out.println(weitress);
					isFound = true;
					root.showOperationPanel();
					break;
				}
			}
			
			if(!isFound) {
				JOptionPane.showMessageDialog(null, "Pin is required", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Pin is required", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
