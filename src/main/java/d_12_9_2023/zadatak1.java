package d_12_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
        FizickoLice nikola=new FizickoLice("Nikola Nikolic","1234", "17777",false);

        FizickoLice stefan=new FizickoLice("Srefan Stefanovic", "4321","2222", true);

        Ugovor ugovor=new Ugovor(nikola,stefan, "12.13.2023.",10004000,"Veljka Milankovica");

        ugovor.stampaj();



    }
}
