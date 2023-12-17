package day_17;

public record Gift(String name, Integer price) {

    @Override
    public String toString() {
        return String.format("%s - %s zł", this.name, this.price);
    }
}
