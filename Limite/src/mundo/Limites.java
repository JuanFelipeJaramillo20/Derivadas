package mundo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Limites extends JFrame implements ActionListener{
	
	private JLabel variableslbl;
	private JLabel albl;
	private JLabel expalbl;
	private JLabel blbl;
	private JLabel clbl;
	private JLabel funcionIniciallbl;
	private JLabel funcionFinallbl;
	private JLabel funcInicialRes;
	private JLabel funFinalRes;
	
	private JTextField atext;
	private JTextField aexptext;
	private JTextField btext;
	private JTextField bexptext;
	private JTextField ctext;
	private JTextField cexptext;
	
	private JButton calcularbtn;
	

	
	public Limites(){
		setSize(500,500);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "Derivadas de funciones sencillas" );
        setResizable( false );
        setLocationRelativeTo( null );
        setVisible(true);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        variableslbl = new JLabel("Coeficiente:");
        GridBagConstraints propiedades = new GridBagConstraints();
        propiedades.gridx = 1;
        propiedades.gridy = 1;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(variableslbl,propiedades);
        
        albl = new JLabel("a");
        propiedades = new GridBagConstraints();
        propiedades.gridx = 0;
        propiedades.gridy = 2;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(albl,propiedades);
        
        expalbl = new JLabel("Exponente de X:");
        propiedades = new GridBagConstraints();
        propiedades.gridx = 2;
        propiedades.gridy = 1;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(expalbl,propiedades);
        
        blbl = new JLabel("b");
        propiedades = new GridBagConstraints();
        propiedades.gridx = 0;
        propiedades.gridy = 3;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(blbl,propiedades);
        
        clbl = new JLabel("c");
        propiedades = new GridBagConstraints();
        propiedades.gridx = 0;
        propiedades.gridy = 4;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(clbl,propiedades);
	    
	    funcionIniciallbl = new JLabel("Función inicial:");
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 3;
        propiedades.gridy = 1;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(funcionIniciallbl,propiedades);
	    
	    funcionFinallbl = new JLabel("Función final:");
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 3;
        propiedades.gridy = 3;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(funcionFinallbl,propiedades);
	    
        funcInicialRes = new JLabel();
        propiedades = new GridBagConstraints();
        propiedades.gridx = 3;
        propiedades.gridy = 2;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        propiedades.gridwidth = 2;
        panel.add(funcInicialRes,propiedades);
        
        funFinalRes = new JLabel();
        propiedades = new GridBagConstraints();
        propiedades.gridx = 3;
        propiedades.gridy = 4;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        propiedades.gridwidth = 2;
        panel.add(funFinalRes,propiedades);
        
	    atext = new JTextField();
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 1;
        propiedades.gridy = 2;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(atext,propiedades);
	    
	    aexptext = new JTextField();
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 2;
        propiedades.gridy = 2;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(aexptext,propiedades);
        
	    btext = new JTextField();
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 1;
        propiedades.gridy = 3;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(btext,propiedades);
        
	    bexptext = new JTextField();
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 2;
        propiedades.gridy = 3;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(bexptext,propiedades);
	    
	    ctext = new JTextField();
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 1;
        propiedades.gridy = 4;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(ctext,propiedades);
	    
	    cexptext = new JTextField();
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 2;
        propiedades.gridy = 4;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(cexptext,propiedades);
	    
	    calcularbtn = new JButton("Calcular");
	    calcularbtn.addActionListener(this);
	    propiedades = new GridBagConstraints();
        propiedades.gridx = 4;
        propiedades.gridy = 5;
        propiedades.fill = GridBagConstraints.HORIZONTAL;
        propiedades.insets = new Insets(10, 10, 10, 10);
        panel.add(calcularbtn,propiedades);
        
	    
	    add(panel);
	    pack();
	}
	
	public void aplicarDerivada(double a, double b, double c, double expA, double expB, double expC) {
		String funcionOriginal = a + "x^" + expA + " + " + b + "x^" + expB + " + " + c  + "x^" + expC;
		String funcionDerivada = (a*expA) + "x^" + (expA-1) + " + " + (b*expB) + "x^" + (expB-1) + " + " + (c*expC) + "x^" + (expC-1);
		funcInicialRes.setText(funcionOriginal);
		funFinalRes.setText(funcionDerivada);
		repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(calcularbtn)) {
			int a = Integer.parseInt(atext.getText());
			int expa = Integer.parseInt(aexptext.getText());
			int b = Integer.parseInt(btext.getText());
			int expb = Integer.parseInt(bexptext.getText());
			int c = Integer.parseInt(ctext.getText());
			int expc = Integer.parseInt(cexptext.getText());
			
			aplicarDerivada(a, b, c, expa, expb, expc);
			
		}	
	}
	
	public static void main(String[] args) {
		Limites prueba = new Limites();
	}

}
