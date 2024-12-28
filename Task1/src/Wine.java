import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private String tradeMark;
    private String country;
    private LocalDate date;
    private String anotation;

    public Wine() {
    }

    public Wine(String name, String tradeMark, String country, LocalDate date, String anotation) {
        this.name = name;
        this.tradeMark = tradeMark;
        this.country = country;
        this.date = date;
        this.anotation = anotation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAnotation() {
        return anotation;
    }

    public void setAnotation(String anotation) {
        this.anotation = anotation;
    }

    public void winePeriod(LocalDate now) {
        int years = Period.between(date,now).getYears();
        System.out.println("Дата выдержки "+ years + " лет");

    }


}
