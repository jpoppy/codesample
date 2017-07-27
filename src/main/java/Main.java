import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by chenBing on 2017/7/13.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(11);
        ids.add(112);
        int loop = ids.size();
        StringBuilder sqlBuilder = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            if (i == loop - 1) {
                sqlBuilder.append(ids.get(i));
            } else {
                sqlBuilder.append(ids.get(i) + ", ");
            }
        }
        System.out.println(sqlBuilder);

    }

    @Test
    public void testRemoveDupList(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(11);
        ids.add(112);
        ids.add(112);
        ids.add(112);
        System.out.println(ids);
        Set<Integer> set = new HashSet<>();
        set.addAll(ids);
        System.out.println(set);
        ids.clear();
        ids.addAll(set);
        System.out.println(ids);

    }
}
