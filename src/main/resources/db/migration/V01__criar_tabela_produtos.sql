create table produto(
                        id varchar(255) not null primary key,
                        nome varchar(50) not null,
                        descricao varchar(300),
                        preco numeric(18,2)
);

INSERT INTO produto (id, nome, descricao, preco) VALUES ('d290f1ee-6c54-4b01-90e6-d701748f0851', 'Pendrive','SanDisk 64GB', '20');