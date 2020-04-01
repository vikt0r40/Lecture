package GUI;

import java.util.ArrayList;

import javax.swing.JFrame;

import Models.Order;
import Models.Product;
import Models.Weitress;

public class AcademyBar extends JFrame {
	
	//ArrayLists
	public ArrayList<Product> products;
	public ArrayList<Weitress> weitreses;
	public ArrayList<Order> orders = new ArrayList<Order>();
	
	//Panels
	public EntrancePanel entrancePanel;
	public OperationPanel operationPanel;
	public PickTablePanel pickTablePanel;
	public GetBillPanel getBillPanel;
	public OrderPanel orderPanel;
	
	public AcademyBar() {
		super("Academy Bar");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);
		
		showEntrancePanel();
	}
	
	public void showEntrancePanel() {
		
		removeAllPanels();

		this.entrancePanel = new EntrancePanel(this);
		this.entrancePanel.setSize(getWidth(), getHeight());
		add(this.entrancePanel);
		invalidate();
		validate();
		
	}
	public void showOperationPanel() {

		removeAllPanels();
		
		this.operationPanel = new OperationPanel(this);
		this.operationPanel.setSize(getWidth(), getHeight());
		this.operationPanel.setVisible(true);
		add(this.operationPanel);
		invalidate();
		validate();
		
	}
	public void showPickTablePanel(int type) {

		removeAllPanels();
		
		this.pickTablePanel = new PickTablePanel(this, type);
		this.pickTablePanel.setSize(getWidth(), getHeight());
		add(this.pickTablePanel);
		invalidate();
		validate();
	
	}
	public void showOrderPanel(Order order, int selectedTable) {

		removeAllPanels();
		
		this.orderPanel = new OrderPanel(this, order, selectedTable);
		this.orderPanel.setSize(getWidth(), getHeight());
		add(this.orderPanel);
		invalidate();
		validate();
		
	}
	public void showGetBillPanel(Order order) {

		removeAllPanels();
		
		this.getBillPanel = new GetBillPanel(this, order);
		this.getBillPanel.setSize(getWidth(), getHeight());
		add(this.getBillPanel);
		invalidate();
		validate();
	
	}
	
	public void removeAllPanels() {
		if(this.getBillPanel != null) {
			//this.getBillPanel.setVisible(false);
			this.getContentPane().remove(this.getBillPanel);
		}
		if(this.orderPanel != null) {
			//this.orderPanel.setVisible(false);
			this.getContentPane().remove(this.orderPanel);
		}
		if(this.operationPanel != null) {
			//this.operationPanel.setVisible(false);
			this.getContentPane().remove(this.operationPanel);
		}
		if(this.pickTablePanel != null) {
			//this.pickTablePanel.setVisible(false);
			this.getContentPane().remove(this.pickTablePanel);
		}
		if(this.entrancePanel != null) {
			//this.entrancePanel.setVisible(false);
			this.getContentPane().remove(this.entrancePanel);
		}
		invalidate();
		validate();
	}
}
