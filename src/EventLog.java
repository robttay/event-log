import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList = new ArrayList<>();


    public EventLog() {
    }

    public int getNumEvents() {
        return eventList.size();
    }

    public boolean addEvent(Event event) {
        if (event == null)
            throw new IllegalArgumentException();
        if (event.getName() == null || event.getAction() == null)
            throw new IllegalArgumentException();
        if (event.getAction().equals("Face2Face") ||
                event.getAction().equals("PhoneCall") ||
                event.getAction().equals("TextMessaging") ||
                event.getAction().equals("Unknown")) {
            System.out.printf("Event Added:\n" + event);
            eventList.add(event);
            return true;
        } else
            throw new IllegalArgumentException();
    }
}


