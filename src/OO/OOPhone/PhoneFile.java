package OO.OOPhone;

public class PhoneFile {
    private int id;
    private String extension;
    private int size;
    private String name;

    public PhoneFile(int id, String extension, Camera.resolution res, String name) {
        this.id = id;
        this.extension = extension;
        this.name = name;
        if (res == Camera.resolution.HIGH){
            this.size = 8;
        } else if (res == Camera.resolution.MEDIUM){
            this.size = 6;
        } else{
            this.size = 4;
        }
    }

    public void getInfo(){
        System.out.println("Informationen:");
        System.out.println("Bildtyp: " + extension);
        System.out.println("Größe: " + size + "Mb");
        System.out.println("Name: " + name);
    }

}
