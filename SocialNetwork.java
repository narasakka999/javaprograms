package Nuts;

import java.util.*;

public class SocialNetwork {
    private Map<String, Set<String>> adj;

    public SocialNetwork() {
        this.adj = new HashMap<>();
    }

    /** Add a person if not already present */
    public void addPerson(String name) {
        if (name == null || name.isEmpty()) return;
        adj.putIfAbsent(name, new HashSet<>());
    }

    /** Add a mutual friendship */
    public void addFriendship(String p1, String p2) {
        if (p1 == null || p2 == null || p1.equals(p2)) return;
        // Ensure both persons exist
        addPerson(p1);
        addPerson(p2);
        // Add edge both ways
        adj.get(p1).add(p2);
        adj.get(p2).add(p1);
    }

    /** Return list of friends (or empty list if person unknown) */
    public List<String> getFriends(String person) {
        Set<String> friends = adj.get(person);
        if (friends == null) return Collections.emptyList();
        return new ArrayList<>(friends);
    }

    /** Print out each person and their friends */
    public void displayNetwork() {
        for (String person : adj.keySet()) {
            System.out.println(person + " -> " + adj.get(person));
        }
    }
}

	


