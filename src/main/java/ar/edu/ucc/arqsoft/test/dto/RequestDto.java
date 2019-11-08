package ar.edu.ucc.arqsoft.test.dto;

import ar.edu.ucc.arqsoft.test.model.Tarjeta;

public class RequestDto{
    
    private TarjetaDto tarjeta;
    
    private Double monto;


    public RequestDto (TarjetaDto tarjeta, Double monto){
        super();

        this.tarjeta = tarjeta;
        this.monto = monto;
    }

    public RequestDto (){}

    public Long getIDTarjeta(){
        return this.tarjeta.getId();
    }

    public TarjetaDto getTarjeta(){
        return tarjeta;
    }

    public void setTarjeta(TarjetaDto tarjeta){
        this.tarjeta = tarjeta;
    }

    public Double getMonto(){
        return monto;
    }

    public void setMonto (Double monto){
        this.monto = monto;
    }
}