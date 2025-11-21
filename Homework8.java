import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        m1.put("myId", "myPass");
        m1.put("myId2", "myPass2");
        m1.put("myId3", "myPass3");

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