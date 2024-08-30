import java.time.LocalDate;

class CarbonData {
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private float carbon;

    public CarbonData(LocalDate dateStart, LocalDate dateEnd, float carbon) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.carbon = carbon;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public float getCarbon() {
        return carbon;
    }

    @Override
    public String toString() {
        return "{date début: " + dateStart + ", date fin: " + dateEnd + ", consommation: " + carbon + " tonnes}";
    }
}
