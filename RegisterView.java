/*
 * Register.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import server.Client;
import server.Server;

import model.Business;
import model.Courier;
import model.Customer;
import model.ModelFactory;
import model.Register;

/**
 *
 * @author  __USER__
 */
public class RegisterView extends javax.swing.JFrame implements WindowListener {

	/** Creates new form Register */
	public RegisterView() {
		initComponents();

		/*¥¶¿Ì“≥√Ê√¿ªØ*/
		this.drawRegisterView();

		this.addWindowListener(this);
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel3 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jRadioButton4 = new javax.swing.JRadioButton();
		jRadioButton5 = new javax.swing.JRadioButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		jPasswordField2 = new javax.swing.JPasswordField();
		jLabel6 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u6ce8\u518c\u8d26\u53f7");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel2Layout.createSequentialGroup().addContainerGap(194,
						Short.MAX_VALUE).addComponent(jLabel1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 146,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(122,
						122, 122)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(25, 25, 25)
						.addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 17,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE)));

		jScrollPane1
				.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jPanel3.setPreferredSize(new java.awt.Dimension(100, 600));

		jLabel2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel2.setText("\u8d26   \u53f7\uff1a");

		buttonGroup2.add(jRadioButton4);
		jRadioButton4.setText("\u7537");

		buttonGroup2.add(jRadioButton5);
		jRadioButton5.setText("\u5973");

		jLabel3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel3.setText("\u59d3   \u540d\uff1a");

		jLabel9.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel9.setText("\u6027   \u522b\uff1a");

		jLabel4.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel4.setText("\u5bc6   \u7801\uff1a");

		jLabel5.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel5.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jLabel6.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel6.setText("\u8054\u7cfb\u7535\u8bdd\uff1a");

		jLabel7.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel7.setText("\u6240\u5728\u5730\u5740\uff1a");

		jLabel8.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel8.setText("\u6ce8\u518c\u8eab\u4efd\uff1a");

		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setText("\u7528\u6237");

		buttonGroup1.add(jRadioButton2);
		jRadioButton2.setText("\u5546\u5bb6");

		buttonGroup1.add(jRadioButton3);
		jRadioButton3.setText("\u5916\u5356\u5458");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(36, 36, 36)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addComponent(jLabel5)
														.addComponent(jLabel6)
														.addComponent(jLabel7)
														.addComponent(jLabel8)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel9))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												62,
																												62,
																												62)
																										.addComponent(
																												jRadioButton4)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jRadioButton5)
																										.addGap(
																												67,
																												67,
																												67))
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												44,
																												44,
																												44)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addComponent(
																																jPasswordField1,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																194,
																																Short.MAX_VALUE)
																														.addComponent(
																																jPasswordField2,
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jTextField5)
																														.addComponent(
																																jTextField6,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																201,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jTextField2,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																204,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.Alignment.LEADING))
																										.addGap(
																												38,
																												38,
																												38))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												9,
																												9,
																												9)
																										.addComponent(
																												jRadioButton1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jRadioButton2)
																										.addGap(
																												53,
																												53,
																												53)
																										.addComponent(
																												jRadioButton3)
																										.addGap(
																												14,
																												14,
																												14)))))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(58, 58, 58)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(35, 35, 35)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												46, Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9)
														.addComponent(
																jRadioButton4)
														.addComponent(
																jRadioButton5))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(44, 44, 44)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jPasswordField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(40, 40, 40)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(39, 39, 39)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(49, 49, 49)
										.addComponent(jLabel8)
										.addGap(30, 30, 30)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jRadioButton3)
														.addComponent(
																jRadioButton2)
														.addComponent(
																jRadioButton1))
										.addGap(38, 38, 38)));

		jScrollPane1.setViewportView(jPanel3);

		jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel4MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel4MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel4MouseExited(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("\u6ce8\u518c");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addGap(119, 119, 119)
						.addComponent(jLabel10).addContainerGap(126,
								Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel10, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPane1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 462,
						Short.MAX_VALUE).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(
								98, Short.MAX_VALUE).addComponent(jPanel4,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								83, 83, 83)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												498, Short.MAX_VALUE)
										.addGap(29, 29, 29)
										.addComponent(
												jPanel4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(22, 22, 22)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * ◊¢≤·
	 */

	private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel4.setBackground(new Color(51, 204, 0));
	}

	private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel4.setBackground(new Color(15, 175, 30));
	}

	private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		
		this.register();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegisterView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.JRadioButton jRadioButton4;
	private javax.swing.JRadioButton jRadioButton5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;

	// End of variables declaration//GEN-END:variables

	/**
	 * ¥¶¿Ì“≥√Ê√¿ªØ
	 * */

	public void drawRegisterView() {
		jPanel2.setBackground(new Color(95, 142, 230)); //…Ë÷√jPanel2—’…´
		jPanel4.setBackground(new Color(51, 204, 0)); //…Ë÷√jPanel3—’…´
	}
	
	/**
	 * ◊¢≤·
	 */
	
	public void register() {

		Customer customer = null;
		Business business = null;
		Courier courier = null;
		
		/*ªÒ»°◊¢≤·–≈œ¢*/
		String id = jTextField1.getText();
		String name = jTextField2.getText();
		String password = jPasswordField1.getText();
		String phone = jTextField5.getText();
		String address = jTextField6.getText();
		String sex="";
		
		if(jRadioButton4.isSelected()) {
			sex = "ƒ–";
		}else if(jRadioButton5.isSelected()){
			sex = "≈Æ";
		}
		
		if (jTextField1.getText().equals("")
				|| jTextField2.getText().equals("")
				|| jPasswordField1.getText().equals("")
				|| jPasswordField2.getText().equals("")
				|| jTextField5.getText().equals("")
				|| jTextField6.getText().equals("")) {
			customer = null;
			JOptionPane.showMessageDialog(this, "–≈œ¢≤ªƒ‹Œ™ø’");
			
		}
		
		if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()
				&& !jRadioButton3.isSelected()) {
			
			JOptionPane.showMessageDialog(this, "«Î—°‘Òƒ˙µƒ…Ì∑›");
			
		} else if(jRadioButton1.isSelected()){
			
			try {
				
				if(!jPasswordField1.getText().equals(jPasswordField2.getText())) {
					JOptionPane.showMessageDialog(this, " ‰»Î√‹¬Î≤ª“ª÷¬");
				}else {
					Client client = new Client();
					client.cRegister(id, name, password, sex, phone, address);
						
					JOptionPane.showMessageDialog(this, "◊¢≤·≥…π¶");
					
					this.dispose();
					new HomeView().setVisible(true);
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		} else if(jRadioButton2.isSelected()) {
			
			try {
				
				if(!jPasswordField1.getText().equals(jPasswordField2.getText())) {
					JOptionPane.showMessageDialog(this, " ‰»Î√‹¬Î≤ª“ª÷¬");
				}else {
					Client client = new Client();
					client.bRegister(id, name, password, phone, address);
					
					JOptionPane.showMessageDialog(this, "◊¢≤·≥…π¶");
					
					this.dispose();
					new HomeView().setVisible(true);
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} else if(jRadioButton3.isSelected()) {
			
			try {
				
				if(!jPasswordField1.getText().equals(jPasswordField2.getText())) {
					JOptionPane.showMessageDialog(this, " ‰»Î√‹¬Î≤ª“ª÷¬");
				}else {
					Client client = new Client();
					client.coRegister(id, name, password, phone, address);
					
					JOptionPane.showMessageDialog(this, "◊¢≤·≥…π¶");
					
					this.dispose();
					new HomeView().setVisible(true);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ÕÀ≥ˆ
	 * @param e
	 */
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.dispose();
		new HomeView().setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	

}