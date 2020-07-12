public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        return this.id.equals(comparedItem.id);
    }
    
    
}
