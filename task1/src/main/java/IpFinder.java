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
        IpSorter is = new IpSorter();
        ArrayList<String> list = is.ipSort(ip1,ip2);
        for (String st : list)
        {
            System.out.println(st);
        }
}}
