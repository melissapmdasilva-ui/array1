package vetores;
import javax.swing.JOptionPane;
public class vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String impressão = "";
		int numeros[] = new int[10];
		
		 
		for (int c=0; c<=10; c++) {
			
			numeros[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite 10 números: "));
			
			impressão = impressão + " " + numeros[c]; 
			
			
			
		JOptionPane.showMessageDialog(null, "" + impressão);	
		}
		
	}

}



