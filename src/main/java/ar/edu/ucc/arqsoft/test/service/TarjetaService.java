import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.model.Tarjeta;
import ar.edu.ucc.arqsoft.test.model.Transaccion;
import ar.edu.ucc.arqsoft.test.model.Usuario;

@Service
@Transactional
public class TarjetaService{
    
    @Autowired
    DaoGenerico<Tarjeta, Long> tarjetaDao;

    @Autowired
    DaoGenerico<Usuario, Long> usuarioDao;

    @Autowired
    DaoGenerico<Transaccion, Long> transaccionDao;

    public ResponseDto nuevaTarjeta(TarjetaAltaDto tarjetaDto){
        Tarjeta tarjeta = new Tarjeta();

        tarjeta.

    }
    


}