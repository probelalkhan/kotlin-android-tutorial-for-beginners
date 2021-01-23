//import java.util.Objects;
//
//public class Person {
//
//    private String id;
//    private String name;
//    private String country;
//
//    public Person(String id, String name, String country) {
//        this.id = id;
//        this.name = name;
//        this.country = country;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", country='" + country + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(id, person.id) &&
//                Objects.equals(name, person.name) &&
//                Objects.equals(country, person.country);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, country);
//    }
//}
