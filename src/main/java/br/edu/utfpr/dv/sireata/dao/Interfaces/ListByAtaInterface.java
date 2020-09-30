package br.edu.utfpr.dv.sireata.dao.Interfaces;

import br.edu.utfpr.dv.sireata.model.Anexo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ListByAtaInterface {
    List<Anexo> listarPorAta(int id) throws SQLException;
}
