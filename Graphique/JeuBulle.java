import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JeuBulle{
	//dessiner le cercle
	public void paintComponent(Graphics g){
		g.setColor(Color.GREEN);
		g.fillOval(80,80,150,150);
	}

	public static void main(String[] args){
		//definiton de la fenêtre et du conteneur des elements
		JFrame frame = new JFrame("JEU BULLE");
		JPanel panel = new JPanel();

		frame.setResizable(false);
		frame.setSize(850,650);



		//definiton des composants de la fenetre
		JButton b1 = new JButton("Changer Couleur");
		JButton b2 = new JButton("Deplacer Bulle");
		JButton b3 = new JButton("Augmenter Taille");

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		frame.getContentPane().add(panel);

		//gestion des evenements liés au clique des boutons
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String newColor = JOptionPane.showInputDialog(frame,"Donner La nouvelle couleur ? ");
		
				JOptionPane.showMessageDialog(frame,"La nouvelle couleur est : "+newColor);
			}
		});

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String x = JOptionPane.showInputDialog(frame,"Donner le nouveau abcisse ");
				String y = JOptionPane.showInputDialog(frame,"Donner le nouveau ordonne ");
				JOptionPane.showMessageDialog(frame,"Voici les nouvelles positions : x = "+x+", y = "+y);
			}
		});

		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String newLenght = JOptionPane.showInputDialog(frame,"Donner La nouvelle taille ? ");
				JOptionPane.showMessageDialog(frame,"Voici la nouvelle taille : "+newLenght);
			}
		});

		//permet de centrer la fenetre à l'ecran
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    	frame.setLocation(dim.width/2 - frame.getWidth()/2, dim.height/2 - frame.getHeight()/2);

		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}