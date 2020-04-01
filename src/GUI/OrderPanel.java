package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Models.Order;
import Models.Product;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class OrderPanel extends JPanel implements ActionListener{

	public AcademyBar root;
	public Order order;
	public ArrayList<JButton> buttons;
	public int selectedTable;
	
	public JButton btnEraseOrder;
	public JButton btnApply;
	
	public JTextArea productList;
	
	public OrderPanel(AcademyBar root, Order order, int selectedTable) {
		setBackground(Color.DARK_GRAY);
		this.root = root;
		this.order = order;
		this.selectedTable = selectedTable;
		
		buttons = new ArrayList<>();
		
		JButton btnNewButton = new JButton("New button");
		buttons.add(btnNewButton);
		
		JButton button = new JButton("New button");
		buttons.add(button);
		
		JButton button_1 = new JButton("New button");
		buttons.add(button_1);
		
		JButton button_2 = new JButton("New button");
		buttons.add(button_2);
		
		JButton button_3 = new JButton("New button");
		buttons.add(button_3);
		
		JButton button_4 = new JButton("New button");
		buttons.add(button_4);
		
		JButton button_5 = new JButton("New button");
		buttons.add(button_5);
		
		JButton button_6 = new JButton("New button");
		buttons.add(button_6);
		
		JButton button_7 = new JButton("New button");
		buttons.add(button_7);
		
		JButton button_8 = new JButton("New button");
		buttons.add(button_8);
		
		JButton button_9 = new JButton("New button");
		buttons.add(button_9);
		
		JButton button_10 = new JButton("New button");
		buttons.add(button_10);
		
		
		for (int i = 0; i < buttons.size(); i++) {
			JButton jButton = buttons.get(i);
			jButton.addActionListener(this);
			Product myProduct = root.products.get(i);
			jButton.setText(myProduct.toString());
		}
		
		
		btnEraseOrder = new JButton("ERASE ORDER");
		btnEraseOrder.addActionListener(this);
		
		btnApply = new JButton("APPLY");
		btnApply.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		if(this.order != null) {
			lblNewLabel.setText("Add to existing order");
		} else {
			lblNewLabel.setText("New Order");
		}
		
		productList = new JTextArea();
		productList.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(productList);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnEraseOrder, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnApply, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(178)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEraseOrder, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnApply, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(21))
		);
		
		setLayout(groupLayout);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.btnEraseOrder) {
			productList.setText("");
			this.order.products = new ArrayList<Product>();
			
			return;
		} 
		if(e.getSource() == this.btnApply) {
			
			for (int i = 0; i < root.orders.size(); i++) {
				Order checkOrder = root.orders.get(i);
				if(checkOrder.tableNumber == this.order.tableNumber) {
					root.orders.remove(i);
					break;
				}
			}
			root.orders.add(this.order);
			
			
			//Popup
			Object[] options = {"Yes, please", "No way!"};
			int n = JOptionPane.showOptionDialog(null,
	                "You sure you want to order these products?",
	                "Confirm order",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,
	                null,
	                options,
	                options[0]);
			if (n == JOptionPane.YES_OPTION) {
				if(this.order.products.size() > 0) {
					root.showEntrancePanel();
				} else {
					for (int i = 0; i < root.orders.size(); i++) {
						Order currentOrder = root.orders.get(i);
						if(currentOrder.tableNumber == this.order.tableNumber) {
							root.orders.remove(i);
							break;
						}
					}
					root.showEntrancePanel();
				}
			}
			
			
			return;
		}
		
		
		if(this.order == null) {
			this.order = new Order(this.selectedTable, new ArrayList<Product>());
		}
		
		JButton selectedProduct = (JButton)e.getSource();
		
		for (int i = 0; i < root.products.size(); i++) {
			Product myProduct = root.products.get(i);
			if(selectedProduct.getText().equals(myProduct.toString())) {
				this.order.products.add(myProduct);
				
				
				String quantity = myProduct.quantity>0?Integer.toString(myProduct.quantity):"";
				this.productList.setText(this.productList.getText() + " " + myProduct.name + " " + quantity + "\n");
			}
		}
	}
}
