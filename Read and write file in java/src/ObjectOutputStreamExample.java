import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
       try {
           oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
           Product product = new Product(1, "IPhone 12", 2800000, "New");
           oos.writeObject(product);
           oos.flush();
       }catch (IOException e){
           e.printStackTrace();
       }finally {
           oos.close();
       }
        System.out.println("success!");
    }
}
