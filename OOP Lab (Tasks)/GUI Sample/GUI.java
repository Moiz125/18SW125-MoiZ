import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame{

    private JTextArea textArea;
	private JButton buttonClear;
	private JTextField fieldMessege;
	private JButton buttonSubmit;
	
	public GUI() {
		createView();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	public void createView() {
		JPanel panel=new JPanel();
		getContentPane().add(panel);
		
		JLabel label = new JLabel("Enter some text");
		panel.add(label);
		
		fieldMessege = new JTextField(20);
		panel.add(fieldMessege);
		
		
		buttonSubmit = new JButton("Submit");
		panel.add(buttonSubmit);
		buttonSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String messege=fieldMessege.getText();
				fieldMessege.setText(null);
				if(!messege.isEmpty()) {
					textArea.append(messege+"\n");
				}
				
			}
			
		});
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setPreferredSize(new Dimension(350,90));
        panel.add(textArea);

		buttonClear = new JButton("Text area clear");
		panel.add(buttonClear);
		buttonClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				
			}
			
		});
		
		
	}
	public static void main(String[]nah) {
        
            new GUI().setVisible(true);
	}
}
