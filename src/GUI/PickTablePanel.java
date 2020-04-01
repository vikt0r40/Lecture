package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Models.Order;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PickTablePanel extends JPanel implements ActionListener{

	public AcademyBar root;
	public int type;
	
	public PickTablePanel(AcademyBar root, int type) {
		setBackground(Color.DARK_GRAY);
		this.root = root;
		this.type = type;
		
		JButton button = new JButton("10");
		button.addActionListener(this);
		
		JButton button_1 = new JButton("15");
		button_1.addActionListener(this);
		
		JButton button_2 = new JButton("20");
		button_2.addActionListener(this);
		
		JButton button_3 = new JButton("25");
		button_3.addActionListener(this);
		
		JButton button_4 = new JButton("30");
		button_4.addActionListener(this);
		
		JButton button_5 = new JButton("35");
		button_5.addActionListener(this);
		
		JButton button_6 = new JButton("40");
		button_6.addActionListener(this);
		
		JButton button_7 = new JButton("45");
		button_7.addActionListener(this);
		
		JButton button_8 = new JButton("50");
		button_8.addActionListener(this);
		
		JLabel lblChooseTable = new JLabel("Choose Table");
		lblChooseTable.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		lblChooseTable.setForeground(Color.WHITE);
		lblChooseTable.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("BACK TO OPERATIONS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.showOperationPanel();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(177)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 180, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblChooseTable, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(lblChooseTable, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		setLayout(groupLayout);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton selectedButton = (JButton)e.getSource();
		System.out.println(selectedButton.getText());
		
		if(this.type == 2 || this.type == 1) {
			//Add to existing order and new order
			if(root.orders.size() > 0) {
				boolean noOrdersForThisTable = false;
				for (int i = 0; i < root.orders.size(); i++) {
					Order currentOrder = root.orders.get(i);
					if(currentOrder.tableNumber == Integer.parseInt(selectedButton.getText())) {
						noOrdersForThisTable = true;
						root.showOrderPanel(currentOrder,Integer.parseInt(selectedButton.getText()));
					}
				}
				if(!noOrdersForThisTable) {
					root.showOrderPanel(null,Integer.parseInt(selectedButton.getText()));
				}
				
			} else {
				root.showOrderPanel(null,Integer.parseInt(selectedButton.getText()));
			}
		} else if(this.type == 3) {
			//Get the bill
			boolean noProducts = false;
			
			if(root.orders.size() > 0) {
				for (int i = 0; i < root.orders.size(); i++) {
					Order currentOrder = root.orders.get(i);
					if(currentOrder.tableNumber == Integer.parseInt(selectedButton.getText())) {
						noProducts = true;
						root.showGetBillPanel(currentOrder);
					}
				}
				
				if(!noProducts) {
					JOptionPane.showMessageDialog(null, "There is not products for this table", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "There is not products for this table", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
	}
}
