alter table medicos add column ativo tinyint;
update medicos set ativo = 1;
alter table  pacientes add column ativo tinyint;
update pacientes set ativo = 1;