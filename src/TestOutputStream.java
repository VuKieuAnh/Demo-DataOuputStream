import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        try{
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);
            for(int i = 0; i <a.length; i++){
                dout.writeInt(a[i]);
            }
            dout.close();

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
