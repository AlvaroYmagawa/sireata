package br.edu.utfpr.dv.sireata.dao.Interfaces;

import br.edu.utfpr.dv.sireata.model.Anexo;

import java.sql.SQLException;

public interface SaveInterface {
    int salvar(Anexo anexo) throws SQLException;
}
