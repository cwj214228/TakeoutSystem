package view;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Play extends JComponent implements Runnable {

	private JLabel jl;
	private JRadioButton[] jrbs;
	private ImageIcon[] imgs;
	
	static int i;
	
	public Play() {
		
	}
	
	public Play(JLabel jl, ImageIcon[] imgs, JRadioButton[] jrbs) {
		this.jl = jl;
		this.imgs = imgs;
		this.jrbs = jrbs;
		

	}
	

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(i = 0; i <= imgs.length; i++) {
			
			if(i > imgs.length - 1) {
				i = 0;
			}
			
			jl.setIcon(imgs[i]);
			jrbs[i].setSelected(true);
			
			//System.out.println("i="+i);
			
			/********°´Å¥ÇÐ»»*********/
			
			jrbs[0].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					i = 0;
					jl.setIcon(imgs[i]);
				}
					
			});
				
			jrbs[1].addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								i = 1;
								jl.setIcon(imgs[i]);
							}
								
						});
			
			jrbs[2].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					i = 2;
					jl.setIcon(imgs[i]);
				}
					
			});
			
			jrbs[3].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					i = 3;
					jl.setIcon(imgs[i]);
				}
					
			});
			

		
			
			
			try {
				Thread.sleep(4000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
	
