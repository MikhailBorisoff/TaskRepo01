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

        //первая часть
        if (dif1 != 0) {

            for (int i = first1; i <= first2; i++) {
                if (i == first1) {
                    for (int j = second1; j < 10; j++) {
                        if (j == second1) {
                            for (int k = third1; k < 10; k++) {
                                if (k == third1) {
                                    for (int q = fourth1; q < 10; q++) {
                                        list.add(i + "." + j + "." + k + "." + q);
                                    }
                                } else {
                                    for (int q = 0; q < 10; q++) {
                                        list.add(i + "." + j + "." + k + "." + q);
                                    }
                                }
                            }
                        } else {
                            for (int k = 0; k < 10; k++) {
                               for (int q = 0; q<10; q++){
                                list.add(i + "." + j + "." + k + "." + q);}
                            }
                        }

                    }
                } else {
                    if (i == first2) {
                        for (int j = 0; j <= second2; j++) {
                            if (j == second2) {
                                for (int k = 0; k <= third2; k++) {
                                    if(k == third2)
                                    {for(int q = 0; q<=fourth2; q++){
                                        list.add(i + "." + j + "." + k + "." + q);}
                                    }
                                    else {
                                        for (int q = 0; q<10; q++){
                                            list.add(i + "." + j + "." + k + "." + q);}
                                    }
                                }
                            } else {
                                for (int k = 0; k < 10; k++) {
                                    for (int q = 0; q<10; q++){
                                        list.add(i + "." + j + "." + k + "." + q);}
                                }
                            }
                        }
                    } else {
                        for (int j = 0; j < 10; j++) {
                            for (int k = 0; k < 10; k++) {
                                for (int q = 0; q<10; q++){
                                    list.add(i + "." + j + "." + k + "." + q);}
                            }
                        }
                    }
                }
            }
        }
        //вторая часть
        {
            if (dif2 != 0) {
                int ai = begin2 - 1;
                int a = third1;
                int b = third2;
                int a3 = begin3 + 1;
                for (int i2 = dif2 + 1; i2 > 0; i2--) {
                    if (i2 == dif2 + 1) {
                        for (int j = a; j < 10; j++) {
                            if (j == a) {
                                for (int k4 = fourth1 + 1; k4 < 10; k4++) {
                                    list.add(first1 + "." + ai + "." + j + "." + k4);
                                }
                            } else {
                                for (int k4 = 0; k4 < 10; k4++) {
                                    list.add(first1 + "." + ai + "." + j + "." + k4);
                                }
                            }
                        }
                    } else {
                        if (i2 == 1) {
                            for (int k = 0; k <= b; k++) {
                                if (k == b) {
                                    for (int k5 = 0; k5 < fourth2; k5++) {
                                        list.add(first1 + "." + ai + "." + k + "." + k5);
                                    }
                                } else {
                                    for (int ii = 0; ii < 10; ii++) {
                                        list.add(first1 + "." + ai + "." + k + "." + ii);
                                    }
                                }
                            }
                        } else {
                            for (int q = 0; q < 10; q++) {
                                for (int k6 = 0; k6 < 10; k6++) {
                                    list.add(first1 + "." + ai + "." + q + "." + k6);
                                }
                            }
                        }
                    }
                    ai++;
                    a3--;

                }
            }
            //третья часть
            else {
                if (dif3 != 0) {
                    int ai = begin3 - 1;
                    int a = fourth1;
                    int b = fourth2;
                    for (int i = dif3 + 1; i > 0; i--) {
                        if (i == dif3 + 1) {
                            for (int j = a + 1; j < 10; j++) {
                                list.add(first1 + "." + second1 + "." + ai + "." + j);
                            }

                        } else {
                            if (i == 1) {
                                for (int k = 0; k < b; k++) {
                                    list.add(first1 + "." + second1 + "." + ai + "." + k);
                                }
                            } else {
                                for (int q = 0; q < 10; q++) {
                                    list.add(first1 + "." + second1 + "." + ai + "." + q);
                                }
                            }
                        }
                        ai++;
                    }

                } else {
                    for (int i = fourth1 + 1; i < fourth2; i++) {
                        list.add(first1 + "." + second1 + "." + third1 + "." + i);
                    }
                }
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





