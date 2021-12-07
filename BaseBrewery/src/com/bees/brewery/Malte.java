package com.bees.brewery;

public class Malte  implements IMalte {

    private Grao _grao;

    private int _litrosDeAgua;

    private int _quantidadeInicial;

    private int _quantidadeMoida;

    private Boolean _isMilled;
    
    private Boolean _isMoistened;

    private boolean _isMusted;

    private boolean _isFiltered;

    private String type;

    public Malte(Grao grao, int quantidade) {
        _grao = grao;
        _quantidadeInicial = quantidade;
    }

    public Grao get_Grao() {
        return _grao;
    }

    public Boolean get_isMilled(){
        return _isMilled;
    }

    public void set_isMilled(Boolean isMilled){
        _isMilled = isMilled;
    }

    public int get_litrosDeAgua() {
        return _litrosDeAgua;
    }

    public void set_litrosDeAgua(int litrosDeAgua) {
        _litrosDeAgua = litrosDeAgua;
    }


    void toMoisten(){
        _isMoistened = _isMoistened;
    }

    void maltear(){

    }

    public int get_Quantidade(){
        return _quantidadeInicial;
    }

    public void set_quantidadeInicial(int quantidadeInicial) {
        _quantidadeInicial = quantidadeInicial;
    }

    private Boolean _isCooked;

    public int get_quantidadeMoida() {
        return _quantidadeMoida;
    }

    public void set_quantidadeMoida(int _quantidadeMoida) {
        this._quantidadeMoida = _quantidadeMoida;
    }

    public boolean get_isMusted() {
        return _isMusted;
    }

    public void set_isMusted(boolean _isMusted) {
        this._isMusted = _isMusted;
    }

    public boolean get_isFiltered() {
        return _isFiltered;
    }

    public void set_isFiltered(boolean _isFiltered) {
        this._isFiltered = _isFiltered;
    }
}
