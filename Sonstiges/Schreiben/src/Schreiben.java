import java.io.*; 

public class Schreiben {

	public static void main(String[] args) throws IOException {
		double [] tempInCelsius = {3,2,6,10,12};
		
		double min = tempInCelsius[0];

		
		for (int i = 0; i < tempInCelsius.length; i++) {
			if (tempInCelsius[i] < min) {
				min = tempInCelsius[i];
				
			}

			FileWriter fw = new FileWriter("test.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String min_str = Double.toString(min);
			
			bw.write(min_str);
			bw.newLine();
			
			bw.close();
			

		}

	}

}
