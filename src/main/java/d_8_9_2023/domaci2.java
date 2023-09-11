package d_8_9_2023;

public class domaci2 {
    public static void main(String[] args) {
     FacebookClass a=new FacebookClass();
     a.fullName="Jovana Jovanovic";
     a.anotherUser="Marija Jovanovic";
     a.text="Cao";
     a.likes=6;
     a.sharee=13;

     FacebookClass b=new FacebookClass();
     b.fullName="Pera Peric";
     b.anotherUser="Nikola Nikolic";
     b.text="Srecan rodjendan";
     b.likes=5;
     b.sharee=10;

     a.like();
     b.like();

     a.share();
     b.share();

     a.dislike();
     b.dislike();

     a.stampaj();
     b.stampaj();



    }
}
