import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Feriados {
    private Map<LocalDate, String> feriados;

    public Feriados() {
        this.feriados = new HashMap<>();
        // Adicionar os feriados na lista
        this.feriados.put(LocalDate.of(2023, 1, 1), "Confraternização mundial");
        this.feriados.put(LocalDate.of(2023, 2, 21), "Carnaval");
        this.feriados.put(LocalDate.of(2023, 4, 17), "Páscoa");
        this.feriados.put(LocalDate.of(2023, 4, 21), "Tiradentes");
        this.feriados.put(LocalDate.of(2023, 5, 1), "Dia do trabalho");
        this.feriados.put(LocalDate.of(2023, 6, 8), "Corpus Christi");
        this.feriados.put(LocalDate.of(2023, 9, 7), "Independência do Brasil");
        this.feriados.put(LocalDate.of(2023, 10, 12), "Nossa Senhora Aparecida");
        this.feriados.put(LocalDate.of(2023, 11, 2), "Finados");
        this.feriados.put(LocalDate.of(2023, 11, 15), "Proclamação da República");
        this.feriados.put(LocalDate.of(2023, 12, 25), "Natal");
    }

    public String buscarFeriadoPorData(String data) {
        LocalDate date = LocalDate.parse(data);
        String feriado = this.feriados.get(date);
        if (feriado == null) {
            return "Não existe feriado na data " + data;
        }
        return "Feriado na data " + data + ": " + feriado;
    }

    public Map<LocalDate, String> getFeriados() {
        return this.feriados;
    }
}
