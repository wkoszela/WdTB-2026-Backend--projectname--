package pl.wsb.clockwork.client.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Adres do faktury. Klasa wbudowana: jej pola są kolumnami tabeli encji, która jej używa.
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Column(length = 120)
    private String street;

    @Column(length = 80)
    private String city;

    @Column(length = 10)
    private String postalCode;

    @Column(length = 2)
    private String country;
}
