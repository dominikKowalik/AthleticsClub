import model.WorkSchedule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import javax.inject.Inject;

/**
 * Created by dominik on 2016-12-24.
 */
public class WrokScheduleTest {

    @Autowired
    private WorkSchedule workSchedule;

    @Test
    public void isWorkScheduleNotNull(){
        assertNotNull(workSchedule);
    }

    @Test
    public void isEmployeeSetNotNull(){
        assertNotNull(workSchedule.getEmployeeSet());
    }


}
