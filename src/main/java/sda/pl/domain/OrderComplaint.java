package sda.pl.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = "orderSet")
@Table(name = "complaint")

public class OrderComplaint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String message;
    @Enumerated(value = EnumType.STRING)
    ComplaintStatus complaintStatus;

    @ManyToMany(mappedBy = "orderComplaintSet", cascade = CascadeType.ALL)
    Set<Order> orderSet;

}
