import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCompanies = scanner.nextInt();
        int[] yearlyIncomes = new int[numberCompanies];
        int[] indyvidualTaxes = new int[numberCompanies];
        int mostTaxCompany = 1;

        for (int i = 0; i < numberCompanies; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numberCompanies; i++) {
            indyvidualTaxes[i] = scanner.nextInt();
        }

        for (int i = 1; i < numberCompanies; i++) {
            if ((double) indyvidualTaxes[i] * (double) yearlyIncomes[i] / 100 > (double) indyvidualTaxes[i - 1] * 
            (double) yearlyIncomes[i - 1] / 100) {
                mostTaxCompany = i + 1;
            }
        }

        System.out.println(mostTaxCompany);
    }
}
