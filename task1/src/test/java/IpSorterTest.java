import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class IpSorterTest {

    @Test
    public void IpSorter_SortOutIP() {
        // given
        IpSorter is = new IpSorter();
        IpSorter is1 = new IpSorter();

        String ip1 = "192.168.0.1";
        String ip2 = "192.168.0.5";
        String ip3 = "192.168.0.1";


        // when
        ArrayList<String> list = is.ipSort(ip1, ip2);
        ArrayList<String> list1 = is1.ipSort(ip1,ip3);

        // then
        ArrayList<String> testList = new ArrayList<String>();
        testList.add("192.168.0.2");
        testList.add("192.168.0.3");
        testList.add("192.168.0.4");
        Assertions.assertEquals(testList, list);
        ArrayList<String> testList1 = new ArrayList<String>();
        testList1.add("Диапазон не задан");
        Assertions.assertEquals(testList1,list1);
    }
}
