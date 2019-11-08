-- Table: "user"."user"

-- DROP TABLE "user"."user";
-- SEQUENCE: "user".user_id_seq

-- DROP SEQUENCE "user".user_id_seq;

CREATE SEQUENCE "user".user_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE "user".user_id_seq
    OWNER TO postgres;

CREATE TABLE "user"."user"
(
    id integer NOT NULL DEFAULT nextval('"user".user_id_seq'::regclass),
    name text COLLATE pg_catalog."default",
    birth_date date NOT NULL,
    age integer NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "user"."user"
    OWNER to postgres;