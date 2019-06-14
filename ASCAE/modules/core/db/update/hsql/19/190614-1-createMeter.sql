create table ASCAE_METER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONSUMER_ID varchar(36),
    SERIAL_NO varchar(50) not null,
    CURRENT_INDICATORS integer,
    IS_USED boolean,
    --
    primary key (ID)
);
