package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperationPanel extends JPanel {
	
	public AcademyBar root;
	
	public OperationPanel(AcademyBar root) {
		setBackground(Color.DARK_GRAY);
		this.root = root;
		
		JLabel lblOperation = new JLabel("OPERATION");
		lblOperation.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblOperation.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperation.setForeground(Color.WHITE);
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.showPickTablePanel(1);;
			}
		});
		
		JButton btnAddToExisting = new JButton("Add to existing order");
		btnAddToExisting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.showPickTablePanel(2);
			}
		});
		
		JButton btnGetBill = new JButton("Get Bill");
		btnGetBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.showPickTablePanel(3);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblOperation, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(164)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAddToExisting, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewOrder, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnGetBill, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(lblOperation)
					.addGap(68)
					.addComponent(btnNewOrder, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddToExisting, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnGetBill, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(140, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		
	}
}
