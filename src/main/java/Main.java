import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<Client>();
        Client Maciej = new Client("0001", "Maciej", "Troszczyński", "509150740",
                "Posiada umowy w nationale nedarlane, spisany na akcje 30k",true,
                new Investment("Piwowarzy S.A.", Category.Shares,22600,"02.08.2021", "02.08.2022"),0, new Expert("0001", "Maks", "Lazarewicz",
                "509411644",clients, 0 ), "Sandra");
        clients.add(Maciej);

        System.out.println(clients.get(0));



    }
}
