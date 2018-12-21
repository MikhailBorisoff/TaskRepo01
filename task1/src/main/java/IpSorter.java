import java.util.ArrayList;

public class IpSorter {
    public ArrayList<String> ipSort (String ip1,String ip2)
    {
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

        int dif1 = difference(first1,first2);
        int begin1 = beginElement(first1,first2);
        int dif2 = difference(second1,second2);
        int begin2 = beginElement(second1,second2);
        int dif3 = difference(third1,third2);
        int begin3 = beginElement(third1,third2);
        int dif4 = difference(fourth1,fourth2);
        int begin4 = beginElement(fourth1,fourth2);
        ArrayList<String> list = new ArrayList<String>();
        //192.168.0.1
        //192.168.0.5

        if (dif1==1)
        {
            if(dif2==1)
            {
                if(dif3==1)
                {
                    if(dif4==1)
                    {
                        System.out.println("Диапазон не задан");
                    }
                    else
                    {
                        int a = begin1;
                        int b = begin2;
                        int c = begin3;
                        for (int d = begin4;d<begin4+dif4;d++)
                        {
                            list.add(a+"."+b+"."+c+"."+d);
                        }
                    }
                }
            }

        }

        //for (int a = begin1;a<begin1+dif1;a++)
        return list;

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

