package xbot.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeadlineTest {
    private Deadline deadline1 = new Deadline("test case 1", "24/4/2025");
    private Deadline deadline2 = new Deadline("test case 2", "25/20/2025");
    private Deadline deadline3 = new Deadline("test case 3", "5/1/2025 0925");
    private Deadline deadline4 = new Deadline("test case 4", "25/20/2025 2525");
    private Deadline deadline5 = new Deadline("test case 5", "25/20/2025 6pm");

    @Test
    public void test1() {
        assertEquals("[D][ ] test case 1 (by: Apr 24 2025)",
                deadline1.toString());
    }

    @Test
    public void test2() {
        assertEquals(
                "[D][ ] test case 2 (by: TimeDate cannot be converted to another format :'0)",
                deadline2.toString());
    }

    @Test
    public void test3() {
        assertEquals("[D][ ] test case 3 (by: Jan 5 2025, 9:25am)",
                deadline3.toString());

    }

    @Test
    public void test4() {
        assertEquals("[D][ ] test case 4 (by: TimeDate cannot be converted to another format :'0)",
                deadline4.toString());
    }


    @Test
    public void test5() {
        assertEquals("[D][ ] test case 5 (by: TimeDate cannot be converted to another format :'0)",
                deadline5.toString());
    }
}
