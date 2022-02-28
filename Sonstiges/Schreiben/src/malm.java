import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class malm {
	public static void main(String[] args) throws IOException {
		

		Double [] tempInCelsius = {4.2,9.2,2.2,1.2,3.2};
		
		double min = tempInCelsius[0];
	
		for (int i = 0; i< tempInCelsius.length;i++) {
			if (tempInCelsius[i]< min) {
				min = tempInCelsius[i];
			}

		}
		FileWriter fw = new FileWriter ("test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String kleinste = Double.toString (min);
		bw.write(kleinste);
		bw.close();
}
}

 
 
