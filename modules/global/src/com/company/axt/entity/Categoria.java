package com.company.axt.entity;

import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "AXT_CATEGORIA")
@Entity(name = "axt_Categoria")
public class Categoria extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = -1127289405780455934L;
    @Column(name = "UUID")
    protected UUID uuid;

    @NumberFormat(pattern = "###0")
    @NotNull
    @Column(name = "CODIGO", nullable = false, unique = true)
    protected Integer codigo;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}