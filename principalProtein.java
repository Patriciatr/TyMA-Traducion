package tyma;

import javax.swing.JFrame;

import tyma.aProtein;
import tyma.vistaProtein;

public class principalProtein {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				busqueda();
			}
		});
	}

	public static void busqueda() {
		vistaProtein button = new vistaProtein();
		JFrame fr = new JFrame("Búsqueda");
		aProtein ctr = new aProtein(button);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setContentPane(button);
		button.getBusquedad().addActionListener(ctr);
		fr.add(button.getScroll());
		fr.pack();
		fr.setVisible(true);

	}
}
