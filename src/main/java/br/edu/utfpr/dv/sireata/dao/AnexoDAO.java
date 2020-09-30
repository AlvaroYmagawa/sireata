package br.edu.utfpr.dv.sireata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.dv.sireata.model.Anexo;

public class AnexoDAO extends AbstractAnexoDAO {

	@Override
	public Anexo buscarPorId(int id) throws SQLException {
		return super.buscarPorId(id);
	}

	@Override
	public List<Anexo> listarPorAta(int idAta) throws SQLException {
		return super.listarPorAta(idAta);
	}

	@Override
	public int salvar(Anexo anexo) throws SQLException {
		return super.salvar(anexo);
	}

	@Override
	public void excluir(int id) throws SQLException {
		super.excluir(id);
	}
}
