import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IpFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip1 = br.readLine();
        String ip2 = br.readLine();
        System.out.println(ip1 + " " + ip2);

        String[] elementList1 = ip1.split("\\.");
        String[] elementList2 = ip2.split("\\.");

        int st1 = Integer.parseInt(elementList1[elementList1.length - 1]);
        int st2 = Integer.parseInt(elementList2[elementList2.length - 1]); //192.168.0.1

        int dif = 0;
        int begin = 0;

        if (st2 > st1) {
            dif = st2 - st1;
            begin = st1 + 1;
        } else {
            dif = st1 - st2;
            begin = st2 + 1;
        }


        for (int i = begin; i < dif + 1; i++) {
            String aa = elementList1[0] + ".";
            for (int a = 1; a < elementList1.length - 1; a++) {
                aa += elementList1[a] + ".";
            }
            System.out.println(aa + i);
        }

    }
}
