package viktormiller.employeemanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Entity
@AllArgsConstructor
public class EmployeeWorking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;

    public EmployeeWorking() {}
}
