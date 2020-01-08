package com.mycompany.ejemploslibrerias;

import java.time.LocalDateTime;

public class Pedido {

    private LocalDateTime horaSalida;
    private LocalDateTime horaLlegada;

    public Pedido(LocalDateTime horaSalida, LocalDateTime horaLlegada) {
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public String toString() {
        return "Pedido{" + "horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + '}';
    }
        
}
