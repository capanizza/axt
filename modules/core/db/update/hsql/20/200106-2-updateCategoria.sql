alter table AXT_CATEGORIA add column DESCRICAO varchar(255) ^
update AXT_CATEGORIA set DESCRICAO = '' where DESCRICAO is null ;
alter table AXT_CATEGORIA alter column DESCRICAO set not null ;
