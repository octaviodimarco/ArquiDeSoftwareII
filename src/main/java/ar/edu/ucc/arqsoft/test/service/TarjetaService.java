import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.model.Tarjeta;

@Service
@Transactional
public class TarjetaService{
    
    @Autowired
    DaoGenerico<Tarjeta, Long> tarjetaDao;



}