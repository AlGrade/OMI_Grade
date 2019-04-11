package Blatt2;

public abstract class Medium {
    long id;
    String type;
    String title;
    String publisher;
    int year;

    public Medium(String type, String title, String publisher, int year) {
        this.type = type;
        this.title = title;
        this.publisher = publisher;
        this.year = year;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String printInfo(){
        String retString = "";

        retString += getId()+", "+getType()+", "+getTitle()+", "+getPublisher()+", "+getYear();

        return retString;
    }

    public abstract void sayHello();
}
