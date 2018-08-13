/*
 * LoginView.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import server.Client;

import model.Business;
import model.Courier;
import model.Customer;
import model.ModelFactory;

/**
 *
 * @author  __USER__
 */
public class LoginView extends javax.swing.JFrame {

	/** Creates new form LoginView */
	public LoginView() {
		initComponents();
		this.drawLoginView(); //处理页面美化

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		jLabel5.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new RegisterView().setVisible(true);
				
			}
		});
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(240, 221, 76));

		jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("  \u4e3b\u9875");
		jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel6MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel6).addContainerGap(356,
								Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel6).addContainerGap(31,
								Short.MAX_VALUE)));

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel1.setText("\u7528\u6237\u540d\uff1a");

		jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel2.setText("\u5bc6   \u7801\uff1a");

		jPanel3.setBackground(new java.awt.Color(51, 204, 0));
		jPanel3.setForeground(new java.awt.Color(255, 255, 255));
		jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				try {
					jPanel3MouseClicked(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel3MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel3MouseExited(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u767b\u5f55");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addGap(154, 154, 154)
						.addComponent(jLabel3).addContainerGap(178,
								Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33,
				Short.MAX_VALUE));

		jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel4.setText("\u672a\u6709\u8d26\u6237\uff1f");

		jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel5.setForeground(new java.awt.Color(0, 102, 204));
		jLabel5.setText("\u6ce8\u518c");
		jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel5MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jLabel5MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jLabel5MouseExited(evt);
			}
		});

		jLabel7.setForeground(new java.awt.Color(153, 153, 153));
		jLabel7.setText("\u2014   \u7b2c\u4e09\u65b9\u767b\u5f55   \u2014");

		jLabel8.setText("\u7528\u6237");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel2,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(24, 24, 24)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel2)
																														.addComponent(
																																jLabel1))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jPasswordField1)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																278,
																																Short.MAX_VALUE)))
																						.addComponent(
																								jLabel8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								319,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jPanel3,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addGap(
																				33,
																				33,
																				33))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel5)
																		.addGap(
																				252,
																				252,
																				252))))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(142, Short.MAX_VALUE)
										.addComponent(jLabel7).addGap(144, 144,
												144)));
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
										.addGap(48, 48, 48)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																41,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(48, 48, 48)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(52, 52, 52)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(jLabel5))
										.addGap(36, 36, 36)
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(19, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/*注册界面*/
	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:

	}

	private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jLabel5.setForeground(new Color(0, 102, 204));
	}

	private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jLabel5.setForeground(new Color(0, 63, 125));

	}

	/*返回主页*/
	private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new HomeView().setVisible(true);
	}

	/*登录*/
	private void jPanel3MouseClicked(java.awt.event.MouseEvent evt)
			throws SQLException, ClassNotFoundException, UnknownHostException,
			IOException {
		// TODO add your handling code here:

		if (jTextField1.getText().equals("")
				|| jPasswordField1.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "信息不能为空");
		} else {

			try {
				String id = jTextField1.getText();
				String password = jPasswordField1.getText();

				try {

					Client client = new Client();

					/*判断登录身份*/
					Customer customer = client.cLogin(id, password);

					if (customer == null) {

						System.out.println("C空");
						this.bLogin();
					} else {

						new LoadView(customer).setVisible(true);
						this.dispose();
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(this, e.getMessage());
					e.printStackTrace();
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
				e.printStackTrace();
			}

		}
	}

	private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel3.setBackground(new Color(51, 204, 0));

	}

	private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel3.setBackground(new Color(15, 175, 30));
	}

	/*商家登录*/
	public void bLogin() {
		try {
			String id = jTextField1.getText();
			String password = jPasswordField1.getText();

			try {

				Client client = new Client();

				/*判断登录身份*/

				Business business = client.bLogin(id, password);

				if (business == null) {
					this.coLogin();
				} else {
					System.out.println(business);
					new LoadView(business).setVisible(true);
					this.dispose();
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
				e.printStackTrace();
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			e.printStackTrace();
		}
	}

	/*外卖员登录*/
	public void coLogin() {
		try {
			String id = jTextField1.getText();
			String password = jPasswordField1.getText();

			try {

				Client client = new Client();

				/*判断登录身份*/

				Courier courier = client.coLogin(id, password);

				if (courier == null) {
					throw new Exception("用户不存在或密码错误");
				} else {

					new HomeView(courier).setVisible(true);
					this.dispose();
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
				e.printStackTrace();
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			//TODO exception
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;

	// End of variables declaration//GEN-END:variables

	/*处理页面美化*/

	public void drawLoginView() {
		jPanel2.setBackground(new Color(95, 142, 230)); //设置jPanel2颜色
		jLabel6.setText("← 主页"); //设置jTextField标签
		jLabel8.setIcon(new ImageIcon("Image/登陆方式.png")); //设置jLabel8的图片
	}
	

}