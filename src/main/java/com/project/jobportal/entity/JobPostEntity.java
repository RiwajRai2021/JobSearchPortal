package com.project.jobportal.entity;

import jakarta.persistence.*;

@Entity
public class JobPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobPostId;

    @ManyToOne
    @JoinColumn(name="postedById", referencedColumnName = "userId")
    private Users postedById;

    private JobLocation jobLocationId;


}
