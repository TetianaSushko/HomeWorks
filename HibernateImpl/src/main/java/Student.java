import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Setter
@Getter
public class Student {

    @Column(name = "Student_entry_year")
    private Integer entryYear;
    @Column(name = "Student_group")
    private Integer group;
    @Column(name = "Student_name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_id")
    private long id;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, int entryYear, int group) {
        this.name = name;
        this.entryYear = entryYear;
        this.group = group;
    }

    @Override

    public String toString() {
        return "id= " + id +
                ", name = " + name + ", group = " + group + ", entryYear = " + entryYear;
    }
}
