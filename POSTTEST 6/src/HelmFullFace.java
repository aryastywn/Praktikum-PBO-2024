class HelmFullFace extends Helm {
    private String visorType;

    public HelmFullFace(String kode, String merk, int stok, String visorType) {
        super(kode, merk, stok);
        this.visorType = visorType;
    }

    public String getVisorType() {
        return visorType;
    }

    public void setVisorType(String visorType) {
        this.visorType = visorType;
    }

    @Override
    public String getJenis() {
        return "Full Face";
    }

    @Override
    public String getAdditionalInfo() {
        return "Visor Type: " + visorType;
    }
}
