
import React from 'react';
import '../styles/Login.css'
import GoogleIcon from '@mui/icons-material/Google';



export const Login = () => {
  return (
    <div className="container">
        <header className="header">

        </header>
        <div className="center">
          <div className="loginImage">
              iamge imgasad
          </div>
          <div className="login">
            <p className="iniciarSesion">Iniciar sesión</p>
             <form className='formSesion' action="">
                  <div className="userName">
                    <p className="texto">Usuario o mail</p>
                    <input type="text" autoFocus className="input" placeholder=' Usuario' />
                  </div>
                  <div className="password">
                    <p className="texto">Contraseña</p>
                    <input type="text" className="input" placeholder=' Contraseña'/> 
                  </div>
                  <div className="olvContradiv">
                      <p className="olvContra">Olvide mi contraseña</p>
                  </div>
                  <div className="botonAcceder">
                    <button className='acceder'>Acceder</button>
                  </div>
                  <div className="iniciarGoogle">
                    <p className='googleTexto'>Iniciar sesión con Google:</p>
                    <button className='botonGoogle'><GoogleIcon></GoogleIcon></button>
                  </div>
              </form>
            <p className="registro">¿Todavía no sos parte de la comunidad? Registrate.</p>
          </div>
        </div>
        <footer className="footer">

        </footer>
    </div>
  );
};