package guesstranslate;

//@author Alessandro Bottiglieri


import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class GuessTranslate {

    public static void main(String[] args) {

        try {
            int y = 0;
            String[][] translate = new String[3][2];
            Random random=new Random();
            String x;

            Scanner sc = new Scanner(System.in);
            
            
            FileReader fr = new FileReader("data/trad.csv");
            BufferedReader br = new BufferedReader(fr);
            
            
            while (br.ready()) {
                String s = br.readLine();
                String[] parola = s.split(",");
                if (parola.length != translate[0].length) {
                    System.out.println("Errore");
                    continue;
                }
                translate[y][0]=parola[0];
                translate[y][1]=parola[1];
                y++;
            }

            int xx = random.nextInt(translate.length);
            System.out.println(translate[xx][0]);
             System.out.print("Traduci: ");
            x = sc.nextLine();
            if (x.equals(translate[xx][1])) {
            System.out.println("giusto");
            } else {
                System.out.println("sbagliato...");
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        } 
    }
}
