package d_8_9_2023;

public class FacebookClass {
    public String fullName;
    public String anotherUser;
    public String text;
    public int likes;
    public int sharee;

    public void like(){
        this.likes++;
    }
    public void dislike(){
        this.likes --;

    }
    public void share(){
        this.sharee++;
    }
    public void stampaj(){
        System.out.println(this.fullName + " >>> " + this.anotherUser);
        System.out.println(this.text);
        System.out.println("Likes " + this.likes + " | Shares " + this.sharee);
}
}

