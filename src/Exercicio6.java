import java.util.HashMap;
import java.util.Map;

public class Holidayzer {

    static class Holiday {
        private String date;
        private String name;

        public Holiday(String date, String name) {
            this.date = date;
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public String getName() {
            return name;
        }
    }

    static class HolidayManager {
        private Map<String, Holiday> holidays;

        public HolidayManager() {
            holidays = new HashMap<>();
            inicializarFeriados();
        }

        private void inicializarFeriados() {
            adicionarFeriado("01-01-2024", "Confraternização Mundial");
            adicionarFeriado("12-02-2024", "Carnaval");
            adicionarFeriado("13-02-2024", "Carnaval");
            adicionarFeriado("29-03-2024", "Sexta-feira Santa");
            adicionarFeriado("21-04-2024", "Tiradentes");
            adicionarFeriado("01-05-2024", "Dia do Trabalho");
            adicionarFeriado("30-05-2024", "Corpus Christi");
            adicionarFeriado("07-09-2024", "Independência do Brasil");
            adicionarFeriado("12-10-2024", "Nossa Senhora Aparecida");
            adicionarFeriado("02-11-2024", "Finados");
            adicionarFeriado("15-11-2024", "Proclamação da República");
            adicionarFeriado("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra");
            adicionarFeriado("25-12-2024", "Natal");
        }

        private void adicionarFeriado(String date, String name) {
            Holiday holiday = new Holiday(date, name);
            holidays.put(date, holiday);
        }

        public void imprimirListaFeriados() {
            System.out.println("Lista de Feriados:");
            for (Holiday holiday : holidays.values()) {
                System.out.println(holiday.getDate() + " => " + holiday.getName());
            }
        }

        public String verificarFeriado(String date) {
            Holiday holiday = holidays.get(date);
            if (holiday != null) {
                return "Dia " + date + " é " + holiday.getName() + "! 🎉";
            } else {
                return "Dia " + date + " não é feriado 🥲";
            }
        }
    }

    public static void main(String[] args) {
        HolidayManager holidayManager = new HolidayManager();

        holidayManager.imprimirListaFeriados();

        String resultado1 = holidayManager.verificarFeriado("01-01-2024");
        String resultado2 = holidayManager.verificarFeriado("03-07-2024");

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}