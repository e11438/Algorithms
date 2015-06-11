import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class combo1 extends JFrame {
	
	private JComboBox box;
	private JLabel picture;
	
	private static String[] filename={"b.png","x.png"};
	private Icon[] pics={new ImageIcon(getClass().getResource(filename[0]))};
	
	public combo1(){
		super("the title");
		setLayout(new FlowLayout());
		
		box=new JComboBox(filename);
		
		box.addItemListener(new handler());
				
	
		add(box);
		picture=new JLabel(pics[0]);
		add(picture);
		
	}
	private class handler implements ItemListener{
		
		public void itemStateChanged(ItemEvent event){
			if(event.getStateChange()==ItemEvent.SELECTED)
				picture.setIcon(pics[box.getSelectedIndex()]);
			
		}
		
	}

}
