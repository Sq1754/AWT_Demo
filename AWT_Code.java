import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AWT_Code {
		
	public AWT_Code(){
		 Frame f = new Frame("Frame");
// Button 		 
		 Button b = new Button("Click me");
		 b.setBounds(50,50, 80, 30);  // (x,y,height of button, width of button)
		 f.add(b); // adding to Frame

//Label		 
		 Label l = new Label("Name:");
		 l.setBounds(50, 90 , 50, 30);
		 f.add(l);
		 
// When button clicked Label edited or any event occur
		           b.addActionListener(new ActionListener() {
	     	
		 				@Override
		 				public void actionPerformed(ActionEvent arg0) {
		 					// TODO Auto-generated method stub
		 					l.setText("Saqlain");
		 				}
	    	 
		 			});  
	 
		 
//TextField 		 
		 TextField tf = new TextField(" ");
		 tf.setBounds(70, 90, 100, 30);
		 f.add(tf);
		 
//TextArea	 
		 TextArea tx = new TextArea();
		 tx.setBounds(70, 150, 120, 70);
		 f.add(tx);
		 
//CheckBox
		 Checkbox c1 = new Checkbox("You");
		 Checkbox c2 = new Checkbox("Me");
		 c1.setBounds(100, 220, 100, 30);
		 c2.setBounds(100, 240, 100, 30);
		 f.add(c1);
		 f.add(c2);
		 
//Frame properties		 
		 f.setSize(400,300);
		 f.setLayout(null);
		 f.setVisible(true);
		
		      f.addWindowListener(new WindowAdapter(){
		        	public void windowClosing(WindowEvent e) {
		      		
		         		f.dispose();// close button activation
		        	}
	    	  });
	}

        public static void main(String[]sq) {
        	
        	new AWT_Code();
        }
}
