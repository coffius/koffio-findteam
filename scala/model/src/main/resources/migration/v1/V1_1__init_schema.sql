CREATE TABLE "public"."users" (
  "id" bigserial NOT NULL,
  "login" varchar(15) NOT NULL,
  "password" varchar(100) NOT NULL,
  "email" varchar(100) NOT NULL,
  PRIMARY KEY ("id")
);

INSERT INTO users (login, password, email) VALUES ('admin', 'admin', 'coffius@gmail.com')