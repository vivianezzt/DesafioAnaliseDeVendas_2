package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Sale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo: "); 
		String path = sc.nextLine();
		
		System.out.println("Total de vendas por vendedor: ");

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> salesList = new ArrayList<>();
			Map<String, Double> totalSales = new HashMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				salesList.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));

				totalSales.put(fields[2], Double.parseDouble(fields[4]));
				line = br.readLine();
			}

			System.out.println();
			for (String key : totalSales.keySet()) {
				Double sum = salesList.stream().filter(x -> x.getSeller().contains(key)).map(x -> x.getTotal())
						.reduce(0.0, (x, y) -> x + y);
				totalSales.put(key, sum);
				
				
				System.out.println(key + " - " + String.format("%.2f", totalSales.get(key)));
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}