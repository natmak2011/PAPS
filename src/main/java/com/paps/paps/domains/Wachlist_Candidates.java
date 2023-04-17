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
    private long request_id;
    private long watchlist_id;
    private String applicant_fn;
    private String applicant_mn;
    private String applicant_ln;
    private String candidate_fn;
    private String candidate_mn;
    private String candidate_ln;
    private long score        ;


}
