package tyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aProtein implements ActionListener {

	vistaProtein button;

	public aProtein(vistaProtein prot) {
		this.button = prot;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String [] protein;
		for (int i = 0; i < button.getSecuencia().length(); i++) {
			switch (button.getSecuencia().toUpperCase().substring(i, i + 3)) {
			case ("UAA"):
				
				break;
			case ("UAG"):
				break;
			case ("UGA"):
				break;
			}
		}
	}
}
