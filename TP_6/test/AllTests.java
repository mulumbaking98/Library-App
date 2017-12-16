import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ControllerTest.class, CopyTest.class, HoldTest.class, PatronTest.class, TestEvent.class, TestLog.class,
		TestManager.class, TestOverDueNotice.class, TestTime.class, TextBookTest.class,
		WorkerTest.class })
public class AllTests {

}
