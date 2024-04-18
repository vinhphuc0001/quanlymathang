package N20DCVT038_OOP_TH3_04;

public class QuocGia {
	private String maQuocGia;
    private String tenQuocGia;

    public QuocGia(String maQuocGia, String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }

    // Getter
    public String layTenQuocGia() {
        return tenQuocGia;
    }
}
