package com.haceb.stepDefinitions;

import com.haceb.steps.InicioSteps;
import com.haceb.steps.RegistroSteps;
import com.haceb.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistrohacebStepdefinitions {
    @Steps
    InicioSteps inicioSteps;
    @Steps
    RegistroSteps registroSteps;
    @Steps
    ValidacionSteps validacionSteps;

    @Dado("que el Usuario abre el navegador e ingrea a la pagina de haceb")
    public void queElUsuarioAbreElNavegadorEIngreaALaPaginaDeHaceb() {
        inicioSteps.abrirNavegador();
        inicioSteps.cerrarPopup();

    }
    @Cuando("selecciona el boton de registrarse y llena todos los datos")
    public void seleccionaElBotonDeRegistrarseYLlenaTodosLosDatos() {

        registroSteps.seleccionarInconUser();
        registroSteps.seleccionarRegistro();
        registroSteps.seleccionarFormulario();
        registroSteps.entreVentanas();

// Llena todos los datos

        registroSteps.completarFormulario();
        registroSteps.seleccionarCheckbots();
        registroSteps.datosComplementarios();
        registroSteps.datosTelefono();
        registroSteps.selectDepartamento();
        registroSteps.selectCiudad();
        registroSteps.seleccionarCheckbots2();

    }
    @Entonces("el usuario podrá visualizar el registro exitoso.")
    public void elUsuarioPodráVisualizarElRegistroExitoso() {
        validacionSteps.validacionPerfil();

    }

    }

