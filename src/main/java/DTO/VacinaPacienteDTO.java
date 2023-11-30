package DTO;

import java.util.Date;

public class VacinaPacienteDTO {

    private int codigoVacinaPaciente;
    private int codigoVacina;
    private int codigoPaciente;
    private Date dataVacPac;
    private String dose;

    public int getCodigoVacinaPaciente() {
        return codigoVacinaPaciente;
    }

    public void setCodigoVacinaPaciente(int codigoVacinaPaciente) {
        this.codigoVacinaPaciente = codigoVacinaPaciente;
    }

    public int getCodigoVacina() {
        return codigoVacina;
    }

    public void setCodigoVacina(int codigoVacina) {
        this.codigoVacina = codigoVacina;
    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public Date getDataVacPac() {
        return dataVacPac;
    }

    public void setDataVacPac(Date dataVacPac) {
        this.dataVacPac = dataVacPac;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    
}
