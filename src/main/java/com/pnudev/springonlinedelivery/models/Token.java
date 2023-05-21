package com.pnudev.springonlinedelivery.models;


import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tokensss")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Token {
    @Id
    @Column(name = "token_id")
    private int tokenId;

    @Basic
    @Column(name = "value")
    private String value;

    @Basic
    @Column(name = "revoked")
    public boolean revoked;

    @Basic
    @Column(name = "expired")
    public boolean expired;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
