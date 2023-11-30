package DTO;

import java.util.Date;

public class PlantaoDTO {

    private int codigoPlantaoEnfermeiro;
    private int codigoEnfermeiro;
    private String horarioEntrada;
    private String horarioSaida;
    private Date dataPlantao;
    private int codigoMedico;

    public int getCodigoEnfermeiro() {
        return codigoEnfermeiro;
    }

    public void setCodigoEnfermeiro(int codigoEnfermeiro) {
        this.codigoEnfermeiro = codigoEnfermeiro;
    }

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public int getCodigoPlantaoEnfermeiro() {
        return codigoPlantaoEnfermeiro;
    }

    public void setCodigoPlantaoEnfermeiro(int codigoPlantaoEnfermeiro) {
        this.codigoPlantaoEnfermeiro = codigoPlantaoEnfermeiro;
    }

    public Date getDataPlantao() {
        return dataPlantao;
    }

    public void setDataPlantao(Date dataPlantao) {
        this.dataPlantao = dataPlantao;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }



}
