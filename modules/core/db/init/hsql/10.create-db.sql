-- begin AXT_CATEGORIA
create table AXT_CATEGORIA (
    ID bigint not null,
    UUID varchar(36),
    --
    CODIGO integer not null,
    DESCRICAO varchar(255) not null,
    --
    primary key (ID)
)^
-- end AXT_CATEGORIA
