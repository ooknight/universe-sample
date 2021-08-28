DROP TABLE IF EXISTS e_ax CASCADE;

-- ======== ======== ======== ========
-- ax
-- ======== ======== ======== ========
CREATE TABLE IF NOT EXISTS e_ax
(
    id       BIGSERIAL             NOT NULL,
    name_    VARCHAR               NULL,
    deleted_ BOOLEAN DEFAULT FALSE NOT NULL,
    created_ TIMESTAMP             NULL,
    updated_ TIMESTAMP             NULL,
    CONSTRAINT ax_pk PRIMARY KEY (id)
);
