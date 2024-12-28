import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.

        Wine wine = new Wine("название", "марка", "страна", LocalDate.of(1974,04,17), "анотация");
        wine.winePeriod(LocalDate.of(2010,5,2));

    }
}