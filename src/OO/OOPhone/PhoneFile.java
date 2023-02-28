package OO.OOPhone;

public class PhoneFile {
    private int id;
    private String extension;
    private double size;
    private String name;

    public PhoneFile(int id, String extension, double size, String name) {
        this.id = id;
        this.extension = extension;
        this.name = name;
        this.size = size;

    }

    public void getInfo(){
        System.out.println("Informationen:");
        System.out.println("Bildtyp: " + extension);
        System.out.println("Größe: " + size + "Mb");
        System.out.println("Name: " + name);
    }

}
