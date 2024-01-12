package org.example.labxpert.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double resultattest;
    @OneToMany (mappedBy="test", fetch = FetchType.LAZY )
    private List<TypeTest> listtaypetest;
    @ManyToOne
    private Analyse analyse;
}
