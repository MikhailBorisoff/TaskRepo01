import java.util.ArrayList;

public class IpSorter {
    public ArrayList<String> ipSort(String ip1, String ip2) {
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

        int dif1 = difference(first1, first2);
        int begin1 = beginElement(first1, first2);
        int dif2 = difference(second1, second2);
        int begin2 = beginElement(second1, second2);
        int dif3 = difference(third1, third2);
        int begin3 = beginElement(third1, third2);
        int dif4 = difference(fourth1, fourth2);
        int begin4 = beginElement(fourth1, fourth2);
        ArrayList<String> list = new ArrayList<String>();
        //192.168.0.1
        //192.168.0.5
        if(dif4==0)
        {int ai = begin3-1;
        int a = fourth1;
        int b = fourth2;
        for (int i = dif3+1; i>0;i--)
        {
            if(i==dif3+1){
                for(int j = a+1; j<10; j++){
                    list.add(first1+"."+second1+"."+ai +"."+j);}

            }
            else
            {
                if(i==1)
                {
                    for (int k = 0; k<b; k++)
                    {
                        list.add(first1+"."+second1+"."+ai +"."+k);
                    }
                }
                else {
                    for (int q = 0; q<10; q++)
                    {
                        list.add(first1+"."+second1+"."+ai +"."+q);
                    }
                }
            }
            ai++;
        }

        }

        return list;
    }

    static int difference(int a, int b) {
        int dif = 0;
        if (b > a) {
            dif = b - a;
        } else {
            if (a == b) {
                dif = 0;
            } else {
                dif = a - b;
            }
        }
        return dif;
    }

    static int beginElement(int a, int b) {
        int begin = 0;
        if (b > a) {
            begin = a + 1;
        } else {
            if (a == b) {
                begin = a;
            } else {
                begin = b + 1;
            }
        }
        return begin;
    }
}





