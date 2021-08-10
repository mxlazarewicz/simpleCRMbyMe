public class Client {
    String idNumber;
    String name;
    String surname;
    String phoneNumber;
    String description;
    boolean hasInvestment;
    Investment investment;
    int valueOfInvestments;
    Expert expert;
    String consultant;

    public Client(String idNumber,
                  String name,
                  String surname,
                  String phoneNumber,
                  String description,
                  boolean hasInvestment,
                  Investment investment,
                  int valueOfInvestments,
                  Expert expert,
                  String consultant) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.hasInvestment = hasInvestment;
        this.investment = investment;
        this.valueOfInvestments = valueOfInvestments;
        this.expert = expert;
        this.consultant = consultant;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHasInvestment(boolean hasInvestment) {
        this.hasInvestment = hasInvestment;
    }


    public void setExpert(Expert expert) {
        this.expert = expert;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    @Override
    public String toString() {
        return "Informacje o kliencie: " +
                "ID: " + idNumber + '\'' +
                "Imię'" + name + '\'' +
                "Nazwisko: " + surname + '\'' +
                "Numer telefonu: '" + phoneNumber + '\'' +
                "Opis: " + description + '\'' +
                "Czy posiada inwestycje w Mountvest: " + hasInvestment +
                "Inwestycje: " + investment +
                "Wartość inwestycji: " + valueOfInvestments +
                "Doradca klienta: " + expert +
                "Asystent: " + consultant + '\'' +
                '}';
    }
}
