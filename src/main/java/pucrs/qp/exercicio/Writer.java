package pucrs.qp.exercicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Writer {

	public List<String> mountNumbers() {
		List<String> strings = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			int square = i * i;
			int cube = i * i * i;
			StringBuilder string = new StringBuilder();
			string.append(i).append(":").append(square).append(":").append(cube);
			strings.add(string.toString());
		}
		return strings;
	}

	public void writeListStringInFile(List<String> content) {
		try (FileWriter writer = new FileWriter("numbers.txt"); BufferedWriter bw = new BufferedWriter(writer)) {
			for(String line : content) {				
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
	}

}
