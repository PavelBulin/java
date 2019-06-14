-- begin ASCAE_CONSUMER
create table ASCAE_CONSUMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS varchar(150) not null,
    --
    primary key (ID)
)^
-- end ASCAE_CONSUMER
-- begin ASCAE_METER
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
)^
-- end ASCAE_METER
