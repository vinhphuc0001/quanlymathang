package N20DCVT038_OOP_TH3_04;

public class HangSanXuat {
	private String tenHang;
    private QuocGia quocGia;

    public HangSanXuat(String tenHang, QuocGia quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    // Getter
    public String layTenQuocGiaSanXuat() {
        return quocGia.layTenQuocGia();
    }
}