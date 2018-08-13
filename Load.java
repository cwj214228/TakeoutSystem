package view;

import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import model.Business;
import model.Customer;

public class Load implements Runnable {

	private JProgressBar jpg;
	private JFrame jf;
	private JLabel jl;
	Customer Cu;
	Business Bu;
	
	public Load(JFrame jf, JProgressBar jpg, JLabel jl,Customer Cu) {
		this.jf = jf;
		this.jpg = jpg;
		this.jl = jl;
		this.Cu=Cu;
	}
	public Load(JFrame jf, JProgressBar jpg, JLabel jl,Business Bu) {
		this.jf = jf;
		this.jpg = jpg;
		this.jl = jl;
		this.Bu=Bu;
	}

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		jpg.setMinimum(0);
		jpg.setMaximum(100);
		
		int i = 0;
		for (i = 0; i <= 100; i += 5) {
			this.jpg.setValue(i);
			jl.setText( Integer.toString(jpg.getValue())+ "%");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(jpg.getValue() == jpg.getMaximum()) {
			jf.dispose();
			if(this.Cu!=null){
				new HomeView(this.Cu).setVisible(true);
			}else{
				try {
					new Market(this.Bu).setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}