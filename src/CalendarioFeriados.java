import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class CalendarioFeriados {
    public static void main(String[] args) {
        Feriados feriados = new Feriados();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de feriados:");
        Map<LocalDate, String> listaFeriados = feriados.getFeriados();
        for (Map.Entry<LocalDate, String> entry : listaFeriados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Digite a data do feriado (no formato yyyy-mm-dd):");
        String dataFeriado = scanner.nextLine();
        String feriado = feriados.buscarFeriadoPorData(dataFeriado);
        System.out.println(feriado);

        scanner.close();
    }
}
