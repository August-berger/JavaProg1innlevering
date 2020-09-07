package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveAvgifter {

		private static double finnAvgift(double inntekt) {
			
			if (inntekt >= 164101 && inntekt <= 230950) {
				return 0.93;
			}
			else if (inntekt >= 230951 && inntekt <= 580650) {
				return 2.41;
			}
			else if (inntekt >= 580651 && inntekt <= 934050) {
				return 11.52;
			}
			else if (inntekt >= 934051) {
				return 14.52;
			}
			else {
				return 0;
			}
				
			}
			
		public static double inntektAvgift(double inntekt, double avgift) {
			if(avgift == 0) {
				return 0;
			}
			else if(avgift == 0.93) {
				return inntekt * 0.0093;
			}
			else if(avgift == 2.41) {
				return inntekt * 0.0241;
			}
			else if(avgift == 11.52) {
				return inntekt * 0.1152;
			}
			else {
				return inntekt * 0.1452;
			}
		}
		public static void main(String[] args) {
			String input = showInputDialog("Skriv inntekt: ");
			double a = Double.parseDouble(input);
			double avgift = finnAvgift(a);
			
			showMessageDialog(null, "Inntekt: " + a + '\n' + "Prosent: " 
								+ avgift + "%" + '\n' + "Avgift: " + inntektAvgift(a, avgift)
								+ '\n' + "Inntekt etter avgift: " + (a-inntektAvgift(a, avgift)));
		}
}
		

