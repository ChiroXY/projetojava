package classes.pessoa;

import classes.usuario.SuperUsuario;

public class Usuario extends SuperUsuario {
    public Usuario(final String login, final String senha) {
        super(login, senha);
    }
}
