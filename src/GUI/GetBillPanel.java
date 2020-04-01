package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Models.Order;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GetBillPanel extends JPanel {
	
	public AcademyBar root;
	public Order order;
	public JLabel lblNewLabel;
	public GetBillPanel(AcademyBar root, Order order) {
		setBackground(Color.DARK_GRAY);
		this.root = root;
		this.order = order;
		
	    lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setText("The bill for table " + this.order.tableNumber+" is " + order.calculateBill());
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Remove order because we take the bill out
				for (int i = 0; i < root.orders.size(); i++) {
					Order selectedOrder = root.orders.get(i);
					if(selectedOrder.tableNumber == order.tableNumber) {
						root.orders.remove(i);
						break;
					}
				}
				
				root.showEntrancePanel();
			}
		});
		
		JButton btnVipCard = new JButton("VIP CARD");
		btnVipCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sumString = order.calculateBillWithoutCurrency();
				double sum = Double.parseDouble(sumString);
				double discountedSum = sum * 0.2;
				sum = sum - discountedSum;
				
				String discountedString = Double.toString(sum);
				lblNewLabel.setText("The bill for table " + order.tableNumber+" is " + discountedString + " BGN");
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnVipCard, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnFinish, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
							.addGap(212))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(157)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnVipCard, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnFinish, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(103, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}
	
}
