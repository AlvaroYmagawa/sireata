package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.Functions.Delete;
import br.edu.utfpr.dv.sireata.dao.Functions.ListByAta;
import br.edu.utfpr.dv.sireata.dao.Functions.Save;
import br.edu.utfpr.dv.sireata.dao.Interfaces.FindByIdInterface;
import br.edu.utfpr.dv.sireata.model.Anexo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class AbstractAnexoDAO {
    FindByIdInterface anexoInterface;
    br.edu.utfpr.dv.sireata.dao.Functions.FindById findById;

    public AbstractAnexoDAO(){}

    protected Anexo carregarObjeto(ResultSet rs) throws SQLException{
        Anexo anexo = new Anexo();

        anexo.setIdAnexo(rs.getInt("idAnexo"));
        anexo.getAta().setIdAta(rs.getInt("idAta"));
        anexo.setDescricao(rs.getString("descricao"));
        anexo.setOrdem(rs.getInt("ordem"));
        anexo.setArquivo(rs.getBytes("arquivo"));

        return anexo;
    }

    public Anexo buscarPorId(int id) throws SQLException {
        Anexo anexo = carregarObjeto(findById.buscarPorId(id));
        return anexo;
    }

    public List<Anexo> listarPorAta(int idAta) throws SQLException{
        ListByAta listByAta = null;
        return listByAta.listarPorAta(idAta);
    };

    public int salvar(Anexo anexo) throws SQLException{
        Save save = null;
        return save.salvar(anexo);
    };

    public void excluir(int id) throws SQLException {
        Delete delete = null;
         delete.excluir(id);
    }
}
