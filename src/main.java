import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Staff s1 = new Executive("it","dr", BigDecimal.valueOf(2500));
        Staff s2 = new NonExecutive("hr","ir",BigDecimal.valueOf(3000));
        Staff s3 = new Executive("hr","ir",BigDecimal.valueOf(3500));

        List<Staff> staffList = new ArrayList<Staff>();
        staffList.add(s1);
        staffList.add(s2);
        staffList.add(s3);
//        System.out.println(s1.annualLeave());
        staffList.forEach(list-> System.out.println(list.toString()));

    }
}
