package tests;

import miApi.ITabla;
import misImplementaciones.Tabla;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TablaTest {
    @Test
    void inicializar_tabla(){
        ITabla t = new Tabla();
        t.inicializarTabla();

        assertTrue(t.estaVacia());
    }

    @Test
    void agregar_elementos_y_validar_pertenencia_de_alguno(){
        ITabla t = new Tabla();
        t.inicializarTabla();
        t.agregar("Federico");
        t.agregar("Nicolás");
        t.agregar("Natalia");
        t.agregar("Leonardo");

        assertTrue(t.pertenece("Nicolás"));
    }

    @Test
    void agregar_elementos_y_validar_la_no_pertenencia(){
        ITabla t = new Tabla();
        t.inicializarTabla();
        t.agregar("Federico");
        t.agregar("Nicolás");
        t.agregar("Natalia");
        t.agregar("Leonardo");

        assertFalse(t.pertenece("Miguel"));
    }

    @Test
    void agregar_elementos_y_pedir_el_codigo_de_alguno(){
        ITabla t = new Tabla();
        t.inicializarTabla();
        t.agregar("Federico");
        t.agregar("Nicolás");
        t.agregar("Natalia");
        t.agregar("Leonardo");

        assertEquals(2, t.codigo("Natalia"));
    }

    @Test
    void agregar_elementos_y_validar_cola_cadena_del_primero(){
        ITabla t = new Tabla();
        t.inicializarTabla();
        t.agregar("Federico");
        t.agregar("Nicolás");
        t.agregar("Natalia");
        t.agregar("Leonardo");

        assertEquals("0;Federico", t.tabla().primero());
    }
}