package br.edu.fema.apidev.model.dto.mapper;

import br.edu.fema.apidev.model.Aplicativo;
import br.edu.fema.apidev.model.Empresa;
import br.edu.fema.apidev.model.dto.request.AplicativoReq;
import br.edu.fema.apidev.model.dto.response.AplicativoRes;

public class AplicativoMapper {
    public static AplicativoRes toDto(Aplicativo aplicativo, Empresa empresa){
        return new AplicativoRes(
                aplicativo.getId(),
                aplicativo.getNome(),
                EmpresaMapper.toDto(empresa),
                aplicativo.getUltimaAtualizacao()
        );
    }

    public static Aplicativo mapEntity(AplicativoReq aplicativoReq,
                                       Aplicativo aplicativo,
                                       Empresa empresa){
        aplicativo.setNome(aplicativoReq.getNome());
        aplicativo.setEmpresa(empresa);
        return aplicativo;
    }
}
