class HelmHalfFace extends Helm {
    private String additionalFeature;

    public HelmHalfFace(String kode, String merk, int stok, String additionalFeature) {
        super(kode, merk, stok);
        this.additionalFeature = additionalFeature;
    }

    public String getAdditionalFeature() {
        return additionalFeature;
    }

    public void setAdditionalFeature(String additionalFeature) {
        this.additionalFeature = additionalFeature;
    }

    @Override
    public String getJenis() {
        return "Half Face";
    }

    @Override
    public String getAdditionalInfo() {
        return "Additional Feature: " + additionalFeature;
    }
}