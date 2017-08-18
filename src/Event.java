public class Event {
    private String name;
    private String action;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    @Override
    public String toString() {
        return "Event --- \n" +
                "-- -- --\n" +
                "Name: " + name + "'\n" +
                "Action: " + action + "\n";
    }






}
