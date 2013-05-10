package br.com.pdo.ste.app.login.seguranca;

import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;


public enum Permissao implements GrantedAuthority {

    ROLE_USER("USUÁRIO"), 
    
    ROLE_EDITAR_PERFIL("EDITAR PERFIL"),
    ROLE_EDITAR_USUARIO("EDITAR USUÁRIO");

    @Override
    public String getAuthority() {
            return name();
    }

    private String codigo;

    private static final Map<String, Permissao> valueMap;

    static {
            Builder<String, Permissao> builder = ImmutableMap.builder();

            for (Permissao permissao : values()) {
                    builder.put(permissao.codigo, permissao);
            }

            valueMap = builder.build();
    }

    private Permissao(String codigo) {
            this.codigo = codigo;
    }

    public static Permissao fromCodigo(String codigo) {
            return valueMap.get(codigo);
    }

    public String getCodigo() {
            return codigo;
    }

    public static Map<String, Permissao> getValueMap() {
            return valueMap;
    }
}