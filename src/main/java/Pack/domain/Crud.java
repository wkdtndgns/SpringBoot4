package domain;

public class Crud {
    private Long id;
    private String name;


    public Crud(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
