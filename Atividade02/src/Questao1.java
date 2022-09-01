import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws IOException {

        String getatr;
        String getatr1;

        System.out.println("Digite aqui o nome do arquivo");
        Scanner scan = new Scanner(System.in);
        getatr = scan.nextLine();
        System.out.println("Digite o nome da string que deseja procurar");
        getatr1 = scan.nextLine();


        InputStream is = new FileInputStream(getatr);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String A = br.readLine();

        if(A != null && A.contains(getatr1)){
            System.out.println(A);
        }
        while(A != null){
            A = br.readLine();
            if(A != null && A.contains(getatr1)){
                System.out.println(A);
            }
        }


         br.close();


    }
}
