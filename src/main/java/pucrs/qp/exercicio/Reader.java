package pucrs.qp.exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reader {

	public int sumStringLine(String line) {
		String[] splitted = line.split("\\:");
		return Integer.valueOf(splitted[2]);
	}

	public int sumAllFileNumbers() {
		try (Stream<String> stream = Files.lines(Paths.get("numbers.txt"))) {

			int sum = stream.mapToInt(line -> sumStringLine(line)).reduce(0, (accumulatedInt, element) -> {
				return accumulatedInt += element;
			});

			return sum;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
