package ar.edu.ucc.arqsoft.test.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.ResponseDto;
import ar.edu.ucc.arqsoft.test.model.*;
import ar.edu.ucc.arqsoft.test.dto.RequestDto;;

@Service
@Transactional
public class TransaccionService{

    @Autowired
    DaoGenerico<Tarjeta, Long> tarjetaDao;

    @Autowired
    DaoGenerico<Transaccion, Long> transaccionDao;

    public ResponseDto debitar (RequestDto req){
        Tarjeta tarjeta = tarjetaDao.load(req.getIDTarjeta());
        Transaccion transaccion = new Transaccion();


        if (req.getMonto() > tarjeta.getSaldo()){
            return new ResponseDto("02", "RECHAZADA", "02");
        }
        
        transaccion.setFecha(Calendar.getInstance().getTime());
        transaccion.setMonto(req.getMonto());
        transaccion.setOperacion(Operacion.DEBITO);
        transaccion.setTarjeta(tarjeta);
        transaccionDao.saveOrUpdate(transaccion);

        Double saldoResultante = tarjeta.getSaldo() - req.getMonto();
        tarjeta.setSaldo(saldoResultante);

        tarjetaDao.saveOrUpdate(tarjeta);
        

        return new ResponseDto("01", "APROBADA", "01");
    
    }
    

    public ResponseDto acreditar (RequestDto req){
        Transaccion transaccion = new Transaccion();
        Tarjeta tarjeta = tarjetaDao.load(req.getIDTarjeta());

        if (tarjeta == null){
            return new ResponseDto("02", "RECHAZADA", "02");
        }

        transaccion.setFecha(Calendar.getInstance().getTime());
        transaccion.setMonto(req.getMonto());
        transaccion.setOperacion(Operacion.CREDITO);
        transaccion.setTarjeta(tarjeta);

        transaccionDao.saveOrUpdate(transaccion);

        Double saldoResultante = req.getMonto() + tarjeta.getSaldo();
        tarjeta.setSaldo(saldoResultante);

        tarjetaDao.saveOrUpdate(tarjeta);

        return new ResponseDto("01", "APREOBADO", "01");
    }
}