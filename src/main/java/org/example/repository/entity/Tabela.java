package org.example.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TABELA_TESTOWA")
public class Tabela {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "KOLUMNA1")
    private String kolumna1;
    @Column(name = "KOLUMNA2")
    private String kolumna2;
    @Column(name = "KOLUMNA3")
    private String kolumna3;
    @Column(name = "KOLUMNA4")
    private int kolumna4;

    @Override
    public String toString() {
        return "Tabela{" +
                "id=" + id +
                ", kolumna1='" + kolumna1 + '\'' +
                ", kolumna2='" + kolumna2 + '\'' +
                ", kolumna3='" + kolumna3 + '\'' +
                ", kolumna4=" + kolumna4 +
                '}';
    }
}
