/*
 * BRedEvenlope.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import server.Client;

import com.mysql.fabric.xmlrpc.base.Array;

import model.Business;
import model.RedEvenlope;

/**
 *
 * @author  __USER__
 */
public class ViewBRedEvenlope extends javax.swing.JFrame implements
		ActionListener {
	Business business = new Business();

	/** Creates new form BRedEvenlope */
	public ViewBRedEvenlope() {
		initComponents();

		/*处理页面美化*/
		this.drawBRedEvenlope();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public ViewBRedEvenlope(Business business) {
		this.business = business;

		initComponents();

		/*处理页面美化*/
		this.drawBRedEvenlope();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		/*显示所有红包*/
		try {
			this.viewRedEvenlope(business.getBid());
		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel3 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u7ea2\u5305");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(176, 176, 176)
						.addComponent(jLabel1).addContainerGap(194,
								Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(26, 26, 26)
						.addComponent(jLabel1).addContainerGap(34,
								Short.MAX_VALUE)));

		jScrollPane1
				.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jPanel3.setPreferredSize(new java.awt.Dimension(100, 10000));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 387,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 10000,
				Short.MAX_VALUE));

		jScrollPane1.setViewportView(jPanel3);

		jButton1.setText("\u6dfb\u52a0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel2MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel2,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 406,
								Short.MAX_VALUE)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(65, 65, 65)
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												41,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												196, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(41, 41,
												41)));
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
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												393,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(jButton1))
										.addContainerGap()));

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

	

	/**
	 * 添加红包
	 */

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new AddRedEvenlope(business).setVisible(true);
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
				new ViewBRedEvenlope().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;

	// End of variables declaration//GEN-END:variables

	/**
	 * 处理页面美化
	 */

	public void drawBRedEvenlope() {
		jPanel2.setBackground(new Color(95, 142, 230));
		
		ImageIcon icon = new ImageIcon("Image/flash黑.png");
		Image img = icon.getImage().getScaledInstance(jLabel2.getWidth(),
				jLabel2.getHeight(), Image.SCALE_DEFAULT);

		icon = new ImageIcon(img);
		this.jLabel2.setIcon(icon);
	}

	/**
	 * 显示所有红包
	 * */

	ArrayList<RedEvenlope> redevenlopes;
	ArrayList<JPanel> jPanels;
	ArrayList<JLabel> imageLabels;
	ArrayList<JLabel> favorableLabels;
	ArrayList<JLabel> descriptLabels;
	ArrayList<JButton> deleteButtons;
	Color color;

	public void viewRedEvenlope(String bid) throws UnknownHostException,
			IOException, ClassNotFoundException {

		redevenlopes = new ArrayList<RedEvenlope>();
		jPanels = new ArrayList<JPanel>();
		imageLabels = new ArrayList<JLabel>();
		favorableLabels = new ArrayList<JLabel>();
		descriptLabels = new ArrayList<JLabel>();
		deleteButtons = new ArrayList<JButton>();

		Client client = new Client();
		redevenlopes = client.viewRedEvenlope(bid);

		System.out.println("redvenlopes:" + redevenlopes.size());

		for (int i = 0; i < redevenlopes.size(); i++) {

			/*首先放一个面板进去*/
			jPanels.add(new JPanel());
			jPanels.get(i).setSize(jPanel3.getWidth(), 120);
			jPanels.get(i).setBounds(0, jPanels.get(i).getHeight() * i,
					jPanel3.getWidth(), 120);
			jPanels.get(i).setBorder(BorderFactory.createEtchedBorder());
			jPanel3.setLayout(null);
			jPanel3.add(jPanels.get(i));

			/*设置jPanel面板最大值*/
			Dimension ds = new Dimension(jPanel2.getWidth(), jPanels.get(i)
					.getHeight()
					* i + 150);
			jPanel3.setPreferredSize(ds);

			//获取背景颜色
			color = jPanels.get(i).getBackground();

			/*添加食物图像*/

			ImageIcon icon = new ImageIcon("Image/红包.png");
			imageLabels.add(new JLabel());
			jPanels.get(i).setLayout(null);
			imageLabels.get(i).setBounds(10, 10, 100, 100);

			Image temp = icon.getImage().getScaledInstance(
					imageLabels.get(i).getWidth(),
					imageLabels.get(i).getHeight(), Image.SCALE_DEFAULT);
			icon = new ImageIcon(temp);

			imageLabels.get(i).setIcon(icon);
			jPanels.get(i).add(imageLabels.get(i));

			/*添加优惠*/
			favorableLabels.add(new JLabel("- "
					+ redevenlopes.get(i).getFavorable()));
			favorableLabels.get(i).setBounds(120, 5, 140, 50);
			favorableLabels.get(i).setFont(new java.awt.Font("微软雅黑", 0, 18));
			jPanels.get(i).add(favorableLabels.get(i));

			/*添加红包详情*/
			descriptLabels.add(new JLabel(redevenlopes.get(i).getDescript()));
			descriptLabels.get(i).setBounds(120, 40, 140, 50);
			jPanels.get(i).add(descriptLabels.get(i));

			//添加删除按钮
			deleteButtons.add(new JButton("删除"));
			deleteButtons.get(i).setBounds(300, 70, 50, 40);
			deleteButtons.get(i).addActionListener(this);

			jPanels.get(i).add(deleteButtons.get(i));

		}
	}

	/**
	 * 删除红包
	 * */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < redevenlopes.size(); i++) {
			if (e.getSource().equals(deleteButtons.get(i))) {

				try {
					Client client = new Client();
					client.deleteRedEvenlope(redevenlopes.get(i).getBid(),
							redevenlopes.get(i).getEid());
					JOptionPane.showMessageDialog(this, "删除成功");

					/*刷新*/
					jPanel3.repaint();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(this, "删除失败");
				}
			}
		}

	}

	/**
	 * 刷新
	 */
	public void getFlash() {
		try {
			this.viewRedEvenlope(business.getBid());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 刷新
	 */
	private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		

		try {
			jPanel3.removeAll();
			viewRedEvenlope(business.getBid());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}