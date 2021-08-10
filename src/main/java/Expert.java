import java.util.ArrayList;

public class Expert {

    String idNumber;
    String name;
    String surname;
    String phoneNumber;
    ArrayList<Client> Clients = new ArrayList<Client>();
    int valueOfInvestments;

    public Expert(String idNumber,
                  String name,
                  String surname,
                  String phoneNumber,
                  ArrayList<Client> clients,
                  int valueOfInvestments) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        Clients = clients;
        this.valueOfInvestments = valueOfInvestments;

    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}



