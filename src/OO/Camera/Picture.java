package OO.Camera;

public class Picture {
    private String name;
    private String date;
    private int size;

    public Picture(String name, String date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void getInfoOfPicture(){
        System.out.println("----------------");
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Size: " + size);
    }
}
