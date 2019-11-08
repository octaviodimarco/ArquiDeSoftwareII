package ar.edu.ucc.arqsoft.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACCION")
public class Transaccion extends ObjetoGenerico {
    //Transacción: fecha, monto, operación (Debito, Crédito), tarjeta

    @Column (name = "FECHA", nullable = false)
    private Date fecha;

    @Column (name = "MONTO", nullable = false)
    private Double monto;

    @Enumerated (EnumType.ORDINAL)
    @Column (name = "OPERACION", nullable = false)
    private Operacion operacion;
    
    @ManyToOne (fetch = FetchType.LAZY, targetEntity = Tarjeta.class)
    @JoinColumn (name = "TARJETA", nullable = false)
    private Tarjeta tarjeta;


    public Date getFecha(){
        return fecha;
    }

    public void setFecha (Date fecha){
        this.fecha = fecha;
    }

    public Double getMonto(){
        return monto;
    }

    public void setMonto(Double monto){
        this.monto = monto;
    }

    public Operacion getOperacion(){
        return operacion;
    }

    public void setOperacion(Operacion operacion){
        this.operacion = operacion;
    }

    public Tarjeta getTarjeta(){
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }
}