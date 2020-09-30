package br.edu.utfpr.dv.sireata.dao.Interfaces;

import br.edu.utfpr.dv.sireata.model.Anexo;
import br.edu.utfpr.dv.sireata.model.Ata;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface FindByIdInterface {
    ResultSet buscarPorId(int id) throws SQLException;
}
