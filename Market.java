/*
 * Market.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import server.Client;

import model.Business;
import model.Food;
import model.ModelFactory;
import model.Order;
import model.Shop;

/**
 *
 * @author  __USER__
 */
public class Market extends javax.swing.JFrame implements ActionListener {
	String bid = "1";
	String bname = "小黄厨";
	Business business = new Business();
	Shop shop;

	/** Creates new form Market 
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * @throws ClassNotFoundException */
	public Market() throws UnknownHostException, IOException,
			ClassNotFoundException {
		initComponents();
		//setBtn();

		this.drawMarket(); //处理页面美化

		jScrollPane1
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public Market(Business business) throws UnknownHostException, IOException,
			ClassNotFoundException {
		this.business = business;

		initComponents();

		/*处理页面美化*/
		drawMarket();

		/*商家登陆后设置本头像、店名等信息*/
		setshop();

		/*管理食物*/
		try {
			showFood(business);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jPanel2.setBorder(BorderFactory.createEtchedBorder());
		jPanel3.setBorder(BorderFactory.createEtchedBorder());
		jScrollPane1
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jPanel11 = new javax.swing.JPanel();
		jLabel11 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel4 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(51, 51, 51));

		jPanel5.setBackground(new java.awt.Color(51, 51, 51));
		jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel5MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel5MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel5MouseExited(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u5f00\u5e97");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addGap(58, 58, 58)
						.addComponent(jLabel4).addContainerGap(59,
								Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel5Layout.createSequentialGroup().addComponent(jLabel4,
						javax.swing.GroupLayout.PREFERRED_SIZE, 38,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		jPanel6.setBackground(new java.awt.Color(51, 51, 51));
		jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel6MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel6MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel6MouseExited(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("\u8bc4\u4ef7");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel6Layout.createSequentialGroup().addGap(58, 58, 58)
						.addComponent(jLabel5).addContainerGap(59,
								Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		jPanel7.setBackground(new java.awt.Color(51, 51, 51));
		jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel7MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel7MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel7MouseExited(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("\u4e0a\u67b6");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel7Layout.createSequentialGroup().addGap(56, 56, 56)
						.addComponent(jLabel6).addContainerGap(61,
								Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
				Short.MAX_VALUE));

		jPanel8.setBackground(new java.awt.Color(51, 51, 51));
		jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel8MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel8MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel8MouseExited(evt);
			}

			
		});

		jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("\u4f11\u606f");
		
		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel8Layout.createSequentialGroup().addGap(55, 55, 55)
						.addComponent(jLabel7).addContainerGap(62,
								Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
				Short.MAX_VALUE));

		jPanel9.setBackground(new java.awt.Color(51, 51, 51));
		jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel9MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel9MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel9MouseExited(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("\u4f18\u60e0");

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel9Layout.createSequentialGroup().addGap(55, 55, 55)
						.addComponent(jLabel10).addContainerGap(62,
								Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
				Short.MAX_VALUE));

		jPanel10.setBackground(new java.awt.Color(51, 51, 51));
		jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel10MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel10MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel10MouseExited(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("\u4fe1\u606f");

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(
				jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel10Layout.createSequentialGroup().addGap(58, 58, 58)
						.addComponent(jLabel12).addContainerGap(59,
								Short.MAX_VALUE)));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 40,
				Short.MAX_VALUE));

		jPanel11.setBackground(new java.awt.Color(51, 51, 51));
		jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel11MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jPanel11MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel11MouseExited(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(
				jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel11Layout.createSequentialGroup().addGap(59, 59, 59)
						.addComponent(jLabel11,
								javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(59, Short.MAX_VALUE)));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jPanel11,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel10,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel5,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel6,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jPanel9,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel8,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel7,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(72, 72, 72)
										.addComponent(
												jPanel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												36,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jPanel6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jPanel7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jPanel8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jPanel9,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel10,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel11,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(389, Short.MAX_VALUE)));

		jScrollPane1
				.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));
		jPanel4.setPreferredSize(new java.awt.Dimension(100, 10000));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 784,
				Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 10000,
				Short.MAX_VALUE));

		jScrollPane1.setViewportView(jPanel4);

		jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel9.setForeground(new java.awt.Color(51, 51, 51));
		jLabel9.setText("\u2014   \u83dc\u54c1   \u2014");

		jLabel1.setText("jLabel1");

		jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 18));
		jLabel2.setText("\u5c0f\u9ec4\u5bb6");

		jLabel3.setText("\u597d\u5403\u53c8\u7f8e\u5473");

		jLabel8.setText("\u9001\u8fbe30\u5206\u949f");

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
										.addGap(48, 48, 48)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												529, Short.MAX_VALUE)
										.addComponent(jLabel8).addGap(77, 77,
												77))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap(349, Short.MAX_VALUE)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												110,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(348, 348, 348)).addGroup(
								jPanel3Layout.createSequentialGroup().addGap(
										370, 370, 370).addComponent(jLabel2)
										.addContainerGap(383, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												105,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												29, Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(jLabel8))
										.addContainerGap()));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												154,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				8,
																				8,
																				8)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane1,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								807,
																								Short.MAX_VALUE)
																						.addComponent(
																								jPanel3,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				318,
																				318,
																				318)
																		.addComponent(
																				jLabel9)
																		.addContainerGap()))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(jPanel3,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18,
						18).addComponent(jLabel9).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
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
	 * 刷新
	 */

	private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel11.setBackground(new Color(51, 51, 51));
	}

	private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel11.setBackground(new Color(72, 72, 72));
	}

	private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel4.removeAll();

		try {
			showFood(business);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 信息
	 */
	private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel10.setBackground(new Color(51, 51, 51));
	}

	private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel10.setBackground(new Color(72, 72, 72));
	}

	private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		try {
			new BusinessChatView().setVisible(true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	/**
	 * 优惠
	 */
	private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel9.setBackground(new Color(51, 51, 51));
	}

	private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel9.setBackground(new Color(72, 72, 72));
	}

	private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new ViewBRedEvenlope(business).setVisible(true);
	}

	/**
	 * 休息
	 */
	private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel8.setBackground(new Color(51, 51, 51));
	}

	private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel8.setBackground(new Color(72, 72, 72));
	}

	private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int openshop = JOptionPane.showConfirmDialog(null, "晚上好呀，休息吗?", "休息",
				JOptionPane.YES_NO_OPTION);
		if (openshop == 0) {
			try {
				Client client = new Client();
				client.closeShop(shop.getSname());

				JOptionPane.showMessageDialog(this, "早点休息哦");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "休息失败");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 上架
	 */
	private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel7.setBackground(new Color(51, 51, 51));
	}

	private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel7.setBackground(new Color(72, 72, 72));
	}

	private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new UpFood(business).setVisible(true);

	}

	/**
	 * 评价
	 */
	private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel6.setBackground(new Color(51, 51, 51));
	}

	private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel6.setBackground(new Color(72, 72, 72));
	}

	private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new CommentView(business).setVisible(true);
	}

	/**
	 * 开店
	 */
	private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel5.setBackground(new Color(51, 51, 51));
	}

	private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jPanel5.setBackground(new Color(72, 72, 72));
	}

	private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int openshop = JOptionPane.showConfirmDialog(null, "早上好呀，开业吗?", "开业",
				JOptionPane.YES_NO_OPTION);
		if (openshop == 0) {
			try {
				Client client = new Client();
				JOptionPane.showMessageDialog(this, business.getBname());
				client.openShop(business.getBname());
				JOptionPane.showMessageDialog(this, "新的一天，加油哦");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "开业失败");
				e.printStackTrace();
			}
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

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
				/*try {
					new Market().setVisible(true);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;

	// End of variables declaration//GEN-END:variables

	/**
	 * 处理页面美化
	 */

	public void drawMarket() {

		/*设置顶部面板颜色*/
		jPanel3.setBackground(new Color(95, 142, 230));
		/*设置侧栏边框*/
		jPanel2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1,
				Color.LIGHT_GRAY));

		/*刷新*/

		ImageIcon icon = new ImageIcon("Image/flash.png");
		Image img = icon.getImage().getScaledInstance(jLabel11.getWidth(),
				jLabel11.getHeight(), Image.SCALE_DEFAULT);

		icon = new ImageIcon(img);
		this.jLabel11.setIcon(icon);

	}

	/**管理食物**/
	ArrayList<Food> foods;
	ArrayList<JPanel> jPanels;
	ArrayList<JLabel> imageLabels;
	ArrayList<JLabel> nameLabels;
	ArrayList<JLabel> describeLabels;
	ArrayList<JLabel> sellCountLabels;
	ArrayList<JLabel> priceLabels;
	ArrayList<JButton> deleteButtons = new ArrayList<JButton>();
	Color color;

	public void showFood(Business business) throws UnknownHostException,
			IOException, ClassNotFoundException, SQLException {

		Client client = new Client();
		foods = client.showFood(business.getBid());

		jPanels = new ArrayList<JPanel>();
		imageLabels = new ArrayList<JLabel>();
		nameLabels = new ArrayList<JLabel>();
		describeLabels = new ArrayList<JLabel>();
		sellCountLabels = new ArrayList<JLabel>();
		priceLabels = new ArrayList<JLabel>();

		System.out.println("B" + foods.size());

		for (int i = 0; i < foods.size(); i++) {

			/*首先放一个面板进去*/
			jPanels.add(new JPanel());
			jPanels.get(i).setSize(jPanel4.getWidth(), 120);
			jPanels.get(i).setBounds(0, jPanels.get(i).getHeight() * i,
					jPanel4.getWidth(), 120);
			jPanels.get(i).setBorder(BorderFactory.createEtchedBorder());
			jPanel4.add(jPanels.get(i));

			/*设置jPanel面板最大值*/
			Dimension ds = new Dimension(jPanel4.getWidth(), jPanels.get(i)
					.getHeight()
					* i + 150);
			jPanel4.setPreferredSize(ds);

			//获取背景颜色
			color = jPanels.get(i).getBackground();

			/*添加食物图像*/

			ImageIcon icon = new ImageIcon("Image/Food/"
					+ foods.get(i).getImage());
			imageLabels.add(new JLabel());
			jPanels.get(i).setLayout(null);
			imageLabels.get(i).setBounds(10, 10, 100, 100);

			Image temp = icon.getImage().getScaledInstance(
					imageLabels.get(i).getWidth(),
					imageLabels.get(i).getHeight(), Image.SCALE_DEFAULT);
			icon = new ImageIcon(temp);

			imageLabels.get(i).setIcon(icon);
			jPanels.get(i).add(imageLabels.get(i));

			/*添加食物名字*/
			nameLabels.add(new JLabel(foods.get(i).getFoodName()));
			nameLabels.get(i).setBounds(120, 5, 140, 50);
			nameLabels.get(i).setFont(new java.awt.Font("微软雅黑", 0, 18));
			jPanels.get(i).add(nameLabels.get(i));

			/*添加月售多少份*/
			sellCountLabels.add(new JLabel("月售:" + foods.get(i).getSellcount()
					+ "" + "份"));
			sellCountLabels.get(i).setBounds(120, 40, 140, 50);
			jPanels.get(i).add(sellCountLabels.get(i));

			/*添加描述*/
			describeLabels.add(new JLabel("描述:"
					+ foods.get(i).getFoodInformation()));
			describeLabels.get(i).setBounds(120, 70, 180, 50);
			jPanels.get(i).add(describeLabels.get(i));

			/*添加价格*/
			priceLabels.add(new JLabel("￥" + foods.get(i).getFoodPrice()));
			priceLabels.get(i).setBounds(550, 70, 50, 50);
			jPanels.get(i).add(priceLabels.get(i));

			/*添加删除按钮*/
			deleteButtons.add(new JButton("删除"));
			deleteButtons.get(i).setBounds(620, 70, 50, 40);
			deleteButtons.get(i).addActionListener(this);

			jPanels.get(i).add(deleteButtons.get(i));
			jPanels.get(i).addMouseListener(new MouseListener() {

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
					for (int i = 0; i < foods.size(); i++) {
						if (e.getSource().equals(jPanels.get(i)))
							jPanels.get(i).setBackground(color);
					}
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					for (int i = 0; i < foods.size(); i++) {
						if (e.getSource().equals(jPanels.get(i)))
							jPanels.get(i).setBackground(
									new Color(173, 175, 173, 80));
					}

				}

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}
			});
		}
	}

	/**
	 * 删除按钮
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < foods.size(); i++) {
			if (e.getSource().equals(deleteButtons.get(i))) {

				try {
					Client client = new Client();
					client.downFood(foods.get(i).getFoodId());
					JOptionPane.showMessageDialog(this, "物品下架成功");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(this, "下架失败");
					e1.printStackTrace();
				}
			}

		}

	}

	/**
	 * 商家登陆后设置本头像、店名等信息
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * @throws ClassNotFoundException 
	 */
	public void setshop() throws UnknownHostException, IOException,
			ClassNotFoundException {
		Client client = new Client();
		Shop shop = client.getShop(business.getBid());
		this.shop = shop;
		ImageIcon image = new ImageIcon("Image/" + shop.getImages());

		Image temp = image.getImage().getScaledInstance(jLabel1.getWidth(),//设置商店头像
				jLabel1.getWidth(), Image.SCALE_DEFAULT);
		image = new ImageIcon(temp);
		jLabel1.setSize(100, 100);
		jLabel1.setIcon(image);
		jLabel1.setSize(100, 100);
		jLabel2.setText(shop.getSname()); //设置店名
		jLabel2.setForeground(Color.WHITE);

		jLabel3.setText(shop.getInformation()); //设置商店信息
	}

}