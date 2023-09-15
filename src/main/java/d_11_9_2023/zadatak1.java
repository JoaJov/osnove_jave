package d_11_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
         Autor autor1=new Autor();
         autor1.setIme("Donato");
         autor1.setPrezime("Karizi");

         Autor autor2=new Autor("Dzejms","Paterson");

         Knjiga knjiga1=new Knjiga(autor1, "Lovac na duse", 1223,2011);

         Knjiga knjiga2=new Knjiga();
         knjiga2.setAutor(autor1);
         knjiga2.setNaziv("Saptac");
         knjiga2.setGodinaIzdanja(2009);
         knjiga2.setIsbn(12345);

         Knjiga knjiga3=new Knjiga();
         knjiga3.setAutor(autor1);
         knjiga3.setNaziv("Lavirint");
         knjiga3.setIsbn(1111);
         knjiga3.setGodinaIzdanja(2017);

         Knjiga knjiga4=new Knjiga();
         knjiga4.setAutor(autor2);
         knjiga4.setNaziv("Tisine");
         knjiga4.setGodinaIzdanja(1961);
         knjiga4.setIsbn(2222);

         knjiga1.stampaj();
         knjiga2.stampaj();
         knjiga3.stampaj();
         knjiga4.stampaj();
    }
}
