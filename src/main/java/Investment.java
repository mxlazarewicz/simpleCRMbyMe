public class Investment {

    String name;
    Category category;
    int valueOfInvestment;
    String startDate;
    String endDate;

    public Investment(String name, Category category, int valueOfInvestment, String startDate, String endDate) {
        this.name = name;
        this.category = category;
        this.valueOfInvestment = valueOfInvestment;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setValueOfInvestment(int valueOfInvestment) {
        this.valueOfInvestment = valueOfInvestment;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
