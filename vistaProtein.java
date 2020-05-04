package tyma;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class vistaProtein extends JPanel {
	private JButton busqu;
	private JLabel secuen;
	private JTextArea result;
	private JPanel pIzq;
	private Vector<String> lista = new Vector<String>();
	private JComboBox<String> secuProt = new JComboBox<String>(lista);
	private JScrollPane scroll = new JScrollPane(secuProt);

	public vistaProtein() {

		busqu = new JButton("Traducir");
		secuen = new JLabel("Secuencia de ADN a traducir");
		result = new JTextArea(60, 100);
		result.setEditable(false);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		secuProt.setEditable(true);
		pIzq = new JPanel();
		pIzq.setLayout(new GridLayout(1, 2));
		pIzq.add(secuen);
		pIzq.add(secuProt);
		add(pIzq, BorderLayout.WEST);
		add(busqu, BorderLayout.CENTER);
		add(result, BorderLayout.EAST);

	}

	public JButton getBusquedad() {
		return this.busqu;
	}

	public void setBusquedad(JButton b) {
		this.busqu = b;
	}

	public JTextArea getResult() {
		return this.result;
	}

	public void setResult(JTextArea a) {
		this.result = a;
	}

	public void printResult(String t) {
		result.setText(t);
		String secGuarda = secuProt.getSelectedItem().toString().toUpperCase();
		boolean guardada = false;
		int cnt = 0;
		while (guardada == false && cnt < lista.size()) {
			if (lista.elementAt(cnt).toUpperCase().equals(secGuarda)) {
				guardada = true;
			}
			cnt++;
		}
		if (!guardada) {
			lista.add(secGuarda);
		}
	}

	public String getSecuencia() {
		return this.secuProt.getSelectedItem().toString().toUpperCase();
	}

	public void setLista(JComboBox<String> s) {
		this.secuProt = s;
	}

	public JScrollPane getScroll() {
		return this.scroll;
	}
}
