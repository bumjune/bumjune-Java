import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        try{
            Scanner fs = new Scanner(new File("db.txt"));
            while(fs.hasNextLine()){
                String line = fs.nextLine().trim();
                if(line.isEmpty()) continue;
                String[] parts = line.split("\\s+");
                if(parts.length == 2){
                    m1.put(parts[0].trim(), parts[1].trim());
                }
            }
            fs.close();
        } catch (FileNotFoundException e){
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();
            if(!m1.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.print("password : ");
            String pw = sc.nextLine().trim();
            if(!m1.get(id).equals(pw)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
    }
}
