package ar.edu.ucc.arqsoft.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACCION")
public class Transaccion {
    @Column(name = "FECHA", nullable = false)
    private Date fecha;
}