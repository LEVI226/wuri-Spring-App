-- Insertion des rôles par défaut
INSERT INTO roles (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO roles (id, name) VALUES (2, 'ROLE_ADMIN');

-- Insertion d'un utilisateur par défaut
-- Note : le mot de passe doit être encodé avec BCrypt. Ici, le mot de passe "admin" a été encodé.
INSERT INTO users (id, username, password)
VALUES (1, 'admin', '$2a$10$fxt6DuI0MGPbIQjz6cRA2u.v9.ppf8SnElPA0JDbzGnCRR4VOU9gy');

-- Association de l'utilisateur aux rôles
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO user_roles (user_id, role_id) VALUES (1, 2);
