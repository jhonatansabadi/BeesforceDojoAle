package com.bees.brewery;

public class Malte implements IMalte {

    private Grao _grao;

    private float _quantidadeDeAgua;

    private int _quantidadeInicial;

    private int _quantidadeMoida;

    private Boolean _isMilled;

    private boolean _isMusted;

    private boolean _isFiltered;

    private boolean _isWarm;

    private boolean _isCold;

    private boolean _isFermented;

    private boolean _hasFerment;

    public Malte(Grao grao, int quantidade) {
        _grao = grao;
        _quantidadeInicial = quantidade;
        _hasFerment = false;
        _isFermented = false;
    }

    public Grao get_Grao() {
        return _grao;
    }

    public Boolean get_isMilled() {
        return _isMilled;
    }

    public void set_isMilled(Boolean isMilled) {
        _isMilled = isMilled;
    }

    public int get_Quantidade() {
        return _quantidadeInicial;
    }

    public void set_quantidadeInicial(int quantidadeInicial) {
        _quantidadeInicial = quantidadeInicial;
    }

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

    public boolean get_isWarm() {
        return _isWarm;
    }

    public void set_isWarm(boolean isWarm) {
        _isWarm = isWarm;
    }

    public void set_isCold(boolean isCold) {
        _isCold = isCold;
    }

    public boolean get_isCold() {
        return _isCold;
    }

    public boolean is_isFermented() {
        return _isFermented;
    }

    public void set_isFermented(boolean _isFermented) {
        this._isFermented = _isFermented;
    }

    public boolean is_hasFerment() {
        return _hasFerment;
    }

    public void set_hasFerment(boolean _hasFerment) {
        this._hasFerment = _hasFerment;
    }

    public boolean hasCerveja() {
        return get_isMusted() && get_isFiltered()
                && get_isWarm() && get_isCold() && is_isFermented();

    }
}
