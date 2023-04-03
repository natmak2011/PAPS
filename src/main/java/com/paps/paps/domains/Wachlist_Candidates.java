package com.paps.paps.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Data
@Table(name = "watchlist_candidates")


public class Wachlist_Candidates {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long request_id;

    private long watchlist_id;


}
