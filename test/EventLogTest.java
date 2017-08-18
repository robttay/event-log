
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class EventLogTest {

        private EventLog testEventLog = new EventLog();
        private Event testEvent;

        @Before
        public void setUp() throws Exception {
            System.out.println("\n - Starting EventLog Test -");
        }

        @After
        public void tearDown() throws Exception {
            System.out.println(" - Ending Test - \n");
        }

        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @Test
        public void nullNameEventTest() throws IllegalArgumentException {
            System.out.println("Attempting to add null name event... ");
            testEvent = new Event();
            testEvent.setName(null);
            testEvent.setAction("Face2Face");
            thrown.expect(IllegalArgumentException.class);
            testEventLog.addEvent(testEvent);
        }

        @Test
        public void allNullEventTest() throws IllegalArgumentException {
            System.out.println("Attempting to add null name & action event... ");
            testEvent = new Event();
            testEvent.setName(null);
            testEvent.setAction(null);
            thrown.expect(IllegalArgumentException.class);
            testEventLog.addEvent(testEvent);
        }

        @Test
        public void invalidActionEventTest() throws IllegalArgumentException {
            System.out.println("Attempting to add invalid action event... ");
            testEvent = new Event();
            testEvent.setName("Text");
            testEvent.setAction("invalid action");
            thrown.expect(IllegalArgumentException.class);
            testEventLog.addEvent(testEvent);
        }

        @Test
        public void validEventListTest() throws IllegalArgumentException {
            System.out.println("Attempting to add valid event to List... ");
            testEvent = new Event();
            testEvent.setName("event name");
            testEvent.setAction("TextMessaging");
            assertTrue("Should return true", testEventLog.addEvent(testEvent));
            assertTrue("Should have been added to event list", testEventLog.getNumEvents() == 1);
            System.out.println("SUCCESS");
        }
    }