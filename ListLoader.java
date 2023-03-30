package LabMarch30;
import java.util.ArrayList;
public class ListLoader {
private ArrayList<Integer> list = new ArrayList<Integer>();

public void loadList(Integer startNumber, Integer lastNumber) {
    for(int i=startNumber; i<=lastNumber; i++) {
        list.add(i);
    }
}

public ArrayList<Integer> getList() {
    return list;
}

public static void main(String[] args) {
    ListLoader loader = new ListLoader();
    long startTime = System.currentTimeMillis();
    loader.loadList(0, 10000000);
    long endTime = System.currentTimeMillis();
    long responseTime = endTime - startTime;
    System.out.println("Time taken to load list: " + responseTime + "ms");
}
}
