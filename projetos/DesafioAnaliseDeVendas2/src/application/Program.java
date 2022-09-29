package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Scanner;

import entities.Sale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
				line = br.readLine();
			}
			
			HashSet<String> list2 = new HashSet<String>();

			for (Sale seller : list) {
				list2.add(seller.getSeller());
			}
			System.out.println();
			System.out.println("Total de Vendas por Vendedor ");
			HashMap<String, Double> list3 = new HashMap<>();

			Double totalPerSeller;

			for (String seller : list2) {
				totalPerSeller = list.stream().filter(v -> v.getSeller().equals(seller)).map(v -> v.getTotal())
						.reduce(0.0, (x, y) -> x + y);
				list3.put(seller, totalPerSeller);
			}

			for (Entry<String, Double> seller : list3.entrySet()) {
				System.out.print(seller.getKey() + " - R$ ");
				System.out.println(String.format("%.2f", seller.getValue()));
			}

			
						
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
			
		sc.close();

	}

}
