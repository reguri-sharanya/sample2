package currencyConverter;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.net.URI;
import java.util.ResourceBundle;

public class AboutBox extends JFrame
{
	private static final ResourceBundle BUNDLE=ResourceBundle.getBundle("localization.translation");
	private JPanel p1;
	private static AboutBox window=null;
	
	//creating aboutbox frame
	
	private AboutBox()
	{
		setTitle(BUNDLE.getString("AboutBox.this.title"));
		setBounds(100,100,347,260);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//window components
		
		p1=new JPanel();
		p1.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(p1);
		
		//label author
		
		JLabel l1=new JLabel(BUNDLE.getString("AboutBox.l1.text"));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(65,159,219,33);
		p1.setLayout(null);
		
		//label title
		
		JLabel l2= new JLabel("Currency Converter");
		l2.setBounds(65,12,219,33);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		p1.add(l2);
		p1.add(l1);
	}
	public static AboutBox getInstance()
	{
		if(window==null)
		{
			window=new AboutBox();
		}
		return window;
	}
}
