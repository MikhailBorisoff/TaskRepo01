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

        int first1 = Integer.parseInt(elementList1[0]);
        int second1 = Integer.parseInt(elementList1[1]);
        int third1 = Integer.parseInt(elementList1[2]);
        int fourth1 = Integer.parseInt(elementList1[3]);

        int first2 = Integer.parseInt(elementList2[0]);
        int second2 = Integer.parseInt(elementList2[1]);
        int third2 = Integer.parseInt(elementList2[2]);
        int fourth2 = Integer.parseInt(elementList2[3]);

         //192.168.0.1

        //int dif1 = difference(first1,first2);
        //int begin1 = beginElement(first1,first2);
        //int dif2 = difference(second1,second2);
        //int begin2 = beginElement(first1,first2);
        //int dif3 = difference(third1,third2);
        //int begin3 = beginElement(first1,first2);
        //int dif4 = difference(fourth1,fourth2);
        //int begin4 = beginElement(first1,first2);

        int dif1 = difference(first1,first2);
        int begin1 = beginElement(first1,first2);
        int dif2 = difference(second1,second2);
        int begin2 = beginElement(second1,second2);
        int dif3 = difference(third1,third2);
        int begin3 = beginElement(third1,third2);
        int dif4 = difference(fourth1,fourth2);
        int begin4 = beginElement(fourth1,fourth2);

        //192.168.0.1
        //192.168.0.5


        for (int a = begin1;a<begin1+dif1;a++)
        {
            for(int b = begin2;b<begin2+dif2;b++)
            {
                for(int c = begin3;c<begin3+dif3;c++)
                {
                    for (int d = begin4; d<begin4+dif4;d++)
                    {
                        System.out.println(a+"."+b+"."+c+"."+d);
                    }
                }
            }
        }

    }

    static int difference(int a, int b) {
        int dif = 0;
        if (b > a) {
            dif = b - a -1;
        } else {
            if (a == b) {
                dif = 1;
            } else {
                dif = a - b -1;
            }
        }
        return dif;
    }
    static int beginElement (int a, int b)
    {
        int begin = 0;
        if (b > a) {
            begin = a + 1;
        } else {if(a==b){
            begin = a;
        }else{
            begin = b + 1;}
        }
        return begin;
    }
}
