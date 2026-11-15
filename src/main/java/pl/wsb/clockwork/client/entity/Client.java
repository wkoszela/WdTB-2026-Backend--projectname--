package pl.wsb.clockwork.client.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(nullable = false, length = 160)
    private String contactEmail;

    @Column(length = 30)
    private String taxId;

    @Column(nullable = false)
    private boolean active = true;

    @Embedded
    private Address billingAddress;
}