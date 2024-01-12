package org.example.labxpert.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name = "analyses")

public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Echantillon echantillon;
    private String technicien;
    private Date date_debut_analyse;
    private Date date_fin_analyse;
    @Enumerated(EnumType.STRING)
    private EnumResultState resultats;
    @OneToMany (mappedBy="analyse",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
     //private List<Test> listtest;
    private List<Test> tests;

    @ManyToOne
    private Reactif reactif;
    @OneToOne
    private Planification planification;
}
