import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

// 중복 숫자 제외 출력하기
public class App1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        // int[] arrNum = new int[num];
        List<Integer> arrNum2 = new ArrayList<>();
        Set<Integer> setNum = new HashSet<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // for문 이용해서 배열에 값 하나씩 넣고, 그 값을 set에 하나씩 넣기
        for (int i = 0; i < num; i++) {

            // arrNum[i] = Integer.parseInt(st.nextToken(" "));
            arrNum2.add(i, Integer.parseInt(st.nextToken(" ")));

            setNum.add(arrNum2.get(i));
        }

        for (int element : setNum) {
            System.out.println(element);
        }
    }
}
